"""
3.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP 예제 increment.jsp</title>
</head>
<body>
	<% int i = 0; %>
	i = <%= ++i %>
</body>
</html>
