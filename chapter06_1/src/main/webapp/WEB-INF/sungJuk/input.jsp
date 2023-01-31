<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="/chapter06_1/sungJuk/result.do"><!-- 절대 주소 -->
<table border="1px">
	<tr>
		<td>이름 : <input type = "text" name='name'></td>
	<tr>	
	<tr>
		<td>국어 : <input type = "text" name ='kor' value="0"></td>
	<tr>	
	<tr>
		<td>영어 : <input type = "text" name='eng' value="0"></td>
	<tr>	
	<tr>
		<td>수학 : <input type = "text" name='math' value="0"></td>
	<tr>	
</table>




<button>계산</button>
</form>
</body>
</html>