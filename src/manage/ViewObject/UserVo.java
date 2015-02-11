package manage.ViewObject;

public class UserVo {
	private int userId;//用户ID
	private String loginName;//登录名
	private String userName;//昵称
	private String userTel;//用户手机
	private String sex;//用户性别
	private String userEmail;//用户邮箱地址
	private int userAge;// 用户年龄
	private String userBirth;//用户出生年月（yyyy-mm-dd）
	private String userPwd;//密码
	
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
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserTel() {
		return userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserBirth() {
		return userBirth;
	}
	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
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
