"""
2.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP 예제 expression.jsp</title>
</head>
<body>
	<% int year = 365; %>
	
	<% out.println("1년은 약 몇 주일까요? <p>"); %>
	<%= year / 7 %>
	<%= " 주 입니다." %>
</body>
</html>
