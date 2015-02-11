package manage.service;

import manage.ViewObject.UserVo;

public interface UserService {
	/**
	 * 根据登录名查找用户
	 * @param loginName
	 * @return 
	 */
	UserVo findUserByLoginName(String loginName);
	/**
	 * 添加新用户
	 * @param user
	 * @return
	 */
	int addUser(UserVo user);

}
