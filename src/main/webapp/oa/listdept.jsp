<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="../taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title></title>
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
        			   //ajax
        			   $.get("ajOneDpt.do?dptID="+ $(v).prop("lang"),function(jsonTxt){
        				   var jsonObj = eval("("+jsonTxt+")");
        				   $("#upd_depID").val(jsonObj.depID);
        				   $("#upd_depname").val(jsonObj.depname);
        				   $("#upd_dnote").html(jsonObj.dnote);
        				   $('#dwEdit').window("open");
        			   });
        		   });
        	   }else if($(v).html()=='【删除】'){
        		   $(v).click(function(){
        			  if(confirm("确认删除'"+$(v).prop("title")+"'?")){
        				  location.href="delD.do?dptID="+$(v).prop("lang"); 
        			  }
        		   });
        	   };
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
						<td colspan="5" class="optiontitle">人员列表</td>
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">部门编号</td>
						<td align="center" bgcolor="#ebf0f7">部门名称</td>
						<td align="center" bgcolor="#ebf0f7">备注</td>
						<td align="center" bgcolor="#ebf0f7">操作 <span class="btnAll">【新增】</span> </td>
					</tr>
					<c:forEach items="${page.results}" var="dpt">
						<tr align="center" bgcolor="#FFFFFF">
						    <td align="center" bgcolor="#ebf0f7">${dpt.depID}</td>
							<td align="center">${dpt.depname}</td>
							<td align="center">${dpt.dnote}</td>
							<td align="center">
							【<a href="oneDpt.do?dptID=${dpt.depID}">查看</a>】<c:if test="${lgnUsr.eid > 0}">
									| <span class="btnAll" lang="${dpt.depID}">【编辑】</span>
								    | <span class="btnAll" lang="${dpt.depID}" title="${dpt.depname}">【删除】</span>
				                   </c:if>
							</td>
						</tr>
					</c:forEach>
					<tr align="right" bgcolor="#ebf0f7">
							<td colspan="5">
							<jk:page totalPage="${page.totalPage}" pageNo="${page.pageNo}" totalRecord="${page.totalRecord}"
                                url="lsD.do" />
							</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
  
	<div id="dw" class="easyui-window" title="创建新部门" data-options="modal:true,minimizable:false,closed:true,maximizable:false,iconCls:'icon-save'" style="width:300px;height:200px;padding:10px;display: none;">
		<form action="addD.do" method="post">
		     部门名称：<input name="depname"/><br><br>
		     备注 ：<textarea name="dnote" rows="3" cols="30"></textarea><br><br>
		      <input type="submit" value="保存"/><br>
		</form>
	</div>
	
	 <div id="dwEdit" class="easyui-window" title="修改部门信息" data-options="modal:true,minimizable:false,closed:true,maximizable:false,iconCls:'icon-save'" style="width:300px;height:200px;padding:10px;display: none;">
		<form action="updD.do" method="post">
		<input name="depID" id="upd_depID" type="hidden"   />
		     部门名称：<input name="depname" id="upd_depname"   /><br><br>
		     备注 ：<textarea name="dnote" rows="3" cols="30" id="upd_dnote"></textarea><br><br>
		      <input type="submit" value="修改"/><br>
		</form>
	</div>
	
</body>
</html>