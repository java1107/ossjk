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
        			  location.href="toUpdtEqq.do?qqeid="+ $(v).prop("lang")+"&x="+Math.random();
        		   });
        	   }else if($(v).html()=='【删除】'){
        		   $(v).click(function(){
        			  if(confirm("确认删除'"+$(v).prop("title")+"'?")){
        				  location.href="deleQQ.do?eqid="+$(v).prop("lang"); 
        			  }
        		   });
        	   } 
           });
              
           //验证qq号码是否已存在
           $("input[name='qqename']").blur(function(){
        	   //ajax验证
        	   $.get("valEqq.do?qqename="+ $(this).val()+"&x="+Math.random(),function(jsonTxt){
   			       if("err"==jsonTxt){
   			    	   $("#btn_save").prop("disabled",true);
   			    	   $("#errMsg").html("Q号已经存在");
   			       }
   		       }); 
            }).keypress(function(){
		    	   $("#errMsg").html("");
		    	   $("#btn_save").prop("disabled",false);
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
						<td colspan="6" class="optiontitle">企业QQ信息</td>
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">QQ号码</td>
						<td align="center" bgcolor="#ebf0f7">拥有人</td>
						<td align="center" bgcolor="#ebf0f7">使用人</td>
						<td align="center" bgcolor="#ebf0f7">QQ用途</td>
						<td align="center" bgcolor="#ebf0f7">QQ备注</td>
						<td align="center" bgcolor="#ebf0f7">操作 <span class="btnAll">【新增】</span> </td>
					</tr>
					<c:forEach items="${page.results}" var="eqq">
						<tr align="center" bgcolor="#FFFFFF">
						    <td align="center" bgcolor="#ebf0f7">${eqq.qqename}</td>
							<td align="center">${eqq.owner.ename}</td>
							<td align="center">${eqq.useEmp.ename}</td>
							<td align="center">${eqq.qqeuse}</td>
							<td align="center">${eqq.qqenote}</td>
							<td align="center">
							【<a href="oneEqq.do?qqeid=${eqq.qqeid}">查看</a>】<c:if test="${lgnUsr.eid > 0}">
									| <span class="btnAll" lang="${eqq.qqeid}">【编辑】</span>
								    | <span class="btnAll" lang="${eqq.qqeid}" title="${eqq.qqename}">【删除】</span>
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
  
	<div id="dw" class="easyui-window" title="创建新企业qq" data-options="modal:true,minimizable:false,closed:true,maximizable:false,iconCls:'icon-save'" style="width:300px;height:240px;padding:10px;display: none;">
		<form action="addEqq.do" method="post">
		   qq号码：<input name="qqename"/> <span id="errMsg" style="color: red"></span>   <br> 
		   QQ性别： <select  name="qqesex">
		                <option value="0">女</option>
		                <option value="1">男</option>
		        </select>
		   <br> 
		   QQ用途：<input name="qqeuse"/><br> 
		   QQ密码：<input name="qqepwd"/><br> 
		   最近更新密码时间： <br> 
		   QQ备注： <textarea name="qqenote" rows="3" cols="30"></textarea><br><br>
		      <input id="btn_save" type="submit" value="保存" /><br>
		</form>
	</div>
	
	
	
</body>
</html>