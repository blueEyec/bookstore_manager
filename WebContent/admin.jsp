<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head><title>管理员界面</title></head>
	<body>
	<jsp:include page="head.jsp"/>
	<jsp:include page="menu.jsp"/>
	
	<div style="margin-top:50px;margin-bottom:200px">
		<table align="center">
		<s:iterator value="#reports" status="status">
		<s:if test="state==0">
			<tr >
			<td><h style="font-size:20px;color: #f06600">可能违法的评论：<s:property value="content"/></h></td>
			<td><h style="font-size:18px;color: #f066e0">已遭到举报的次数：</a><s:property value="count"/></h></td>
			
			<td><a href="${pageContext.request.contextPath}/audit.html?id=<s:property value="id"/>&eva_id=<s:property value="evaluation_id"/>&state=1"><img style="width:20px;height:20px"src="${pageContext.request.contextPath}/img_web/right.jpg">(审核通过)</a></td>
			<td><a href="${pageContext.request.contextPath}/audit.html?id=<s:property value="id"/>&eva_id=<s:property value="evaluation_id"/>&state=0"><img style="width:20px;height:20px"src="${pageContext.request.contextPath}/img_web/delete.png">(审核不通过，删除该评论)</a></td>
			</tr>
		</s:if>
		</s:iterator>
			
		</table>
	</div>
	
	<jsp:include page="foot.jsp"/>
	</body>
</html>