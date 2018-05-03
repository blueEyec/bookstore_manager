<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<s:debug></s:debug>
<link rel="stylesheet" href="css/basis.css" type="text/css" />	

<div id="divhead">
	<table cellspacing="0" class="headtable">
		<tr>
			<td><img  src="img_web/logo.jpg"></td>
			<td style="text-align:right"><img src="img_web/cart.gif"
				width="26" height="23" style="margin-bottom:-4px" />&nbsp;<a
				href="${pageContext.request.contextPath}/showCart.html">购物车</a> | <a href="${pageContext.request.contextPath}/help.jsp">帮助中心</a> 
				| <a href="register.jsp">新用户注册</a>
				| <a href="${pageContext.request.contextPath}/myInfo.html">我的帐户</a>
				| <a href="${pageContext.request.contextPath}/index.jsp">首页</a></td>
				
			<td>
				<dt><s:property value="#session.nickname"/>
				
				<img src="/bookstore_manager/img_user/<s:property value="#session.picture"/>" style="width:40px;height:60px"/></dt>
				<dt>目前积分:<s:property value="#session.integral"/>分</dt>
				
				<dt>座右铭：<s:property value="#session.sign"/></dt>
				<s:if test="#session.id!=null">
				<s:set var="test" value="'登出'"></s:set>
				</s:if>
				<dt><a href="${pageContext.request.contextPath}/loginOut.html"><s:property value="#test"/></a></dt>
				<!-- 
				<dt align="center"><s:if test="#session.id!=null"><a href="${pageContext.request.contextPath}/personal.html">修改个人信息</a></s:if></dt> -->
			</td>
			
			<s:if test="#session.permission==1||#session.permission==2||#session.integral>=500">
			<td><a href="book_publish.jsp">我要卖书</a></td>
			</s:if>
		</tr>
	</table>
</div>