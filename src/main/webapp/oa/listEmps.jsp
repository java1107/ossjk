<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="../taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>列出工作岗位</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="../css/four.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" type="text/css" href="../css/jqe/themes/default/easyui.css"/>
	<link rel="stylesheet" type="text/css" href="../css/jqe/themes/icon.css"/>

    <script type="text/javascript" src="../js/jquery-3.1.1.min.js"></script>
	<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>

    <script type="text/javascript">
 
        $(function(){
          
         	//初始化对话框
        	 $('#dw,#dwEdit').window({
       		   onBeforeClose:function(){ 
       			   //取消时关闭等待框
       			   setTimeout(function(){ 
       				   sending.style.visibility = "hidden";
					   }, 250);
       	    }});
       	
            $(".btnAll").each(function(i,v){
         	   //变手型
         	     $(v).mouseover(function() {
     				$(this).css("cursor", "hand");
     			 }).mouseout(function() {
     				$(this).css("cursor", "pointer");
     			 });
         	   
          	   if($(v).html()=='【新增】'){
          		   $(v).click(function(){
          			   $('#dw').window("open");
          		   });
          	   }else if($(v).html()=='【编辑】'){
        		   $(v).click(function(){
        			   location.href="upJob1.do?jobid="+$(v).prop("lang");  
        		   });
        	   }else if($(v).html()=='【删除】'){
        		   $(v).click(function(){
         			  if(confirm("确认删除'"+$(v).prop("title")+"'?")){
         				  location.href="delJb.do?jobid="+$(v).prop("lang"); 
         			  }
         		   });
         	   }
         	   
            });
        	
        });
    </script>
</head>
<body>
	<!-- 包含等待框 -->
	<jsp:include page="../waittable.jsp" flush="true" />
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr valign="top">
			<td bgcolor="#FFFFFF"><table width="96%" border="0" align="center" cellpadding="4" cellspacing="1" bgcolor="#aec3de">
					<tr align="left" bgcolor="#F2FDFF">
						<td colspan="6" class="optiontitle">
						 <select name="slkt_dps">
						       <option    value="0">全部</option>
						    <c:forEach items="${dpts}" var="dpt">
						       <option   ${dpt.depID==lgnUsr.ejob.depID?"select='selected'":""} value="${dpt.depID}">${dpt.depname}</option>
						    </c:forEach>
						 </select>
						   岗位列表</td>
					</tr>
				  	<tr align="center">
					    <td align="center" bgcolor="#ebf0f7">员工ID</td>
						<td align="center" bgcolor="#ebf0f7">员工姓名</td>
						<td align="center" bgcolor="#ebf0f7">担任岗位</td>
						<td align="center" bgcolor="#ebf0f7">入职时间</td>
						<td align="center" bgcolor="#ebf0f7">电话号码</td>
						<td align="center" bgcolor="#ebf0f7">操作 <span class="btnAll">【新员工入职】</span> </td>
					</tr>
					<c:forEach items="${page.results}" var="emp">
						<tr align="center" bgcolor="#FFFFFF">
						    <td align="center" bgcolor="#ebf0f7">${emp.eid}</td>
							<td align="center">${emp.ename}</td>
							<td align="center">${emp.ejob.jobname}</td>
							<td align="center">${emp.hireDate}</td>
							<td align="center">${emp.ephone}</td>
							<td align="center">
							【<a href="oneJobs.do?jobid=${emp.eid}">查看</a>】<c:if test="${lgnUsr.eid > 0}">
									| <span class="btnAll" lang="${emp.eid}">【编辑】</span>
								    | <span class="btnAll" lang="${emp.eid}" title="${job.jobname}">【离职】</span>
								    | <span class="btnAll" lang="${emp.eid}" title="${job.jobname}">【删除】</span>
				                   </c:if>
							</td>
						</tr>
					</c:forEach>
					<tr align="right" bgcolor="#ebf0f7">
							<td colspan="6">
							<jk:page totalPage="${page.totalPage}" pageNo="${page.pageNo}" totalRecord="${page.totalRecord}"
                                url="lsD.do" />
							</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
		  <td align="center" style="color: red">${msg}</td>
		</tr>
	</table>
  
	<div id="dw" class="easyui-window" title="创建新新岗位" data-options="modal:true,minimizable:false,closed:true,maximizable:false,iconCls:'icon-save'" style="width:300px;height:350px;padding:10px;display: none;">
		<form action="addJB.do" method="post">
		        所属 部门： <select name="depID">
						    <c:forEach items="${dpts}" var="dpt">
						         <option   ${dpt.depID==lgnUsr.ejob.depID?"select='select'":""} value="${dpt.depID}">${dpt.depname}</option>
						    </c:forEach>
						 </select><br> <br> 
		       岗位名称：<input name="jobname"/><br> <br> 
		       岗位底薪：<input name="jobsal"/><br> <br> 
		        绩效说明：<textarea name="jxsal" rows="2" cols="30"></textarea><br> 
		       工资备注：<textarea name="thrsal" rows="2"  cols="30"></textarea><br> 
		       岗位描述：<textarea name="jobdesc" rows="3" cols="30"></textarea><br> <br> 
		      <input  type="submit" value="保存"/><br>
		</form>
	</div>
	
	 <div id="dwEdit" class="easyui-window" title="修改部门信息" data-options="modal:true,minimizable:false,closed:true,maximizable:false,iconCls:'icon-save'" style="width:300px;height:200px;padding:10px;display: none;">
		<form action="updD.do" method="post">
		<input name="depID" id="upd_depID" type="hidden"   />
		     部门名称：<input name="depname" id="upd_depname"   /><br><br>
		     备注 ：<textarea name="dnote" rows="3" cols="30" id="upd_dnote"></textarea><br><br>
		      <input type="submit" value="修改" /><br>
		</form>
	</div>
	
</body>
</html>