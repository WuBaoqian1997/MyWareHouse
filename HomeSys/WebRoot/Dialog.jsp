<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'Dialog.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link href="css/commen.css" rel="stylesheet" />
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script src="laydate/laydate.js"></script>

</head>

<body>
	<<div id="dialog1">
	<form id="setRoomPricePop" method="post" action="./updateRoom.action">
		<table class="art-ui-dialog-grid">
			<tbody>
				<tr>
					<td i="header" class="art-ui-dialog-header"><i
						class="art-ui-dialog-start"></i>
						<div i="title" class="art-ui-dialog-title"
							id="title:1500786494974">修改房型价格</div>
					</td>
				</tr>
				<tr>
					<td i="body" class="art-ui-dialog-body" style="padding: 0px 15px;"><div
							i="content" class="art-ui-dialog-content" style="width: 500px;"
							id="content:1500786494974">
								<div class="set-price-pop">
									<div class="price-item form-inline mt10">
										<div class="form-group ml10">
											<label>房型名称：</label>
											<input type="text" class="form-control input-sm" data-duplex-changed="fetchPriceCode" disabled="" value="${roomtype.roomTypeName}" name="roomtype.roomTypeName"/>
										</div>
										<div class="form-group">
											<label>房价代码：</label> <select class="form-control input-sm"
												disabled="">
												<option value="10010">门市价</option>
											</select>
										</div>
									</div>
									<div class="price-item form-inline mt10">
										<div class="form-group ml10">
											<label>起始时间：</label>
											<%-- <input type="hidden" value="${room.roomtype.price.priceId }" name="price.priceId"/>
											<input type="hidden" value="${room.roomtype.price.accommodation.accommodationId}" name="price.accommodation.accommodationId"/>
											<input type="hidden" value="${room.roomtype.price.accommodation.accommodationType }" name="price.accommodation.accommodationType"/> --%>
											<input type="text" name="price.startTime" value="${price.startTime}" class="inline laydate-icon" id="start1" style="width:165px; margin-right:5px;"/>
										</div>
										<div class="form-group">
											<label>终止时间：</label>
											<input type="text" name="price.endTime" value="${price.endTime}" class="inline laydate-icon" id="end1" style="width:165px;"/>
										</div>
									</div>
									<div class="price-item form-inline mt10 mb10">
										<div class="form-group ml10">
											<label>平日价格：</label> 
											<input
												class="validate[required,custom[money]] form-control input-sm"
												type="text" name="price.routinePrice" value="${price.routinePrice}">
										</div>
										<div class="form-group">
											<label>周末价格：</label> <input class="form-control input-sm"
												type="text" name="price.weekendPrice" value="${price.weekendPrice}">
										</div>
									</div>
								</div>
						</div>
					</td>
				</tr>
				<tr>
					<td i="footer" class="art-ui-dialog-footer"><div i="statusbar"
							class="art-ui-dialog-statusbar" style="display:none;"></div>
						<span id="update_roomprice">
						<div i="button" class="art-ui-dialog-button">
							<!-- <button type="button" data-id="ok" class="art-ui-dialog-autofocus">保存</button> -->
							<input type="submit" value="保存" style="padding:6px 20px;border:0;background-color:#4cae4c;color:#FFF; vertical-align:middle;margin:10px;line-height:18px; -moz-border-radius: 10px;-webkit-border-radius: 15px;" />
						</div>
						</span>
					</td>
				</tr>
			</tbody>
		</table>
		</form>
	</div>
	<script>
	$(function(){
		$("#update_roomprice").click(function(){
			$("#setRoomPricePop").submit();
			parent.layer.close(1);
		});
	});
		!function() {
			laydate.skin('molv');//切换皮肤，请查看skins下面皮肤库
			laydate({
				elem : '#demo'
			});//绑定元素
		}();
		//日期范围限制
		var start = {
			elem : '#start1',
			format : 'YYYY-MM-DD',
			min : laydate.now(), //设定最小日期为当前日期
			max : '2099-06-16', //最大日期
			istime : true,
			istoday : false,
			choose : function(datas) {
				end.min = datas; //开始日选好后，重置结束日的最小日期
				end.start = datas //将结束日的初始值设定为开始日
			}
		};
		var end = {
			elem : '#end1',
			format : 'YYYY-MM-DD',
			min : laydate.now(),
			max : '2099-06-16',
			istime : true,
			istoday : false,
			choose : function(datas) {
				start.max = datas; //结束日选好后，充值开始日的最大日期
			}
		};
		laydate(start);
		laydate(end);
		//自定义日期格式
		laydate({
			elem : '#test1',
			format : 'YYYY年MM月DD日',
			festival : true, //显示节日
			choose : function(datas) { //选择日期完毕的回调
				alert('得到：' + datas);
			}
		});
		//日期范围限定在昨天到明天
		laydate({
			elem : '#hello3',
			min : laydate.now(-1), //-1代表昨天，-2代表前天，以此类推
			max : laydate.now(+1)
		//+1代表明天，+2代表后天，以此类推
		});
	</script>
	<script>
	
</script>
</body>
</html>
