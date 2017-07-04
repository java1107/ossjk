<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

   <link href="../css/four.css" rel="stylesheet" type="text/css" />
	<!-- 包含等待框 -->
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr valign="top">
			<td bgcolor="#FFFFFF">
			    <table width="96%" border="0" align="center" cellpadding="4" cellspacing="1" bgcolor="#aec3de">
					<tr align="left" bgcolor="#F2FDFF">
						<td colspan="2" class="optiontitle">工资查看【<fmt:formatDate value="${sal.salmth}" pattern="yyyy-MM"/>月】:${sal.ename}</td>
					</tr>
						<tr align="center">
						<td align="center" bgcolor="#ebf0f7">工资状态</td>
						<td align="left" bgcolor="#FFFFFF">
                             ${sal.salstate==0?"已录入":(sal.salstate==1?"已确认":"已发")}
                        </td> 
						</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">基本工资</td>
						<td align="left" bgcolor="#FFFFFF">${sal.basicsalary}元</td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">绩效工资</td>
						<td align="left" bgcolor="#FFFFFF">${sal.meritsal}元</td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">补发工资</td>
						<td align="left" bgcolor="#FFFFFF">${sal.addsal}元</td> 
					</tr>
						<tr align="center">
						<td align="center" bgcolor="#ebf0f7">其他</td>
						<td align="left" bgcolor="#FFFFFF">${sal.addmeritsal}元</td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">个人社保代扣</td>
						<td align="left" bgcolor="#FFFFFF">${sal.isbuysb}</td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">缴纳个税</td>
						<td align="left" bgcolor="#FFFFFF">${sal.isbuysb}</td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">税前总额</td>
						<td align="left" bgcolor="#FFFFFF">${sal.basicsalary+sal.addmeritsal+sal.addsal+sal.meritsal}元</td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">实发金额</td>
						<td align="left" bgcolor="#FFFFFF">6000元</td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">工资备注</td>
						<td align="left" bgcolor="#FFFFFF">${sal.saldesc}</td> 
					</tr>
				</table>
			</td>
		</tr>
		<tr>
		  <td align="center"> <a href="javascript:history.go(-1)">返回...</a> </td>
		</tr>
	</table>
  
