<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

   <link href="../css/four.css" rel="stylesheet" type="text/css" />
	<!-- 包含等待框 -->
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr valign="top">
			<td bgcolor="#FFFFFF">
			    <table width="96%" border="0" align="center" cellpadding="4" cellspacing="1" bgcolor="#aec3de">
					<tr align="left" bgcolor="#F2FDFF">
						<td colspan="2" class="optiontitle">所属部门:${job.dpt.depname}</td>
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">岗位ID</td>
						<td align="left" bgcolor="#FFFFFF">${job.jobid}</td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">岗位名称</td>
						<td align="left" bgcolor="#FFFFFF">${job.jobname}</td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">岗位底薪</td>
						<td align="left" bgcolor="#FFFFFF">${job.jobsal}</td> 
					</tr>
						<tr align="center">
						<td align="center" bgcolor="#ebf0f7">绩效工资</td>
						<td align="left" bgcolor="#FFFFFF">${job.jxsal}</td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">工资备注</td>
						<td align="left" bgcolor="#FFFFFF">${job.thrsal}</td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">岗位描述</td>
						<td align="left" bgcolor="#FFFFFF">${job.jobdesc}</td> 
					</tr>
						<tr align="center">
						<td align="center" bgcolor="#ebf0f7">上级岗位</td>
						<td align="left" bgcolor="#FFFFFF">${job.upjobid}</td> 
					</tr>
		 
				 
				</table>
			</td>
		</tr>
		<tr>
		  <td align="center"> <a href="javascript:history.go(-1)">返回...</a> </td>
		</tr>
	</table>
  
