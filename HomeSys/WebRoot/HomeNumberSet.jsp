<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>房号设置</title>
<link href="css/commen.css" rel="stylesheet" />
<link href="css/jquery-ui.css" rel="stylesheet" />
<link href="css/page.css" rel="stylesheet" />
<script type="text/javascript" src='js/jquery-1.8.3.min.js'></script>
<script src="layer/layer.js"></script>
<script type="text/javascript">
	$(function(){
		$("#sava_room").click(function(){
			$("#addRoomNoPop").submit();
	});
});

</script>
</head>

<body>
	<div class="config-roomno-wrap">
		<div class="q-btnbar spacer-main-title">
			<span class="title">房号设置</span> <span class="fn-right">
				<button type="button" class="btn btn-delicate btn-sm"
					id="dialog-link" class="ui-button ui-corner-all ui-widget">
					<i class="i-icon"></i>批量添加
				</button> <!--ms-if--> </span>
		</div>

		<div class="q-panel">
			<div class="roomno-table-wrap">
				<table class="table table-bordered">
					<thead>
						<tr>
							<th width="25%">房型</th>
							<th width="20%">房号</th>
							<!--ms-if-->
							<th width="10%">楼层</th>
							<th width="10%">房间特性</th>
							<th width="15%">
								<div class="form-inline">
									<label>是否有效</label> <select class="form-control input-sm w80">
										<option value="">全部</option>
										<option value="true">有效</option>
										<option value="false">无效</option>
									</select>
								</div></th>
							<th width="10%">操作</th>
						</tr>
					</thead>
					<tbody>
						<!--each718902311506-->
						<!--repeat067460391037-->
						<c:forEach items="${pRoomList}" var="room">

							<tr>
								<td rowspan="1">${room.roomtype.roomTypeName}</td>
								<td class="ids">${room.roomId}</td>
								<!--ms-if-->
								<td>${room.position.positionName}</td>
								<td>${room.characteristic}</td>
								<td>有效</td>
								<td>
								<span class="update_num">
									<button type="button" class="btn btn-delicate btn-xs"
										<i class="i-icon"> </i>
										修改
										<input type="hidden" value="${room.roomId}" class="ids"/>
									</button>
								</span>
										<a href="./HomeSys/delectRoom.action?id=${room.roomId}">删除</a></td>
							</tr>
						</c:forEach>
						<!--repeat067460391037-->

						<!--repeat067460391037-->
						<!--repeat067460391037:end-->
						<!--each718902311506:end-->
					</tbody>
				</table>
				<!-- -->
				<!--ms-if-->
			</div>

			<div id="page">
				<ul>
					<li><a href="/HomeSys/queryRoomAction?number=1">首页</a>
					</li>
					<li><a
						href="/HomeSys/queryRoomAction?number=<s:property value='prev'/>">上一页</a>
					</li>
					<li><span><s:property value="number" />/<s:property
								value="total" />页</span>
					</li>
					<li><a
						href="/HomeSys/queryRoomAction?number=<s:property value='next'/>">下一页</a>
					</li>
					<li><a
						href="/HomeSys/queryRoomAction?number=<s:property value='total'/>">尾页</a>
					</li>
				</ul>
			</div>
		</div>
	</div>
	<div id="dialog">
		<table class="art-ui-dialog-grid">
			<tbody>
				<tr>
					<td i="header" class="art-ui-dialog-header"><i
						class="art-ui-dialog-start"></i>
						<div i="title" class="art-ui-dialog-title"
							id="title:1500781798992">新增房间号</div>
					</td>
				</tr>
				<!-- 111111111111 -->
				<tr>
					<td i="body" class="art-ui-dialog-body"><div i="content"
							class="art-ui-dialog-content" style="width: 420px;"
							id="content:1500781798992">
							<div id="addRoomNoPanel"
								class="add-roomNo-pop form-inline room-no-dialog">
								<form id="addRoomNoPop" class="add-roonno-pop"
									action="saveRoom.action" method="post">
									<div class="mt10 add-item">
										<label class="item-title">房间类型：</label> <select
											name="room.roomtype.roomTypeId"
											class="form-control input-sm w300">
											<c:forEach items="${rList}" var="roomType">
												<option value="${roomType.roomTypeId}">${roomType.roomTypeName}</option>
											</c:forEach>
										</select>
									</div>
									<div class="mt10 add-item">
										<label class="item-title">楼层设置：</label> <select
											name="room.position.positionId"
											class="form-control input-sm w300">

											<c:forEach items="${pList}" var="position">
												<option value="${position.positionId}">${position.positionName}</option>

											</c:forEach>
											<!--each007509744546-->
											<!--each007509744546:end-->
										</select>
									</div>

									<label class="fn-left item-title mt5">房间特性：&nbsp</label>
									<textarea class="form-control input-sm w300" rows="" cols=""
										name="room.characteristic" style="height:100px;width:305px"></textarea>

									<!-- </form>
								<form id="roomNameForm" class="add-roonno-pop"> -->
									<div class="mt10 add-item fn-clear">
										<label class="fn-left item-title mt5">房间号名称：</label>

										<div class="fn-left add-box">

											<!--repeat446179630498-->
											<div class="add-item fn-left mb10 mr10 add-no-item">
												<div
													class="room-no-formError hide-formError j-formError j-formError_0"
													style="opacity: 1; position: absolute; top: 0px; left: 0; margin-top: -40px;"
													data-index="0">
													<div class="room-no-formErrorContent">
														该房间号已存在<br>
													</div>
													<div class="room-no-formErrorArrow">
														<i></i>
													</div>
												</div>
												<input
													class="validate[required,custom[roomNoName],maxSize[8]] form-control input-sm j-roomNo-input j-roomNo_0"
													data-errormessage-custom-error="房间号只支持中文、字母、数字、-、_"
													data-errormessage-range-overflow="最多8位数"
													data-errormessage-value-missing="请输入房间号"
													data-isrepeated="0" name="room.roomId" type="text" />
												<!--ms-if-->
											</div>
											<!--repeat446179630498-->
											<!--repeat446179630498:end-->

										</div>
									</div>
							</div>
						</div>
					</td>
				</tr>
				<tr>
					<td i="footer" class="art-ui-dialog-footer"><div i="statusbar"
							class="art-ui-dialog-statusbar" style="display: none;"></div>
						
							<div i="button" class="art-ui-dialog-button">
								<button id="sava_room" type="button" data-id="ok" class="art-ui-dialog-autofocus">保存</button>
							</div>
					</td>
				</tr>
				</form>
				<!-- 1111111111111111 -->
			</tbody>
		</table>
	</div>

	<script src="external/jquery/jquery.js"></script>
	<script src="js/jquery-ui.js"></script>
	<script type="text/javascript">
	//弹出一个iframe层
               $(function(){
				$(".update_num").click(function(){
				var ids = $(this).find(".ids").val();
				//var roomid = $(this).find("#roomids").val();
					layer.open({
		            	type: 2,
		                title: '修改',
		                maxmin: true,
		                shadeClose: true, //点击遮罩关闭层
		                area : ['600px' , '400px'],
		                content: 'byroomId.action?id='+ids
		         }); 
		});
	});
		$("#dialog").dialog({
			autoOpen : false,
			width : 505,
			buttons : [ {
				text : "取消",
				click : function() {
					$(this).dialog("close");
				}
			} ]
		});
		// Link to open the dialog
		$("#dialog-link").click(function(event) {
			$("#dialog").dialog("open");
			event.preventDefault();
		});
	</script>
</body>
</html>

