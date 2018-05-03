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
	<div style="margin-top:100px">
		<table align="center">
		<s:set var="money" value="0"></s:set>
			<s:iterator value="#order_items" status="status">
			<tr >
				<s:if test='pay_state=="未支付"'>
				<td>订单号：<s:property value="order_num"/></td>
				<td>书名：《<s:property value="book_name"/>》</td>
				<td>卖家:<s:property value="sell_name"/></td>
				<td>价格：<s:property value="price"/>元</td>
				<td>&nbsp;&nbsp;&nbsp;<a  href="${pageContext.request.contextPath}/deleteOrder.html?id=<s:property value="id"/>">
				<img  src="img_web/delete.png" style="width:15px;heignt:15px">删除</a>
				
				<s:set var="money" value="#money+price"></s:set>
				</s:if>
			</tr>
			</s:iterator>
			
		</table>
	
	</div>
	
	<div >
		<table align="right">
			<tr>
				<td style="font-size:40px">合计<s:property value="#money"/>元</td>
			</tr>
			<tr>
				<td ><a href="" style="font-size:40px">付款</a> </td>
			</tr>
		</table>
	</div>
	
	<jsp:include page="foot.jsp"/>
</body>
</html>