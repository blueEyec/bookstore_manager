<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>购物清单</title>
</head>
<body>
	<jsp:include page="head.jsp"/>
	<jsp:include page="menu.jsp"/>
	
	<div style="margin-bottom:50px;margin-top:50px">
	<center>
		<s:form action="upload" method="post" enctype="multipart/form-data" >
			<s:file name="photo"></s:file>
			<s:submit value="修改头像"></s:submit>
			<s:actionerror/>
		</s:form>
		</center>
		<center>
		<s:form action="modify" method="post" >
			修改密码：<input name="password" type="password" value="<s:property value="#session.password"/>"></br>
			重复密码：<input name="repassword" type="password" value="<s:property value="#session.password"/>"></br>
			
			昵称：<input name="nickname" type="text" value="<s:property value="#session.nickname"/>"></br>
			<input name="picture" value="<s:property value="#session.picture_upload"/>" type="hidden">
			邮箱：<input name="email" type="text" value="<s:property value="#session.email"/>"></br>
			联系方式：<input name="telphone" type="text" value="<s:property value="#session.telphone"/>"></br>
			地址：<input name="address" type="text" value="<s:property value="#session.address"/>"></br>
			个性签名：<input name="sign" type="textarea" value="<s:property value="#session.sign"/>"></br>
			
					
			<s:submit value="确认修改" ></s:submit>
			
		</s:form>
	
	</center>
	
	
	</div>
	
	<jsp:include page="foot.jsp"/>
</body>
</html>