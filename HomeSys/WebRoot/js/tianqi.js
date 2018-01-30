 <!doctype html> 
<html class="no-js fixed-layout"> 
<head> 
<meta charset="utf-8"> 
<meta http-equiv="X-UA-Compatible" content="IE=edge"> 
<title>jQuery�Զ���λ��������Ԥ������</title> 
<script src="js/jquery.min.js"></script>
<script src="js/jquery.leoweather.min.js"></script>
<style>
body  { font:14px/1.5 ΢���ź�; text-align:center; }
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
<script>$('#demo').leoweather({format:'<i class="icon-{ͼ��}">{����}��</i><p>{����}<span>|</span>{����}<span>|</span>{����}{�缶}��</p>'});</script>
</div>
<div id="demo2">
<script>$('#demo2').leoweather();</script>
</div>
<div class="api" align="center">
<table>
<thead>
<tr>
<th>����</th>
<td>˵��</td>
</tr>
</thead>
<tbody>
<tr>
<th>city</th>
<td>������ʾ��һ�����е����������������Զ�����IP��ȡ����</td>
</tr>
<tr>
<th>format</th>
<td>�ñ�ǩ������ʾ���ݵĸ�ʽ������������ʾĬ�ϸ�ʽ</td>
</tr>
</tbody>
</table>
</div>
<div class="tag" align="center">
<table>
<thead>
<tr>
<th>��ǩ</th>
<td class="demo">��ʾ</td>
<td>˵��</td>
</tr>
</thead>
<tbody>
<tr>
<th>{��}</th>
<td class="demo" id="nian"><script>$('#nian').leoweather({format:'{��}��'});</script></td>
<td>��ʾ��ǰʱ�����ݣ��磺2016</td>
</tr>
<tr>
<th>{��}</th>
<td class="demo" id="yue"><script>$('#yue').leoweather({format:'{��}��'});</script></td>
<td>��ʾ��ǰʱ����·ݣ��磺08</td>
</tr>
<tr>
<th>{��}</th>
<td class="demo" id="ri"><script>$('#ri').leoweather({format:'{��}��'});</script></td>
<td>��ʾ��ǰʱ������ڣ��磺16</td>
</tr>
<tr>
<th>{ʱ}</th>
<td class="demo" id="shi"><script>$('#shi').leoweather({format:'{ʱ}ʱ'});</script></td>
<td>��ʾ��ǰʱ���Сʱ���磺14����ֻ������Сʱ��û�ж�����Ӻ����ӣ����ʱ��ÿСʱ����һ��</td>
</tr>
<tr>
<th>{��}</th>
<td class="demo" id="fen"><script>$('#fen').leoweather({format:'{��}��'});</script></td>
<td>��ʾ��ǰʱ��ķ��ӣ��磺38����ֻ�����˷��ӣ�û�ж������ӣ����ʱ��ÿ��������һ��</td>
</tr>
<tr>
<th>{��}</th>
<td class="demo" id="miao"><script>$('#miao').leoweather({format:'{��}��'});</script></td>
<td>��ʾ��ǰʱ�����ݣ��磺57����ֻ���������ӣ����ʱ��ÿ������һ��</td>
</tr>
<tr>
<th>{��}</th>
<td class="demo" id="zhou"><script>$('#zhou').leoweather({format:'����{��}'});</script></td>
<td>��ʾ��ǰʱ�����ܼ����磺�ա�һ�����������ġ��塢��</td>
</tr>
<tr>
<th>{ʱ��}</th>
<td class="demo" id="shiduan"><script>$('#shiduan').leoweather({format:'{ʱ��}'});</script></td>
<td>��ʾ��ǰʱ���ʱ�Σ��磺���硢���硢���硢�������ϡ��賿</td>
</tr>
<tr>
<th>{��ҹ}</th>
<td class="demo" id="zhouye"><script>$('#zhouye').leoweather({format:'{��ҹ}'});</script></td>
<td>��ʾ��ǰʱ���ǰ��컹�Ǻ�ҹ���磺���졢ҹ��</td>
</tr>
<tr>
<th>{����}</th>
<td class="demo" id="chengshi"><script>$('#chengshi').leoweather({format:'{����}'});</script></td>
<td>��ʾ��������</td>
</tr>
<tr>
<th>{����}</th>
<td class="demo" id="tianqi"><script>$('#tianqi').leoweather({format:'{����}'});</script></td>
<td>��ʾ��ǰ�����������磺���ꡢ�硢���ơ���</td>
</tr>
<tr>
<th>{����}</th>
<td class="demo" id="qiwen"><script>$('#qiwen').leoweather({format:'{����}'});</script></td>
<td>��ʾ��ǰ�������£��磺30��24</td>
</tr>
<tr>
<th>{����}</th>
<td class="demo" id="fengxiang"><script>$('#fengxiang').leoweather({format:'{����}'});</script></td>
<td>��ʾ��ǰ���з����磺�޳������򡢱���</td>
</tr>
<tr>
<th>{�缶}</th>
<td class="demo" id="fengji"><script>$('#fengji').leoweather({format:'{�缶}'});</script></td>
<td>��ʾ��ǰ���з缶���磺��3����2����1</td>
</tr>
<tr>
<th>{ͼ��}</th>
<td class="demo" id="tubiao"><script>$('#tubiao').leoweather({format:'{ͼ��}'});</script></td>
<td>��ʾ��ǰ��������Ӣ�ģ��磺qing��duoyun����������չͼ�꣺&lt;img src='img/weather/{ͼ��}.jpg'&gt;</td>
</tr>
<tfoot>
<tr>
<th>�ر�˵��</th>
<td colspan="2">
�����Ҫ������ȡ�������ҹ����������ݣ�����ʹ�ã�{����}����{ҹ��}��ǩ��ȡ���磺{��������}<br>
��ֻ������ʱ���ǩ����������ʱ����ʱ����ҹ����������ȡ��������<br>
��ֻ������������ǩ���磺�����������·���缶ͼ�����ҹ�䣬����򲻶�ȡʱ��
</td>
</tr>
</tfoot>
</tbody>
</table>
</div>
 
<!--readem ���·�������Ϣ-->
<div style="clear:both;height:10px;"></div>
<div class="rem" style="width:80%;margin:30px auto 10px auto;font-size:14px;">
<p style="border-top:1px solid #ccc;padding-top:10px;"><a href="http://www.shangdaotong.com/yxbk/" target="_blank">������ҳ</a> / ��������<a href="http://www.shangdaotong.com/yxbk/" target="_blank">Ӫ���ٿ�</a></p>
<p style="font-size:14px;">�� ���������Ͷ��ɹ�,ת�����Ծ�ע��������ע���˴������ѧϰ����,����������ҵ��;��</p>
</div>
<!--end readem-->
</body> 
</html>