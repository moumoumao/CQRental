package manage.dao;

import java.util.List;

import org.seasar.dao.annotation.tiger.Arguments;

import manage.ViewObject.RoleVo;

public interface RoleDao {
	/**
	 * 根据rolename模糊查询（并分页）
	 * @param pageStart 开始条数
	 * @param pageSize 页数
	 * @param rolename 角色名称
	 * @return
	 */
	@Arguments({"pageSize","pageStart","rolename"})
	List<RoleVo> findRoleList(int pageSize,int pageStart,String rolename);
	/**
	 * 根据rolename模糊查询查出其总条数
	 * @param rolename 角色名称
	 * @return
	 */
	@Arguments({"rolename"})
	int findRoleListCount(String rolename);
	
}
