<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제이에스피</title>
</head>
<body>
		<%int cnt = 100;
			if(request.getParameter("cnt")!=null&& !request.getParameter("cnt").equals("")){
				try{cnt = Integer.parseInt(request.getParameter("cnt"));}
				catch(NumberFormatException e){%>
					숫자만입력!
				<% cnt = 0 ; }
			}
		%>
		<%for(int  i = 0 ; i<cnt ; i++) {%>
		안녕하세요!!<br>
		<%} %>
		
</body>
</html>