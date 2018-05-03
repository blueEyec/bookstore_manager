<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<html>
<head>

<title>商品信息</title></head>
	<jsp:include page="head.jsp"/>
	<jsp:include page="menu.jsp"/>
	<style type="text/css">
	dt{
		color:#000000;
		font-size:20px;
	}
	</style>
	<div>
		<table align="center">
			<tr>
				<td >
				
					<dt><img style="width:200px;height:300px;"
					alt="《<s:property value="#book.book_name"/>》的封面" 
					src="/bookstore_manager/img_book/<s:property value="#book.book_picture"/>"></dt>
					<dt >《<s:property value="#book.book_name"/>》</dt>
					<dt>作者：<s:property value="#book.book_author"/></dt>
					<dt>类别：<s:property value="#book.category"/></dt>
					<dt>价格：<s:property value="#book.price"/>元</dt>
					<dt>内容简介：</dt>
					<dt><textarea rows="3" cols="50" readonly="readonly" ><s:property value="#book.description"/></textarea></dt>
					<dt>还剩：<s:property value="#book.inventory"/>本</dt>
					<dt style="margin-left:300px"><a href="${pageContext.request.contextPath}/recommended.html?id=<s:property value="#book.id"/>"><h style="font-size:20px">加入推荐</h></a>
					
				</td>
			</tr>
		</table>
		
	</div>
	<div align="right">
	<dt style="margin-right:100px"><a href="${pageContext.request.contextPath}/cart.html?id=<s:property value="#book.id"/>" style="font-size:20px">加入购物车</a>
	<a href="" style="font-size:20px" >付款</a></dt>
	
	
	
	</div>
	<div style="align:left;margin-top:40px">
		<table style="margin-left:150px">
			<s:iterator value="#evaluations" status="status">
			<tr >
			<td><h style="font-size:20px"><s:property value="user_nickname"/>:</h></td>
			<td><textarea><s:property value="eva_time"/></textarea></td>
			<td><h style="font-size:20px"><s:property value="content"/></h></td>
			<s:property value="user_id"/>
			<td><a href="${pageContext.request.contextPath}/like.html?id=<s:property value="id"/>&user_id=<s:property value="#sell_id"/>&book_id=<s:property value="#book.id"/>"><img src="${pageContext.request.contextPath}/img_web/like.jpg" style="width:20px;height:20px">(<s:property value="agree"/>)</a></td>
			
			
			<td><a href="${pageContext.request.contextPath}/hate.html?id=<s:property value="id"/>&user_id=<s:property value="#sell_id"/>&book_id=<s:property value="#book.id"/>"><img src="${pageContext.request.contextPath}/img_web/hate.png" style="width:20px;height:20px">(<s:property value="hate"/>)</a></td>
			<s:if test="hate>=50">
			<td ><a href="${pageContext.request.contextPath}/report.html?id=<s:property value="id"/>&book_id=<s:property value="#book.id"/>"><img style="width:20px;height:20px;padding-left:50px" src="${pageContext.request.contextPath}/img_web/report.jpg">(举报)</a></td></s:if>
			</tr>
			</s:iterator>
		</table>
	</div>
	
	
	<div >
		<form action="addevaluation.html">
		<table align="center">
			<tr>
				<td><h style="font-size:15px">我的评论:</h></td>
				<td><input type="text" name="content"></td>
				<td><input type="hidden" name="id" value="<s:property value="#book.id"/>"></td>
			</tr>
			<tr>
			<td></td>
			<td style="padding-left:110px"><input type="submit"></td>
			</tr>
		</table>
		</form>
	
	</div>
	
	<jsp:include page="foot.jsp"/>




</html>