"""
05-1.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP 예제 : ch05_includemain.jsp</title>
</head>
<body>
	1. 태그 param이 없는 태그 include <p>
	<jsp:include page="ch05_includesub.jsp" />
	
	2. 태그 param이 있는 태그 include <p>
	<jsp:include page="ch05_includesub.jsp" >
		<jsp:param name="programming" value="jsp" />
	</jsp:include>
</body>
</html>
