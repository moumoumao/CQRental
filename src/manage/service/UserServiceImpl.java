package manage.service;

import manage.ViewObject.UserVo;
import manage.dao.UserDao;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao){
		this.userDao = userDao ;
	}

	/**
	 * 添加用户
	 */
	@Override
	public int addUser(UserVo user) {
		
		return userDao.insertUser(
				user.getLoginName(),user.getUserName() , user.getUserTel(),
				user.getSex(), user.getUserEmail(), user.getUserAge(),
				user.getUserBirth(), user.getUserPwd(), user.getRoleId());
	}

	/**
	 * 根据登录名查找
	 */
	@Override
	public UserVo findUserByLoginName(String loginName) {
		return userDao.findUserByLoginName(loginName);
	}

}
