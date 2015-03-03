package manage.ViewObject;

public class RoleVo {
	//角色信息
	private int roleId;//角色ID
	private String roleName;//角色名称（唯一）
	
	//权限信息(0为没有权限，1为有权限。默认为0)
	private int powerId;//权限ID
	private int roleCreate;//创建角色
	private int roleUpdate;//角色更改
	private int roleDelete;//角色删除
	private int userRoleUpdate;// 用户角色更改
	private int rolePowerUpdate;//角色权限更改
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public int getPowerId() {
		return powerId;
	}
	public void setPowerId(int powerId) {
		this.powerId = powerId;
	}
	public int getRoleCreate() {
		return roleCreate;
	}
	public void setRoleCreate(int roleCreate) {
		this.roleCreate = roleCreate;
	}
	public int getRoleUpdate() {
		return roleUpdate;
	}
	public void setRoleUpdate(int roleUpdate) {
		this.roleUpdate = roleUpdate;
	}
	public int getRoleDelete() {
		return roleDelete;
	}
	public void setRoleDelete(int roleDelete) {
		this.roleDelete = roleDelete;
	}
	public int getUserRoleUpdate() {
		return userRoleUpdate;
	}
	public void setUserRoleUpdate(int userRoleUpdate) {
		this.userRoleUpdate = userRoleUpdate;
	}
	public int getRolePowerUpdate() {
		return rolePowerUpdate;
	}
	public void setRolePowerUpdate(int rolePowerUpdate) {
		this.rolePowerUpdate = rolePowerUpdate;
	}
}
