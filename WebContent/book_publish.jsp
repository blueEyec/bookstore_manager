<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<title>发布新书</title>
		<link rel="stylesheet" href="css/main.css" type="text/css" />
	</head>
	<body class="main">
		<jsp:include page="head.jsp" />
		<jsp:include page="menu.jsp" />
		
		<div align="center">
			<s:form action="book_upload" method="post" enctype="multipart/form-data">
				<tr>
					<td>封面图片上传</td>
					<s:actionerror/>
					<td>
						<s:file name="photo"></s:file>
						<s:submit value="上传图书封面" ></s:submit>
						
					</td>
					
				</tr>
				
				
			</s:form>
			
			
			<s:form action="publish" method="post">
				<table>
					<tr>
						<td>书名</td>
						<td><s:textfield name="book_name"></s:textfield></td>
					</tr>
					<tr>
						<td>作者</td>
						<td><s:textfield name="book_author"></s:textfield></td>
					</tr>
					<tr>
						<td>类别</td>
						<td><s:checkboxlist list="{'文学','生活','计算机','外语','经管'}" name="category" ></s:checkboxlist></td>
						<td><s:checkboxlist list="{'励志','社科','学术','少儿','艺术'}" name="category" ></s:checkboxlist></td>
						<td><s:checkboxlist list="{'原版','科技','考试','生活百科'}" name="category" ></s:checkboxlist></td>
					</tr>
					<tr>
						<td>价格</td>
						<td><s:textfield name="price"></s:textfield></td>
					</tr>
					<tr>
						<td>简介</td>
						<td><s:textfield name="description"></s:textfield></td>
					</tr>
					<tr>
						<td>库存</td>
						<td><s:textfield name="inventory"></s:textfield></td>
						
					</tr>
					<tr>
						<td>
						<input name="book_picture" value="<s:property value="#session.picture"/>" type="hidden">
						</td>
					</tr>
					
					<tr>
						<s:submit value="发布"></s:submit>
					</tr>
					
				
				</table>
			
			
			</s:form>
			
		
		</div>
		
		
		
		
		<jsp:include page="foot.jsp" />
	</body>

</html>