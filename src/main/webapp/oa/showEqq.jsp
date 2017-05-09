<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="../taglibs.jsp"%>
   <link href="../css/four.css" rel="stylesheet" type="text/css" />
	<!-- 包含等待框 -->
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr valign="top">
			<td bgcolor="#FFFFFF">
			    <table width="96%" border="0" align="center" cellpadding="4" cellspacing="1" bgcolor="#aec3de">
					<tr align="left" bgcolor="#F2FDFF">
						<td colspan="2" class="optiontitle">QQ所有者:${eqq.owner.ename}</td>
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">QQ号码</td>
						<td align="left" bgcolor="#FFFFFF">${eqq.qqename}</td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">QQ性别</td>
						<td align="left" bgcolor="#FFFFFF">${eqq.qqesex==0?"女":"男"}</td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">QQ用途</td>
						<td align="left" bgcolor="#FFFFFF">${eqq.qqeuse}</td> 
					</tr>
						<tr align="center">
						<td align="center" bgcolor="#ebf0f7">QQ密码</td>
						<td align="left" bgcolor="#FFFFFF">${eqq.qqepwd}</td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">最近更新密码时间</td>
						<td align="left" bgcolor="#FFFFFF"><fmt:formatDate value="${eqq.qqelastupp}" pattern="yyyy-MM-dd HH:mm:ss"/></td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">最近分配时间</td>
						<td align="left" bgcolor="#FFFFFF"><fmt:formatDate value="${eqq.lastfp}" pattern="yyyy-MM-dd HH:mm:ss"/></td> 
					</tr>
						<tr align="center">
						<td align="center" bgcolor="#ebf0f7">QQ备注</td>
						<td align="left" bgcolor="#FFFFFF">${eqq.qqenote}</td> 
					</tr>
		 
				 
				</table>
			</td>
		</tr>
		<tr>
		  <td align="center"> <a href="javascript:history.go(-1)">返回...</a> </td>
		</tr>
	</table>
  
