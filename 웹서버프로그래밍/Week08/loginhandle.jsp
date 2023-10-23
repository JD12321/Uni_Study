"""
loginhandle.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP 예제 : loginhandle.jsp</title>
</head>
<body>
	<%
	request.setCharacterEncoding("euc-kr");
	String userid = request.getParameter("userid");
	String passwd = request.getParameter("passwd");
	%>
	<%
	if (userid.equals("guest")) {
		out.println("회원이 아니시군요. 반갑습니다.<br>");
		out.println("다음으로 로그인 하세요.<hr>");
	} else {
		out.println("회원님, 반갑습니다.<hr>");
	}
	%>
	아이디 : <%= userid %>,
	암호 : <%= passwd %>
</body>
</html>
