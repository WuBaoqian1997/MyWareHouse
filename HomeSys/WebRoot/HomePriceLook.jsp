<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>房价设置</title>
<link href="css/commen.css" rel="stylesheet" />
<link href="css/jquery-ui.css" rel="stylesheet" />
<link href="css/helper.css" rel="stylesheet" />
</head>

<body>
	<div class="q-main spacer-main spacer-sidebar q-room-price">

		<div class="q-btnbar spacer-main-title">
			<span class="title">房价代码</span> <span class="fn-right">
				<button type="button" class="btn btn-delicate btn-sm"
					id="dialog-link" class="ui-button ui-corner-all ui-widget">
					<i class="i-icon"></i>快速添加
				</button> </span>
		</div>

		<div class="q-panel q-room-price-code">
			<table class="table table-hover">
				<thead>
					<tr>
						<td class="text-center w110">显示优先级 <i
							class="i-icon icon-question-mark"></i>
						</td>
						<td class="text-center">房价名称</td>
						<td class="text-center w150">平日价</td>
						<td class="text-center w150">周末价</td>
						<td class="text-center w200">
							<div class="form-inline">
								<label>是否有效</label> <select class="form-control input-sm w80">
									<option value="">全部</option>
									<option value="true">有效</option>
									<option value="false">无效</option>
								</select>
							</div></td>
						<td class="text-center w200">操作</td>
					</tr>
				</thead>
				<tbody>
					<!--repeat639109922034-->
					<c:forEach items="${priceList}" var="price">
					
					<tr>
						<td class="text-center">1</td>
						<td class="text-center">${price.accommodation.accommodationType}</td>
						<td class="text-center">${price.routinePrice}</td>
						<td class="text-center">${price.weekendPrice}</td>
						<td class="text-center">有效</td>
						<td class="text-center">
							<button type="button" class="btn btn-delicate btn-xs"
								id="dialog-link1" class="ui-button ui-corner-all ui-widget">
								<i class="i-icon"></i>修改
							</button>
							<a href="./HomeSys/deletePrice.action?id=${price.priceId}">删除</a>
							</td>
					</tr>
					</c:forEach>
					<!--repeat639109922034:end-->
				</tbody>
			</table>

			<!--ms-if-->
		</div>
			<div id="page">
		    	<ul>
		    		<li><a href="/HomeSys/queryPriceAction?number=1">首页</a></li>
		    		<li><a href="/HomeSys/queryPriceAction?number=<s:property value='prev'/>">上一页</a></li>
		    		<li><span><s:property value="number"/>/<s:property value="total"/>页</span></li>
		    		<li><a href="/HomeSys/queryPriceAction?number=<s:property value='next'/>">下一页</a></li>
		    		<li><a href="/HomeSys/queryPriceAction?number=<s:property value='total'/>">尾页</a></li>
		    	</ul>
		    </div>
		<ul class="mt15 footer-remark">
			<li>
				1.&nbsp;通过房价代码，您可以针对不同类型的客人定义不同的房价，如针对会员可设置会员价，若有多种会员类型，可定义多个会员价
				<ul class="sub-ul">
					<li>协议价：酒店与一些公司、单位有协议房价时，采用此房价代码类型</li>
					<li>免费价：酒店自己负担房费时，采用此房价代卖类型</li>
					<li>自用价：酒店员工自己使用时，采用此房价代码类型</li>
					<li>会员价：酒店给客人提供会员价时，采用此房价代码类型</li>
				</ul></li>
			<li>2.&nbsp;房价代码类型变更或房价代码置为无效会使直销对应的房价下线</li>
		</ul>
	</div>
	<div id="dialog">
		<table class="art-ui-dialog-grid">
			<tbody>
				<tr>
					<td i="header" class="art-ui-dialog-header"><i
						class="art-ui-dialog-start"></i>
					<div i="title" class="art-ui-dialog-title" id="title:1500784760130">快速添加房价代码</div>
					</td>
				</tr>
				<tr>
					<td i="body" class="art-ui-dialog-body"><div i="content"
							class="art-ui-dialog-content" style="width: 330px;"
							id="content:1500784760130">
							<div id="addBatchDialog" data-include-replace="true"
								class="add-batch-dialog f14" avalonctrl="addBatchDialog">
								<form id="addBatchForm" class="table-wrapper j-wrapper">
									<table class="table">
										<thead>
											<tr>
												<td class="text-center w150">房价名称</td>
												<td class="text-center w120">房价类型</td>
												<td class="text-center w30"></td>
											</tr>
										</thead>
										<tbody>
											<!--repeat86771876816-->
											<tr>
												<td class="text-center"><input maxlength="20"
													class="validate[required,maxSize[20]] form-control input-sm f14"
													data-errormessage="请填写正确的房价名称" placeholder="请输入房价名称"
													autocomplete="off" type="text"></td>
												<td class="text-center"><select
													class="form-control input-sm f14">
														<!--repeat899178027207-->
														<option value="0">普通</option>
														<!--repeat899178027207-->
														<option value="1">协议</option>
														<!--repeat899178027207-->
														<option value="2">免费</option>
														<!--repeat899178027207-->
														<option value="3">自用</option>
														<!--repeat899178027207-->
														<option value="4">会员</option>
														<!--repeat899178027207-->
														<!--repeat899178027207:end-->
												</select></td>
												<td class="text-center"><i class="i-icon plus-btn"
													onselectstart="return false;"></i></td>
											</tr>
											<!--repeat86771876816-->
											<!--repeat86771876816:end-->
										</tbody>
									</table>
								</form>
								<label class="add-data-btn mt5"><i class="i-icon"></i><i
									class="btn-i">添加房价代码</i>
								</label>
							</div>
						</div>
					</td>
				</tr>
				<tr>
					<td i="footer" class="art-ui-dialog-footer"><div i="statusbar"
							class="art-ui-dialog-statusbar" style="display: none;"></div>
						<div i="button" class="art-ui-dialog-button">
							<button type="button" data-id="ok"
								class="art-ui-dialog-autofocus">保存</button>
						</div>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
	<div id="dialog1">
		<table class="art-ui-dialog-grid">
			<tbody>
				<tr>
					<td i="header" class="art-ui-dialog-header"><i
						class="art-ui-dialog-start"></i>
					<div i="title" class="art-ui-dialog-title" id="title:1500784760131">修改房价代码</div>
					</td>
				</tr>
				<tr>
					<td i="body" class="art-ui-dialog-body"><div i="content"
							class="art-ui-dialog-content" style="width: 300px;"
							id="content:1500784760131">
							<div ms-controller="roomPriceCodeEditDialog"
								data-include-replace="true">
								<form id="roomPriceCodeEditDialog">
									<ul class="form-inline">
										<li class="mb10"><label class="w70 mr5 text-right"><i
												class="q-icon color-danger">*</i> 房价名称</label> <input
											class="validate[required,maxSize[10]] form-control input-sm w200"
											data-errormessage="请填写正确的房价名称" id="form-validation-field-0"
											type="text"></li>
										<li class="mb10"><label class="w70 mr5 text-right">包价</label>
											<!--ms-include-->
											<select id="packagePrice"
											class="form-control input-sm w160 w200" multiple=""
											tabindex="-1" style="display: none;">
												<!--repeat996997675693:end-->
										</select><span
											class="select2 select2-container select2-container--default select2-container--below"
											dir="ltr" style="width: 200px;"><span
												class="selection"><span
													class="select2-selection select2-selection--multiple"
													role="combobox" aria-autocomplete="list"
													aria-haspopup="true" aria-expanded="false" tabindex="0"
													aria-owns="select2-packagePrice-results"><ul
															class="select2-selection__rendered">
															<li class="select2-search select2-search--inline"><input
																class="select2-search__field" tabindex="-1"
																autocomplete="off" autocorrect="off"
																autocapitalize="off" spellcheck="false" role="textbox"
																placeholder="" style="width: 0.75em;" type="search">
															</li>
														</ul>
												</span>
											</span><span class="dropdown-wrapper" aria-hidden="true"></span>
										</span>
										<!--ms-include-end--></li>
										<li class="mb10"><label class="w70 mr5 text-right">显示优先级</label>
											<input
											class="validate[custom[onlyNumberSp],maxSize[3]] form-control input-sm w200"
											maxlength="3" data-errormessage-custom-error="请填写数字排序"
											data-errormessage-range-overflow="排序值最大999" type="text">
										</li>
										<li class="mb10"><label
											class="w70 mr5 text-right room-price-type-title">房价类型</label>
											<div class="room-price-type-list form-inline w200">
												<!--repeat1598794235186-->
												<label class="label-radio mr20 mt5"
													onselectstart="return false;"> <input
													name="roomPriceType" value="0" type="radio"> <i
													class="i-radio"></i>普通 </label>
												<!--repeat1598794235186-->
												<label class="label-radio mr20 mt5"
													onselectstart="return false;"> <input
													name="roomPriceType" value="1" type="radio"> <i
													class="i-radio"></i>协议 </label>
												<!--repeat1598794235186-->
												<label class="label-radio mr20 mt5"
													onselectstart="return false;"> <input
													name="roomPriceType" value="2" type="radio"> <i
													class="i-radio"></i>免费 </label>
												<!--repeat1598794235186-->
												<label class="label-radio mr20 mt5"
													onselectstart="return false;"> <input
													name="roomPriceType" value="3" type="radio"> <i
													class="i-radio"></i>自用 </label>
												<!--repeat1598794235186-->
												<label class="label-radio mr20 mt5"
													onselectstart="return false;"> <input
													name="roomPriceType" value="4" type="radio"> <i
													class="i-radio"></i>会员 </label>
												<!--repeat1598794235186-->
												<!--repeat1598794235186:end-->
											</div></li>
										<li><label class="w70 mr5 text-right">是否有效</label> <select
											class="form-control input-sm w200">
												<option value="true">有效</option>
												<option value="false">无效</option>
										</select></li>
									</ul>
								</form>
							</div>
						</div>
					</td>
				</tr>
				<tr>
					<td i="footer" class="art-ui-dialog-footer"><div i="statusbar"
							class="art-ui-dialog-statusbar" style="display: none;"></div>
						<div i="button" class="art-ui-dialog-button">
							<button type="button" data-id="ok"
								class="art-ui-dialog-autofocus">保存</button>
						</div>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
	<script src="external/jquery/jquery.js"></script>
	<script src="js/jquery-ui.js"></script>
	<script>
		$( "#dialog" ).dialog({
			autoOpen: false,
			width: 400,
			height: 330,
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
			width: 380,
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

