<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="main/css/main.css">
<script type="text/javascript">
	function chose(id)
	{
		switch (id) {
			case 1:
				document.getElementById("framehtml").src="queryall";
			break;
			case 2:
			
			break;
			case 3:
			
			break;
			case 4:
			
			break;
			case 5:
			
			break;
		}
	}
</script>

  </head>
  
  <body>
  <div class="top">
  	<span>你好</span>
  	<input type="button" value="退出">
  </div>
  <div class="function">
  	<ul>
  		<li><input type="button" onclick="chose(1)" value="查询"/></li>
  		<li><input type="button" onclick="" value="借阅"/></li>
  		<li><input type="button" onclick="" value="归还"/></li>
  		<li><input type="button" onclick="" value="添加"/></li>
  		<li><input type="button" onclick="" value="删除"/></li>
  	</ul>
  </div>
  
    <iframe class="framehtml" id="framehtml">
    </iframe>
  </body>
</html>
