<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>联房客人</title>
<link href="css/ruzhu1.css" rel="stylesheet">
<link href="css/ruzhu2.css" rel="stylesheet">
<style type="text/css">
.finance-price {
	margin-left: 150px;
	background-color: #FFFDD9;
	float: left;
	height: 30px;
	border: 1px solid #F7D0A6;
}

.finance-price ul li {
	padding-left: 5px;
	display: block width:  100px;
	float: left;
	line-height: 30px;
}

#m_caiwumain {
	margin-top: 20px;
	margin-left: 20px;
	display: none;
}
</style>
</head>

<body>

	<div style="margin-top: 20px;margin-left: 20px;">
		<div class="g-f-right j-f-right order-detail-wrapper">
			<div class="order-info-field">
				<ul class="fn-clear">
					<li>订单号：17072272169873072</li>
				</ul>
			</div>
			<!--ms-include-->
			<div class="j-f-right-content f-right-content mt20">
				<ul class="q-tabs" id="fixedWrapper"
					style="position: relative; top: 0px; width: 100%; background-color: rgb(255, 255, 255); z-index: 7;">
					<li class="active"><a href="javascript:;" id="lianfangkeren">联房客人</a>
					</li>
					<li><a href="javascript:;" id="caiwu">财务明细</a></li>
				</ul>
				<div style="display: none; height: 44px;"></div>
				<div class="g-f-table j-f-table" id="lainfang">
					<form id="connectOrderForm">
						<div class="">
							<table class="table table-hover text-center q-panel">
								<thead>
									<tr>
										<td class="w50 text-left"><label
											class="label-checkbox w50 ml5"> <input id="seleteAll"
												checked="checked" type="checkbox"> <i
												class="i-checkbox"></i> </label></td>
										<td><label class="w50">状态</label>
										</td>
										<td><label class="w80">房号</label>
										</td>
										<td class="text-left"><label class="w120">房型</label>
										</td>
										<td><label class="w140">入离时间</label>
										</td>
										<td><label class="w120">姓名</label>
										</td>
										<td><label class="w120">手机号</label>
										</td>
										<td class="min-w120"><label class="w120">证件类型</label>
										</td>
										<td><label class="w120">证件号</label>
										</td>
									</tr>
								</thead>
								<tbody>
									<!--repeat975422654908-->
									<tr>
										<td class="w50 text-left" id="checkboxCol">
											<div class="checkbox-wrapper w50 inline-block ml5">
												<label class="label-checkbox"> <input
													checked="checked" type="checkbox"> <!--ms-if--> <i
													class="i-checkbox checked"></i> </label>
												<!--ms-if-->
											</div></td>
										<td><label class="w50">${orders.orderstatus.orderStatusName }</label>
										</td>
										<td><label class="w80 fn-text-overflow" title="104">${orders.room.roomId }</label>
											<!--ms-if--> <!--ms-if--></td>
										<td>
											<div class="w120 text-left text-overflow inline-block"
												title="${orders.room.roomtype.roomTypeName }">${orders.room.roomtype.roomTypeName }</div></td>
										
										<td class="w140 text-center">
											<div class="text-center">入住:${orders.startTime }</div>
											<div class="text-center">离店:${orders.endTime }</div></td>
										<td><input maxlength="15"
											class="validate[custom[userName],maxSize[15]] form-control input-sm w120 inline-block"
											placeholder="请输入客人姓名" autocomplete="off" value="${orders.customer.customerName }"
											type="text"> <!--ms-if--></td>
										<td><input maxlength="15"
											class="validate[custom[mobile]] form-control input-sm w120 inline-block" value="${orders.customer.phone }"
											placeholder="请输入手机号" type="text"> <!--ms-if--></td>
										<td><select
											class="form-control input-sm w120 inline-block"
											style="display: inline-block;">
												<!--repeat244110988154-->
												<option value="11" selected="selected">身份证</option>
												<!--repeat244110988154-->
												<option value="12">户口薄</option>
												<!--repeat244110988154-->
												<option value="13">外交护照</option>
												<!--repeat244110988154-->
												<option value="14">普通护照</option>
												<!--repeat244110988154-->
												<option value="15">公务护照</option>
												<!--repeat244110988154-->
												<option value="16">军官证</option>
												<!--repeat244110988154-->
												<option value="17">警官证</option>
												<!--repeat244110988154-->
												<option value="18">士兵证</option>
												<!--repeat244110988154-->
												<option value="19">通行证</option>
												<!--repeat244110988154-->
												<option value="20">其它</option>
												<!--repeat244110988154-->
												<!--repeat244110988154:end-->
										</select> <select class="form-control input-sm w120 inline-block"
											disabled="true" style="display: none;">
												<!--repeat622333762966-->
												<option value="11" selected="selected">身份证</option>
												<!--repeat622333762966-->
												<option value="12">户口薄</option>
												<!--repeat622333762966-->
												<option value="13">外交护照</option>
												<!--repeat622333762966-->
												<option value="14">普通护照</option>
												<!--repeat622333762966-->
												<option value="15">公务护照</option>
												<!--repeat622333762966-->
												<option value="16">军官证</option>
												<!--repeat622333762966-->
												<option value="17">警官证</option>
												<!--repeat622333762966-->
												<option value="18">士兵证</option>
												<!--repeat622333762966-->
												<option value="19">通行证</option>
												<!--repeat622333762966-->
												<option value="20">其它</option>
												<!--repeat622333762966-->
												<!--repeat622333762966:end-->
										</select></td>
										<td><input
											class="form-control input-sm w120 inline-block validate[custom[chinaId]]"
											placeholder="请输入证件号" maxlength="40" id="credType0"
											type="text" value="${orders.customer.idnumber }"> <!--ms-if--></td>
									</tr>
									<!--repeat975422654908:end-->
								</tbody>
							</table>
						</div>
						<!--ms-if-->
					</form>
				</div>

			</div>
			<!--ms-include-end-->
		</div>
		<!--ms-include-->
		<div class="g-f-btn j-btn-w" id="bottom_btn">
			<button type="button" class="btn btn-success btn-sm  mr10"
				style="display: inline-block;">扫描身份证</button>
			<button type="button" class="btn btn-default btn-sm  mr10"
				disabled="disabled" style="display: none;">扫描身份证</button>

			<button type="button" class="btn btn-success btn-sm  mr10"
				style="display: none;">入住</button>
			<button type="button" class="btn btn-default btn-sm  mr10"
				disabled="disabled" style="display: inline-block;">入住</button>

			<button type="button" id="jiaoyajing"
				class="btn btn-success btn-sm  mr10" style="display: inline-block;">交押金</button>
			<button type="button" class="btn btn-default btn-sm  mr10"
				disabled="disabled" style="display: none;">交押金</button>

			<button type="button" class="btn btn-success btn-sm  mr10"
				style="display: inline-block;">打登记单</button>
			<button type="button" class="btn btn-default btn-sm  mr10"
				disabled="disabled" style="display: none;">打登记单</button>


		</div>
		<!--ms-include-end-->
	</div>


	<!-- 财务明细-->

	<!-- contenter -->
	<div id="m_caiwumain">

		<div
			class="q-main spacer-main spacer-sidebar finance-order order-detail-wrapper">

			<!--ms-include-->
			<div class="detail-wrapper q-panel">
				<div id="fixedWrapper"
					style="position: relative; top: 0px; width: 100%; background-color: rgb(255, 255, 255); z-index: 7;">

					<div class="finance-filter">
						<div class="finance-category form-inline" style="float: left;">
							<br /> <label>财务类别</label>&nbsp;&nbsp;&nbsp;&nbsp; <label
								class="label-radio"> <input class="c-r-valign" value="0"
								type="radio" name="caiwu_type"> <i class="i-radio"></i>全部
							</label> &nbsp;&nbsp;&nbsp;&nbsp; <label class="label-radio"> <input
								class="c-r-valign" value="0" type="radio" name="caiwu_type">
								<i class="i-radio"></i>未结账 </label> &nbsp;&nbsp;&nbsp;&nbsp; <label
								class="label-radio"> <input class="c-r-valign" value="0"
								type="radio" name="caiwu_type"> <i class="i-radio"></i>已结账
							</label> &nbsp;&nbsp;&nbsp;&nbsp; <label class="label-radio"> <input
								class="c-r-valign" value="0" type="radio" name="caiwu_type">
								<i class="i-radio"></i>转出 </label>

						</div>
						<div class="finance-price">
							<ul class="fn-clear">
								<li>消费：¥1180.00</li>
								<li>付款：¥0.00</li>
								<li>余额：<span class="color-danger">¥1180.00</span>
								</li>
								<li>预授权：<a href="javascript:;" class="color-blue">¥0.00</a>
								</li>
								<li>发票：<a href="javascript:;" class="color-blue">¥0.00</a>
								</li>
							</ul>
						</div>


					</div>
				</div>
				<div style="display: none; height: 82px;"></div>
				<div class="finance-table">
					<table class="table table-hover">
						<thead>
							<tr>
								<td width="8%">
									<div class="first-column">
										<label class="label-checkbox inline-block"> <input
											class="checkbox" type="checkbox"> <i
											class="i-checkbox"></i>房号 </label>
									</div></td>
								<td class="text-center" width="8%">项目名称</td>
								<td class="text-center" width="8%">消费</td>
								<td class="text-center" width="8%">付款</td>
								<td class="text-center" width="8%">营业日</td>
								<td class="text-center" width="12%">操作人</td>
								<td class="text-center" width="10%">状态</td>
								<td width="10%">备注</td>
								<td class="text-center" width="18%">操作</td>
							</tr>
						</thead>
						<tbody>
							<!--each457146240464-->
							<tr>
								<td>
									<div class="first-column">
										<label class="label-checkbox inline-block"> <input
											class="checkbox" type="checkbox"> <i
											class="i-checkbox"></i>104 </label>
									</div></td>
								<td class="text-center"><span>小商品</span> <!--ms-if--> <!--ms-if-->
								</td>
								<td class="text-center"><span>¥600.00</span></td>
								<td class="text-center">
									<!--ms-if--></td>
								<td class="text-center">2017-05-01</td>
								<td class="text-center">中班-穆雄雄<br>2017-07-22 20:47:45
								</td>
								<td class="text-center">未结</td>
								<td><span title=""></span></td>
								<td class="text-center">
									<button type="button" class="btn btn-default btn-sm btn-xs mr5">拆账</button>
									<button type="button" class="btn btn-default btn-sm btn-xs mr5">冲账</button>
									<!--ms-if-->
									<button type="button" class="btn btn-default btn-sm btn-xs">修改备注</button>
								</td>
							</tr>
							<!--repeat962656636025-->
							<!--repeat962656636025:end-->
							<!--each457146240464-->
							<tr>
								<td>
									<div class="first-column">
										<label class="label-checkbox inline-block"> <input
											class="checkbox" type="checkbox"> <i
											class="i-checkbox"></i>104 </label>
									</div></td>
								<td class="text-center"><span>小商品</span> <!--ms-if--> <!--ms-if-->
								</td>
								<td class="text-center"><span>¥500.00</span></td>
								<td class="text-center">
									<!--ms-if--></td>
								<td class="text-center">2017-05-01</td>
								<td class="text-center">中班-穆雄雄<br>2017-07-22 20:47:29
								</td>
								<td class="text-center">未结</td>
								<td><span title=""></span></td>
								<td class="text-center">
									<button type="button" class="btn btn-default btn-sm btn-xs mr5">拆账</button>
									<button type="button" class="btn btn-default btn-sm btn-xs mr5">冲账</button>
									<!--ms-if-->
									<button type="button" class="btn btn-default btn-sm btn-xs">修改备注</button>
								</td>
							</tr>
							<!--repeat459600034711-->
							<!--repeat459600034711:end-->
							<!--each457146240464-->
							<tr>
								<td>
									<div class="first-column">
										<label class="label-checkbox inline-block"> <input
											class="checkbox" type="checkbox"> <i
											class="i-checkbox"></i>104 </label>
									</div></td>
								<td class="text-center"><span>手工房费</span> <!--ms-if--> <!--ms-if-->
								</td>
								<td class="text-center"><span>¥80.00</span></td>
								<td class="text-center">
									<!--ms-if--></td>
								<td class="text-center">2017-05-01</td>
								<td class="text-center">中班-穆雄雄<br>2017-07-22 20:47:21
								</td>
								<td class="text-center">未结</td>
								<td><span title=""></span></td>
								<td class="text-center">
									<button type="button" class="btn btn-default btn-sm btn-xs mr5">拆账</button>
									<button type="button" class="btn btn-default btn-sm btn-xs mr5">冲账</button>
									<!--ms-if-->
									<button type="button" class="btn btn-default btn-sm btn-xs">修改备注</button>
								</td>
							</tr>
							<!--repeat40777214807-->
							<!--repeat40777214807:end-->
							<!--each457146240464:end-->
						</tbody>
					</table>


				</div>
				<!--ms-include-end-->

				<!--ms-include-->
				<div class="g-f-btn j-btn-w">
					<button type="button" class="btn btn-success btn-sm  mr10"
						style="display: inline-block;">结账退房</button>
					<button type="button" class="btn btn-success btn-sm  mr10"
						style="display: inline-block;">部分结账</button>
					<button type="button" class="btn btn-success btn-sm  mr10"
						style="display: inline-block;">入账</button>
					<button type="button" class="btn btn-success btn-sm  mr10"
						style="display: inline-block;">预收款</button>

					<button type="button" class="btn btn-success btn-sm  mr10"
						style="display: none;">选房结账</button>

					<button type="button" class="btn btn-success btn-sm  mr10"
						style="display: inline-block;">转账</button>


					<button type="button" class="btn btn-success btn-sm  mr10"
						style="display: inline-block;">挂账</button>
					<button type="button" class="btn btn-success btn-sm  mr10"
						style="display: inline-block;">加收房费</button>
					<button type="button" class="btn btn-success btn-sm  mr10"
						style="display: inline-block;">小商品</button>
				</div>
				<!--ms-include-end-->
			</div>
			<!--ms-include-end-->
		</div>
		<!-- /contenter -->
	</div>

<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script src="layer/layer.js"></script>
<script type="text/javascript">
            //弹出一个iframe层
                $(function(){
                    $("#jiaoyajing").click(function(){
                          layer.open({
                              type: 2,
                              title: '预收款',
                              maxmin: true,
                              shadeClose: true, //点击遮罩关闭层
                              area : ['400px' , '450px'],
                              content: 'getPayment.action?ordersid=${orders.orderId}',
                              end:function(){
                              	//关闭窗口的时候刷新父页面
                              	location.href="getRoomList.action";
                              	}
                              });
                    });

                    $("#caiwu").click(function(){
                        $("#m_caiwumain").show();//显示财务明细
                        $("#lainfang").hide();   //联房信息隐藏
                        $("#bottom_btn").hide();
                    }); 
                    $("#lianfangkeren").click(function(){
                         $("#m_caiwumain").hide();//显示财务明细
                        $("#lainfang").show();   //联房信息隐藏
                        $("#bottom_btn").show();
                    });
                
                });
                
        </script>

</body>
</html>