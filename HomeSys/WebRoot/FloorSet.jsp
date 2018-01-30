<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>楼层设置</title>
<link href="css/commen.css" rel="stylesheet" />
<link href="css/jquery-ui.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#save_floor").click(function(){
			$("#addBatchForm").submit();
		});
	});
</script>
</head>

<body>
	<div class="q-main spacer-main spacer-sidebar">

		<div class="q-btnbar spacer-main-title">
			<span class="title">楼层设置</span> <span class="fn-right">
				<button type="button" id="dialog-link"
					class="btn btn-delicate btn-sm"
					class="ui-button ui-corner-all ui-widget">
					<i class="i-icon"></i>快速添加
				</button> </span>
		</div>

		<div class="q-panel">
			<table class="table table-hover">
				<thead>
					<tr>
						<td class="text-center w150">显示优先级</td>
						<td class="text-center">楼层名称</td>
						<td class="text-center">楼层锁号</td>
						<td class="text-center w150">操作</td>
					</tr>
				</thead>
				<tbody>
					<!--repeat440945529416-->
					<c:forEach items="${pList}" var="pList">
						<tr>
							<td class="text-center">99</td>
							<td class="text-center">${pList.positionName}</td>
							<td class="text-center">暂无</td>
							<td class="text-center">
								 <a href="/HomeSys/deletePosition.action?id=${pList.positionId}">删除</a>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div id="dialog">
			<table class="art-ui-dialog-grid">
				<tbody>
					<tr>
						<td i="header" class="art-ui-dialog-header"><i
							class="art-ui-dialog-start"></i>
							<div i="title" class="art-ui-dialog-title"
								id="title:1500781002903">快速添加楼层</div></td>
					</tr>
					<tr>
						<td i="body" class="art-ui-dialog-body"
							style="padding: 0px 5px 20px 20px;"><div i="content"
								class="art-ui-dialog-content" style="width: 315px;"
								id="content:1500781002903">
								<div id="addBatchDialog" data-include-replace="true"
									class="add-batch-dialog" avalonctrl="addBatchDialog">
									<form id="addBatchForm" class="table-wrapper j-wrapper"
										action="insertPosition.action" method="post">
										<table class="table f14">
											<thead>
												<tr>
													<td class="text-center w220">楼层名称</td>
													<td class="text-center w30"></td>
												</tr>
											</thead>
											<tbody>
												<!--repeat061036337377-->
												<tr>
													<td class="text-center w220"><input maxlength="20"
														name="position.positionName"
														class="validate[required,maxSize[20]] form-control input-sm name-input j-name-0"
														data-errormessage="请输入楼层名称" placeholder="请输入楼层名称"
														autocomplete="off" type="text">
													</td>
													<td class="text-center w30"><i class="i-icon plus-btn"
														onselectstart="return false;"></i>
													</td>
												</tr>
												<!--repeat061036337377-->
												<!--repeat061036337377:end-->
											</tbody>
										</table>
									</form>
									<label class="add-data-btn mt5"><i class="i-icon"></i><i
										class="btn-i">添加楼层</i> </label>
								</div>
							</div></td>
					</tr>
					<tr>
						<td i="footer" class="art-ui-dialog-footer"><div
								i="statusbar" class="art-ui-dialog-statusbar"
								style="display: none;"></div>
							<div i="button" class="art-ui-dialog-button">
								<!-- <input type="submit" data-id="ok" class="art-ui-dialog-autofocus" value="保存"/> -->
								<button type="submit" data-id="ok"
									class="art-ui-dialog-autofocus" id="save_floor">保存</button>
							</div></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
	<div id="page">
		<ul>
			<li><a href="/HomeSys/queryAllPosition?number=1">首页</a></li>
			<li><a
				href="/HomeSys/queryAllPosition?number=<s:property value='prev'/>">上一页</a>
			</li>
			<li><span><s:property value="number" />/<s:property
						value="total" />页</span></li>
			<li><a
				href="/HomeSys/queryAllPosition?number=<s:property value='next'/>">下一页</a>
			</li>
			<li><a
				href="/HomeSys/queryAllPosition?number=<s:property value='total'/>">尾页</a>
			</li>
		</ul>
	</div>
	<script src="external/jquery/jquery.js"></script>
	<script src="js/jquery-ui.js"></script>
	<script>
		$( "#dialog" ).dialog({
			autoOpen: false,
			width: 400,
			height: 345,
			buttons: [
			{
					text: "取消",
					click: function() {
						$( this ).dialog( "close" );
					}
				}
			]
		});
		// Link to open the dialog
		$( "#dialog-link" ).click(function( event ) {
			$( "#dialog" ).dialog( "open" );
			event.preventDefault();
		});
		$( "#dialog1" ).dialog({
			autoOpen: false,
			width: 400,
			height: 345,
			buttons: [
			{
					text: "取消",
					click: function() {
						$( this ).dialog( "close" );
					}
				}
			]
		});
		// Link to open the dialog
		$( "#dialog-link1" ).click(function( event ) {
			$( "#dialog1" ).dialog( "open" );
			event.preventDefault();
		});
    </script>
</body>
</html>

