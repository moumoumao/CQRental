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
</head>
<body>
   <table class="table table-bordered"  id="table-pagination" data-url="/CQRental/role!findAllRole.action" data-height="400" data-pagination="true" data-search="true">
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
	<div style="width: 100%;text-align: center;">
	<ul class="pagination">
			  <li><a href="#">&laquo;</a></li>
			  <c:forEach begin="1" end="${pageBean.pageCount}" var="i">
			  <c:choose>
				<c:when test="${pageBean.currentPage}==i"><li class="active"><a href="#">i</a></li> </c:when>
    			<c:otherwise><li ><a href="#">i</a></li></c:otherwise>
   				</c:choose>
			  </c:forEach>
			  <li><a href="#">&raquo;</a></li>
		
		</ul>
   </div>
</div>



</body>
</html>
