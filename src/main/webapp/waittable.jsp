<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'waittable.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function() {

		$("a").click(function() {
			if ($(this).attr('class') != "delete" && $(this).attr('id') != "export" ) {
				sending.style.visibility = "visible";
			}
			
		});

		$(".delete").click(function() {

			if (confirm("确定要删除吗?")) {
				sending.style.visibility = "visible";
				return true;
			}
			return false;

		});

		$(":input[type='submit']").click(function() {
			sending.style.visibility = "visible";
		});
	})
</script>

</head>

<div id="sending" style="filter:alpha(opacity=80); position:absolute; top:40%; left: 40%; z-index:10; visibility:hidden; width: 617px; height: 81px;">
	<TABLE WIDTH=80% BORDER=0 CELLSPACING=0 CELLPADDING=0>
		<TR>
			<td width=30%></td>
			<TD bgcolor=#104A7B><TABLE WIDTH=100% height=80 BORDER=0 CELLSPACING=2 CELLPADDING=0>
					<TR>
						<td bgcolor=#eeeeee align=center>正在处理数据, 请稍候...</td>
					</tr>
				</table></td>
			<td width=30%></td>
		</tr>
	</table>
</div>
</html>
