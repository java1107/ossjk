<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

   <link href="../css/four.css" rel="stylesheet" type="text/css" />
	<!-- 包含等待框 -->
	<form action="uptSal.do" method="post">
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr valign="top">
			<td bgcolor="#FFFFFF">
			    <table width="96%" border="0" align="center" cellpadding="4" cellspacing="1" bgcolor="#aec3de">
					<tr align="left" bgcolor="#F2FDFF">
						<td colspan="2" class="optiontitle">修改 ${sal.ename}【<fmt:formatDate value="${sal.salmth}" pattern="yyyy-MM"/>月】的工资预算:<input name="salid" type="hidden" value="${sal.salid}"> </td>
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">基本工资</td>
						<td align="left" bgcolor="#FFFFFF"><input name="basicsalary" value="${sal.basicsalary}"></td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">绩效工资</td>
						<td align="left" bgcolor="#FFFFFF"><input name="meritsal" value="${sal.meritsal}"></td> 
					</tr>
						<tr align="center">
						<td align="center" bgcolor="#ebf0f7">补发工资</td>
						<td align="left" bgcolor="#FFFFFF"><input name="addsal" value="${sal.addsal}"></td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">其他工资</td>
						<td align="left" bgcolor="#FFFFFF"><input name="addmeritsal" value="${sal.addmeritsal}"></td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">是否购买社保</td>
						<td align="left" bgcolor="#FFFFFF">
                               <input name="isbuysb"  type="checkbox"  ${sal.isbuysb==1?"checked='checked'":""}  value="1">购买
                        </td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">工资备注</td>
						<td align="left" bgcolor="#FFFFFF"><textarea rows="2" cols="60" name="saldesc">${sal.saldesc}</textarea></td> 
					</tr>
				</table>
			</td>
		</tr>
		<tr>
		  <td align="center">  <input type="submit" value="修改"> &nbsp;&nbsp;&nbsp; <input type="button" onclick="javascript:history.go(-1)" value="返回">    </td>
		</tr>
	</table>
  </form>
