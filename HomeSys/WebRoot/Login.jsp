<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<title>去呼呼酒店管理系统</title>
<meta name="author" content="DeathGhost" />
<link rel="stylesheet" type="text/css" href="Login/css/normalize.css" />
<link rel="stylesheet" type="text/css" href="Login/css/zzsc-demo.css">
<link rel="stylesheet" type="text/css" href="Login/assets/less/unlock.css">
<link rel="stylesheet" type="text/css" href="Login/css/style.css" tppabs="css/style.css" />
<style>
body{height:100%;background:#16a085;overflow:hidden;}
canvas{z-index:-1;position:absolute;}
.a { color:#FFF}
.nocode {  
	display: inline-block;
    width: 100px;  
    height: 25px;  
}  
  
.code {  
	display: inline-block;
    color: #ff0000;  
    font-family: Tahoma, Geneva, sans-serif;  
    font-style: italic;  
    font-weight: bold;  
    text-align: center;  
    width: 100px;  
    height: 80px;  
    line-height: 25px;
    cursor: pointer;  
    border:1px solid #e2b4a2;
    background: #e2b4a2;
	float:left;
}  
  
.input {   
	font-size:14px;height:50px;line-height:50px;padding:0px 5%;width:50%;text-indent:2em;border:none;background:#5cbdaa;color:white;
}  
</style>

<script src="Login/js/jquery.js"></script>
<script src="Login/js/Particleground.js" tppabs="Login/js/Particleground.js"></script>
<script>
$(document).ready(function() {
  //粒子背景特效
  $('body').particleground({
    dotColor: '#5cbdaa',
    lineColor: '#5cbdaa'
  });
                    
});
function hiddenBtn(){
	$(".submit_btn").hide();
	$("#hide").hide();
}
</script>
</head>
<body onLoad="hiddenBtn()">
<form action="login.action"  method="post">
<dl class="admin_login">
 <dt>
  <strong>站点后台管理系统</strong>
  <em>Management System</em>
 </dt>
 <dd class="user_icon">
  <input type="text" placeholder="请输入账号" class="login_txtbx" name="staff.staffName" value="111"/>
 </dd>
 <dd class="pwd_icon">
  <input type="password" placeholder="请输入密码" class="login_txtbx" name="staff.pwd" value="111"/>
 </dd>
 <dd class="val_icon">
  <div class="checkcode"></div>
 </dd>

 <dd>
  	<input type="submit" value="立即登陆" class="submit_btn"/>
  <s:property value="msg"/>
 </dd>
 <dd>
<p><a href="" target="_blank" id="a">忘记密码！</a> </p>
 </dd>
</dl>
</form>
<script type="text/javascript" src="Login/js/code.js"></script>  
<script src='Login/assets/js/unlock.js'></script>
<script type="text/javascript">
	$('.checkcode').slideToUnlock({
		height : 50,     
		width : 400,
		bgColor :'#f00',			//滑动前颜色
		progressColor : '#f60',		//滑动中颜色
		succColor :'#00ff00' ,		//成功后颜色
		text : '请滑动方块',			//滑动前显示文字
		succText : '验证成功'			//成功后显示文
	});

</script>
</body>
</html>
