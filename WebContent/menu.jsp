<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<script type="text/javascript">
	
</script>


<link rel="stylesheet" href="css/basis.css" type="text/css" />
<div id="divmenu">
	<a href="${pageContext.request.contextPath}/recomShow.html">推荐</a>
	
	<a
		href="${pageContext.request.contextPath}/show.html?category=文学">文学</a>
		
	<a
		href="${pageContext.request.contextPath}/show.html?category=生活">生活</a>
	<a
		href="${pageContext.request.contextPath}/show.html?category=计算机">计算机</a>
	<a
		href="${pageContext.request.contextPath}/show.html?category=外语">外语</a>
	<a
		href="${pageContext.request.contextPath}/show.html?category=经营">经管</a>
	<a
		href="${pageContext.request.contextPath}/show.html?category=励志">励志</a>
	<a
		href="${pageContext.request.contextPath}/show.html?category=社科">社科</a>
	<a
		href="${pageContext.request.contextPath}/show.html?category=学术">学术</a>
	<a
		href="${pageContext.request.contextPath}/show.html?category=少儿">少儿</a>
	<a
		href="${pageContext.request.contextPath}/show.html?category=艺术">艺术</a>
	<a
		href="${pageContext.request.contextPath}/show.html?category=原版">原版</a>
	<a
		href="${pageContext.request.contextPath}/show.html?category=科技">科技</a>
	<a
		href="${pageContext.request.contextPath}/show.html?category=考试">考试</a>
	<a
		href="${pageContext.request.contextPath}/show.html?category=生活百科">生活百科</a>
		
	<a href="${pageContext.request.contextPath}/show.html?category=全部商品"
		style="color:#FFFF00">全部商品目录</a>
	<s:if test="#session.permission==2"><a href="${pageContext.request.contextPath}/adminReport.html"
		style="color:#FFFF00">管理网友举报</a></s:if>
</div>
<div id="divsearch">
	<form action="${pageContext.request.contextPath}/search.html"
		method="post">
		<table width="100%" border="0" cellspacing="0">
			<tr>
				<td style="text-align:right; padding-right:220px">
				Search <input
					type="text" name="search" class="inputtable" onkeyup="searchName();"
					id="name" /> 
					<input type="image" src="img_web/serchbutton.gif"
					border="0" style="margin-bottom:-4px">
				</td>
			</tr>
		</table>

	</form>
</div>
<div id="content"
	style="background-color:white;width:128px; text-align:left;margin-left:945px;color:black;float:left;margin-top: -20px;display: none">
</div>

</html>