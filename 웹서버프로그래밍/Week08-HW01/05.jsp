"""
05.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP 예제 question5</title>
</head>
<body>
	<%= "1. request" %> <br>
	<%= "2. response" %> <br>
	<%= "3. out" %> <br>
	<% out.clear(); %>
	<%= "4. application" %> <br>
	<%= "5. exception" %> <br>
	
	<%-- 실행 결과
	 4. application 
	 5. exception 
	--%>
</body>
</html>
