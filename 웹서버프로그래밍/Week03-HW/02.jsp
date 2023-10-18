"""
2.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP 예제 ex02.jsp</title>
</head>
<body>
	<% String name = "홍길동"; %>
	<% long num = 20501430; %>
	
	<%= "이름: " %>
	<%= name %> <br>
	<%= "학번: " %>
	<%= num %>
	
</body>
</html>
