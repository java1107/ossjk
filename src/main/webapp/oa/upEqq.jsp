<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="../taglibs.jsp"%>
   <link href="../css/four.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" type="text/css" href="../css/jqe/themes/default/easyui.css"/>
	<link rel="stylesheet" type="text/css" href="../css/jqe/themes/icon.css"/>

    <script type="text/javascript" src="../js/jquery-3.1.1.min.js"></script>
	<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>

    <script type="text/javascript">

        $(function(){
        	//初始化对话框
        	 $('#dw').window({
        		   onBeforeClose:function(){ 
        			   //取消时关闭等待框
        			   setTimeout(function(){ 
        				   sending.style.visibility = "hidden";
					   }, 250);
        	   }});
        	
        	   //变手型
        	     $("#btnAll").mouseover(function() {
    				$(this).css("cursor", "hand");
    			 }).mouseout(function() {
    				$(this).css("cursor", "pointer");
    			 }).css("color","blue").click(function(){
    				   $('#dw').window("open");
    			 });
        	   
        	    
           
        });
    </script>
	<!-- 包含等待框 -->
	<form action="uptJob.do" method="post">
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr valign="top">
			<td bgcolor="#FFFFFF">
			    <table width="96%" border="0" align="center" cellpadding="4" cellspacing="1" bgcolor="#aec3de">
					<tr align="left" bgcolor="#F2FDFF">
						<td colspan="2" class="optiontitle">企业QQ所有人:${eqq.owner.ename},最后更新时间:[<fmt:formatDate value="${eqq.lastfp}" pattern="yyyy-MM-dd HH:mm:ss"/>]&nbsp;&nbsp;|&nbsp;&nbsp;当前分配给:${eqq.useEmp.ename}<span id="btnAll">【点击修改】</span>
						<input type="hidden" name="qqeid" value="${eqq.qqeid}"/></td>
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">QQ号码</td>
						<td align="left" bgcolor="#FFFFFF"><input name="qqename"   value="${eqq.qqename}"/></td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">QQ性别</td>
						<td align="left" bgcolor="#FFFFFF"><select  name="qqesex"  value="${eqq.qqesex}" >
		                <option  ${eqq.qqesex==0?"selected='selected'":""}    value="0">女</option>
		                <option  ${eqq.qqesex==1?"selected='selected'":""}  value="1">男</option>
		                   </select></td> 
					</tr>
						<tr align="center">
						<td align="center" bgcolor="#ebf0f7">QQ用途</td>
						<td align="left" bgcolor="#FFFFFF"><input name="qqeuse"   value="${eqq.qqeuse}"/></td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">QQ密码</td>
						<td align="left" bgcolor="#FFFFFF"><input  name="qqepwd"  value="${eqq.qqepwd}"/></td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">最近更新密码时间</td>
						<td align="left" bgcolor="#FFFFFF"><input  value="${eqq.qqelastupp}"> </td> 
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">备注</td>
						<td align="left" bgcolor="#FFFFFF"><textarea rows="2" cols="60" name="qqenote">${eqq.qqenote}</textarea></td> 
					</tr>
				
				</table>
			</td>
		</tr>
		<tr>
		  <td align="center">  <input type="submit" value="修改"> &nbsp;&nbsp;&nbsp; <input type="button" onclick="javascript:history.go(-1)" value="返回">    </td>
		</tr>
			<tr><td align="center"><span id="msg" style="color: red"></span>&nbsp;</td> 
	   </tr>
    
	</table>
  </form>
 	<div id="dw" class="easyui-window" title="创建新企业qq" data-options="modal:true,minimizable:false,closed:true,maximizable:false,iconCls:'icon-save'" style="width:300px;height:180px;padding:10px;display: none;">
		<form action="addEqq.do" method="post">
		 当前使用人：${eqq.useEmp.ename}<br><br>  
		 
		  分配给部门： <select  name="qqesex2">   <c:forEach items="${dpts}" var="dpt">
						       <option ${dpt.depID==eqq.useEmp.ejob.depID?"selected='selected'":""} value="${dpt.depID}">${dpt.depname}</option>
						    </c:forEach></select>
		   <br><br> 员工: <select  name="qqesex">
		                <c:forEach items="${dptEmps}" var="emp">
						       <option   value="${emp.eid}">${emp.ename}</option>
						    </c:forEach>
		        </select>    <br><br>

		      <input type="submit" value="确认"   /><br>
		</form>
	</div>