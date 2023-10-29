"""
02.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP 예제 question2</title>
</head>
<body>
<%-- 20231575 은지담
	|-----------------------------------------------------------------------------------|
	|  태그 종류 	|           액션 태그				|               메소드 호출					|
	|-----------------------------------------------------------------------------------|
	|태그 include	|<jsp:include page="sub.jsp />	|<% pageContext.include("sub.jsp"); %>	|
	|-----------------------------------------------------------------------------------|
	|태그 forward	|<jsp:forward page="sub.jsp />	|<% pageContext.forward("sub.jsp"); %>	|
	|-----------------------------------------------------------------------------------|
--%>
</body>
</html>
