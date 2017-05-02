<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
	<!-- 包含等待框 -->
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr valign="top">
			<td bgcolor="#FFFFFF">
			    <table width="96%" border="0" align="center" cellpadding="4" cellspacing="1" bgcolor="#aec3de">
					<tr align="left" bgcolor="#F2FDFF">
						<td colspan="2" class="optiontitle">所属 部门</td>
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">岗位ID</td>
						<td align="center" bgcolor="#FFFFFF">${job.jobid}</td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">岗位名称</td>
						<td align="center" bgcolor="#FFFFFF">${job.jobname}</td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">岗位底薪</td>
						<td align="center" bgcolor="#FFFFFF">${job.dnote}</td> 
					</tr>
						<tr align="center">
						<td align="center" bgcolor="#ebf0f7">绩效工资</td>
						<td align="center" bgcolor="#FFFFFF">${job.dnote}</td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">工资备注</td>
						<td align="center" bgcolor="#FFFFFF">${job.dnote}</td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">岗位描述</td>
						<td align="center" bgcolor="#FFFFFF">${job.jobdesc}</td> 
					</tr>
						<tr align="center">
						<td align="center" bgcolor="#ebf0f7">上级岗位</td>
						<td align="center" bgcolor="#FFFFFF">${job.dnote}</td> 
					</tr>
				 
				</table>
			</td>
		</tr>
	</table>
  
