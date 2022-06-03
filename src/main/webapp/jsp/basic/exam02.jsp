<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>1 ~ 10사이의 정수 출력</h1>
	<%
		for(int i = 1; i <= 10; i++){
			
	%>
			<%= i %><br> 
			<!-- 
				out.write(i)
				out.print(i)
			 -->
	<%
	
		}
	%>
	
	<h1>1 ~ 10 까지의 총합</h1>
	<%
		int sum = 0;
		for(int i = 1; i <= 10; i++){
			sum = sum + i;
	%>
			<%= i %><br> 
			
	<%
	
		}
	%>
	1 ~ 10 사이의 총합 : <%= sum %><br>

</body>
</html>