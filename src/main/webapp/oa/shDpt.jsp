<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

   <link href="../css/four.css" rel="stylesheet" type="text/css" />

	<!-- 包含等待框 -->
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr valign="top">
			<td bgcolor="#FFFFFF">
			    <table width="96%" border="0" align="center" cellpadding="4" cellspacing="1" bgcolor="#aec3de">
					<tr align="left" bgcolor="#F2FDFF">
						<td colspan="2" class="optiontitle">部门详细信息</td>
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">部门编号</td>
						<td align="left" bgcolor="#FFFFFF">${dpt.depID}</td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">部门名称</td>
						<td align="left" bgcolor="#FFFFFF">${dpt.depname}</td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">部门说明</td>
						<td align="left" bgcolor="#FFFFFF">${dpt.dnote}</td> 
					</tr>
				 
				</table>
			</td>
		</tr>
		<tr>
		  <td align="center"><a href="javascript:history.go(-1)">返回...</a> </td>
		</tr>
	</table>
  
