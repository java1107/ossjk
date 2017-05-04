<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="../taglibs.jsp"%>
<link href="../css/four.css" rel="stylesheet" type="text/css" />
<!-- 包含等待框 -->

<form action="upEmp.do" method="post">
<table width="100%" border="0" cellpadding="0" cellspacing="0">
	<tr valign="top">
		<td bgcolor="#FFFFFF">
			<table width="96%" border="0" align="center" cellpadding="4"
				cellspacing="1" bgcolor="#aec3de">
				<tr align="left" bgcolor="#F2FDFF">
					<td colspan="2" class="optiontitle">正在修改:${emp.ename} 的信息</td>
				</tr>
				<tr align="center">
					<td align="center" bgcolor="#ebf0f7">登录名</td>
					<td align="left" bgcolor="#FFFFFF"><input name="eid" type="hidden" value="${emp.eid}"><input name="lgnName" value="${emp.lgnName}"></td>
				</tr>
				<tr align="center">
					<td align="center" bgcolor="#ebf0f7">电话</td>
					<td align="left" bgcolor="#FFFFFF"><input name="ephone" value="${emp.ephone}"></td>
				</tr>
				<tr align="center">
					<td align="center" bgcolor="#ebf0f7">入职时间hireDate</td>
					        
					<td align="left" bgcolor="#FFFFFF"><input name="" value="<fmt:formatDate value='${emp.hireDate}' pattern='yyyy-MM-dd HH'/>"></td>
				</tr>
				<tr align="center">
					<td align="center" bgcolor="#ebf0f7">合同到期euntildate</td>
					<td align="left" bgcolor="#FFFFFF"><input name="" value="${emp.detail.euntildate}"></td>
				</tr>
				<tr align="center">
					<td align="center" bgcolor="#ebf0f7">企业QQ</td>
					<td align="left" bgcolor="#FFFFFF"><input name=qqe value="${emp.qqe}"></td>
				</tr>
				<tr align="center">
					<td align="center" bgcolor="#ebf0f7">任职岗位</td>
					<td align="left" bgcolor="#FFFFFF">
						 <select name="jobid">
						    <c:forEach items="${jobs}" var="jb">
						       <option ${jb.jobid==emp.ejob.jobid?"selected='selected'":""} value="${jb.jobid}">${jb.jobname}</option>
						    </c:forEach>
						 </select>
			      </td>
				</tr>
			</table>
		</td>
	</tr>
	<tr>
	 <td align="center">  <input type="submit" value="修改"> &nbsp;&nbsp;&nbsp; <input type="button" onclick="javascript:history.go(-1)" value="返回">    </td> 
	</tr>
</table>
</form>
