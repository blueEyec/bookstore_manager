<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
	<head>
		<title>电子书城</title>
		<link rel="stylesheet" href="css/main.css" type="text/css" />
	</head>
	<body class="main">
		<jsp:include page="head.jsp" />
		<jsp:include page="menu.jsp" />
		
		<div align="center" style="margin-top:80px;margin-top:20px;margin-bottom:20px">
			<table style="width:80%" align="center">
				<tr >
					<h1 style="font-size:20px">好书推荐</h1>
				</tr>
				<s:iterator value="#books" status="status">
				<s:if test="#status.index %6 == 0">
				<tr>
				</s:if>
				<td onClick="window.location.href='/bookstore_manager/recommendedShow.html?id=<s:property value="book.getId()"/>' ">
					<dt><img style="width:200px;height:240px;"
					alt="《<s:property value="book_name"/>》的封面" 
					src="/bookstore_manager/img_book/<s:property value="book_picture"/>"></dt>
					<dt>《<s:property value="book_name"/>》</dt>
					<dt>作者：<s:property value="book_author"/></dt>
					<dt>价格：<s:property value="price"/></dt>
					<dt>卖家：<s:property value="user.getId()"/></dt>
				</td>
				<s:if test="#status.index%6 == 5">
				</tr>
				</s:if>
				</s:iterator>
			
			
		</table>
		</div>
	
	<jsp:include page="foot.jsp"/>

	

	</body>
</html>