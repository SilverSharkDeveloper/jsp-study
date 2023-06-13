<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	아이디
	<input type="text" id="id">
	<p id="text"></p>
	아이디
</body>

<script>
	let p = document.querySelector("#text");

	let input = document.querySelector("#id");
	let button = document.querySelector("#button")

	function checkId() {
		let id = input.value;
		
		let xhr = new XMLHttpRequest();	
		

		xhr.open("GET", "checkId.jsp", true);
		//opne  경로에는  get일경우 쿼리스트링 즉 데이터까지 모두 삽입
		xhr.send();
		//선택적으로 body즉 데이터가 담겨가야할 body가 필요한 경우에만 작성 POST방식 인경우 나머지는 무시되고 null전달
		xhr.onreadystatechange = function()
		//xhr의 state가 바뀔때마다 실행될 이벤트 함수
		{
			console.log(xhr.responseText);
			let rs = xhr.responseText.trim();
			if (xhr.readyState == XMLHttpRequest.DONE && xhr.status == 200) {
				if(rs == "성공"){
					p.innerHTML = "멋진 아이디네여!";
				}else{
					p.innerHTML = "중복된 아이디";
				}
			}
		}
	}
	
	input.addEventListener("blur" , checkId);
	
</script>
</html>