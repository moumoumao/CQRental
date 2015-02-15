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
	$('#sub').click(function(){
		$('#imgForm').ajaxSubmit({
            success: function(data) { // data 保存提交后返回的数据，一般为 json 数据
                // 此处可对 data 作相关处理
                alert('123');
                if(data.success){
                	$.each(data.pageData.spilt(","),function(i, item) {
					str+="<div class='img_div'><img src='"+item+"' class='img-thumbnail'></div>";
					});
                }
                $(this).resetForm(); // 提交后重置表单
            }
            
            });
        return false; // 阻止表单自动提交事件
    
	});
});
</script>
  </head>
  
  <body>
  
  <div class="panel panel-default">
	  <div class="panel-heading">图片</div>
	  <div class="panel-body">
		  <div>
		  	123
		  	<form action="fileUpload!doUpload.action" enctype="multipart/form-data" method="post" id="imgForm">
		  	</form>
		  </div>
		  <div class="img_div">
			  <a>
			  <span class="glyphicon glyphicon-plus" aria-hidden="true" id="add_img"></span>
			  <div style="text-align: center;">添加图片</div>
			  </a>
		  </div>
		  <button type="button" class="btn btn-default" id="sub">确定</button>
	  </div>
  </div>
  </body>
</html>
