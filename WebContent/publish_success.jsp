<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	
<html>
<s:debug></s:debug>
	<head>
	<title>发布成功</title>
	<link rel="stylesheet" href="css/main.css" type="text/css" />
	</head>
	<body align="center">
		<jsp:include page="head.jsp"></jsp:include>
		<jsp:include page="menu.jsp"></jsp:include>
		<div>
		<h1 style="font-size:40px" >您的新书发布成功</h1><br/>
		<table align="center">
		<tr>
			<td>
			<h2>书名：<s:property value="#session.book_name"/> </h2>
			</td></tr><tr><td>
			<h2>作者：<s:property value="#session.book_author"/></h2>
		</td></tr><tr><td>
			<h2>封面信息</h2>
			</td></tr><tr><td>
			<img  src="/bookstore_manager/img_book/<s:property value="#session.picture"/>">
			</td></tr><tr><td>
			</td></tr><tr><td>
			<h2>类别：<s:property value="#session.category"/></h2>
			</td></tr><tr><td>
			<h2>价格：<s:property value="#session.price"/>元</h2>
			</td></tr><tr><td>
			<h2>简介：<s:property value="#session.description"/></h2>
			</td></tr><tr><td>
			<h2>库存：<s:property value="#session.inventory"/>本</h2>
			</td></tr>
		
		</table>
		<a style="font-size:20px" href="book_publish.jsp">继续发布图书</a>
		</div>
		
		
		<jsp:include page="foot.jsp"></jsp:include>
	</body>

</html>