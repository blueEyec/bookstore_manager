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
		
		<div id="divcontent" style="margin-top:100px; margin-bottom:100px">
		<table width="900px" border="0" cellspacing="0">
			<tr>
				<td width="497">
					<table cellspacing="0" class="ctl">
						<tr>
							<td>&middot;<a href="news.html" style="color:#000000">图书3折起，支持在线浏览
									先看再买不后悔,任何商品免费送货</a></td>
						</tr>
						<tr>
							<td>&middot;<a href="news.html" style="color:#000000">Lonely
									Planet 已出版600多种旅行指南，几乎覆盖了全世界的每个角落。</a></td>
						</tr>
						<tr>
							<td>&middot;<a href="news.html" style="color:#000000">2007年中旅游图书畅销榜速递
									中国游,世界游,旅游图书全部7折封顶</a></td>
						</tr>
						<tr>
							<td>&middot;<a href="news.html" style="color:#000000">50万种图书3折,百货团购价热卖
									畅销榜新书速递,促销天天有</a></td>
						</tr>
						<tr>
							<td>&middot;<a href="news.html" style="color:#000000">50万种图书3折,百货团购价热卖
									畅销榜新书速递,促销天天有</a></td>
						</tr>
					</table></td>
				<td style="padding:5px 15px 10px 40px"><table width="100%"
						border="0" cellspacing="0">
						<tr>
							
						</tr>
					</table>
					<table width="100%" border="0" cellspacing="0">
						<tr>
						<td>
						<s:actionerror/>
						</td>
							<td>
								<img style="width:200px;height:150px" src="${pageContext.request.contextPath}/img_web/welcom.jpg">
							</td>
							
						</tr>
					</table></td>
			</tr>
		</table>
	</div>
	
	<jsp:include page="foot.jsp"/>

	

	</body>
</html>