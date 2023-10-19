"""
3.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP 예제 question3</title>
</head>
<body>
	<%= exception %>
	
	<%--
	다음 프로그램은 오류가 발생한다.
	그 이유를 기술하시오.
	--> exception 내장 객체는 오류 페이지 즉, 오류가 발생 했을 때
	사용자에게 보여지는 페이지에서만 사용이 가능한데 코드 내에 오류 페이지로 지정하는
	코드가 없어 오류 페이지로 지정되어 있지 않아 오류가 발생합니다.
	 --%>
</body>
</html>
