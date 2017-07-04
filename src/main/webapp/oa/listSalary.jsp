<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="../taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>列出部门的工资报表</title>
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
            			   location.href="toUpdtSal.do?sid="+$(v).prop("lang");  
            		   });
            	   }else if($(v).html()=='【删除】'){
            		   $(v).click(function(){
             			  if(confirm("确认删除'"+$(v).prop("title")+"'?")){
             				  location.href="delSal.do?sid="+$(v).prop("lang"); 
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
						<td colspan="8" class="optiontitle">
						 <select name="slkt_dps">
						       <option    value="0">全部</option>
						    <c:forEach items="${dpts}" var="dpt">
						       <option ${dpt.depID==lgnUsr.ejob.depID?"selected='selected'":""} value="${dpt.depID}">${dpt.depname}</option>
						    </c:forEach>
						 </select>
						</td>
					</tr>
				  	<tr align="center">
				  		<td align="center" bgcolor="#ebf0f7">月份</td>
						<td align="center" bgcolor="#ebf0f7">员工姓名</td>
						<td align="center" bgcolor="#ebf0f7">基本工资</td>
						<td align="center" bgcolor="#ebf0f7">绩效工资</td>
						<td align="center" bgcolor="#ebf0f7">补发工资</td>
						<td align="center" bgcolor="#ebf0f7">额外奖金</td>
						<td align="center" bgcolor="#ebf0f7">总额</td>
						<td align="center" bgcolor="#ebf0f7">操作 <span class="btnAll">【新增】</span> </td>
					</tr>
					<c:forEach items="${page.results}" var="empSal">
						<tr align="center" bgcolor="#FFFFFF">
						    <td align="center"  bgcolor="#ebf0f7"><fmt:formatDate value="${empSal.salmth}" pattern="yyyy-MM" /></td>
						    <td align="center">${empSal.ename}</td>
							<td align="center">${empSal.basicsalary}</td>
							<td align="center">${empSal.meritsal}</td>
							<td align="center">${empSal.addsal}</td>
							<td align="center">${empSal.addmeritsal}</td>
							<td align="center">${empSal.basicsalary+empSal.meritsal+empSal.addsal+empSal.addmeritsal}</td>
							<td align="left">
							【<a href="oneSal.do?salid=${empSal.salid}">查看</a>】<c:if test="${lgnUsr.eid > 0}">
									| <span class="btnAll" lang="${empSal.salid}">【编辑】</span>
								    | <span class="btnAll" lang="${empSal.salid}" title="${empSal.ename}">【删除】</span>
				                   </c:if>
							</td>
						</tr>
					</c:forEach>
					<tr align="right" bgcolor="#ebf0f7">
							<td colspan="8">
							<jk:page totalPage="${page.totalPage}" pageNo="${page.pageNo}" totalRecord="${page.totalRecord}"
                                url="lsEmp.do" />
							</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
		  <td align="center"><span id="msg" style="color: red">${msg}</span></td>
		</tr>
	</table>
  
	<div id="dw" class="easyui-window" title="工资记录" data-options="modal:true,minimizable:false,closed:true,maximizable:false,iconCls:'icon-save'" style="width:750px;height:180px;padding:10px;display: none;">
		<form action="addSal.do" method="post">
		   <table border="0" width="100%" >
		   	 <tr><td>员工姓名:</td><td>月份</td><td>基本工资</td><td>绩效工资</td><td>不发工资</td><td>额外奖金</td><td>购买社保</td></tr>
		     <tr><td>
		                <select name="eid">
						    <c:forEach items="${empsFrDept}" var="emp2">
						       <option value="${emp2.eid}">${emp2.ename}</option>
						    </c:forEach>
						 </select>
		     </td><td> <select name="mthd">
						    <c:forEach items="${mthds}" var="mthd">
						       <option>${mthd}</option>
						    </c:forEach>
						 </select></td>
	                  	<td><input size="5" name="basicsalary"/></td><td><input size="5"  name="meritsal"/></td><td><input size="5"  name="addsal"/></td><td><input size="5"  name="addmeritsal"/></td><td><input type="checkbox" value="1" name="isbuysb"/></td>
						 </tr>
			<tr><td>备注:</td><td colspan="6"><input size="110"  name="saldesc"/></td></tr>
						 
		     <tr> <td  colspan="7"><input type="submit" value="添加工资报表记录"/></td></tr>
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