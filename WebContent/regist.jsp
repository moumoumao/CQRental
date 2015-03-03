<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<link rel="stylesheet" href="/CQRental/css/main.css" type="text/css"></link>
<link rel="stylesheet" href="/CQRental/css/login.css" type="text/css"></link>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"></link>
<link rel="stylesheet" href="css/bootstrap-theme.min.css" type="text/css"></link>
<title>注册</title>
<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script type="text/javascript">
$(function(){
	$('#name').blur(function(){
		$.ajax({
			url:'user!checkLoginName.action',
			data:{'userVo.loginName':$('#name').val()},
			async: false,
            type: "POST",
            dataType: "JSON",
			success:function(data){
			alert(data.mes);
			}
		});
	});
	$('#repwd').blur(function(){
		if($('#repwd').val!=$('#pwd').val()){
			alert('两次密码输入不一致！');
		}
	});
});
</script>
</head>
<body>                   
<div id="container">
	<div class="log-title"><div>宜居</div></div>
	<div id="content">
		<div class="show_div">
        <div class="wel-login-title">欢迎登录宜居网</div>
        <div class="left">
        <form action="user!doRegist.action" method="post">
          <div class="input_box">
                <em class="user_img"></em><input  type="text" class="input_all" name="userVo.loginName" id="name" placeholder="用户名"/>
            </div>
            <div class="input_box">
                <em class="pwd_img"></em><input  type="password" class="input_all" name="userVo.userPwd" id="pwd" placeholder="密码"/>
            </div>
            <div class="input_box">
                <em class="pwd_img"></em><input  type="password" class="input_all" id="repwd" placeholder="确认密码"/>
            </div>
            <input type="submit">
        </form>
            
        </div>
        <div class="right">      
        </div>
       
        </div>
        
	</div>
</div>

</body>
</html>