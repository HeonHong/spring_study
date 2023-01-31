<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- ****${sungJukDTO.name }의 성적****<br>
총점 : ${sungJukDTO.tot }<br>
평균 : ${sungJukDTO.avg }<br> --%>


****${sungJukDTO2.getName() }의 성적****<br>
<!-- 원래는 이런 형식이지만 el태그 속성상 메소드를 이름으로 바로 사용 가능 -->
총점 : ${sungJukDTO2.tot }<br>
평균 : ${sungJukDTO2.avg }<br>

</body>
</html>