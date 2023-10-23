"""
forwardloginhandle.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP 예제 : forwardloginhandle.jsp</title>
</head>
<body>
	<%
	request.setCharacterEncoding("euc-kr");
	String userid = request.getParameter("userid");
	String passwd = request.getParameter("passwd");
	String studentnum = request.getParameter("snum");
	%>
	<%
		if (userid == null ? true : userid.equals("")) {
	%>
		<h2>로그인</h2>
		<form method="post" action="forwardlogin.jsp">
		아이디 : <input type="text" name="userid"><br>
		암호 : <input type="text" name="passwd"><p>
		<input type="submit" value="로그인">
		<input type="reset" value="다시입력">
		</form>
		<%
		} else {
		%>
			아이디 : <%= userid %>,
			암호 : <%= passwd %>,
			학번 : <%= studentnum %>
			<hr> 회원님, 반갑습니다.
		<%
		}
		%>
</body>
</html>
