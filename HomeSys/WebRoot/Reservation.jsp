<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>房间预定</title>
    <link rel="stylesheet" type="text/css" href="css/global1.css"/>
    <link rel="stylesheet" href="css/smoothness/jquery.ui.css" type="text/css" />
    <link rel="stylesheet" type="text/css" href="css/css.css"/>
</head>
<body class="ticketBody">
<!--中间-->
<div class="webIndex">
<div class="stay-list clearFloat">
    <div class="stay-list-left">
        <span class="search-sign"></span>
        <h3 class="search-title">预定信息</h3>
        <form action="saveReserve.action" method="post" id="form1">
            <div class="sea-div">
                <label class="search-lab">预定人</label>
                <input type="text" placeholder="预定姓名" class="hotel-name"  name="reserve.name"/>
            </div>
            <div class="sea-div">
                <label class="search-lab">联系方式</label>
                <input type="text" placeholder="联系方式" class="hotel-name"  name="reserve.phone"/>
            </div>
            <div class="sea-div">
                <label class="search-lab">入住日期</label>
                <input type="text" readonly  id="startDate" name="reserve.startTime"/>
            </div>
            <div class="sea-div">
                <label class="search-lab">退房日期</label>
                <input type="text" readonly  id="endDate" name="reserve.endTime"/>
            </div>
            <div class="sea-div">
                <label class="label">房间类型</label>
                	<select style="border:1px solid #CCC;margin-left:30px;" name="reserve.roomtype.roomTypeId">
                    	<c:forEach items="${roomtypeList }" var="roomtype">
                    		<option value="${ roomtype.roomTypeId}" >${ roomtype.roomTypeName}</option>
                        </c:forEach>
                    </select>
                <label class="label">房间号码</label>
                	<select style="border:1px solid #CCC;margin-left:30px;" name="reserve.room.roomId">
                    	<c:forEach items="${roomList }" var="room">
                    		<option value="${ room.roomId}" >${ room.roomId}</option>
                        </c:forEach>
                    </select>
             </div>
            <input type="button"  class="search-but" id="search-but" value="预   定"/>
        </form>
    </div>
</div>
</div>

<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.ui.js"></script>
<script type="text/javascript" src="js/moment.min.js"></script>
<script type="text/javascript" src="js/hotel/hotel.search.js"></script>
<script type="text/javascript" src="js/stay.js"></script>
<script type="text/javascript" >
	$('#search-but').click(function(){
		$('#form1').submit();
	})
</script>
 
</body>
</html>
