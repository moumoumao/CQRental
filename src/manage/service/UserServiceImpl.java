package manage.service;

import java.util.List;

import manage.ViewObject.UserVo;
import manage.dao.UserDao;
import manage.util.PageBean;

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
				user.getUserBirth(), user.getUserPwd(), (user.getRoleId()==0)?1:user.getRoleId());
	}

	/**
	 * 根据登录名查找
	 */
	@Override       
	public UserVo findUserByLoginName(String loginName) {
		return userDao.findUserByLoginName(loginName);
	}

	@Override
	public PageBean findByroleId(int roleId, int pageSize, int page) {
		PageBean pageBean = new PageBean();
		pageBean.setCurrentPage(page);
		int count = userDao.finduserListContext(0, 0, "", "", "", 0, "", "", roleId).size();
		pageBean.setRowCount(count);
		pageBean.setRecordList(userDao.finduserListContext((page-1)*pageSize, pageSize, "", "", "", 0, "", "", roleId));
		return pageBean;
	}

	@Override
	public List<UserVo> findAllUser() {
		// TODO Auto-generated method stub
		return userDao.findAllUser();
	}


}
