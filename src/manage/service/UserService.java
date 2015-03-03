package manage.service;

import java.util.List;

import manage.ViewObject.UserVo;
import manage.util.PageBean;

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
	/**
	 * 根据角色分页查找用户
	 * @param roleId 角色ID
	 * @param pageSize 页码
	 * @param page
	 * @return
	 */
	PageBean findByroleId(int roleId,int pageSize,int page);
	/**
	 * 查找所有用户
	 * @return
	 */
	List<UserVo> findAllUser();

}
