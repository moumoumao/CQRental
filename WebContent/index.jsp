<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"></link>
    <link rel="stylesheet" href="css/bootstrap-theme.min.css" type="text/css"></link>
<title>首页</title>
<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script type="text/javascript">
var height = 0;
$(function(){
	$('.carousel').carousel({
  		interval: 3000 
	});
	$('#menuFrame').load(function(){
		var ifm= document.getElementById("menuFrame");  
		var subWeb = document.frames ? document.frames["menuFrame"].document : ifm.contentDocument;  
		if(ifm != null && subWeb != null) {
			ifm.height = subWeb.body.scrollHeight;
			ifm.height = parseInt(ifm.height)+  parseInt(height)+32;
			height=0;
			ifm.width = subWeb.body.scrollWidth;
		} 
	});
});
</script>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">网站</a>
    </div>

    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">首页<span class="sr-only">(current)</span></a></li>
        <li><a href="#">item1</a></li>
        <li><a href="/CQRental/manage/house_list.jsp" target="menuFrame">list</a></li>
        <li><a href="#">item3</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">下拉列表 <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li class="divider"></li>
            <li><a href="#">Separated link</a></li>
            <li class="divider"></li>
            <li><a href="#">One more separated link</a></li>
          </ul>
        </li>
      </ul>
      <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">${user.userName } <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu" >
            <li><a href="#">个人中心</a></li>
            <li><a href="#">我的</a></li>
            <li class="divider"></li>
            <li><a href="#">退出登录</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
</nav>
<div class="container">
<iframe id="menuFrame" name="menuFrame" src="/CQRental/manage/main.jsp" 
style="overflow: visible;margin-top: 55px;" scrolling="no" frameborder="no" width="100%" ></iframe>
</div>
</body>
</html>
