<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장객체 예제</title>
</head>
<body>
		<form action ="on_click.jsp" name = "join">
			<fieldset>
				<legend>이름과 생일 입력</legend>
				<input type = "text" name="name">
				<input type = "date" name="birthday">
				<input type = "button" value ="확인" onclick="send()">
				
				
			</fieldset>
		
		</form>
		
		
</body>
<script src = "https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script>
		$("input[name ='name']").on("click",function(){
			$("input[name = 'name']").removeAttr("style");
			$("input[name = 'name']").removeAttr("placeholder");
		});
		
		$("input[name ='birthday']").on("click",function(){
			$("input[name ='birthday']").removeAttr("style");
		});
		
		function send(){
			let frm =document.join;
			if(!frm.name.value){
				$("input[name = 'name']").css("border-color","red");
				$("input[name = 'name']").attr("placeholder","성함을 입력해주세요");
				return;	
			}
			if(!frm.birthday.value){
				$("input[name = 'birthday']").css("border-color","red");
				return;
			}
			frm.submit();
			
		}
</script>
</html>