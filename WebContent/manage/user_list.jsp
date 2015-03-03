<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="/CQRental/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="/CQRental/css/bootstrap.min.css" type="text/css"></link>
<link rel="stylesheet" href="/CQRental/css/bootstrap-theme.min.css" type="text/css"></link>
<style type="text/css">

</style>
<title>Insert title here</title>
<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
<script src="/CQRental/js/bootstrap.min.js"></script>
<script type="text/javascript">
$(function(){
});
function findByRole(currentPage,pageSize,roleId){
	alert(roleId);
	$.ajax({
		url:'/CQRental/user!findByRole.action',
		data:{'pageBean.pageSize':pageSize,'pageBean.currentPage':currentPage,'userVo.roleId':roleId},
		success:function(data){
		var str="<tr>";
		
		str+="</tr>";
		$('#user_data').append(str);
		
		}
	});
}
</script>
</head>
<body>

<div class="panel panel-success">
<ul id="myTab" class="nav nav-tabs">
 <li><a href="#role"  data-toggle="tab">角色管理</a></li>
 <li><a href="#list"  data-toggle="tab">list</a></li>
 <li><a href="#">用户列表</a></li>
  <li class="dropdown">
	      <a href="#" id="myTabDrop1" class="dropdown-toggle" 
	         data-toggle="dropdown">
	         用户列表<b class="caret"></b></a>
	      <ul class="dropdown-menu" role="menu" aria-labelledby="myTabDrop1" >
	      <li onclick="findByRole(0)"><a href="#user_list" tabindex="-1" data-toggle="tab">全部</a></li>
	      <c:forEach var="item" items="${roleList}">
	      		<li onclick="findByRole(1,10,${item.roleId})"><a href="#user_list" tabindex="-1" data-toggle="tab">${item.roleName}</a></li>
          </c:forEach>
	      </ul>
  </li>
</ul>
<div id="myTabContent" class="tab-content" style="padding: 5px;">
   <div class="tab-pane fade in active" id="role">
   		 <table class="table table-bordered">
	    <thead>
	        <tr>
	            <th data-field="roleId" data-align="right" data-sortable="true">角色ID</th>
	            <th data-field="roleName" data-align="center" data-sortable="true">角色名称</th>
	            <th data-field="ck" data-sortable="true" data-sorter="priceSorter">操作</th>
	        </tr>
	    </thead>
	    <tbody>
	    	<c:forEach var="item2" items="${roleList}">
		      	 <tr>
			         <td>${item2.roleId}</td>
			         <td>${item2.roleName}</td>
			         <td><a href="" class="btn btn-primary">权限</a> <a href="" class="btn btn-success">用户</a></td>
			      </tr>
	        </c:forEach>
			     
		</tbody>
	</table>
   </div>
   <div class="tab-pane fade" id="list">
  
		<ul class="pagination">
			  <li><a href="#">&laquo;</a></li>
			  <li class="active"><a href="#">1</a></li>
			  <li ><a href="#">2</a></li>
			  <li><a href="#">3</a></li>
			  <li><a href="#">4</a></li>
			  <li><a href="#">5</a></li>
			  <li><a href="#">&raquo;</a></li>
		</ul>
   </div>
   <div class="tab-pane fade" id="user_list">
   		 <table class="table table-bordered">
	    <thead>
	        <tr>
	            <th data-field="roleId" data-align="right" data-sortable="true">角色ID</th>
	            <th data-field="roleName" data-align="center" data-sortable="true">角色名称</th>
	            <th data-field="ck" data-sortable="true" data-sorter="priceSorter">操作</th>
	        </tr>
	    </thead>
	    <tbody id="user_data">
	    	<c:forEach var="item2" items="${roleList}">
		      	 <tr>
			         <td>${item2.roleId}</td>
			         <td>${item2.roleName}</td>
			         <td><a href="" class="btn btn-primary">权限</a> <a href="" class="btn btn-success">用户</a></td>
			      </tr>
	        </c:forEach>
			     
		</tbody>
	</table>
   		<ul class="pagination" id="page">
			  <li><a href="#">&laquo;</a></li>
			  <li class="active"><a href="#">1</a></li>
			  <li ><a href="#">2</a></li>
			  <li><a href="#">3</a></li>
			  <li><a href="#">4</a></li>
			  <li><a href="#">5</a></li>
			  <li><a href="#">&raquo;</a></li>
		</ul>
   </div>
</div>



</body>
</html>
