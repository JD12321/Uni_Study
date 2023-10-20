"""
7.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP 예제 declaration.jsp</title>
</head>
<body>
	<%! double radius = 4.8; %>
	<%!
		public double getArea(double r) {
			return r * r * 3.14;
		}
	%>
	반지름이 <%= radius %>인 원의 면적은 <%= getArea(radius) %>이다.
</body>
</html>
