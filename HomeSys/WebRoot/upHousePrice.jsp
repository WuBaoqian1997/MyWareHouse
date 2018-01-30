<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="commTop.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>调价</title>
<link href="css/ruzhu1.css" rel="stylesheet">
<link href="css/ruzhu2.css" rel="stylesheet">
<style type="text/css">
#m_jiao_main {
	margin: 0px auto;
	padding: 20px;
	border-radius: 15px;
}
</style>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#savemoney").click(function(){
		$("#savemoneys").submit();
		parent.layer.close(1);
	});
	})
	
</script>
</head>
<body>
	<div id="m_jiao_main">

		<div class="fn-clear">
			<div class="fn-left">
			<form action="updateHousePrice.action" method="post" id="savemoneys">
				<div id="advancePayForm" class="validationEngineContainer">
					<div i="title" class="art-ui-dialog-title" id="title:1500735064451">调价</div>
					<ul class="form-inline">
						<li class="mb10"><label class="w60 mr5 text-right"> <i
								class="q-icon color-danger">*</i>调价房号 </label>
						 <select
							class="form-control input-sm w200" name="" id="payer">
								<option data-type="3" value="S17072272169973072"
									selected="selected">${orders.room.roomId }-${orders.customer.customerName}</option>
						</select>
						</li>
						<li class="mb10"><label class="w60 mr5 text-right"> <i
								class="q-icon color-danger">*</i>原房价 </label> 
							<input
							class="validate[required,custom[minusMoney]] form-control
                              input-sm w200"
							maxlength="9" data-errormessage-value-missing="请填写原房价" name="" readonly="readonly"
							data-errormessage-custom-error="请正确填写原房价" type="text" value="${orders.customer.houseing }">	
						</li>
						<li class="mb10"><label class="w60 mr5 text-right"> <i
								class="q-icon color-danger">*</i>新房价 </label> <!--ms-if--> <input
							class="validate[required,custom[minusMoney]] form-control
                              input-sm w200"
							maxlength="9" data-errormessage-value-missing="请填写新房价 " name="price"
							data-errormessage-custom-error="请正确填写新房价 " type="text">
						</li>
						<!-- 订单编号 -->
						<input type="hidden"  value="${orders.orderId}" name="ordersid"/>
						<li class="mb10"><label class="w60 mr5 text-right">备注</label>
							<textarea 
								class="validate[custom[legalString],maxSize[200]] form-control w200 remark"
								rows="3" data-errormessage-range-overflow="最多200个字"
								data-prompt-position="topLeft:0,30"></textarea>
						</li>

						<div style="width:100%">
							<div class="g-f-btn j-btn-w" style="padding-left: 200px;">
								<input type="button" id="savemoney" class="btn btn-success btn-sm  mr10"
									style="display: inline-block;"  value="提交">
							</div>
						</div>
					</ul>
				</div>
			</form>
			</div>
		</div>
</body>
</html>
