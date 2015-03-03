/**
 * 
 */
package manage.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionContext;

import manage.ViewObject.UserVo;
import manage.service.UserService;
import manage.util.AbstractAction;
import manage.util.JsonInfo;
import manage.util.PageBean;

/**
 * @author Administrator
 *
 */
@Results({
	@Result(name="user_role",location="/manage/user_list_for_role.jsp")
})
public class UserAction extends AbstractAction {
	private UserVo userVo;
	private PageBean pageBean;
	
	private UserService userService;
	public UserAction(UserService userService){
		this.userService = userService;
	}

	public void doLogin(){
		UserVo user = userService.findUserByLoginName(userVo.getLoginName());
		JsonInfo json = new JsonInfo();
		if(user==null){
			json.setSuccess(false);
			json.setMes("用户名不存在！");
		}else if(user.getUserPwd().equals(userVo.getUserPwd())){
			ActionContext.getContext().getSession().put("user", user);
			json.setSuccess(true);
			json.setMes("用户名与密码匹配！");
		}else{
			json.setSuccess(false);
			json.setMes("密码不正确！");
		}
		super.writeJson(json);
	}

	public void doRegist(){
		JsonInfo json = new JsonInfo();
		int flag= userService.addUser(userVo);
		if(flag!=1){
			json.setSuccess(false);
			json.setMes("人品爆发了，注册失败！请重试！");
		}else{
			json.setSuccess(true);
			json.setMes("该注册成功");
		}	
		super.writeJson(json);
	}
	
	public void checkLoginName(){
		UserVo user = userService.findUserByLoginName(userVo.getLoginName());
		JsonInfo json = new JsonInfo();
		if(user!=null){
			json.setSuccess(false);
			json.setMes("该用户名已存在！");
		}else{
			json.setSuccess(true);
			json.setMes("该用户名可用！");
		}
		super.writeJson(json);
	}
	public void findByRole(){
		pageBean = userService.findByroleId(userVo.getRoleId(), pageBean.getPageSize(), pageBean.getCurrentPage());
		try {
			ServletActionContext.getResponse().getWriter().write((JSONObject.fromObject(pageBean)).toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void findAllUser(){
		super.writeJson(userService.findAllUser());
	}
	public UserVo getUserVo() {
		return userVo;
	}

	public void setUserVo(UserVo userVo) {
		this.userVo = userVo;
	}

	public PageBean getPageBean() {
		return pageBean;
	}

	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}
	
	
}
