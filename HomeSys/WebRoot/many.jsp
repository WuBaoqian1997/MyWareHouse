<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head>
<meta charset="utf-8">
<title>去呼呼酒店管理系统</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no">
<link rel="stylesheet" href="plugins/layui/css/layui.css" media="all" />
<link rel="stylesheet" href="css/tapoo.css" media="all">
<link rel="stylesheet" type="text/css"
	href="http://www.jq22.com/jquery/font-awesome.4.6.0.css">
<!--头部-->
<link rel="stylesheet" href="css/global.css" type="text/css" />
<link rel="stylesheet" href="css/index.css" type="text/css" />
<link rel="stylesheet" href="css/menu.css" type="text/css" />
<script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="js/kandtabs/kandytabs.pack.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<link rel="stylesheet" href="js/kandtabs/kandytabs.css" type="text/css" />
<script src="js/autoheight.js" type="text/javascript"></script>
<link href="css/lanrenzhijia.css" rel="stylesheet" type="text/css" />
<!--添加-->
<script src="dakang/js/bootstrap.min.js"></script>
<script src="dakang/js/jquery.js"></script>
<link rel="stylesheet" href="js/kandtabs/kandytabs.css" type="text/css" />
<script src="js/autoheight.js" type="text/javascript"></script>
<link href="css/lanrenzhijia.css" rel="stylesheet" type="text/css" />
<link href="dakang/assets/font-awesome/css/font-awesome.css"
	rel="stylesheet" />
<link href="dakang/css/style.css" rel="stylesheet">
<link href="dakang/css/bootstrap1.min.css" rel="stylesheet">
</head>
<body>
	<!--头部-->
	<div class="header" region="north" border="true">
		<div class="logo fleft">
			<img src="images/logo2.png" width="344" height="49" />
		</div>

		<div id="info_m" style="width:250px;float:left;padding-left:500px;line-height:80px;">
			<a href="getRoomAndRoomType.action">
				新建预定
			</a>&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="getRoomList.action">
				实时房态
			</a>
		</div>
		<div class="dingwei">
			
			<div class="top-nav ">
				<li class="dropdown"><a data-toggle="dropdown"
					class="dropdown-toggle" href="#"> <img alt=""
						src="dakang/img/avatar1_small.jpg"> <span class="username">你好,${user.staffName }</span>
						<b class="caret"></b> </a>&nbsp;&nbsp;&nbsp;&nbsp;
					<ul class="dropdown-menu extended logout">
						<div class="log-arrow-up"></div>
						<li><a href="#"><i class="icon-suitcase"></i>任务</a>
						</li>
						<li><a href="#"><i class="icon-cog"></i> 日志</a>
						</li>
						<li><a href="#"><i class="icon-bell-alt"></i> 办公</a>
						</li>
						 <li><a href="exit.action"><i class="icon-key"></i> 退出</a></li>
						</li>
					</ul></li>
			</div>
		</div>
	</div>
	</div>
	<!--身体-->
	<div class="layui-side layui-bg-black" id="admin-side">
		<div class="layui-side-scroll" id="admin-navbar-side"
			lay-filter="side"></div>
	</div>
	<div class="layui-body" style="bottom: 0; id="admin-body">
		<div class="layui-tab admin-nav-card layui-tab-brief"
			lay-filter="admin-tab">
			<ul class="layui-tab-title">
				<li class="layui-this"><i class="fa fa-dashboard"
					aria-hidden="true"></i> <cite>实时房态</cite></li>
			</ul>
			<div class="layui-tab-content"
				style="min-height: 150px; padding: 0px 0 0 0;">
				<div class="layui-tab-item layui-show">
					<iframe src="getRoomList.action"></iframe>
				</div>
			</div>
		</div>
	</div>
	<!--属性菜单-->
	<div class="site-mobile-shade"></div>
	<script type="text/javascript" src="plugins/layui/layui.js"></script>
	<script type="text/javascript" src="datas/nav.js"></script>
	<script src="js/index.js"></script>
	<script>
				layui.use('layer', function() {
					var $ = layui.jquery,
						layer = layui.layer;
					$('#video1').on('click', function() {
						layer.open({
							title: 'YouTube',
							maxmin: true,
							type: 2,
							content: 'video.html',
							area: ['800px', '500px']
						});
					});

				});
			</script>
	</div>
</body>
</html>
