<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html>
	
	<head>
	<title>注册页面</title>
	<link rel="stylesheet" href="css/basis.css" type="text/css" />
	</head>
	<body class="main">
		<jsp:include page="head.jsp" />
		<jsp:include page="menu.jsp" />
		<!--
			search是由一行一列table完成
		-->
		

<div id="content" style="margin-top:100px">
		<center>
		<s:form action="upload" method="post" enctype="multipart/form-data" >
			<s:file name="photo"></s:file>
			<s:submit value="上传头像"></s:submit>
			<s:actionerror/>
		</s:form>
		</center>
	<center>
		<s:form action="registerAction" method="post" >
			<s:textfield label="用户名" name="username"></s:textfield>
			<s:password label="密码" name="password"></s:password>
			<s:password label="重复密码" name="repassword"></s:password>
			<s:textfield label="真实姓名" name="realname"></s:textfield>
			<s:textfield label="昵称" name="nickname"></s:textfield>
			<input name="picture" value="<s:property value="#session.picture_upload"/>" type="hidden">
			<s:radio list="#{'1':'男','0':'女'}" name="gender" value="1" label="性别"/>
			<s:textfield label="邮箱" name="email"></s:textfield>
			<s:textfield label="联系电话" name="telphone"></s:textfield>
			<s:textarea label="地址" name="address"></s:textarea>
			<s:textarea label="个性签名" name="sign"></s:textarea>
					
					
			<s:submit value="注册" ></s:submit>
			
		</s:form>
	
	</center>


	
	
</div>
		<jsp:include page="foot.jsp"/>
				
		
	</body>
</html>