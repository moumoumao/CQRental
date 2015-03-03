package manage.service.Impl;

import java.util.List;

import manage.ViewObject.RoleVo;
import manage.dao.RoleDao;
import manage.service.RoleService;

public class RoleServiceImpl implements RoleService {
	private RoleDao roleDao;
	public RoleServiceImpl(RoleDao roleDao) {
		this.roleDao = roleDao;
	}
	@Override
	public int findAllRoleCount() {
		return roleDao.findRoleListCount("");
	}
	@Override
	public List<RoleVo> findAllPagetion(int pageStart, int pageSize) {
		return roleDao.findRoleList(pageSize, pageStart, "");
	}
	@Override
	public List<RoleVo> findAllRole() {
		return roleDao.findRoleList(0, 0, "");
	}

	@Override
	public List<RoleVo> findByName(String roleName) {
		return roleDao.findRoleList(0, 0, roleName);
	}

	

}
