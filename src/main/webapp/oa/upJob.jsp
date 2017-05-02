<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

   <link href="../css/four.css" rel="stylesheet" type="text/css" />
	<!-- 包含等待框 -->
	<form action="uptJob.do" method="post">
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr valign="top">
			<td bgcolor="#FFFFFF">
			    <table width="96%" border="0" align="center" cellpadding="4" cellspacing="1" bgcolor="#aec3de">
					<tr align="left" bgcolor="#F2FDFF">
						<td colspan="2" class="optiontitle">所属部门:${job.dpt.depname}  <input name="jobid" type="hidden" value="${job.jobid}"> </td>
					</tr>
					
 
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">岗位名称</td>
						<td align="left" bgcolor="#FFFFFF"><input name="jobname" value="${job.jobname}"></td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">岗位底薪</td>
						<td align="left" bgcolor="#FFFFFF"><input name="jobsal" value="${job.jobsal}"></td> 
					</tr>
						<tr align="center">
						<td align="center" bgcolor="#ebf0f7">绩效工资</td>
						<td align="left" bgcolor="#FFFFFF"><input name="jxsal" value="${job.jxsal}"></td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">工资备注</td>
						<td align="left" bgcolor="#FFFFFF"><textarea rows="2" cols="60" name="thrsal">${job.thrsal}</textarea></td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">岗位描述</td>
						<td align="left" bgcolor="#FFFFFF"><textarea rows="2" cols="60" name="jobdesc">${job.jobdesc}</textarea></td> 
					</tr>
						<tr align="center">
						<td align="center" bgcolor="#ebf0f7">上级岗位</td>
						<td align="left" bgcolor="#FFFFFF"><input name="jobdesc" value="${job.upjobid}"> </td> 
					</tr>
		 
				 
				</table>
			</td>
		</tr>
		<tr>
		  <td align="center">  <input type="submit" value="修改"> &nbsp;&nbsp;&nbsp; <input type="button" onclick="javascript:history.go(-1)" value="返回">    </td>
		</tr>
	</table>
  </form>
