<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>



<head>
	<title>商品</title>
	<script type="text/javascript" src="jquery.js"></script>
	<style type="text/css">
	dt{
		color:#000000;
		font-size:20px;
	}
	</style>
</head>
<body>
	<jsp:include page="head.jsp" />
	<jsp:include page="menu.jsp" />


	<div>
		<table style="width:80%" align="center">
				
				<s:iterator value="#books" status="status">
				<s:if test="#status.index %6 == 0">
				<tr>
				</s:if>
				<td onClick="window.location.href='/bookstore_manager/showInfo.html?id=<s:property value="id"/>' ">
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
				
				
	
	</div>
	<jsp:include page="foot.jsp" />
</body>
</html>