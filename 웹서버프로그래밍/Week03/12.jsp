"""
12.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP 예제 import.jsp</title>
</head>
<body>
	<h2> page 지시자의 import 속성 </h2>
	<%@ page import="java.util.Date" %>
	현재 시각 : <%= new Date().toLocaleString() %>
</body>
</html>
