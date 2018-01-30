<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="commTop.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<title>联房客人</title>
	<link href="css/ruzhu1.css" rel="stylesheet">
	<link href="css/ruzhu2.css" rel="stylesheet">
    <style type="text/css">
        .finance-price{
            margin-left: 150px;
            background-color: #FFFDD9;  
            float: left;
            height: 30px;
            border: 1px solid #F7D0A6;
        }
    
        .finance-price ul li{
            padding-left: 5px;
            display: block
            width: 100px;
            float: left;
            line-height: 30px;
        }
        #m_caiwumain{
            margin-top: 20px;
            margin-left: 20px;
            display: block;
        }
</style>
	</head>
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
                              content: 'save_money.html'
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
                
                })
                
        </script>
<body>
	
<div style="margin-top: 20px;margin-left: 20px;">
    <div class="g-f-right j-f-right order-detail-wrapper" >
        <div class="order-info-field">
            <ul class="fn-clear">
                <li>订单号：17072272169873072</li>
            </ul>
        </div>
        <!--ms-include--><div class="j-f-right-content f-right-content mt20">
    <ul class="q-tabs" id="fixedWrapper" style="position: relative; top: 0px; width: 100%; background-color: rgb(255, 255, 255); z-index: 7;">
    
        <li>
            <a href="javascript:;" id="caiwu">财务明细</a>
        </li>
    </ul><div style="display: none; height: 44px;"></div>
  
        
    </div>
<!--ms-include-end-->
    </div>
   
</div>


<!-- 财务明细-->
    
<!-- contenter -->
<div id="m_caiwumain">
  
<div class="q-main spacer-main spacer-sidebar finance-order order-detail-wrapper">
    
    <!--ms-include--><div class="detail-wrapper q-panel">
    <div id="fixedWrapper" style="position: relative; top: 0px; width: 100%; background-color: rgb(255, 255, 255); z-index: 7;">
        
        <div class="finance-filter">
            <div class="finance-category form-inline" style="float: left;display: none;">
            <br/>
                <label>财务类别</label>&nbsp;&nbsp;&nbsp;&nbsp;
                <label class="label-radio">
                    <input class="c-r-valign" value="0" type="radio" name="caiwu_type">
                    <i class="i-radio"></i>全部
                </label>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <label class="label-radio">
                    <input class="c-r-valign" value="0" type="radio" name="caiwu_type">
                    <i class="i-radio"></i>未结账
                </label>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <label class="label-radio">
                    <input class="c-r-valign" value="0" type="radio" name="caiwu_type">
                    <i class="i-radio"></i>已结账
                </label>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <label class="label-radio">
                    <input class="c-r-valign" value="0" type="radio" name="caiwu_type">
                    <i class="i-radio"></i>转出
                </label>
                
            </div>
            <div class="finance-price" style="margin-left: 550px;">
                    <ul class="fn-clear">
                        <li>消费：¥${orders.customer.accountsPayable}</li>
                        <li>付款：¥${orders.customer.deposit }</li>
                        <li>余额：<span class="color-danger">¥-${(orders.customer.balance) -(orders.customer.accountsPayable)}</span></li>
                        <li>预授权：<a href="javascript:;" class="color-blue">¥0.00</a></li>
                        <li>发票：<a href="javascript:;" class="color-blue">¥0.00</a></li>
                    </ul>
            </div>
            
            
        </div>
    </div><div style="display: none; height: 82px;"></div>
    <div class="finance-table">
        <table class="table table-hover">
            <thead>
                <tr>
                    <td width="8%">
                        <div class="first-column">
                            <label class="label-checkbox inline-block">
                                <input class="checkbox" type="checkbox">
                                <i class="i-checkbox"></i>房号
                            </label>
                        </div>
                    </td>
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
            <c:forEach items="${ordersitemList}" var="ordersitem">
	                <tr>
	                    <td>
	                        <div class="first-column">
	                            <label class="label-checkbox inline-block">
	                                <input class="checkbox" type="checkbox">
	                                <i class="i-checkbox"></i>${ordersitem.orders.room.roomId }
	                            </label>
	                        </div>
	                    </td>
	                    <td class="text-center">
	                        <span>${ordersitem.itemname}</span>
	                        <!--ms-if-->
	                        <!--ms-if-->
	                    </td>
	                    <td class="text-center">
	                        <span>¥${ordersitem.xiaofei }</span>
	                    </td>
	                    <td class="text-center">
	                        <!--ms-if-->
	                        <span>¥${ordersitem.fukuan }</span>
	                    </td>
	                    <td class="text-center">${ordersitem.createtime }</td>
	                    <td class="text-center">
	                        ${ordersitem.orders.staff.shift.shiftName}-${ordersitem.orders.staff.staffName }<br>2017-07-22 20:47:45
	                    </td>
	                    <td class="text-center">${ordersitem.itemstatus }</td>
	                    <td>
	                        <span title=""></span>
	                    </td>
	                    <td class="text-center">
	                        <button type="button" class="btn btn-default btn-sm btn-xs mr5">拆账</button>
	                        <button type="button" class="btn btn-default btn-sm btn-xs mr5">冲账</button>
	                        <!--ms-if-->
	                        <button type="button" class="btn btn-default btn-sm btn-xs">修改备注</button>
	                    </td>
	                </tr>
               </c:forEach>
               </tbody>
        </table>

       
</div><!--ms-include-end-->
  
    <!--ms-include-->
    <div class="g-f-btn j-btn-w">
    <button type="button" class="btn btn-success btn-sm  mr10" id="jiezhang" style="display: inline-block;">
 	<input type="hidden" value="${orders.orderId}" id="zhujing_ordersid"/>
    结账退房</button>
    <button type="button" class="btn btn-success btn-sm  mr10" style="display: inline-block;">部分结账</button>
    <button type="button" class="btn btn-success btn-sm  mr10" style="display: inline-block;" id="ruzhang" >
    	入账
    </button>
    <button type="button" class="btn btn-success btn-sm  mr10" style="display: inline-block;" id="savemoney">
 	   
    预收款</button>

    <button type="button" class="btn btn-success btn-sm  mr10" style="display: none;">选房结账</button>
   
    <button type="button" class="btn btn-success btn-sm  mr10" style="display: inline-block;">转账</button>
    

    <button type="button" class="btn btn-success btn-sm  mr10" style="display: inline-block;">挂账</button>
    <button type="button" class="btn btn-success btn-sm  mr10" style="display: inline-block;">加收房费</button>
    <button type="button" class="btn btn-success btn-sm  mr10" style="display: inline-block;">小商品</button>
</div><!--ms-include-end-->
</div><!--ms-include-end-->
</div>
<!-- /contenter -->
</div>
<script type="text/javascript" src='<%=basePath %>/js/jquery-1.8.3.min.js'></script>
<script src="<%=basePath %>/layer/layer.js"></script>
<script type="text/javascript">
            //弹出一个iframe层
                $(function(){
                var ordersid = $(this).find("#zhujing_ordersid").val();
                    $("#jiezhang").click(function(){
                          layer.open({
                              type: 2,
                              title: '结账退房',
                              maxmin: true,
                              shadeClose: true, //点击遮罩关闭层
                              area : ['400px' , '450px'],
                              content: 'getQuitMoney.action?ordersid='+ordersid,
                              end:function(){
                              	location.href="getRoomList.action";
                              }
                              });
                    });
                    /* 点击入账 */
                     $("#ruzhang").click(function(){
                          layer.open({
                              type: 2,
                              title: '入账',
                              maxmin: true,
                              shadeClose: true, //点击遮罩关闭层
                              area : ['400px' , '450px'],
                              content: 'tiaozhuan_record.action?ordersid='+ordersid,
                              end:function(){
                              	location.href="getRoomList.action";
                              }
                              });
                    });
                    /* 交押金 */
					$("#savemoney").click(function(){
                          layer.open({
                              type: 2,
                              title: '预收款',
                              maxmin: true,
                              shadeClose: true, //点击遮罩关闭层
                              area : ['400px' , '450px'],
                              content: 'getPayment.action?ordersid='+ordersid,
                              end:function(){
                              	//关闭窗口的时候刷新父页面
                              	location.href="getRoomList.action";
                              	}
                              });
                    });
                });
        </script>


</body>
</html>