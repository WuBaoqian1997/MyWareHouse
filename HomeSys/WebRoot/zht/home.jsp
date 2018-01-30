<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="../commTop.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet"
	href="<%=basePath %>/dakang/plugins/layui/css/layui.css" media="all" />
<link rel="stylesheet" href="<%=basePath %>/dakang/css/global.css"
	media="all">
	<link rel="stylesheet" type="<%=basePath %>/dakang/text/css"
		href="http://www.jq22.com/jquery/font-awesome.4.6.0.css">
		<link rel="stylesheet" href="<%=basePath %>/dakang/css/table.css" />
		<link href="<%=basePath %>/css/ruzhu1.css" rel="stylesheet">
			<link href="<%=basePath %>/css/ruzhu2.css" rel="stylesheet">
				<link href="<%=basePath %>/font-awesome/css/font-awesome.min.css"
					rel="stylesheet">

					<title>房态列表</title>
					<style type="text/css">
* {
	margin: 0px;
	padding: 0px;
}

#m_main {
	width: 100%;
	height: 100%;
}

.layui-nav .layui-nav-item a {
	color: black;
}

.Yuding {
	width: 150px;
	height: 100px;
	background-color: red;
	float: left;
	margin: 5px;
}

.show1 {
	width: 150px;
	height: 100px;
	background-color: rgb(0, 104, 245);
	float: left;
	margin: 5px;
}

ul li {
	list-style: none;
	font-size: 14px;
	line-height: 20px;
	padding-left: 10px;
	padding-top: 10px;
}

.show_1 {
	position: relative;
	width: 470px;
	background-color: white;
	top: 35px;
	line-height: 20px;
}

.show_1class {
	position: relative;
	width: 470px;
	background-color: white;
	top: 35px;
	right: 320px;
	line-height: 20px;
}

.show_1 a {
	margin: 6px;
	margin-right: 3px;
}

.Zhujing {
	width: 150px;
	height: 100px;
	background-color: green;
	float: left;
	margin: 5px;
}

.Zhuzang {
	width: 150px;
	height: 100px;
	background-color: #360;
	float: left;
	margin: 5px;
}

.kozang {
	width: 150px;
	height: 100px;
	background-color: #666;
	float: left;
	margin: 5px;
}

.weixui {
	width: 150px;
	height: 100px;
	background-color: #FC0;
	float: left;
	margin: 5px;
}
</style>
<script type="text/javascript" src='<%=basePath %>/js/jquery-1.8.3.min.js'></script>

<script type="text/javascript">
	$(function(){
        /*隐藏下面的div*/
     $(".show_1").hide();
     /*鼠标悬乎显示，离开隐藏   .show1是鼠标要悬乎的div,.show_1是要显示的div，鼠标离开的时候这个div隐藏*/
     
     $(".show1, .Zhujing , .Zhuzang , .kozang , .weixui,.Yuding").hover(function(){
        //父容器的宽
        var pwidth=$(this).parent().width();
        //当前div的左边距
        var dleft=$(this).offset().left;
        //
        var swidth=$(this).find(".show_1").width();
        
        var newWidth=dleft+swidth;
        //如果超出的话
        if(newWidth>pwidth){
            $(".show_1").addClass("show_1class");
        }else{
            $(".show_1").removeClass("show_1class");
        }
        
        $(this).find(".show_1").show();
        $(this).find(".show_1").find(".username").html($("._username").html());
   },function(){
      $(".show_1").hide();
  });
     
 
     
 })
 $(function(){
 	/*单击房态，显示具体信息,住净*/
/*    $(".Zhujing").click(function(){
   		
     });  */
     /*单击房态，显示具体信息。住脏*/
   /* $(".Zhuzang").click(function(){
   		var ordersid = $(this).find("#zhuzang_ordersid").val();
        location.href="client_list.action?ordersid="+ordersid;
     }); */
 })
</script>

</head>

<body>

	<div id="m_main">
		<c:forEach items="${roomsList}" var="room">
			<c:if test="${room.roomstatus.roomStatusName == '空净'}">
				<div class="show1">
					<ul>
						<li><span class="_type_name">${room.roomId
								}&nbsp;&nbsp;&nbsp;&nbsp;${room.roomtype.roomTypeName }</span></li>
					</ul>
			</c:if>
			<c:if test="${room.roomstatus.roomStatusName == '住净'}">
				<div class="Zhujing">
				
					<ul>
						<li><span class="_type_name">${room.roomId
								}&nbsp;&nbsp;&nbsp;&nbsp;${room.roomtype.roomTypeName }</span></li>
						<li><span class="_username">${room.customer.customerName
								}</span></li>
					</ul>
			</c:if>
			<c:if test="${room.roomstatus.roomStatusName == '住脏'}">
				<div class="Zhuzang">
					<input type="hidden" value="${room.roomId}" id="zhuzang_ordersid"/>
					<ul>
						<li><span class="_type_name">${room.roomId
								}&nbsp;&nbsp;&nbsp;&nbsp;${room.roomtype.roomTypeName }</span></li>
						<li><span class="_username">${room.customer.customerName
								}</span></li>
					</ul>
			</c:if>
			<c:if test="${room.roomstatus.roomStatusName == '空脏'}">
				<div class="kozang">
					<ul>
						<li><span class="_type_name">${room.roomId
								}&nbsp;&nbsp;&nbsp;&nbsp;${room.roomtype.roomTypeName }</span></li>
					</ul>
			</c:if>
			<c:if test="${room.roomstatus.roomStatusName == '维修'}">
				<div class="weixui">
					<ul>
						<li><span class="_type_name">${room.roomId
								}&nbsp;&nbsp;&nbsp;&nbsp;${room.roomtype.roomTypeName }</span></li>
						开始时间：2019-10-10
						<br />
						<br /> 结束时间：2019-10-11
					</ul>
			</c:if>
			<c:if test="${room.roomstatus.roomStatusName == '预定'}">
				<div class="Yuding">
					<ul>
						<li><span class="_type_name">${room.roomId
								}&nbsp;&nbsp;${room.roomtype.roomTypeName }</span></li>
						<li><span class="_username">${room.customer.customerName
								}</span></li>
					</ul>
			</c:if>
			<ul class="show_1">
				<blockquote class="layui-elem-quote"
					style="background-color: white;">
					<span class="type_name">${room.roomId
						}&nbsp;&nbsp;${room.roomtype.roomTypeName }</span>
						
						 <span class="username1"
							style="margin-left: 300px;">
								
							</span> <br /> <br />
					<c:if test="${room.roomstatus.roomStatusName != '维修'}">
						<c:if test="${room.roomstatus.roomStatusName eq '空净'}">
							<a href="getOrdersInfo.action?roomid=${room.roomId }"> <span
								class="btn btn-delicate btn-xs"> <i
									class="fa fa-sign-out"></i>&nbsp;&nbsp;日租入住 </span> </a>
							<a href="<%=basePath %>/daycheck_in.jsp"> <span
								class="btn btn-delicate btn-xs"> <i class="fa fa-clock-o"></i>&nbsp;&nbsp;时租入住
							</span> </a>
						</c:if>
						<c:if
							test="${room.roomstatus.roomStatusName eq '空脏' ||room.roomstatus.roomStatusName eq '住脏'}">
							<a href="updZhijing.action?room.roomId=${room.roomId }"> <span
								class="btn btn-delicate btn-xs"> <i class="fa fa-trash-o"></i>&nbsp;&nbsp;置净
							</span> </a>
						</c:if>
						<c:if
							test="${room.roomstatus.roomStatusName eq '空净' ||room.roomstatus.roomStatusName eq '住净'}">
							<a href="updZhizang.action?room.roomId=${room.roomId }"> <span
								class="btn btn-delicate btn-xs"> <i class="fa fa-trash-o"></i>&nbsp;&nbsp;置脏
							</span> </a>
						</c:if>

						<c:if
							test="${room.roomstatus.roomStatusName eq '住净' ||room.roomstatus.roomStatusName eq '住脏'}">
							<a href="javascript:function();" class="caiwu">
							<input type="hidden" value="${room.roomId}" id="zhujing_ordersid"/> <span
								class="btn btn-delicate btn-xs"> <i
									class="fa fa-rmb"></i>&nbsp;&nbsp;财务 </span>
									
									 </a>
							<a href="javascript:function();" class="updatePrice">
							<input type="hidden" value="${room.roomId}" id="update_ordersid"/> <span
							 <span 
								class="btn btn-delicate btn-xs"> <i
									class="fa fa-exchange"></i>&nbsp;&nbsp;调价 </span> </a> 
									
							<a href="javascript:function();" class="swopRoom">
								<input type="hidden" value="${room.roomId}" id="swop_ordersid"/> <span
								 <span 
									class="btn btn-delicate btn-xs"> <i
							class="fa fa-refresh"></i>&nbsp;&nbsp;换房 </span> </a> 
							
						</c:if>
						<c:if
							test="${room.roomstatus.roomStatusName eq '预定'}">
							<a href="getOrdersInfo.action?roomid=${room.roomId }"> <span
								class="btn btn-delicate btn-xs"> <i
									class="fa fa-sign-out"></i>&nbsp;&nbsp;日租入住 </span> </a>
						</c:if>
						<a href="<%=basePath %>/daycheck_in.jsp"> <span
							class="btn btn-delicate btn-xs"> <i class="fa fa-ban"></i>&nbsp;&nbsp;锁房
						</span> </a>
						<a href="updWeixui.action?room.roomId=${room.roomId }"> <span
							class="btn btn-delicate btn-xs"> <i class="fa fa-wrench"></i>&nbsp;&nbsp;维修房
						</span> </a>
					
					</c:if>
					<c:if test="${room.roomstatus.roomStatusName == '维修'}">
						<a href="updJieShuWeixui.action?room.roomId=${room.roomId }">
							<span class="btn btn-delicate btn-xs"> <i
								class="fa fa-wrench"></i>&nbsp;&nbsp;结束维修</span> </a>
					</c:if>
					<c:if
						test="${room.roomstatus.roomStatusName eq '住净' ||room.roomstatus.roomStatusName eq '住脏'}">
						<br/>
                    <div style="background-color: #f6f6f6;font-size:14px;">
                        <span >入住：${room.customer.starttime}</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <span>离店：${room.customer.endtime }</span><br/>
                        <span >今日房价：￥${room.customer.houseing}</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <span>消费：￥${room.customer.accountsPayable }</span><br/>
                        <span >收款金额：￥${room.customer.deposit}</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <span>余额：￥${room.customer.deposit-room.customer.accountsPayable}</span><br/>
						<br/>
					</c:if>
					<c:if
						test="${room.roomstatus.roomStatusName eq '预定'}">
						<br/>
                    <div style="background-color: #f6f6f6;font-size:14px;">
                        <span >入住：${room.customer.starttime}</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <span>离店：${room.customer.endtime }</span><br/>
                        <span>预订人：${room.customer.customerName }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <span >当日房价：￥${room.customer.houseing}</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<br/>
					</c:if>

				</blockquote>
			</ul>
	</div>
	</c:forEach>
	</div>

<script type="text/javascript" src='<%=basePath %>/js/jquery-1.8.3.min.js'></script>
<script src="<%=basePath %>/layer/layer.js"></script>
<script type="text/javascript">
            //弹出一个iframe层
                $(function(){
                	//财务
                	$(".caiwu").click(function(){
                		var ordersid = $(this).find("#zhujing_ordersid").val();
        				location.href="client_list.action?ordersid="+ordersid;
                	});
                	
                	//调价
                    $(".updatePrice").click(function(){
                    var ordersid = $(this).find("#update_ordersid").val();
                          layer.open({
                              type: 2,
                              title: '调房价',
                              maxmin: true,
                              shadeClose: true, //点击遮罩关闭层
                              area : ['400px' , '450px'],
                              content: 'v_updateHousePrice.action?ordersid='+ordersid,
                              end:function(){
                              		//关闭窗口的时候刷新父页面
                              	location.href="getRoomList.action";
                              }
                              });
                    });
                    //$(".Zhujing").unbind("click");
                    
                    //换房
                    $(".swopRoom").click(function(){
                    var ordersid = $(this).find("#swop_ordersid").val();
                          layer.open({
                              type: 2,
                              title: '换房',
                              maxmin: true,
                              shadeClose: true, //点击遮罩关闭层
                              area : ['400px' , '450px'],
                              content: 'v_swopRoom.action?ordersid='+ordersid,
                              end:function(){
                              		//关闭窗口的时候刷新父页面
                              	location.href="getRoomList.action";
                              }
                              });
                    });
                });
        </script>
</body>
</html>

