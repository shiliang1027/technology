<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="ws" uri="/website"%>
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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<ws:res
	addRes="css/layout.css,easyui/themes/default/easyui.css,easyui/themes/icon.css,easyui/jquery-1.8.0.min.js,easyui/jquery.easyui.min.js,easyui/locale/easyui-lang-zh_CN.js" />
<title>首页</title>
<style type="text/css">
<!--
.STYLE1 {
	font-family: "微软雅黑";
	color: #FFFFFF;
	font-size: 12px;
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
	
}

a {
	font-family: 微软雅黑;
}
-->
</style>
<script>
	function setTab(name, cursel) {
		cursel_0 = cursel;
		for ( var i = 1; i <= links_len; i++) {
			var menu = document.getElementById(name + i);
			var menudiv = document.getElementById("con_" + name + "_" + i);
			if (i == cursel) {
				menu.className = "off";
				menudiv.style.display = "block";
			} else {
				menu.className = "";
				menudiv.style.display = "none";
			}
		}
	}
	function Next() {
		cursel_0++;
		if (cursel_0 > links_len)
			cursel_0 = 1
		setTab(name_0, cursel_0);
	}
	var name_0 = 'one';
	var cursel_0 = 1;
	var links_len, iIntervalId;
	onload = function() {
		var links = document.getElementById("tab1").getElementsByTagName('li')
		links_len = links.length;
		setTab(name_0, cursel_0);
	}

	function ScrollTime() {

	}
	function changeSecurityCode() {
		$("#securityCodeImage").attr("src",
				'<s:url value="/images/securityCode.jpg"/>?' + Math.random());
	}
</script>
</head>

<body>
	<table width="100%" border="0" cellpadding="0" cellspacing="0"
		bgcolor="#1880B3">
		<tr>
			<td bgcolor="#2681C8"><img src="images/top.png" width="853"
				height="70" /></td>
		</tr>
	</table>

	<form id="ff" method="post" style="margin: 0;"
		action="<s:url value="/login.html"/>"
		onsubmit="return $('#ff').form('validate')">
		<table width="100%" height="35" border="0" cellpadding="0"
			cellspacing="0">

			<tr>
				<td width="3%" bgcolor="#1880b3" class="STYLE2">&nbsp;</td>
				<td bgcolor="#1880b3" class="STYLE2"><div align="center">
						普通登录 丨 用户名 <input name="username" data-options="required:true"
							class="easyui-validatebox" type="text" id="textfield2" size="12" />
						密码 <input name="pwd" data-options="required:true"
							class="easyui-validatebox" type="text" id="textfield3" size="12" />
						验证码 <input name="securityCode" data-options="required:true"
							class="easyui-validatebox" type="text" id="textfield4" size="8" />
						<img id="securityCodeImage" style="cursor: pointer;"
							src="<s:url value="/images/securityCode.jpg"/>" alt="看不清？换一个"
							onclick="changeSecurityCode()" width="63" height="20"
							align="absmiddle" />&nbsp;&nbsp;<span class="btn"><a
							href="javascript:void(0)" onclick="$('#ff').submit()"
							class="STYLE2">登录</a></span>&nbsp;&nbsp;<font color="red"><s:property
								value="ajax" /></font>&nbsp;&nbsp;&nbsp;&nbsp;<span class="STYLE1"><a
							href="<s:url value="/register.html"/>" class="STYLE1">新用户注册</a></span>&nbsp;&nbsp;<span
							class="STYLE1"><a
							href="<s:url value="/passwordforget.html"/>" class="STYLE1">忘记密码</a></span>
					</div>
					<div align="left"></div>
					<div align="left"></div></td>
			</tr>
		</table>
	</form>
	<div id="container">
		<div id="header">
			<table width="100%" border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td width="25%"><div class="busines">
							<table width="100%" cellspacing="0">
								<tr>
									<td><a href="a.htm"><img src="images/xt.png"
											width="65" height="41" /></a></td>
									<td class="STYLE3"><a href="a.htm" class="STYLE3">系统使用演示</a></td>
								</tr>
							</table>
						</div></td>
					<td width="25%"><div class="busines">
							<table width="100%" cellspacing="0">
								<tr>
									<td><a href="a.htm"><img src="images/xt2.png"
											width="65" height="41" /></a></td>
									<td class="STYLE3"><a href="a.htm" class="STYLE3">系统使用说明</a></td>
								</tr>
							</table>
						</div></td>
					<td width="25%"><div class="busines">
							<table width="100%" cellspacing="0">
								<tr>
									<td><a href="a.htm"><img src="images/xt3.png"
											width="65" height="41" /></a></td>
									<td class="STYLE3"><a href="a.htm" class="STYLE3">系统用户介绍</a></td>
								</tr>
							</table>
						</div></td>
					<td width="25%"><div class="busines">
							<table width="100%" cellspacing="0">
								<tr>
									<td><a href="a.htm"><img src="images/xt4.png"
											width="65" height="41" /></a></td>
									<td class="STYLE3"><a href="a.htm" class="STYLE3">相关软件下载</a></td>
								</tr>
							</table>
						</div></td>
				</tr>
			</table>
			<span class="STYLE5">丨</span><span class="STYLE4">科技业务一览</span>
			<div class="busines">
				<div class="tab1" id="tab1">
					<div class="technologymenu">
						<li id="one1" onclick="setTab('one',1)">科技计划项目</li>
						<li id="one2" onclick="setTab('one',2)">审批审核业务</li>
					</div>
					<div class="menudiv">
						<div id="con_one_1">
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
						<div id="con_one_2" style="display: none;">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td><div align="center">科技支撑计划</div></td>
									<td><div align="center">科技支撑计划</div></td>
									<td><div align="center">科技支撑计划</div></td>
								</tr>
							</table>
						</div>
					</div>
				</div>
				<table width="100%" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td width="17%" height="32" bgcolor="#f5f5f5"><div
								align="center" class="STYLE3">业务类别</div></td>
						<td width="17%" bgcolor="#f5f5f5"><div align="center"
								class="STYLE3">业务类别</div></td>
						<td width="15%" bgcolor="#f5f5f5"><div align="center"
								class="STYLE3">业务类别</div></td>
						<td width="17%" bgcolor="#f5f5f5"><div align="center"
								class="STYLE3">业务类别</div></td>
						<td width="17%" bgcolor="#f5f5f5"><div align="center"
								class="STYLE3">业务类别</div></td>
						<td width="17%" bgcolor="#f5f5f5"><div align="center"
								class="STYLE3">业务类别</div></td>
					</tr>
					<tr>
						<td height="34" class="line"><div align="center">重点实验室建设计划</div></td>
						<td class="line"><div align="center">
								<a href="a.htm" class="STYLE9">查看</a>
							</div></td>
						<td class="line"><div align="center">
								<img src="images/pdf.png" width="18" height="18" /><img
									src="images/word.png" width="15" height="15" />
							</div></td>
						<td class="line"><div align="center">
								<a href="a.htm" class="STYLE9">查看</a>
							</div></td>
						<td class="line"><div align="center">
								<a href="a.htm" class="STYLE9">查看</a>
							</div></td>
						<td class="line"><div align="center">
								<span class="btn"><a href="a.htm" class="STYLE2">申报</a></span>
							</div></td>
					</tr>
					<tr>
						<td height="34" class="line"><div align="center">重点实验室建设计划</div></td>
						<td class="line"><div align="center">
								<a href="a.htm" class="STYLE9">查看</a>
							</div></td>
						<td class="line"><div align="center">
								<img src="images/pdf.png" width="18" height="18" /><img
									src="images/word.png" width="15" height="15" />
							</div></td>
						<td class="line"><div align="center">
								<a href="a.htm" class="STYLE9">查看</a>
							</div></td>
						<td class="line"><div align="center">
								<a href="a.htm" class="STYLE9">查看</a>
							</div></td>
						<td class="line"><div align="center">
								<span class="btn"><a href="a.htm" class="STYLE2">申报</a></span>
							</div></td>
					</tr>
					<tr>
						<td height="34" class="line"><div align="center">重点实验室建设计划</div></td>
						<td class="line"><div align="center">
								<a href="a.htm" class="STYLE9">查看</a>
							</div></td>
						<td class="line"><div align="center">
								<img src="images/pdf.png" width="18" height="18" /><img
									src="images/word.png" width="15" height="15" />
							</div></td>
						<td class="line"><div align="center">
								<a href="a.htm" class="STYLE9">查看</a>
							</div></td>
						<td class="line"><div align="center">
								<a href="a.htm" class="STYLE9">查看</a>
							</div></td>
						<td class="line"><div align="center">
								<span class="btn"><a href="a.htm" class="STYLE2">申报</a></span>
							</div></td>
					</tr>
					<tr>
						<td height="34" class="line"><div align="center">重点实验室建设计划</div></td>
						<td class="line"><div align="center">
								<a href="a.htm" class="STYLE9">查看</a>
							</div></td>
						<td class="line"><div align="center">
								<img src="images/pdf.png" width="18" height="18" /><img
									src="images/word.png" width="15" height="15" />
							</div></td>
						<td class="line"><div align="center">
								<a href="a.htm" class="STYLE9">查看</a>
							</div></td>
						<td class="line"><div align="center">
								<a href="a.htm" class="STYLE9">查看</a>
							</div></td>
						<td class="line"><div align="center">
								<span class="btn"><a href="a.htm" class="STYLE2">申报</a></span>
							</div></td>
					</tr>
					<tr>
						<td height="34" class="line"><div align="center">重点实验室建设计划</div></td>
						<td class="line"><div align="center">
								<a href="a.htm" class="STYLE9">查看</a>
							</div></td>
						<td class="line"><div align="center">
								<img src="images/pdf.png" width="18" height="18" /><img
									src="images/word.png" width="15" height="15" />
							</div></td>
						<td class="line"><div align="center">
								<a href="a.htm" class="STYLE9">查看</a>
							</div></td>
						<td class="line"><div align="center">
								<a href="a.htm" class="STYLE9">查看</a>
							</div></td>
						<td class="line"><div align="center">
								<span class="btn"><a href="a.htm" class="STYLE2">申报</a></span>
							</div></td>
					</tr>
					<tr>
						<td height="34" class="line"><div align="center">重点实验室建设计划</div></td>
						<td class="line"><div align="center">
								<a href="a.htm" class="STYLE9">查看</a>
							</div></td>
						<td class="line"><div align="center">
								<img src="images/pdf.png" width="18" height="18" /><img
									src="images/word.png" width="15" height="15" />
							</div></td>
						<td class="line"><div align="center">
								<a href="a.htm" class="STYLE9">查看</a>
							</div></td>
						<td class="line"><div align="center">
								<a href="a.htm" class="STYLE9">查看</a>
							</div></td>
						<td class="line"><div align="center">
								<span class="btn"><a href="a.htm" class="STYLE2">申报</a></span>
							</div></td>
					</tr>
					<tr>
						<td height="34" class="line"><div align="center">重点实验室建设计划</div></td>
						<td class="line"><div align="center">
								<a href="a.htm" class="STYLE9">查看</a>
							</div></td>
						<td class="line"><div align="center">
								<img src="images/pdf.png" width="18" height="18" /><img
									src="images/word.png" width="15" height="15" />
							</div></td>
						<td class="line"><div align="center">
								<a href="a.htm" class="STYLE9">查看</a>
							</div></td>
						<td class="line"><div align="center">
								<a href="a.htm" class="STYLE9">查看</a>
							</div></td>
						<td class="line"><div align="center">
								<span class="btn"><a href="a.htm" class="STYLE2">申报</a></span>
							</div></td>
					</tr>
				</table>

			</div>
			<table width="100%" border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td width="50%"><span class="STYLE5">丨</span><span
						class="STYLE4">公告通知</span></td>
					<td width="50%"><span class="STYLE5">丨</span><span
						class="STYLE4">动态提示</span></td>
				</tr>
			</table>

			<table width="100%" cellspacing="0">
				<tr>
					<td width="50%" height="234" valign="top"><div class="busines">
							<table width="100%" height="170" border="0" cellpadding="0"
								cellspacing="0">

								<tr>
									<td height="30" colspan="2"><div align="left" class="line">
											<a href="a.htm" class="STYLE9">(2013-08-20)江西省科学技术厅关于组织申报江西省江西省江西省...</a>
										</div></td>
								</tr>
								<tr>
									<td height="30" colspan="2"><div align="left" class="line">
											<a href="a.htm" class="STYLE9">(2013-08-20)江西省科学技术厅关于组织申报江西省江西省江西省...</a>
										</div></td>
								</tr>
								<tr>
									<td height="30" colspan="2"><div align="left" class="line">
											<a href="a.htm" class="STYLE9">(2013-08-20)江西省科学技术厅关于组织申报江西省江西省江西省...</a>
										</div></td>
								</tr>
								<tr>
									<td height="30" colspan="2"><div align="left" class="line">
											<a href="a.htm" class="STYLE9">(2013-08-20)江西省科学技术厅关于组织申报江西省江西省江西省...</a>
										</div></td>
								</tr>
								<tr>
									<td width="87%" height="50" class="STYLE6">有疑问，先查看<a
										href="a.htm" class="STYLE8">“项目申报常见问题”</a>，再联系技术支持：40077045
									</td>
									<td width="13%" class="STYLE4"><div align="right">
											<a href="a.htm" class="STYLE4">更多》</a>
										</div></td>
								</tr>
							</table>
						</div></td>
					<td width="50%" valign="top"><div class="busine">
							<marquee onMouseOver=this.stop() onMouseOut=this.start()
								scrollamount=1 scrolldelay=5 direction=up width=420 height=150>
							<span class="STYLE4">现特别提醒以下事项：</span>
							<br />
							1、各单位可以下载业务使用指南，了解单位注册流程，申报人注册流程，及项目申报流程等，详见演示文稿 。 <br />
							2、请各单位抓紧准备好单位的相关信息材料，认真填写单位信息的各项内容，完成用户帐号注册，以免影响项目申报。<br />
							1、各单位可以下载业务使用指南，了解单位注册流程，申报人注册流程，及项目申报流程等，详见演示文稿 。 <br />
							2、请各单位抓紧准备好单位的相关信息材料，认真填写单位信息的各项内容，完成用户帐号注册，以免影响项目申报。<br />
							3、密切留意首页“科技业务一览”列表，了解各科技业</marquee>
						</div></td>
				</tr>
			</table>


		</div>

	</div>
	<table width="100%" border="0" cellspacing="0">
		<tr>
			<td height="60" bgcolor="#3b3b3b"><p align="center"
					class="STYLE2">主办单位： 江西省科学技术厅 技术支持： 爱瑞思软件（深圳）有限公司
					技术支持电话：40077045500，791-82058272</p></td>
		</tr>
	</table>

</body>
</html>