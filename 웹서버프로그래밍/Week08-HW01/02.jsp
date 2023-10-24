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
	<%! int application = 1; %>
	<%= application %>
	
	<%--
	다음 프로그램의 실행 결과는 1이 아니다.
	그 이유를 기술하시오.
	--> application이라는 이름의 변수가 내장 객체인 application과
	이름이 같아 충돌하기 때문에 실행 결과는 1이 아닙니다.
	--%>
</body>
</html>
