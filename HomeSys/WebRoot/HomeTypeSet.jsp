<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>房型设置</title>
<link href="css/commen.css" rel="stylesheet" />
<link href="css/jquery-ui.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/num-alignment.js"></script>
<script type="text/javascript">
	$(function(){
		$("#save_type").click(function(){
			$("#addBatchForm").submit();
		});
	});
</script>
</head>

<body>
	<div class="q-room-type">
		<div class="q-btnbar spacer-main-title fn-clear">
			<span class="title">房型设置</span> <span class="fn-right">
				<button type="button" class="btn btn-delicate btn-sm"
					id="dialog-link" class="ui-button ui-corner-all ui-widget">
					<i class="i-icon"></i>快速添加
				</button> </span>
		</div>
		<div class="q-panel">
			<table class="table table-hover">
				<thead>
					<tr>
						<td class="text-center" width="90">显示优先级</td>
						<td width="100">房型名称</td>
						<td class="text-center" width="100">超售数量</td>
						<td class="text-left" width="100">面积</td>
						<td class="text-center" width="70">床数</td>
						<td class="text-center" width="200">
							<div class="form-inline">
								<label>是否有效</label> <select class="form-control input-sm w80">
									<option value="">全部</option>
									<option value="true">有效</option>
									<option value="false">无效</option>
								</select>
							</div></td>
						<td class="text-center" width="200">备注</td>
						<td class="text-center" width="100">操作</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${tList}" var="tList">
						<tr>
						<td class="text-center">99</td>
						<td>${tList.roomTypeName}</td>
						<td class="text-center">0</td>
						<td class="text-left">
							<!--ms-if--> <i>${tList.acreage}/㎡</i></td>
						<td class="text-center">
							${tList.bedType}
						</td>
						<td class="text-center"><span>有效</span> <!--ms-if--></td>
						<td class="text-center">暂无</td>
						<td class="text-center">
							<a href="./deleteType.action?id=${tList.roomTypeId}">
								<button type="submit" class="btn btn-delicate btn-xs"
									<i class="i-icon"></i>删除
								</button>
							</a>
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>

			<!--ms-if-->
		</div>
	</div>
	<div id="dialog">
		<table class="art-ui-dialog-grid">
			<tbody>
				<tr>
					<td i="header" class="art-ui-dialog-header"><i
						class="art-ui-dialog-start"></i>
					<div i="title" class="art-ui-dialog-title" id="title:1500780286634">快速添加房型</div>
					</td>
				</tr>
				<tr>
					<td i="body" class="art-ui-dialog-body"><div i="content"
							class="art-ui-dialog-content" style="width: 550px;"
							id="content:1500780286634">
							<div id="addBatchDialog" data-include-replace="true"
								class="add-batch-dialog f14" avalonctrl="addBatchDialog">
								<form id="addBatchForm" class="table-wrapper j-wrapper" action="saveType.action"
								method="post">
									<table class="table">
										<thead>
											<tr>
												<td class="text-center w200">房型名称</td>
												<td class="text-center w110">床数</td>
												<td class="text-center w110">面积(平方米)</td>
												<td class="text-center w30"></td>
											</tr>
										</thead>
										<tbody>
											<!--repeat904541664673-->
											<tr>
												<td class="text-center"><input maxlength="20" name="roomtype.roomTypeName"
													class="validate[required,maxSize[20]] form-control input-sm f14 j-name-0"
													data-errormessage="请填写正确的房型名称" placeholder="请输入房型名称"
													autocomplete="off" type="text"></td>
												<td class="text-center" style="position:relative;top:10px;">
													<input id="3" user_data="aaa" value="1" name="roomtype.bedType"/><br>
												</td>
												<td class="text-center"><input maxlength="8" name="roomtype.acreage"
													placeholder="请输入面积" autocomplete="off"
													class="validate[custom[number],min[0],custom[roomArea]]] form-control input-sm f14"
													data-errormessage-range-underflow="面积不能小于0" type="text">
												</td>
												<td class="text-center"><i class="i-icon plus-btn"
													onselectstart="return false;"></i></td>
											</tr>
										</tbody>
									</table>
								</form>
								<label class="add-data-btn mt5"><i class="i-icon"></i><i
									class="btn-i">添加房型</i>
								</label>
							</div>
						</div>
					</td>
				</tr>
				<tr>
					<td i="footer" class="art-ui-dialog-footer"><div i="statusbar"
							class="art-ui-dialog-statusbar" style="display: none;"></div>
						<div i="button" class="art-ui-dialog-button">
							<button type="submit" data-id="ok" id="save_type"
								class="art-ui-dialog-autofocus">保存</button>
						</div>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
	<div id="page">
		<ul>
			<li><a href="/HomeSys/queryTypeInfo?number=1">首页</a></li>
			<li><a
				href="/HomeSys/queryTypeInfo?number=<s:property value='prev'/>">上一页</a>
			</li>
			<li><span><s:property value="number" />/<s:property
						value="total" />页</span></li>
			<li><a
				href="/HomeSys/queryTypeInfo?number=<s:property value='total'/>">下一页</a>
			</li>
			<li><a
				href="/HomeSys/queryTypeInfo?number=<s:property value='total'/>">尾页</a>
			</li>
		</ul>
	</div>
	<script src="external/jquery/jquery.js"></script>
	<script src="js/jquery-ui.js"></script>
	<script>
		$( "#dialog" ).dialog({
			autoOpen: false,
			width: 620,
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
			width: 800,
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
