<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="../taglibs.jsp"%>
<link href="../css/four.css" rel="stylesheet" type="text/css" />
<!-- 包含等待框 -->
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

          $(".btnAll").each(function(i,v){
    	   //变手型
    	     $(v).mouseover(function() {
				$(this).css("cursor", "hand");
			 }).mouseout(function() {
				$(this).css("cursor", "pointer");
			 });
    	   
    	   
    	   if($(v).html()=='【增加附件】'){
    		   $(v).click(function(){
    			   $('#dw').window("open");
    		   });
    	     }else if($(v).html()=='【删除】'){
    		   $(v).click(function(){
    			  if(confirm("确认删除附件'"+$(v).prop("title")+"'?")){
    					 $.get("delAtta.do?fjid="+ $(v).prop("lang")+"&x="+Math.random(),function(jsonTxt){
    						   if("err"==jsonTxt){
    						    	 $("#msg").html("删除["+$(v).prop("title")+"]失败");
    						   }else{
    							     $("#msg").html("删除["+$(v).prop("title")+"]成功");
    							     $(v).parent().html("");
    						   } 
    					   });
    			  }
    		   });
    	   } 
          });
       
         $("#fjname").blur(function(){
        	 $.get("valFjname.do?eid="+ $(this).prop("lang")+"&fn="+encodeURI($(this).val())+"&x="+Math.random(),function(jsonTxt){
				   if("err"==jsonTxt){
				    	 $("#msg2").html("附件名已存在,请修改");
				    	 $("input[type='submit']").prop("disabled","disabled");	 
				    }  
			   });

         }).keydown(function(){
        	 $("#msg2").html("");
        	 $("input[type='submit']").removeProp("disabled");
         });
          
        });
    </script>



<form action="upEmp.do" method="post">
<table width="100%" border="0" cellpadding="0" cellspacing="0">
	<tr valign="top">
		<td bgcolor="#FFFFFF">
			<table width="96%" border="0" align="center" cellpadding="4"
				cellspacing="1" bgcolor="#aec3de">
				<tr align="left" bgcolor="#F2FDFF">
					<td colspan="2" class="optiontitle">正在修改:${emp.ename} 的信息&nbsp;&nbsp;&nbsp;</td>
				</tr>
				<tr align="center">
					<td align="center" bgcolor="#ebf0f7">登录名</td>
					<td align="left" bgcolor="#FFFFFF"><input name="eid" type="hidden" value="${emp.eid}"><input name="lgnName" value="${emp.lgnName}"></td>
				</tr>
				<tr align="center">
					<td align="center" bgcolor="#ebf0f7">电话</td>
					<td align="left" bgcolor="#FFFFFF"><input name="ephone" value="${emp.ephone}"></td>
				</tr>
				<tr align="center">
					<td align="center" bgcolor="#ebf0f7">入职时间hireDate</td>
					        
					<td align="left" bgcolor="#FFFFFF"><input name="" value="<fmt:formatDate value='${emp.hireDate}' pattern='yyyy-MM-dd HH'/>"></td>
				</tr>
				<tr align="center">
					<td align="center" bgcolor="#ebf0f7">合同到期euntildate</td>
					<td align="left" bgcolor="#FFFFFF"><input name="" value="${emp.detail.euntildate}"></td>
				</tr>
				<tr align="center">
					<td align="center" bgcolor="#ebf0f7">企业QQ</td>
					<td align="left" bgcolor="#FFFFFF"><input name=qqe value="${emp.qqe}"></td>
				</tr>
				<tr align="center">
					<td align="center" bgcolor="#ebf0f7">任职岗位</td>
					<td align="left" bgcolor="#FFFFFF">
						 <select name="jobid">
						    <c:forEach items="${jobs}" var="jb">
						       <option ${jb.jobid==emp.ejob.jobid?"selected='selected'":""} value="${jb.jobid}">${jb.jobname}</option>
						    </c:forEach>
						 </select>
			      </td>
				</tr>
			</table>
		</td>
	</tr>
	<tr>
	 <td align="center">  <input type="submit" value="修改"> &nbsp;&nbsp;&nbsp; <input type="button" onclick="javascript:history.go(-1)" value="返回">    </td> 
	</tr>
	<tr><td align="center"><span id="msg" style="color: red"></span>&nbsp;</td> 
	</tr>
    <tr valign="top">
			<td>
			<table width="96%" border="0" align="center" cellpadding="4"
				cellspacing="1" bgcolor="#aec3de">
				<tr align="left" bgcolor="#F2FDFF">
					<td colspan="4" class="optiontitle">个人附件信息：<span class="btnAll" lang="${atta.fjid}">【增加附件】</span></td>
				</tr>
				<tr align="center">
				  <c:forEach items="${attas}" var="atta" varStatus="vsts">
				     <c:if test="${vsts.count mod 2 eq 0}">
				          <td align="left" bgcolor="#ebf0f7"> <a href="#" title="${atta.fjadds}">${atta.fjname}</a>&nbsp;&nbsp;&nbsp;&nbsp;<span class="btnAll" title="${atta.fjname}" lang="${atta.fjid}">【删除】</span></td>
				     </c:if>
				     <c:if test="${vsts.count mod 2 eq 1}">
				          <td  align="left" bgcolor="#FFFFFF"  ><a href="#" title="${atta.fjadds}">${atta.fjname}</a>&nbsp;&nbsp;&nbsp;&nbsp;<span class="btnAll" title="${atta.fjname}" lang="${atta.fjid}">【删除】</span></td>
				     </c:if>
				       <c:if test="${vsts.count mod 4 eq 0}">
				         </tr><tr align="left">
				     </c:if>
				  </c:forEach>
				</tr>
			</table>
		</td>
	</tr>

</table>
</form>
	<div id="dw" class="easyui-window" title="新增附件信息" data-options="modal:true,minimizable:false,closed:true,maximizable:false,iconCls:'icon-save'" style="width:310px;height:200px;padding:10px;display: none;">
		<form action="addFj.do" method="post" enctype="multipart/form-data">
		  <input type="hidden" name="dpid" value="${param.dpid}"/>
		  <input type="hidden" name="eid" value="${emp.eid}"/>
			<input type="hidden" name="t_e_eid" value="${sessionScope.lgnUsr.eid}"/>
		     个人附件名称：<input name="fjname" id="fjname" lang="${emp.eid}"/><br><br>
		     文件 ：<input type="file" name="actPic1"><br><br>
		          备注 ：<textarea name=fjadds rows="2" cols="30" id="upd_dnote"></textarea><br><br>
		      <input type="submit" value="上传"/> <span id="msg2" style="color: red"></span>  <br>
		</form>
	</div>