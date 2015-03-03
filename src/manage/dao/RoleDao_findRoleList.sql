select  * from t_role t
left join  t_power p  on t.power_id=p.power_id
where 1=1
  /*IF rolename != ''*/
 and role_name ~/*rolename*/'rolename'
 /*END*/
  /*IF pageSize != 0 */
limit /*pageSize*/'pageSize' offset /*pageStart*/'pageStart'
/*END*/