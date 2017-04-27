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
        	 $("#addDpt").click(function(){
        		 $('#w').window('open').onClose(function(){
        			 alert("sss");
        		 });
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
						<td align="center" bgcolor="#ebf0f7">操作 【<span id="addDpt">新增</span>】 </td>
					</tr>
					<c:forEach items="${page.results}" var="userTmp">
						<tr align="center" bgcolor="#FFFFFF">
						    <td align="center" bgcolor="#ebf0f7">部门编号</td>
							<td align="center">${userTmp.uname}</td>
							<td align="center">${userTmp.upwd}</td>
							<td align="center">
							【<a href="toUpdateUser.do?id=${userTmp.uid}">查看</a>】<c:if test="${sessionScope.usr.utpye eq 1}">
									|【<a href="updtUsr1.do?uid=${userTmp.uid}">编辑</a>】
								    |【<a href="deleteUser.do?id=${userTmp.uid}" class="delete" >删除</a>】
				                   </c:if>
							</td>
						</tr>
					</c:forEach>
					<tr align="right" bgcolor="#ebf0f7">
							<td colspan="5">
							<jk:page totalPage="${page.totalPage}" pageNo="${page.pageNo}" totalRecord="${page.totalRecord}"
                                url="/j1107cars/mgr/listUsr.do" />
                        
							</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>

	<div id="w" class="easyui-window" title="创建新部门" data-options="modal:true,minimizable:false,closed:true,maximizable:false,iconCls:'icon-save'" style="width:300px;height:200px;padding:10px;">
		<form>
		     部门名称：<input name="s"/><br><br>
		     备注 ：<textarea name="s2" rows="3" cols="30"></textarea><br><br>
		     <input type="button" value="保存"/><br>
		</form>
	</div>
	
</body>
</html>