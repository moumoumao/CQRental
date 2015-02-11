/**
 * 
 */
package manage.action;

import com.opensymphony.xwork2.ActionContext;

import manage.ViewObject.UserVo;
import manage.service.UserService;
import manage.util.AbstractAction;
import manage.util.JsonInfo;

/**
 * @author Administrator
 *
 */
public class UserAction extends AbstractAction {
	private UserVo userVo;
	
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

	public UserVo getUserVo() {
		return userVo;
	}

	public void setUserVo(UserVo userVo) {
		this.userVo = userVo;
	}
	
}
