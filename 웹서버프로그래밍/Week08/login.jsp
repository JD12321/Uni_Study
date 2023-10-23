"""
login.jsp
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP 예제 : login.jsp</title>
</head>
<body>
	<h2>로그인 예제</h2>
	<%
	request.setCharacterEncoding("euc-kr");
	String userid = request.getParameter("userid");
	String passwd = request.getParameter("passwd");
	%>
	<%
	if (userid.equals(""))	{
	%>
	<jsp:include page="loginhandle.jsp">
		<jsp:param name="userid" value="guest" />
		<jsp:param name="passwd" value="anonymous" />
	</jsp:include>
	<%
	} else {
	%>
	<jsp:include page="loginhandle.jsp" />
	<%
	}
	%>
</body>
</html>
