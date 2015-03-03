<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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
<style type="text/css">
.img_div{
	width: 150px;
	height: 150px;
	border: 1px dashed #000;
}
#add_img{
	margin-top: 50px;
	margin-left: 62px;
	font-size: 25px;
}
a:hover{
	text-decoration: none;
}
</style>
<script type="text/javascript">
var img_len=0;
$(function(){
	$("#add_img").click(function(){
		$('#fileUp').click();
		$('#imgForm').append("<input type='file' id='upload_img"+img_len+"' name='upload'/>");
		$('#upload_img'+img_len).click();
		img_len++;
	});
	$('#sub').click(function{
		$('#imgForm').submit();
	});
});
</script>
  </head>
  
  <body>
  
  <div class="panel panel-default">
	  <div class="panel-body">
		  <div>
		  	123
		  	<form action="fileUploadAction!doUpload.action" enctype="multipart/form-data" method="post" id="imgForm">
		  	</form>
		  </div>
		  <div class="img_div">
			  <a>
			  <span class="glyphicon glyphicon-plus" aria-hidden="true" id="add_img"></span>
			  <div style="text-align: center;">添加图片</div>
			  </a>
		  </div>
		  <button type="button" class="btn btn-default" id="sub">
	  </div>
  </div>
  </body>
</html>
