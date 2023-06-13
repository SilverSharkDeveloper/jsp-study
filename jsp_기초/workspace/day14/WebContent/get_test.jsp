<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>겟방식 요청</title>
</head>
<body>

<%
	String city = request.getParameter("City");
	String zipCode = request.getParameter("zipCode");
	
	if(city ==null || zipCode ==null){
		response.sendRedirect("post_test.jsp");
	}else{
%>
		<form >
			<input type = "text" value ="Seoul" name = "City" readonly>
			<input type = "text" value ="123455" name = "zipCode" readonly>
			<button>GET 방식으로 요청 보내기</button>
		</form>
		
		<p><%=city%></p>
		<p><%=zipCode%></p>
		<%} %>
</body>
</html>