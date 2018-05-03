<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html>
	<title>bookStore商城-商品信息展示</title>
		<style type="text/css">
			.main{
				/*设置外边距，下面有30px距离*/
				margin:0px 0px 30px 0px;
				/*背景色*/
				background-color:#ffffff;
				/*字体大小*/
				font-size:12px;
				/*文字颜色*/
				color:#000000;
				/*文本对齐方式*/
				text-align:center;
				/*垂直对齐方式*/
				vertical-align:top;
				/*设置行高*/
				line-height:150%;	
				font-family: Arial, Helvetica, sans-serif;				
			}
			/*设置a标签 字体12px 颜色 #0066FF*/
			a {
				font-size: 12px;
				color: #0066FF; /*#1E33F7*/
			}
			/*设置未访问的超连接无下划线*/
			a:link {
				text-decoration: none;
			}
			/*设置访问后的连接颜色为#0066ff 也无下划线*/
			a:visited {
				text-decoration: none;
				color: #0066FF;
			}
			/*设置鼠标移到超连接上无下划线颜色为#990099*/
			a:hover {
				text-decoration: none;
				color: #990099; /*颜色变换*/
			}
			/*设置选定的超连接无下划线，颜色为#0066ff*/
			a:active {
				text-decoration: none;
				color: #0066FF;
			}
			/*设置所有td标签*/
			td{
				text-align:left;
				vertical-align:top;
				font-size:12px;
			}
			/*设置所有的hr标签*/
			hr{
				/*颜色*/
				color:#cccccc;
				/*高度*/
				height:1px;
				/*上外边距5px*/
				margin-top:5px;
				/*下外边距5px*/
				margin-bottom:5px;
				/*分隔线如果超出框架部分隐藏*/
				overflow:hidden;
			}
			/*设置h1*/
			h1{
				font-size:14px;
				color:#000000;				
				margin-bottom:5px;
				font-weight:bold;
				display:inline;		
				text-align:left;				
			}
			
			#head{
				/*设置head这个div宽度为100%*/
				width:100%;
			}
			.headtab{
				width:100%;
			}
			.headta td{
				/*设置td内边距上10px 右50px 下25px 左135px*/
				padding:10px 50px 25px 135px;
			}
			
			#menu{
				width:100%;
				background-color:#1c3f09;/*设置背景色*/
				border-top-width:4px;/*设置上边框宽度4px*/
				border-top-style:solid; /*设置上边框样式 实线*/
				border-top-color:#82b211; /*设置上边框的颜色 #82b211*/
				text-align:center;
				font-size:14px;
				padding:10px 0px 10px 0px;
			}
			#menu td{
				text-align:center;
			}
			#menu a{
				font-size:14px;
				color:#ffffff; /*超连接文字颜色*/
				font-weight:bold; /*超连接字体加粗*/
				padding:10px 10px 10px 10px; /*超连接内边距*/
			}
			
			#menu a:link {
				text-decoration: none;
				font-weight: bold;
			}

			#menu a:visited {
				text-decoration: none;
				color: #FFFFFF;
				font-weight: bold;
			}

			#menu a:hover {
				text-decoration: none;
				color: #999999; /*颜色变换*/
				font-weight: bold;
			}

			#menu a:active {
				text-decoration: none;
				color: #FFFFFF;
				font-weight: bold;
			}
			#search{
				width:100%;
				text-align:center;
				color:#ffffff;
				font-weight:bold;
				padding:5px 0px 5px 0px;
				background-color:#b6b684;
			}
			.inputtxt{
				width:130px;
				height:18px;
				border:1px solid #999999;
			}
			/*注册页面content部分整体设计*/
			#content{
				width:900px;
				background-color:#fcfdef;
				border:1px solid #eeeddb;
				margin-right:auto;
				margin-left:auto;
			}
			/*设置边框*/			
			.upline{
				border-bottom-width:1px;
				border-bottom-style:dashed;
				border-bottom-color:#b0bec7;
				padding-top:5px;
				padding-bottom:5px;
				margin:20px;
			}
			/*设置文本框样式*/
			.txtinput{
				margin-left:10px;
				font-size:12px;
				width:150px;
				height:18px;
				border:1px solid #a4b4bd;
			}
			/*设置文本域样式*/
			.txtarea{
				margin-left:10px;
				font-size:12px;
				width:350px;
				height:75px;
				border:1px solid #a4b4bd;
			}
			#foot{
				width:100%;
				background-color:#efeedc;
				margin-top:15px;
			}			
		</style>
	</head>
	<body class="main">
		<!--
			head是由一行两列table完成展示 
		-->
		<div id="head">
		<table class="headtab">
			<tr>
				<td align="left">
					<img src="web/logo.jpg">
				</td>
				<td style="text-align:right">					
					<img src="web/cart.gif">							
					<a>购物车</a>|
					<a>帮助中心</a>|
					<a>我的帐户</a>|
					<a>新用户注册</a>|
					
				</td>
			</tr>
		</table>
		</div>
		<!--
			menu其中就是很多超连接
		-->
		<div id="menu">	
			<table width="100%">
				<tr>
					<td>
						<a href="#">文学</a>			
						<a href="#">生活</a>
						<a href="#">计算机</a>
						<a href="#">外语</a>
						<a href="#">经管</a>
						<a href="#">励志</a>
						<a href="#">社科</a>			
						<a href="#">学术</a>
						<a href="#">少儿</a>
						<a href="#">艺术</a>			
						<a href="#">原版</a>
						<a href="#">科技</a>
						<a href="#">考试</a>			
						<a href="#">生活百科</a>
						<a href="#" style="color:yellow">全部商品目录</a>
					</td>
				</tr>		
			</table>	
		</div>
		<!--
			search是由一行一列table完成
		-->
		<div id="search">
			<table width="100%">
				<tr>
					<td style="text-align:right;padding-right:220px">
						Search
						<input type="text" class="inputtxt">
						<input type="image" src="web/serchbutton.gif" style="margin-bottom:-4px;">						
					</td>
				</tr>
			</table>
		</div>	
		<!--
			
		-->
<div id="content">			
	<form action="registerAction" method="post">
		<table width="850px" border="0" cellspacing="0">
			<tr>
				<td style="padding:30px;">
					<h1>新会员注册</h1>
					<table width="70%" border="0" cellspacing="2" class="upline">
						<tr>
							<td style="text-align:right;">用户名</td>									
							<td><input type="text" name="username" class="txtinput"></td>
							<td><font color="#999999">用户名至少六位</font></td>
						</tr>
						
						<tr>
							<td  style="text-align:right;">密码</td>									
							<td><input type="password" name="password" class="txtinput"></td>									
							<td><font color="#999999">密码至少六位</font></td>
						</tr>
						<tr>
							<td  style="text-align:right;">重复密码</td>									
							<td><input type="password" name="repassword" class="txtinput"></td>									
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td style="text-align:right;width:20%">上传头像</td>									
							<td><input type="file" name="picture" class="txtinput"></td>			
							
						</tr>
						<tr>
							<td style="text-align:right;width:20%">真实姓名</td>									
							<td><input type="text" name="realname" class="txtinput"></td>			
						</tr>
						<tr>
							<td style="text-align:right;width:20%">昵称</td>									
							<td><input type="text" name="nickname" class="txtinput"></td>			
						</tr>
						<tr>
							<td style="text-align:right;width:20%">邮箱</td>									
							<td><input type="text" name="email" class="txtinput"></td>			
							<td>
								<font color="#999999">请输入有效的邮箱地址</font>
							</td>
						</tr>
						<tr>
							<td style="text-align:right;width:20%">地址</td>									
							<td><input type="text" name="address" class="txtinput"></td>			
						</tr>		
						<tr>
							<td  style="text-align:right;width:20%">性别</td>									
							<td colspan="2"><input type="radio" name="gender" value="1" checked>男
							&nbsp;&nbsp;<input type="radio" name="gender" value="0">女</td>
							
						</tr>
						
						<tr>
							<td  style="text-align:right;width:20%">联系电话</td>									
							<td colspan="2"><input type="text" name="telphone" class="txtinput" style="width:350px;"></td>									
							
						</tr>
						
						<tr>
							<td  style="text-align:right;width:20%">个性签名</td>									
							<td colspan="2"><textarea name="sign" class="txtarea"></textarea></td>									
						</tr>
					</table>
					<h1>注册校验</h1>
					<table width="70%" border="0" cellspacing="2" class="upline">
						<tr>
							<td  style="text-align:right;width:20%">输入校验码</td>
							<td><input type="text" name="checkcode" class="txtinput"></td>
							<td>&nbsp;</td>
						</tr>
						
						<tr>
							<td>&nbsp;</td>
							<td colspan="2">
								<img src="images/validateCode.png" class="txtinput" style="height:30px;">
								<a href="#">看不清换一张</a>
							</td>
						</tr>
					</table>
					
					<table width="70%" border="0" cellspacing="2">
						<tr>
							<td style="text-align:center">
								<input type="image" src="web/register.gif">
							</td>									
						</tr>
					</table>
					
				</td>
			</tr>
		</table>
	</form>
	
</div>
		<!--
			foot是由两行两列的table完成。
			但是第一个td合并了2行
		-->
		<div id="foot">
			<table bgcolor="#efeedc" width="100%" align="center">
				<tr>
					<td rowspan="2" style="width:10%">
						<img src="web/logo.jpg" width="195" height="50" style="margin-left:175px;">
					</td>
					<td style="padding-left:50px;padding-top:5px;">
						<a><font color="#747556">联系我们</font></a>:824143077@qq.com

					</td>
				</tr>
				<tr>
					
					<td style="padding-left:50px;">
						<font color="#747556">版权所有&copy;书店保留所有权利</font>
					</td>
				</tr>
				
			</table>
		</div>			
	</body>
</html>