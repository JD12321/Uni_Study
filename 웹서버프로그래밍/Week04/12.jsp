"""
12.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP 예제 page.jsp</title>
</head>
<body>

	<%@ page info="내장 객체 page : page 자기 자신의 객체" %>
	<%= this.getServletInfo() %> <p>
	<%= ((org.apache.jasper.runtime.HttpJspBase) (page)).getServletInfo() %>

</body>
</html>
