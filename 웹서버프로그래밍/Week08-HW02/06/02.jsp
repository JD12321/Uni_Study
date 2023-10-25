"""
06-2.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP 예제 : ch06_forwardmain.jsp</title>
</head>
<body>
	<p><font color=blue>취미는
	<%=request.getParameter("hobby") %>입니다.
	</font></p>
</body>
</html>
