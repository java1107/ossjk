<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

   <link href="../css/four.css" rel="stylesheet" type="text/css" />

	<!-- 包含等待框 -->
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr valign="top">
			<td>
			   <img src="shEmpimgs.do?fjid=${param.fjid}" style="width: 640px;height: 480px">
			</td>
		</tr>
		<tr>
		  <td  align="left">${param.fn},可以使用鼠标右键"图片另存为"下载</td>
		</tr>
		<tr>
		  <td align="center"><a href="javascript:history.go(-1)">返回...</a> </td>
		</tr>
	</table>
  
