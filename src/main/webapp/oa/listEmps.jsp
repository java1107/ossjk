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
         	   
          	   if($(v).html()=='【新员工入职】'){
          		   $(v).click(function(){
          			   $('#dw').window("open");
          		   });
          	   }else if($(v).html()=='【编辑】'){
        		   $(v).click(function(){
        			   location.href="toBUEmp.do?eid="+$(v).prop("lang")+"&dpid="+$("select[name='slkt_dps']").val();  
        		   });
        	   }else if($(v).html()=='【删除】'){
        		   $(v).click(function(){
        			 //  alert($("select[name='slkt_dps']").val());
         			  if(confirm("确认删除员工'"+$(v).prop("title")+"'?")){
         				   location.href="delEmp.do?eid="+$(v).prop("lang")+"&dpid="+$("select[name='slkt_dps']").val(); 
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
						<td colspan="7" class="optiontitle">
						 <select name="slkt_dps">
						       <option    value="0">全部</option>
						    <c:forEach items="${dpts}" var="dpt">
						       <option ${dpt.depID==lgnUsr.ejob.depID?"selected='selected'":""} value="${dpt.depID}">${dpt.depname}</option>
						    </c:forEach>
						 </select>
						</td>
					</tr>
				  	<tr align="center">
					    <td align="center" bgcolor="#ebf0f7">员工ID</td>
						<td align="center" bgcolor="#ebf0f7">员工姓名</td>
						<td align="center" bgcolor="#ebf0f7">员工邮箱</td>
						<td align="center" bgcolor="#ebf0f7">担任岗位</td>
						<td align="center" bgcolor="#ebf0f7">入职时间</td>
						<td align="center" bgcolor="#ebf0f7">电话号码</td>
						<td align="center" bgcolor="#ebf0f7">操作 <span class="btnAll">【新员工入职】</span> </td>
					</tr>
					<c:forEach items="${page.results}" var="emp">
						<tr align="center" bgcolor="#FFFFFF">
						    <td align="center" bgcolor="#ebf0f7">${emp.eid}</td>
							<td align="center">${emp.ename}</td>
							<td align="center">${emp.lgnName}</td>
							<td align="center">${emp.ejob.jobname}</td>
							<td align="center"><fmt:formatDate value="${emp.hireDate}" pattern="yyyy-MM-dd HH点" /></td>
							<td align="center">${emp.ephone}</td>
							<td align="left">
							【<a href="oneEmps.do?eid=${emp.eid}">查看</a>】<c:if test="${lgnUsr.eid > 0}">
									| <span class="btnAll" lang="${emp.eid}">【编辑】</span>
								    | <span class="btnAll" lang="${emp.eid}" title="${emp.ename}">【离职】</span>
								    | <span class="btnAll" lang="${emp.eid}" title="${emp.ename}">【删除】</span>
								    <c:if test="${emp.esex==null}"><span class="btnAll" lang="${emp.eid}" title="${emp.ename}">【重发邮件】</span></c:if>
				                   </c:if>
							</td>
						</tr>
					</c:forEach>
					<tr align="right" bgcolor="#ebf0f7">
							<td colspan="7">
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
  
	<div id="dw" class="easyui-window" title="新员工入职" data-options="modal:true,minimizable:false,closed:true,maximizable:false,iconCls:'icon-save'" style="width:280px;height:150px;padding:10px;display: none;">
		<form action="addEmp.do" method="post">
		   <table border="0" width="100%" >
		     <tr><td>员工姓名:</td><td><input name="ename"/></td></tr>
		     <tr><td>登录邮箱:</td><td><input name="lgnName"/></td></tr>
		     <tr><td>任职岗位:</td><td>
		   	       <select name="jobid">
						    <c:forEach items="${jobs}" var="jb">
						       <option value="${jb.jobid}">${jb.jobname}</option>
						    </c:forEach>
						 </select>
		       </td></tr>
		     <tr><td></td><td><input type="submit" value="入职"/></td></tr>
		   </table>
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