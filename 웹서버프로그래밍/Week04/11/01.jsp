"""
11-1.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;vcharset=EUC-KR">
<title>JSP 예제 pagecontext.jsp</title>
</head>
<body>
	<h2> pageContext 예제 </h2>
	
	<%pageContext.getOut().println("include.html을 추가"); %>
	<hr>
	<% pageContext.include("include.html"); %>
	
</body>
</html>
