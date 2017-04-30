<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="Login/css/Login.css">


  </head>
  
  <body>
  <div  class="subtable">
    <s:form action="Login" method="post" theme="simple">
    	<s:textfield name="name" label="姓名" required="true"  class="inputs"/><br/>
    	<s:password name="password" label="密码" required="true"  class="inputs"/>
    	<s:submit label="提交"/>
    </s:form>
    </div>
  </body>
</html>
