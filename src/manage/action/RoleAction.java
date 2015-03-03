package manage.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;


import manage.ViewObject.RoleVo;
import manage.service.RoleService;
import manage.util.AbstractAction;
@Results({
		@Result(name="role_list",location="/manage/user_list.jsp"),
		@Result(name="success",location="/index.jsp")
})
public class RoleAction extends AbstractAction {
	private RoleVo roleVo;
	private List<RoleVo> roleList ;
	private int count;
	private int pageSize;
	private int pageStart;
	private RoleService roleService;
	public RoleAction(RoleService roleService) {
		this.roleService = roleService;
	}
	/**
	 * 跳转至角色列表页面
	 */
	public String goRoleList(){
		roleList = roleService.findAllRole();
		return "role_list";
	}
	/**
	 * 查找所有角色
	 */
	public void findAllRole(){
		roleList = roleService.findAllRole();
		writeJson(roleList);
	}
	/**
	 * 
	 */
	public void findRolePagetion(){
		count = roleService.findAllRoleCount();
		roleList = roleService.findAllPagetion(pageStart, pageSize);
	}

	public RoleVo getRoleVo() {
		return roleVo;
	}

	public void setRoleVo(RoleVo roleVo) {
		this.roleVo = roleVo;
	}

	public List<RoleVo> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<RoleVo> roleList) {
		this.roleList = roleList;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageStart() {
		return pageStart;
	}
	public void setPageStart(int pageStart) {
		this.pageStart = pageStart;
	}
	
}
