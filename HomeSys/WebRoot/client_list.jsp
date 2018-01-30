<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="commTop.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>客人列表</title>
<link href="css/ruzhu1.css" rel="stylesheet">
<link href="css/ruzhu2.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<style>
* {
	margin: 0;
	padding: 0;
	list-style: none;
}

body {
	font-size: 14px;
}

.nav {
	width: 100px;
	height: 30px;
	margin: 20px auto;
	text-align: center;
}

.nav p {
	display: block;
	padding-left: 10px;
	line-height: 30px;
	border: 1px solid #5CB85C;
}

.set {
	background: url(images/btn_2.png) 165px 10px no-repeat;
}

.select {
	background: url(images/btn_1.png) 165px 10px no-repeat;
}

.new {
	width: 100px;
	position: absolute;
	border: 1px solid #5CB85C;
	display: none;
	text-align: center;
}

.nav ul li {
	line-height: 30px;
	padding-left: 10px;
}

.nav ul li:hover {
	background: #5CB85C;
	color: #FFF;
}
</style>
<style type="text/css">
#m_main {
	margin: 20px;
}

.form-inline {
	height: 90px;
	padding: 15px;
	margin-bottom: 15px;
	position: relative;
	background: #fff;
	line-height: 50px;
	font-size: 14px;
	border-radius: 2px;
	box-shadow: 1px 1px 1px rgba(0, 0, 0, 0.1);
}

.fn-clear {
	font-weight: bolder;
	margin-bottom: 20px;
	margin-top: 20px;
}
</style>
</head>
<body>
	<div id="m_main">
		<div class="guest-main">
			<!--ms-include-->
			<div class="guest-query">
				<div class="form-inline">
					<label class="mr10">快速查询</label> <input type="text"
						class="form-control input-sm w200 mr10" placeholder="请输入客人姓名或房间号">
					<button type="button" class="btn btn-sm btn-success mr10">查询</button>

					<button type="button" class="btn btn-sm btn-delicate fn-right">
						<i class="i-icon"></i>导出
					</button>
				</div>
				<!--ms-if-->
			</div>
			<div class="fn-clear">
				<div class="q-guest-total fn-left">
					订单数：<span>1</span>房间数：1
				</div>
				<!--ms-if-->
			</div>
			<!--ms-include-end-->
			<div class="guest-list-wrap">
				<!--ms-include-->
				<div class="guest-list" id="guestList">
					<table class="table table-hover">
						<thead>
							<!--ms-include-->
							<tr>
								<td width="130" class="text-left">订单状态/订单号</td>
								<td width="150" class="text-left">客人信息</td>
								<td width="120" class="text-center">房间信息</td>
								<td width="160"><a href="javascript:void(0);" id="checkIn">入离时间
										<i class="i-icon fn-vam"></i> <!--ms-if--> </a></td>
								<td width="100" class="text-left"><a
									href="javascript:void(0);">余额 <i class="i-icon fn-vam"></i>
										<!--ms-if--> </a></td>
								<td width="105" class="pos-relative"><a href="javascript:;"
									class="from-co"> <span>渠道</span> <i class="q-icon icon-up"></i>
										<!--ms-if--> <!--ms-if--> </a></td>
								<td width="135" class="text-left">备注</td>
								<td width="160">操作</td>
							</tr>
							<!--ms-include-end-->
						</thead>
						<tbody>
							<!--each625098570043-->
							<tr class="">
								<td class="ml5 text-left">
									<div>${orders.orderstatus.orderStatusName }</div>
									<div class="font-gray">${orders.orderId }</div></td>
								<td class="text-left">
									<div>
										<span>${orders.room.customer.customerName }</span>
										<!--ms-if-->
									</div>
									<div></div> <!--ms-if--> <!--ms-if--></td>
								<td class="text-center">
									<div>
										<!--ms-if-->
										<!--ms-if-->
										<span class="tb-item-ellipsis tb-item-roomtypename"
											title="${orders.room.roomtype.roomTypeName }">${orders.room.roomtype.roomTypeName }</span> <span
											class="tb-item-ellipsis tb-item-roomno" title="104">${orders.room.roomId }</span>
									</div>
									<div>
										<span class="color-danger fn-fwb">¥${orders.room.customer.houseing }</span>
									</div></td>
								<td>入住：${orders.room.customer.starttime }<br> 离店：${orders.room.customer.endtime }</td>
								<td class="text-left color-danger fn-fwb"><span
									class="tb-item-ellipsis tb-item-price" title="1348.00">¥${orders.room.customer.balance }</span>
								</td>
								<td class="text-center"><span class="tb-item" title="线下客人">线下客人</span>
								</td>
								<td class="text-left"><label
									class="tb-item-remark j-remark" title="${orders.remarks }
">没有订单备注
								</label></td>
								<td class="operate-td"><label class="w120"> <a><div class="nav" id="nav">
												<p class="set">更多</p>
												<ul class="new">
												
													<li><a href="viewFinance.action?ordersid=${orders.orderId }">查看</a>
													</li>
														<li id="jiezhang">
														<input type="hidden" value="${orders.orderId}" id="zhujing_ordersid"/>
															结账退房
														</li>
													
													<li>延住</li>
													<li>交押金</li>
													<li>调价</li>
													<li>打登记单</li>
													<li>联房</li>
													<li>同住</li>
													<li>换房</li>
												</ul>
											</div> </a> <!--ms-if--> </label></td>
							</tr>
							<!--each625098570043:end-->
						</tbody>
					</table>
					<!--ms-if-->
					<!--ms-if-->
				</div>
			</div>
		</div>
	</div>

	<script type="text/javascript">
$(function(){

	$(".nav p").click(function(){
		var ul=$(".new");
		if(ul.css("display")=="none"){
			ul.slideDown();
		}else{
			ul.slideUp();
		}
	});
	
	$(".set").click(function(){
		var _name = $(this).attr("name");
		if( $("[name="+_name+"]").length > 1 ){
			$("[name="+_name+"]").removeClass("select");
			$(this).addClass("select");
		} else {
			if( $(this).hasClass("select") ){
				$(this).removeClass("select");
			} else {
				$(this).addClass("select");
			}
		}
	});
	
	$(".nav li").click(function(){
		var li=$(this).text();
		$(".nav p").html(li);
		$(".new").hide();
		/*$(".set").css({background:'none'});*/
		$("p").removeClass("select") ;   
	});
})
</script>
<script type="text/javascript" src='<%=basePath %>/js/jquery-1.8.3.min.js'></script>
<script src="<%=basePath %>/layer/layer.js"></script>
<script type="text/javascript">
            //弹出一个iframe层
                $(function(){
                var ordersid = $("#zhujing_ordersid").val();
                    $("#jiezhang").click(function(){
                          layer.open({
                              type: 2,
                              title: '结账退房',
                              maxmin: true,
                              shadeClose: true, //点击遮罩关闭层
                              area : ['400px' , '450px'],
                              content: 'getQuitMoney.action?ordersid='+ordersid,
                              end:function(){
                              	//关闭子窗口刷新父窗口
                              	location.href="getRoomList.action";
                              }
                              });
                    });

                });
        </script>

</body>
</html>
