<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>登陆</title>
		<link rel="stylesheet" href="css/basis.css" type="text/css" />
	</head>
	<body class="main">

	<jsp:include page="head.jsp" />
	<jsp:include page="menu.jsp" />

	<div id="divcontent">
		<s:form action="login" method="post">
			<table width="900px" border="0" cellspacing="0">
				<tr>
					<td style="padding:30px">
					<div style="height:470px">
							<b>&nbsp;&nbsp;首页&nbsp;&raquo;&nbsp;个人用户登录</b>
							<div>
								<table width="85%" border="0" cellspacing="0">
									<tr>
										<td>
											<div id="logindiv">
												<table width="100%" border="0" cellspacing="0">
													<tr>
														
													</tr>
													<tr>
														<td style="text-align:center;padding-top:20px;"><font color="#ff0000"><s:actionerror/></font>
														</td>
													</tr>
													<tr>
														<td style="text-align:center">
															<table width="80%" border="0" cellspacing="0" style="margin-top:15px ;margin-left:auto; margin-right:auto">
																<tr>
																	<td style="text-align:right; padding-top:5px; width:25%">用户名：</td>
																	<td style="text-align:left"><input name="username" type="text" class="textinput">
																	</td>
																</tr>
																<tr>
																	<td style="text-align:right; padding-top:5px">密&nbsp;&nbsp;&nbsp;&nbsp;码：</td>
																	<td style="text-align:left"><input name="password" type="password" class="textinput">
																	</td>
																</tr>
																<tr>
																	
																<tr>
																	<td><s:radio list="#{'0':'普通用户','1':'卖家','2':'管理员'}" value="'0'" label="登陆身份" name="permission"></s:radio></td>
																</tr>
																<tr>
																	<td colspan="2" style="padding-top:10px; text-align:center"><input type="image"  src="img_web/loginbutton.gif" width="83" height="22">
																	</td>
																</tr>

																
																<tr>
																	<td colspan="2" style="padding-top:10px; text-align:center"><a href="register.jsp">
																	</a></td>
																</tr>
															</table>
														</td>
													</tr>
												</table>
											</div></td>
										<td style="text-align:left; padding-top:30px; width:60%"><h1>您还没有注册？</h1>
											<p>注册新会员，享受更优惠价格!</p>
											<p>千种图书，供你挑选！注册即享受丰富折扣和优惠，便宜有好货！超过万本图书任您选。</p>
											<p>超人气社区！精彩活动每一天。买卖更安心！支付宝交易超安全。</p>
											
										</td>
									</tr>
								</table>
							</div>
						</div></td>
				</tr>
			</table>
		</s:form>
	</div>
			<jsp:include page="foot.jsp"></jsp:include>
	</body>
</html>