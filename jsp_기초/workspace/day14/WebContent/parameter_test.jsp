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
	response.setCharacterEncoding("UTF-8");%>
	<form action ="response_test.jsp">
	
			<input type ="text" name ="name">
			<button>전송!</button>
	</form>
	
	<%if(request.getParameter("name")!=null){
		out.println(request.getParameter("name"));
	};%>
	
</body>

</html>