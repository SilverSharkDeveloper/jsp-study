<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Script Test</title>
</head>
<body>
		<%!
			int count = 3;
			String makeBeLower(String data){
				return data.toLowerCase();
			}
		%>
		
		<%
			for(int i = 0 ; i< count; i ++){
				out.println("Java Server Page " + (i+1) + ".<br>");
			}
		%>
		
		<%="Today is " + new java.util.Date() 
		
		%>
		<table border="1">
			<%for(int i = 0; i<3 ; i++) {%>
				<tr>
					<%for(int j = 0 ; j<5 ; j++){ %>
						<td>
							<%=i+1%>행 <%=j+1%>열
						</td>
					<%}%>
				
					
				</tr>
				<%}%>
		</table>
		
		<table border ="1">
			<%
				for(int i = 0; i< 3 ; i++){
					out.println("<tr>");
						for(int j = 0 ; j <5 ; j++){
							out.println("<td>"+ (i+1)+"행" + (j+1) + "열 " + "</td>");
						}
				}
				
			
			
			%>
		
		</table>
		
		
		<table border = "1">
			<%for(int i = 0 ; i <9 ; i++){%>
				<tr>
					<%if(i<5) {%>
						<%for(int j = 0 ; j<i+1 ; j++ ){ %>
							<td>
								<%=i+1%>행 <%=j+1%>열
							</td>
						<%} %>
					<%}else{ %>
						<%for(int j = 0 ; j<9-i ; j++ ){ %>
							<td>
								<%=i+1%>행 <%=j+1%>열
							</td>
						<%} %>
					<%} %>
				</tr>
			<%}%>	
		</table>
	
</body>
</html>