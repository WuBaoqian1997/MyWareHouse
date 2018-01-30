 <!doctype html> 
<html class="no-js fixed-layout"> 
<head> 
<meta charset="utf-8"> 
<meta http-equiv="X-UA-Compatible" content="IE=edge"> 
<title>jQuery自动定位当地天气预报代码</title> 
<script src="js/jquery.min.js"></script>
<script src="js/jquery.leoweather.min.js"></script>
<style>
body  { font:14px/1.5 微软雅黑; text-align:center; }
table { border:1px solid #DDD; border-collapse:collapse; width:980px; margin-top:20px; }
thead,
tfoot { background:#FAFAFA; }
td,th { border:1px solid #DDD; text-align:left; font-weight:normal; padding:15px; }
th,
.demo { width:100px; min-width:100px; max-width:100px; }
td    { width:680px; min-width:680px; max-width:680px; }
#demo { width:780px; margin:150px auto; background:#72af3c; color:#FFF; padding:50px 0 100px 0; overflow:hidden; border-radius:5000px; }
#demo i { background: no-repeat top left; display:inline-block; height:128px; line-height:128px; margin:0 auto 20px auto; font-size:70px; padding-left:150px; font-style:normal; text-align:center; font-weight:bold; }
#demo i.icon-xiaoyu { background-image:url(icon/xiaoyu.png); }
#demo i.icon-zhongyu { background-image:url(icon/zhongyu.png); }
#demo i.icon-dayu { background-image:url(icon/dayu.png); }
#demo i.icon-qing { background-image:url(icon/qing.png); }
#demo i.icon-duoyun { background-image:url(icon/duoyun.png); }
#demo i.icon-yin { background-image:url(icon/yin.png); }
#demo p { background:rgba(0,0,0,.3); margin:0 200px; padding:20px; border-radius:1000px; font-size:16px; }
#demo p span { margin:0 15px; }
#demo2 { width:980px; margin:0 auto; margin-top:20px; background:#fafafa; border:1px solid #ddd; padding:30px 0; overflow:hidden; }
</style>
</head> 
<body>
<div id="demo">
<script>$('#demo').leoweather({format:'<i class="icon-{图标}">{气温}℃</i><p>{城市}<span>|</span>{天气}<span>|</span>{风向}{风级}级</p>'});</script>
</div>
<div id="demo2">
<script>$('#demo2').leoweather();</script>
</div>
<div class="api" align="center">
<table>
<thead>
<tr>
<th>参数</th>
<td>说明</td>
</tr>
</thead>
<tbody>
<tr>
<th>city</th>
<td>设置显示哪一个城市的天气，不设置则自动根据IP获取城市</td>
</tr>
<tr>
<th>format</th>
<td>用标签设置显示内容的格式，不设置则显示默认格式</td>
</tr>
</tbody>
</table>
</div>
<div class="tag" align="center">
<table>
<thead>
<tr>
<th>标签</th>
<td class="demo">演示</td>
<td>说明</td>
</tr>
</thead>
<tbody>
<tr>
<th>{年}</th>
<td class="demo" id="nian"><script>$('#nian').leoweather({format:'{年}年'});</script></td>
<td>显示当前时间的年份，如：2016</td>
</tr>
<tr>
<th>{月}</th>
<td class="demo" id="yue"><script>$('#yue').leoweather({format:'{月}月'});</script></td>
<td>显示当前时间的月份，如：08</td>
</tr>
<tr>
<th>{日}</th>
<td class="demo" id="ri"><script>$('#ri').leoweather({format:'{日}日'});</script></td>
<td>显示当前时间的日期，如：16</td>
</tr>
<tr>
<th>{时}</th>
<td class="demo" id="shi"><script>$('#shi').leoweather({format:'{时}时'});</script></td>
<td>显示当前时间的小时，如：14，当只定义了小时，没有定义分钟和秒钟，则计时器每小时跳动一次</td>
</tr>
<tr>
<th>{分}</th>
<td class="demo" id="fen"><script>$('#fen').leoweather({format:'{分}分'});</script></td>
<td>显示当前时间的分钟，如：38，当只定义了分钟，没有定义秒钟，则计时器每分钟跳动一次</td>
</tr>
<tr>
<th>{秒}</th>
<td class="demo" id="miao"><script>$('#miao').leoweather({format:'{秒}秒'});</script></td>
<td>显示当前时间的年份，如：57，当只定义了秒钟，则计时器每秒跳动一次</td>
</tr>
<tr>
<th>{周}</th>
<td class="demo" id="zhou"><script>$('#zhou').leoweather({format:'星期{周}'});</script></td>
<td>显示当前时间是周几，如：日、一、二、三、四、五、六</td>
</tr>
<tr>
<th>{时段}</th>
<td class="demo" id="shiduan"><script>$('#shiduan').leoweather({format:'{时段}'});</script></td>
<td>显示当前时间的时段，如：上午、中午、下午、傍晚、晚上、凌晨</td>
</tr>
<tr>
<th>{昼夜}</th>
<td class="demo" id="zhouye"><script>$('#zhouye').leoweather({format:'{昼夜}'});</script></td>
<td>显示当前时段是白天还是黑夜，如：白天、夜间</td>
</tr>
<tr>
<th>{城市}</th>
<td class="demo" id="chengshi"><script>$('#chengshi').leoweather({format:'{城市}'});</script></td>
<td>显示城市名称</td>
</tr>
<tr>
<th>{天气}</th>
<td class="demo" id="tianqi"><script>$('#tianqi').leoweather({format:'{天气}'});</script></td>
<td>显示当前城市天气，如：阵雨、晴、多云、阴</td>
</tr>
<tr>
<th>{气温}</th>
<td class="demo" id="qiwen"><script>$('#qiwen').leoweather({format:'{气温}'});</script></td>
<td>显示当前城市气温，如：30、24</td>
</tr>
<tr>
<th>{风向}</th>
<td class="demo" id="fengxiang"><script>$('#fengxiang').leoweather({format:'{风向}'});</script></td>
<td>显示当前城市风向，如：无持续风向、北风</td>
</tr>
<tr>
<th>{风级}</th>
<td class="demo" id="fengji"><script>$('#fengji').leoweather({format:'{风级}'});</script></td>
<td>显示当前城市风级，如：≤3、≤2、≤1</td>
</tr>
<tr>
<th>{图标}</th>
<td class="demo" id="tubiao"><script>$('#tubiao').leoweather({format:'{图标}'});</script></td>
<td>显示当前城市天气英文，如：qing、duoyun，可用于拓展图标：&lt;img src='img/weather/{图标}.jpg'&gt;</td>
</tr>
<tfoot>
<tr>
<th>特别说明</th>
<td colspan="2">
如果需要独立提取白天或者夜间的天气数据，可以使用：{白天}或者{夜间}标签提取，如：{白天气温}<br>
当只定义了时间标签，如年月日时分秒时段昼夜，则插件不读取天气数据<br>
当只定义了天气标签，如：城市天气气温风向风级图标白天夜间，插件则不读取时间
</td>
</tr>
</tfoot>
</tbody>
</table>
</div>
 
<!--readem 以下非正文信息-->
<div style="clear:both;height:10px;"></div>
<div class="rem" style="width:80%;margin:30px auto 10px auto;font-size:14px;">
<p style="border-top:1px solid #ccc;padding-top:10px;"><a href="http://www.shangdaotong.com/yxbk/" target="_blank">返回首页</a> / 代码整理：<a href="http://www.shangdaotong.com/yxbk/" target="_blank">营销百科</a></p>
<p style="font-size:14px;">◎ 尊重他人劳动成果,转载请自觉注明出处！注：此代码仅供学习交流,请勿用于商业用途。</p>
</div>
<!--end readem-->
</body> 
</html>