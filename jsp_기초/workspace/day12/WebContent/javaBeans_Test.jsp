<%@page import="com.jspex.beans.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean class = "com.jspex.beans.MemberVO" id="vo"></jsp:useBean>
    <jsp:useBean class = "com.jspex.beans.MemberDAO" id="dao"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자바빈즈 예제</title>
</head>
<body>
	<jsp:setProperty property="name" name="vo" value = "한동석"/>
	<jsp:setProperty property="birthDay" name="vo" value = "12-04"/>
	
	<%
		ArrayList<MemberVO> members = new ArrayList<>();
		dao.insert(vo);
		members = dao.select(vo.getName());
	%>
	<%=members%> 
	
	
	<jsp:getProperty property="name" name="vo"/>
	<jsp:getProperty property="birthDay" name="vo"/>
</body>
</html>