<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%
		if(request.getParameter("id").equals("sdf")){
			out.println("성공");
		}else{
			out.println("실패");
		}
	%>
