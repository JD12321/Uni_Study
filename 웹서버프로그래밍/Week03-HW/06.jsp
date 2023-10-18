"""
6.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP 예제 ex06.jsp</title>
</head>
<body>
	
	<% int x; %>
	<% int total = 0; %>
	<%
		for (x=1; x<=100; x++) {
			total = total + x;
		}
	%>
	1부터 100까지의 합은 <%= total %>이다.
</body>
</html>
