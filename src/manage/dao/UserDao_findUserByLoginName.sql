select * from t_user u
left join t_role t on u.role_id = t.role_id
left join t_power p on t.power_id = p.power_id
where u.login_name = /*loginName*/'loginName'