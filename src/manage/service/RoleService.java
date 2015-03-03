package manage.service;

import java.util.List;

import manage.ViewObject.RoleVo;

public interface RoleService {
	/**
	 * 查找所有角色信息
	 * @return
	 */
	List<RoleVo> findAllRole();
	/**
	 * 查找角色的总条数	
	 *  @return
	 */
	int findAllRoleCount();
	/**
	 * 查找用户信息并分页
	 * @param pageStart
	 * @param pageSize
	 * @return
	 */
	List<RoleVo> findAllPagetion(int pageStart,int pageSize);
	/**
	 * 根据角色名称模糊查询
	 * @param roleName
	 * @return
	 */
	List<RoleVo> findByName(String roleName);
}
