<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

   <link href="../css/four.css" rel="stylesheet" type="text/css" />
	<!-- 包含等待框 -->
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr valign="top">
			<td bgcolor="#FFFFFF">
			    <table width="96%" border="0" align="center" cellpadding="4" cellspacing="1" bgcolor="#aec3de">
					<tr align="left" bgcolor="#F2FDFF">
						<td colspan="4" class="optiontitle">姓名:${emp.ename}</td>
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">登录名</td>
						<td align="left" bgcolor="#FFFFFF">${emp.lgnName}</td> 
						<td align="center" bgcolor="#ebf0f7">性别</td>
						<td align="left" bgcolor="#FFFFFF">${emp.esex}</td> 
					</tr>
					<tr align="center">
				        <td align="center" bgcolor="#ebf0f7">电话</td>
						<td align="left" bgcolor="#FFFFFF">${emp.ephone}</td>
						<td align="center" bgcolor="#ebf0f7">民族</td>
						<td align="left" bgcolor="#FFFFFF">${emp.enotion}</td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">入职时间</td>
						<td align="left" bgcolor="#FFFFFF">${emp.hireDate}</td> 
						<td align="center" bgcolor="#ebf0f7">生日</td>
						<td align="left" bgcolor="#FFFFFF">${emp.eage}</td> 
					</tr>
					
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">最高学历</td>
						<td align="left" bgcolor="#FFFFFF">${emp.ejob.jobname}</td> 
						<td align="center" bgcolor="#ebf0f7">毕业院校</td>
						<td align="left" bgcolor="#FFFFFF">${emp.ejob.jobsal}</td> 
					</tr>
							<tr align="center">
						<td align="center" bgcolor="#ebf0f7">最高学历</td>
						<td align="left" bgcolor="#FFFFFF">${emp.ejob.jobname}</td> 
						<td align="center" bgcolor="#ebf0f7">毕业院校</td>
						<td align="left" bgcolor="#FFFFFF">${emp.ejob.jobsal}</td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">技能描述</td>
						<td align="left" bgcolor="#FFFFFF">${emp.ejob.jxsal}</td> 
						<td align="center" bgcolor="#ebf0f7">合同到期</td>
						<td align="left" bgcolor="#FFFFFF">${emp.weixin}</td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">学位</td>
						<td align="left" bgcolor="#FFFFFF">${emp.ejob.jxsal}</td> 
						<td align="center" bgcolor="#ebf0f7">专业</td>
						<td align="left" bgcolor="#FFFFFF">${emp.weixin}</td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">紧急联系人1</td>
						<td align="left" bgcolor="#FFFFFF">${emp.ejob.jxsal}</td> 
						<td align="center" bgcolor="#ebf0f7">紧急联系人1电话</td>
						<td align="left" bgcolor="#FFFFFF">${emp.weixin}</td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">紧急联系人2</td>
						<td align="left" bgcolor="#FFFFFF">${emp.ejob.jxsal}</td> 
						<td align="center" bgcolor="#ebf0f7">紧急联系人2电话</td>
						<td align="left" bgcolor="#FFFFFF">${emp.weixin}</td> 
					</tr>
					
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">个人QQ</td>
						<td align="left" bgcolor="#FFFFFF">${emp.qqp}</td> 
						<td align="center" bgcolor="#ebf0f7">企业QQ</td>
						<td align="left" bgcolor="#FFFFFF">${emp.qqe}</td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">岗位名称</td>
						<td align="left" bgcolor="#FFFFFF">${emp.ejob.jobname}</td> 
						<td align="center" bgcolor="#ebf0f7">岗位底薪</td>
						<td align="left" bgcolor="#FFFFFF">${emp.ejob.jobsal}</td> 
					</tr>
						<tr align="center">
						<td align="center" bgcolor="#ebf0f7">银行卡账号</td>
						<td colspan="1" align="left" bgcolor="#FFFFFF">${emp.ejob.thrsal}</td> 
						<td align="center" bgcolor="#ebf0f7">银行卡开户行</td>
						<td colspan="1" align="left" bgcolor="#FFFFFF">${emp.ejob.thrsal}</td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">支付宝账号</td>
						<td colspan="1" align="left" bgcolor="#FFFFFF">${emp.ejob.thrsal}</td> 
						 <td align="center" bgcolor="#ebf0f7">住址</td>
						<td colspan="1" align="left" bgcolor="#FFFFFF">${emp.ejob.thrsal}</td> 
					</tr>
				</table>
			</td>
		</tr>
		<tr>
		   
		
		  <td align="left">工资备注:${emp.ejob.thrsal}</td>
		</tr>
			<tr>
		  <td align="left">工作履历:${emp.ejob.thrsal}</td>
		</tr>
		<tr>
		  <td align="center"> <a href="javascript:history.go(-1)">返回...</a> </td>
		</tr>
	</table>
  
