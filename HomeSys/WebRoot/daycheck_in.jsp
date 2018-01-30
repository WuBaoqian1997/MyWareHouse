<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="commTop.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="shortcut icon" href="http://gj.quhuhu.com/_favicon.ico">
<link href="<%=basePath %>/font-awesome/css/font-awesome.min.css" rel="stylesheet">
<title>去呼呼管家酒店版 - 散客步入</title>
<link href="css/ruzhu1.css" rel="stylesheet">
<link href="css/ruzhu2.css" rel="stylesheet">
<script src="laydate/laydate.js"></script>
<style type="text/css">
#m_dayruzhu_main {
	width: 100%;
}

.q-contenter {
	margin-top: 5px;
}
</style>
<style>
	*{margin:0;padding:0;list-style:none;}
	html{background-color:#E3E3E3; font-size:14px; color:#000; font-family:'微软雅黑'}
	h2{line-height:30px; font-size:20px;}
	a,a:hover{ text-decoration:none;}
	pre{font-family:'微软雅黑'}
	.box{width:970px; padding:10px 20px; background-color:#fff; margin:10px auto;}
	.box a{padding-right:20px;}
	.demo1,.demo2,.demo3,.demo4,.demo5,.demo6{margin:25px 0;}
	h3{margin:10px 0;}
	.layinput{height: 22px;line-height: 22px;width: 150px;margin: 0;}
</style>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#ruzhu").click(function() {
		//入住
			$("#guestInfo").submit();
		});
	})
</script>
</head>
<body>

	<!-- contenter -->
	<div id="m_dayruzhu_main">
	<form class="guest-info" id="guestInfo" action="check_in.action" method="post">
		<!--ms-include-->
		<div class="q-main q-check-in">
			<div>
				<ul class="list-inline ul_search_tab">
					<li><label>请选择预订类型</label>
					</li>
					<li class="cursor active"><span class="fw">日租入住</span></li>
				</ul>
			</div>
			<div class="q-checkIn-main">
					<!-- start 表单输入 start -->
					<!--ms-include-->
					<div class="form-filter q-panel">
						<ul class="list-inline form-inline">
						<span style="display:block;float:left;">入住日期：</span>
					   	<span style="display:block;float:left">
					   	<input class="inline laydate-icon" name="orders.startTime" value="" id="start" style="width:200px;">
					   	</span>
							<span style="display:block;float:left;margin-left:10px;">离店日期：</span>
					   	<span style="display:block;float:left">
					   	<input class="inline laydate-icon" name="orders.endTime" value="" id="end" style="width:200px;">
					   	</span>
							<li><label class="w70 mr5 text-right">销售员:</label>${user.staffName}</li>




							<!--ms-if-->

							<!--ms-if-->
							<!--ms-include-end-->

							<li><label class="w70 mr5 text-right"><i
									class="q-icon color-danger">*</i> 房价代码</label> 
									<select name="orders.accommodation.accommodationId"
								class="validate[required] w160 form-control input-sm"
								style="display: inline-block;">
									<c:forEach items="${accommodationList }" var="accommodation">
									<option data-codetype="0" value="${accommodation.accommodationId }" id="priceCode101208">${accommodation.accommodationType }</option>
									</c:forEach>
							</select> 
							<select class="validate[required] w160 form-control input-sm"
								style="display: none;">
									<c:forEach items="${accommodationList }" var="accommodation">
									<option data-codetype="0" value="${accommodation.accommodationId }" id="priceCode101208">${accommodation.accommodationType }</option>
									</c:forEach>
							</select> <select class="w160 form-control input-sm"
								style="display: none;">
									<!--repeat94168984758:end-->
							</select> <!--ms-if--></li>
						</ul>
					</div>
					<!--ms-include-end-->
					<!-- end 表单输入 end -->

					<div class="q-panel">
						<!-- start 表格信息 start -->
						<div class="info-tab" avalonctrl="table">
							<!--ms-include-->
							<table class="q-checkIn-table table table-hover"
								id="checkInTable">
								<colgroup>
									<col width="15%">
									<col width="20%">
									<col width="10%">
									<col width="10%">
									<col width="25%">
									<col width="10%">
								</colgroup>
								<thead>
									<tr>
										<td>房型</td>
										<td>首日房价</td>
										<td>可订数</td>
										<td>安排房间</td>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>${room.roomtype.roomTypeName }</td>
										<td class="day-price-td"><i class="price-ico"> <label>¥</label>
												<input type="text" maxlength="12" value="${room.roomtype.price.routinePrice}"
												class="form-control input-sm w100 validate[required, custom[money]]"
												placeholder="请输入房价" data-errormessage-value-missing="请填写价格"
												data-errormessage-custom-error="价格不能超过999999999.99" name="orders.accountsPayable"
												id="price_0"> </i> <!--ms-if--> <!--ms-if--></td>
										<td>${roomCount }</td>

										<td>
											<span> <label>${room.roomId }</label></span>
											<input type="hidden" value="${room.roomId }" name="orders.room.roomId"/>
									</tr>
								</tbody>
							</table>
						</div>
					</div>

					<div class="q-panel">
						<!--ms-include-->
						
							<div class="w60 mb10 f14 fn-fwb">住客信息</div>
							<ul class="fn-clear">
								<!--repeat443299060751-->
								<li class="row fn-clear">
									<div class="item item-room" style="float:left;line-height:30px;margin-right:10px;">房间：${room.roomId }</div>
									<div class="item item-card" style="float:left;">
										<input type="text" name="customer.customerName"
											class="validate[custom[userName],maxSize[15]] form-control input-sm w200"
											maxlength="15" data-errormessage-custom-error="请输入正确的客户姓名"
											data-errormessage-range-overflow="最多15个字"
											data-prompt-position="topLeft:0,0" placeholder="请输入姓名或扫描身份证"
											autocomplete="off">
									</div>
									
									<div class="item" style="float:left;">
										<input type="text" name="customer.phone"
											class="validate[custom[mobile]] form-control input-sm w200"
											data-errormessage-custom-error="请输入正确的手机号码"
											data-prompt-position="topLeft:0,0" placeholder="请输入手机号">
											 
									</div>
									<div class="item" style="float:left;">
										<!--ms-if-->
									</div></li>
								<!--repeat443299060751-->
								<!--repeat443299060751:end-->
							</ul>
							<!--ms-if-->
						
						<!--ms-include-end-->

						<!-- start 订单备注 -->
						<div class="remark-div">
							<div class="w60 mb10 f14 fn-fwb">订单备注</div>
							<textarea name="orders.remarks" rows="3" maxlength="1000"
								class="form-control validate[maxSize[1000]] input-sm remark-text"
								data-prompt-position="topLeft:70,0"
								data-errormessage-range-overflow="备注最多1000个字"
								id="form-validation-field-0"></textarea>
						</div>
						<!-- end 订单备注 -->
					</div>
				</form>

				<!-- start 操作按钮 start -->
				<!--ms-include-->
				<div class="checkIn-btn text-center">
					<span class="btn btn-success btn-sm w100 fn-fwb f14" id="ruzhu">入住</span>
				</div>
				<!--ms-include-end-->
				<!-- end 操作按钮 end -->
				
			</div>
		</div>
		<!--ms-include-end-->

		<!-- /contenter -->
		
<script>
!function(){
laydate.skin('molv');//切换皮肤，请查看skins下面皮肤库
laydate({elem: '#demo'});//绑定元素
}();
//日期范围限制
var start = {
    elem: '#start',
    format: 'YYYY-MM-DD',
    min: laydate.now(), //设定最小日期为当前日期
    max: '2099-06-16', //最大日期
    istime: true,
    istoday: false,
    choose: function(datas){
         end.min = datas; //开始日选好后，重置结束日的最小日期
         end.start = datas //将结束日的初始值设定为开始日
    }
};
var end = {
    elem: '#end',
    format: 'YYYY-MM-DD',
    min: laydate.now(),
    max: '2099-06-16',
    istime: true,
    istoday: false,
    choose: function(datas){
        start.max = datas; //结束日选好后，充值开始日的最大日期
    }
};
laydate(start);
laydate(end);
//自定义日期格式
laydate({
    elem: '#test1',
    format: 'YYYY年MM月DD日',
    festival: true, //显示节日
    choose: function(datas){ //选择日期完毕的回调
        alert('得到：'+datas);
    }
});
//日期范围限定在昨天到明天
laydate({
    elem: '#hello3',
    min: laydate.now(-1), //-1代表昨天，-2代表前天，以此类推
    max: laydate.now(+1) //+1代表明天，+2代表后天，以此类推
});
</script>
	</div>
</body>
</html>

