"""
6.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP 예제 runerrorhandle.jsp</title>
</head>
<body>
	<% String []str = {"감사합니다.", "Thank you."};%>
	한국어로 [<%= str[0] %>]는 <br>
	영어로 [<%= str[1] %>]이다.
</body>
</html>
