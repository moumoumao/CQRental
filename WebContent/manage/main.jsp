<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="/CQRental/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="/CQRental/css/bootstrap.min.css" type="text/css"></link>
<link rel="stylesheet" href="/CQRental/css/bootstrap-theme.min.css" type="text/css"></link>
<title>Insert title here</title>
<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
<script src="/CQRental/js/bootstrap.min.js"></script>
<script type="text/javascript">
$(function(){
	$('.carousel').carousel({
  		interval: 3000 
	});
});
</script>
</head>
<body>
<div id="myCarousel" class="carousel slide">
  <div class="carousel-inner">
    <div class="active item"><img src="/CQRental/img/userBg.jpg" style="width: 100%;height: 400px;"></img></div>
    <div class="item"><img src="/CQRental/img/img1.png" style="width: 100%;height: 400px;"></img></div>
    <div class="item"><img src="/CQRental/img/img2.png" style="width: 100%;height: 400px;"></img></div>
  </div>
  <a class="carousel-control left" href="#myCarousel" data-slide="prev"><span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span></a>
  <a class="carousel-control right" href="#myCarousel" data-slide="next"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span></a>
</div>
</body>
</html>