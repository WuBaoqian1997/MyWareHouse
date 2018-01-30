<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'HomeNumberUpdate.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link href="css/commen.css" rel="stylesheet" />
<script type="text/javascript" src='js/jquery-1.8.3.min.js'></script>
<script type="text/javascript">
$(function(){
		$("#sava_room").click(function(){
			$("#updatedRoomNoPop").submit();
			location.href="queryRoomAction.action";
			parent.layer.close(1);
		
	});
});
</script>
<head>
<body>
	<div id="dialog1">
		<form id="updatedRoomNoPop" action="updateRoomInfo.action"
			method="post">
			<table class="art-ui-dialog-grid">
				<tbody>
					<tr>
						<td i="header" class="art-ui-dialog-header"><i
							class="art-ui-dialog-start"></i>
							<div i="title" class="art-ui-dialog-title"
								id="title:1500782489848">修改房间号</div></td>
					</tr>
					<tr>
						<td i="body" class="art-ui-dialog-body"><div i="content"
								class="art-ui-dialog-content" style="width: 310px;"
								id="content:1500782489848">

								<div class="mod-roonno-pop form-inline room-no-dialog">
									<label class="item-title">房号名称：</label> <input maxlength="8"
										class="form-control" disabled=""
										data-errormessage-custom-error="房间号只支持中文、字母、数字、-、_"
										data-errormessage-value-missing="请输入房间号"
										data-errormessage-range-overflow="最多8位数" type="text"
										name="room.roomId" value="${room.roomId}">
									<div class="mt10 add-item">
										<label class="item-title">房间类型：</label> <input
											class="form-control" type="text"
											name="room.roomtype.roomTypeName"
											value="${room.roomtype.roomTypeName}" disabled="" />
									</div>
									<div class="mt10 add-item">
										<label class="item-title">楼层设置：</label> <input
											class="form-control" type="text"
											name="room.position.positionName"
											value="${room.position.positionName}" disabled="" />
									</div>

									<!--ms-if-->
									<div class="mt10 mod-item fn-clear">
										<label class="fn-left item-title mt5">房间特性：&nbsp</label>
											<input class="form-control"
											name="room.characteristic"
											value="${room.characteristic}"/>
											
									</div>

								</div>
							</div></td>
					</tr>
					<tr>
						<td i="footer" class="art-ui-dialog-footer"><div
								i="statusbar" class="art-ui-dialog-statusbar"
								style="display: none;"></div>
							<div i="button" class="art-ui-dialog-button">
								<button id="sava_room" type="button" data-id="ok"
									class="art-ui-dialog-autofocus">保存</button>
							</div></td>
					</tr>
				</tbody>
			</table>
		</form>
	</div>
</body>
</html>
