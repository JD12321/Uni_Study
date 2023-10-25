"""
04-1.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP 예제 : ch04_forwardparam.jsp</title>
</head>
<body>
	<% int i = 12; %>
	<% int n = 365; %>
	1 년은 <%=i %>달 입니다.
	<jsp:forward page="ch04_paramsub.jsp" >
		<jsp:param name="weeks" value="52" />
	</jsp:forward>
	1 년은 <%=n %>일 입니다.
	
	<%--
	다음 2개의 파일에서 파일 forwardparam.jsp를 실행하면 무엇이 출력되는가?
	또한 웹 브라우저의 주소와 캡션에는 무엇이 남아있는가?
	
	- 웹 브라우저의 주소: http://localhost:8085/ex06/ch04_forwardparam.jsp
	- 웹 브라우저의 캡션(탭 제목): JSP 예제 : ch04_forwardparam.jsp
	--%>
</body>
</html>
