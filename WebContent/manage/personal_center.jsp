<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="/CQRental/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="/CQRental/css/bootstrap.min.css" type="text/css"></link>
<link rel="stylesheet" href="/CQRental/css/bootstrap-theme.min.css" type="text/css"></link>
<title>个人中心</title>
<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
<script src="/CQRental/js/bootstrap.min.js"></script>
<style type="text/css">
#img_div{
width:100%;
 text-align: center;
}
</style>
<script type="text/javascript">
</script>
  </head>
  
  <body>
  <div id="img_div">  <img src="../img/img1.png" 
   class="img-circle" style="width: 100px;height: 100px;"></div>
   <ul id="myTab" class="nav nav-tabs">
	   <li class="active"><a href="#base" data-toggle="tab"> 基本信息</a></li>
	   <li><a href="#house" data-toggle="tab">发布的房源</a></li>
	   <li class="dropdown">
	      <a href="#" id="myTabDrop1" class="dropdown-toggle" 
	         data-toggle="dropdown">
	         Java <b class="caret"></b></a>
	      <ul class="dropdown-menu" role="menu" aria-labelledby="myTabDrop1">
	         <li><a href="#jmeter" tabindex="-1" data-toggle="tab">jmeter</a></li>
	         <li><a href="#ejb" tabindex="-1" data-toggle="tab">ejb</a></li>
	      </ul>
	   </li>
	</ul>
   <div id="myTabContent" class="tab-content">
   <div class="tab-pane fade in active" id="base">
      <table class="table table-bordered" style="margin-top: 5px;">
		   <tbody>
		      <tr>
		         <td>用户名:</td>
		         <td>${user.loginName } </td>
		         <td>昵称:</td>
		         <td>${user.userName } </td>
		      </tr>
		      <tr>
		         <td>手机:</td>
		         <td>${user.userTel } </td>
		         <td>邮箱地址:</td>
		         <td>${user.userEmail } </td>
		      </tr>
		      <tr>
		         <td>年龄:</td>
		         <td>${user.userAge } </td>
		         <td>出生年月:</td>
		         <td>${user.userBirth } </td>
		      </tr>
		      <tr>
		         <td>年龄:</td>
		         <td>${user.userAge } </td>
		         <td>出生年月:</td>
		         <td>${user.userBirth } </td>
		      </tr>
		   </tbody>
		</table>
   </div>
   <div class="tab-pane fade" id="house">房源</div>



   
  </body>
</html>
