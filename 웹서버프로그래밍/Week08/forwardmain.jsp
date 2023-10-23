"""
forwardmain.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP 예제 : forwardmain.jsp</title>
</head>
<body>
	<h2>forward 액션 태그</h2>
	forwardmain.jsp 파일 시작 부분입니다.<br>
	forward 태그는 페이지 속성 파일로 제어를 넘깁니다.<br>
	forwardmain.jsp 페이지의 출력 내용은 하나도 출력되지 않습니다.<br>
	
	<jsp:forward page="forwardsub.jsp" />
	
	forwardmain.jsp 파일 끝 부분입니다.
</body>
</html>
