select * from t_user t
where 1=1
 /*IF loginName != ''*/
 and login_name~/*loginName*/'loginName'
 /*END*/
  /*IF userName != ''*/
 and user_name~/*userName*/'userName'
 /*END*/
  /*IF sex != ''*/
 and sex_id=/*sex*/'sex'
 /*END*/
  /*IF userAge != 0*/
 and userAge=/*userAge*/'userAge'
 /*END*/
  /*IF userBirthStart != ''*/
 and user_birth>=/*userBirthStart*/'userBirthStart'
 /*END*/
   /*IF userBirthEnd != ''*/
 and user_birth<=/*userBirthEnd*/'userBirthEnd'
 /*END*/
  /*IF roleId != 0*/
 and role_id=/*roleId*/'roleId'
 /*END*/
 /*IF pageSize != 0 */
limit /*pageSize*/'pageSize' offset /*pageStart*/'pageStart'
/*END*/
