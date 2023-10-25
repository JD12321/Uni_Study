"""
06-3.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP 예제 : ch06_redirectmain.jsp</title>
</head>
<body>
	<% response.sendRedirect("ch06_hobbysub.jsp?hobby=gorf"); %>
	
</body>
</html>
