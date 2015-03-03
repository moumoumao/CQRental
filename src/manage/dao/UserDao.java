package manage.dao;

import java.util.List;

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
	/**
	 * 组合查询用户信息
	 * @param pageStart 开始条数
	 * @param pageSize 页数
	 * @param loginName 登录名
	 * @param userName 昵称
	 * @param sex 性别
	 * @param userAge 年龄
	 * @param userBirthStart 出身年月
	 * @param userBirthEnd  出身年月
	 * @param roleId 角色Id
	 * @return
	 */
	@Arguments({"pageStart","pageSize","loginName","userName","sex","userAge","userBirthStart","userBirthEnd","roleId"})
	List<UserVo> finduserListContext(int pageStart ,int pageSize,String loginName,String userName,String sex,int userAge,String userBirthStrat,String userBirthEnd,int roleId);
	/**
	 * 查询所有用户
	 * @return
	 */
	List<UserVo> findAllUser();

}
