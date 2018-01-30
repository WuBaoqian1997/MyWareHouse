<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>房价设置</title>
<link href="css/commen.css" rel="stylesheet" />
<link href="css/jquery-ui.css" rel="stylesheet" />
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script src="laydate/laydate.js"></script>
<script src="external/jquery/jquery.js"></script>
<script src="js/jquery-ui.js"></script>
<script src="layer/layer.js"></script>
<script type="text/javascript">
	$(function(){
		$(".update").click(function(){
		var ids = $(this).find("#ids").val();
		var roomid = $(this).find("#roomids").val();
			layer.open({
            	type: 2,
                title: '修改',
                maxmin: true,
                shadeClose: true, //点击遮罩关闭层
                area : ['600px' , '300px'],
                content: './byId.action?tid='+ids+'&&roomid='+roomid
         }); 
		});
	});
</script>
</head>

<body>
	<div class="q-main spacer-main spacer-sidebar">
		<div class="config-roomprice-wrap">
			<div class="q-btnbar spacer-main-title">
				<span class="title">房价设置</span> <span class="fn-right">
					<button type="button" class="btn btn-delicate btn-sm">
						<i class="i-icon"></i>
					</button> </span>
			</div>
			<div class="q-panel">
				<div class="roomprice-table-wrap">
					<table class="table table-bordered">
						<thead>
							<tr>
								<th width="12%">优先显示级</th>
								<th width="8%">房型</th>
								<th width="12%">起始时间</th>
								<th width="12%">终止时间</th>
								<th width="9%">常规价</th>
								<th width="9%">周末价</th>
								<th width="12%">备注</th>
								<th width="26%">操作</th>
							</tr>
						</thead>
						
						<!--repeat037165370613-->
						<tbody>
							<c:forEach items="${rList}" var="rList">
								<tr>
									<td>${rList.roomId}</td>
									<td>${rList.roomtype.roomTypeName}</td>
									<td>${rList.roomtype.price.startTime}</td>
									<td>${rList.roomtype.price.endTime}</td>
									<td>￥${rList.roomtype.price.routinePrice}</td>
									<td>￥${rList.roomtype.price.weekendPrice}</td>
									<td>暂无</td>
									<td>
										<div class="items">
											<span class="update">
												<button type="button" class="btn btn-delicate btn-xs"
													class="ui-button ui-corner-all ui-widget">
													<i class="i-icon"></i>修改
												</button> 
													<input id="ids" type="hidden" value="${rList.roomtype.roomTypeId}" />
													<input id="roomids" type="hidden" value="${rList.roomId}" />
												</span> <a href="./deleteRoom.action?id=${rList.roomId}">删除</a>
										</div></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<div id="page">
		<ul>
			<li><a href="./queryAllRoom?number=1">首页</a>
			</li>
			<li><a href="./queryAllRoom?number=<s:property value='prev'/>">上一页</a>
			</li>
			<li><span><s:property value="number" />/<s:property
						value="total" />页</span>
			</li>
			<li><a href="./queryAllRoom?number=<s:property value='next'/>">下一页</a>
			</li>
			<li><a href="./queryAllRoom?number=<s:property value='total'/>">尾页</a>
			</li>
		</ul>
	</div>
</body>
</html>

