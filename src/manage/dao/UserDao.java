package manage.dao;

import org.seasar.dao.annotation.tiger.Arguments;

import manage.ViewObject.UserVo;

public interface UserDao {
	/**
	 * 根据登录名查找用户查找
	 * @param loginName
	 * @return
	 */
	@Arguments("loginName")
	UserVo findUserByLoginName(String loginName);
	/**
	 *添加新用户
	 * @param loginName 登录名
	 * @param userName昵称
	 * @param userTel 电话
	 * @param sex 性别
	 * @param userEmail 邮箱
	 * @param userAge 年龄
	 * @param userBirth 出生年月yyyy-mm-dd
	 * @param roleId 角色ID
	 * @return 
	 */
	@Arguments({"loginName","userName","userTel","sex","userEmail","userAge","userBirth","userPwd","roleId"})
	int insertUser(String loginName,String userName,String userTel,String sex,String userEmail,int userAge,String userBirth,String userPwd,int roleId);


}
