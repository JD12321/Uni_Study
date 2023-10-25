"""
03-2.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP 예제 : ch03_paramsub.jsp</title>
</head>
<body>
	<hr><font color=blue>
	1 년은 <%=request.getParameter("weeks") %>주 입니다.
	</font><hr>
</body>
</html>
