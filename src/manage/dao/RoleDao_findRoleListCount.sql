select  count(*) from t_role t
left join  t_power p  on t.power_id=p.power_id
where 1=1
  /*IF rolename != ''*/
 and role_name ~/*rolename*/'rolename'
 /*END*/