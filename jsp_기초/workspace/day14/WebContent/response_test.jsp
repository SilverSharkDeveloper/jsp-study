<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%request.setCharacterEncoding("UTF-8"); 
	response.setCharacterEncoding("UTF-8");
	response.setContentType("text/html; charset = UTF-8");%>
	
	
		<% String name = request.getParameter("name");
		response.sendRedirect("parameter_test.jsp?name=" + URLEncoder.encode(name,"UTF-8")); %>
</body>
</html>