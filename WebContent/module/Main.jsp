<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="ws" uri="/website"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%--
	/**
	 * 该jsp的描述信息
	 *
	 * @author shiliang tel：18661205639
	 * @version 1.0
	 * @since 2014-7-14 下午9:43:44
	 * 
	 * 
	 */
 --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<style type="text/css">
<!--
.STYLE1 {
	font-family: "微软雅黑";
	color: #FFFFFF;
	font-size: 14px;
	text-decoration: underline;
}
body,td,th {
	font-family: 微软雅黑;
}
body {
	background-color: #f5f5f5;
}
-->
</style>
<title>主页</title>
<link href="<s:url value="/css/"/>layout.css" rel="stylesheet" type="text/css" />

<style type="text/css">
<!--
a:link {
	text-decoration: none;
}
a:visited {
	text-decoration: none;
}
a:hover {
	text-decoration: none;
}
a:active {
	text-decoration: none;
}
a {
	font-family: 微软雅黑;
}

-->
</style>
<script>
function setTab(name,cursel){
	cursel_0=cursel;
	for(var i=1; i<=links_len; i++){
		var men = document.getElementById(name+i);
		var mendiv = document.getElementById("con_"+name+"_"+i);
		if(i==cursel){
			men.className="off";
			mendiv.style.display="block";
		}
		else{
			men.className="";
			mendiv.style.display="none";
		}
	}
}
function Next(){                                                        
	cursel_0++;
	if (cursel_0>links_len)cursel_0=1
	setTab(name_0,cursel_0);
} 
var name_0='one';
var cursel_0=1;
var links_len,iIntervalId;
onload=function(){
	var links = document.getElementById("tab2").getElementsByTagName('li')
	links_len=links.length;
	for(var i=0; i<links_len; i++){
		links[i].onmouseover=function(){
			clearInterval(iIntervalId);
			this.onmouseout=function(){
				iIntervalId = setInterval(Next,ScrollTime);;
			}
		}
	}
	document.getElementById("con_"+name_0+"_"+links_len).parentNode.onmouseover=function(){
		clearInterval(iIntervalId);
		this.onmouseout=function(){
			iIntervalId = setInterval(Next,ScrollTime);;
		}
	}
	setTab(name_0,cursel_0);
	iIntervalId = setInterval(Next,ScrollTime);
}
</script>
</head>

<body><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#1880B3">
  <tr>
    <td width="83%" rowspan="2" bgcolor="#217FCA"><img src="images/top.png" width="853" height="70" /></td>
    <td colspan="2" bgcolor="#217FCA"><div align="left" class="STYLE2">
      <div align="right">欢迎，<shiro:principal /></div>
    </div>
      <div align="left"></div>
    <div align="left" class="STYLE2"></div></td>
    <td bgcolor="#217FCA">&nbsp;</td>
  </tr>
  <tr>
    <td width="9%" bgcolor="#217FCA"><div align="right"><img src="images/key.png" width="30" height="29" align="absmiddle" /><a href="<s:url value="/help.html"/>" class="STYLE2">常见问题</a></div></td>
    <td width="6%" bgcolor="#217FCA"><div align="right"><img src="images/power.png" width="30" height="29" align="absmiddle" /><a href="<s:url value="/logout.html"/>" class="STYLE2">退出</a></div></td>
    <td width="2%" bgcolor="#217FCA">&nbsp;</td>
  </tr>
</table>


<div id="container">
  <div id="header"><br/>
<div class="tab2" id="tab2">
	<div class="men">
			<li id="one1" onclick="setTab('one',1)">科技计划项目</li>
	    <li id="one2" onclick="setTab('one',2)">审批审核业务</li>
          <li id="one3" onclick="setTab('one',3)">科技计划项目</li>
	    <li id="one4" onclick="setTab('one',4)">审批审核业务</li>
          <li id="one5" onclick="setTab('one',5)">审批审核业务</li>
	</div>
	<div class="mendiv">
		<div id="con_one_1" >
		  <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td><div align="center">科技支撑计划</div></td>
              <td><div align="center">科技支撑计划</div></td>
              <td><div align="center">科技支撑计划</div></td>
              <td><div align="center">科技支撑计划</div></td>
              <td><div align="center">科技支撑计划</div></td>
              <td><div align="center">科技支撑计划</div></td>
              <td><div align="center">科技支撑计划</div></td>
            </tr>
          </table>
		</div>
		<div id="con_one_2" style="display:none;"><table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td><div align="center">科技支撑计划</div></td>
    <td><div align="center">科技支撑计划</div></td>
    <td><div align="center">科技支撑计划</div></td>
     </tr>
</table>
</div>
<div id="con_one_3" style="display:none;"><table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td><div align="center">科技支撑计划</div></td>
    <td><div align="center">科技支撑计划</div></td>
    <td><div align="center">科技支撑计划</div></td>
     </tr>
</table>
</div>
<div id="con_one_4" style="display:none;"><table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td><div align="center">科技支撑计划</div></td>
    <td><div align="center">科技支撑计划</div></td>
    <td><div align="center">科技支撑计划</div></td>
     </tr>
</table>
</div>
<div id="con_one_5" style="display:none;"><table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td><div align="center">科技支撑计划</div></td>
    <td><div align="center">科技支撑计划</div></td>
    <td><div align="center">科技支撑计划</div></td>
     </tr>
</table>
</div>
	</div>
</div>
<table width="100%" height="28" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td width="50%"><span class="STYLE5">丨</span><span class="STYLE4">业务办理</span></td>
    <td width="50%"><span class="STYLE5">丨</span><span class="STYLE4">提醒事项</span></td>
  </tr>
</table>
<table width="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td width="50%" rowspan="2" valign="top"><div class="busine">
    <table width="100%" height="39" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td width="31%" bgcolor="#e8e8e8" class="line"><div align="center"><a href="2.html" class="STYLE9">科技计划项目类</a></div></td>
    <td width="33%" class="line"><div align="center"><a href="3.html" class="STYLE9">审批审核业务类</a> </div></td>
    <td width="36%" class="line">&nbsp;</td>
  </tr>
</table>
<br/>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td><p align="center"><a href="a.htm"><img src="images/1.png" width="86" height="80" /></a></p>            </td>
          <td><div align="center"><img src="images/tou.png" width="37" height="38" /></div></td>
          <td><div align="center"><a href="a.htm"><img src="images/2.png" width="86" height="80" /></a></div></td>
          <td><div align="center"><img src="images/tou.png" width="37" height="38" /></div></td>
          <td><div align="center"><a href="a.htm"><img src="images/3.png" width="86" height="80" /></a></div></td>
        </tr>
        <tr>
          <td height="30"><div align="center"><span class="STYLE3">申报书审核</span></div></td>
          <td><div align="center"></div></td>
          <td><div align="center" class="STYLE3">合同书审核</div></td>
          <td><div align="center"></div></td>
          <td><div align="center" class="STYLE3">经费查询</div></td>
        </tr>
        <tr>
          <td height="30"><div align="center"><img src="images/down.png" width="38" height="37" /></div></td>
          <td>&nbsp;</td>
          <td><div align="center"><img src="images/left.png" width="37" height="38" /></div></td>
          <td>&nbsp;</td>
          <td><div align="center"><img src="images/up.png" width="38" height="37" /></div></td>
        </tr>
      </table>
      <table width="100%" height="110" border="0" cellpadding="0" cellspacing="0">
        <tr>
          <td width="25%" height="80"><p align="center"><a href="a.htm"><img src="images/4.png" width="86" height="80" /></a></p>            </td>
          <td width="11%"><div align="center"><img src="images/tou.png" width="37" height="38" /></div></td>
          <td width="27%"><div align="center"><a href="a.htm"><img src="images/5.png" width="86" height="80" /></a></div></td>
          <td width="11%"><div align="center"><img src="images/tou.png" width="37" height="38" /></div></td>
          <td width="26%"><div align="center"><a href="a.htm"><img src="images/6.png" width="86" height="80" /></a></div></td>
        </tr>
        <tr>
          <td height="30"><div align="center"><span class="STYLE3">变更管理</span></div></td>
          <td><div align="center"></div></td>
          <td><div align="center" class="STYLE3">中期检查管理</div></td>
          <td><div align="center"></div></td>
          <td><div align="center">项目验收（结题）</div></td>
        </tr>
      </table>
    </div></td>
    <td width="50%" height="173" valign="top"><div class="busine"><table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="6%"><div align="center"><img src="images/voice.png" width="16" height="19" align="middle" /></div></td>
    <td width="94%">通知公告 <span class="STYLE8"><a href="a.htm" class="STYLE8">8</a></span> </td>
  </tr>
</table>
        <table width="100%" height="120" border="0" cellpadding="0" cellspacing="0">

  <tr>
    <td height="30"><div align="left" class="line">有3个单位信息等待审批，<span class="STYLE8"><a href="a.htm" class="STYLE8">点击进入</a></span> </div></td>
  </tr>
  <tr>
        <td height="30"><div align="left" class="line">有3个单位信息等待审批，<span class="STYLE8"><a href="a.htm" class="STYLE8">点击进入</a> </span></div></td>
  </tr> 
  <tr>
      <td height="30"><div align="left" class="STYLE8"><a href="a.htm" class="STYLE8">关于地市科技局组织申报江西省2011年度科技计划项目的通知</a> </div></td>
  </tr>
  <tr>
      <td height="30"><div align="left" class="line">有3个单位信息等待审批，<span class="STYLE8"><a href="a.htm" class="STYLE8">点击进入</a></span> </div></td>
  </tr>
  <tr>
      <td height="30"><div align="left" class="line">有3个单位信息等待审批，<span class="STYLE8"><a href="a.htm" class="STYLE8">点击进入</a></span> </div></td>
  </tr>
</table>
</div></td>
  </tr>
  <tr>
    <td height="234" valign="top"><span class="STYLE5">丨</span><span class="STYLE4">辅助管理</span>
      <div class="busines"><table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="55"><div align="center"><span class="btn3"><a href="a.htm" class="STYLE10">单位信息维护</a></span></div></td>
    <td><div align="center"><span class="btn3"><a href="a.htm" class="STYLE10">申报人管理</a></span></div></td>
  </tr>
</table>
</div></td>
  </tr>
</table>
</div>
</div>
<table width="100%" border="0" cellspacing="0">
  <tr>
    <td height="60" bgcolor="#3b3b3b"><p align="center" class="STYLE2">主办单位： 江西省科学技术厅    技术支持： 爱瑞思软件（深圳）有限公司  技术支持电话：40077045500，791-82058272 </p>
    </td>
  </tr>
</table>

</body>
</html>