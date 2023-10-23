"""
includedirective.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP 예제 : includedirective.jsp</title>
</head>
<body>
	<% int i = 12; %>
	<% //int n = 365; %>
	<% int days = 365; %>
	1년은 <%=i %>달 입니다.
	<%@ include file="includesub.jsp" %>
	1년은 <%=days %>일 입니다.
</body>
</html>
