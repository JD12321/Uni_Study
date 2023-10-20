"""
15.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP 예제 include.jsp</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<hr> <p>
	include 지시자: &lt;%@ include file="file_name" %gt; <p>
	<hr> <p>
	<%@ include file="footer.html" %>
</body>
</html>
