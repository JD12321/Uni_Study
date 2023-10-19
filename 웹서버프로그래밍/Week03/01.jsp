"""
1.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP 예제 scriptlet.jsp</title>
</head>
<body>
	<% int i = 24; %>
	<%
		out.println("하루는 " + i + " 시간이며, <br>");
		out.println("하루는 " + i*60 + " 분 입니다.");
	%>
</body>
</html>
