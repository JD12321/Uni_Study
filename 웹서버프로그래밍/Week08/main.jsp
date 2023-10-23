"""
main.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP 예제 : main.jsp</title>
</head>
<body>

	<h2> include 액션 태그</h2>
	main.jsp 파일 시작 부분입니다.<br>
	include 태그는 페이지 속성 파일 결과를 태그 위치에 삽입합니다.<br>
	
	<jsp:include page="sub.jsp" />
	
	main.sjp 파일 끝 부분입니다.

</body>
</html>
