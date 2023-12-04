<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>표현언어 내장객체 cookie 이용</h2>
	<%
		Cookie c = new Cookie("userid", "gdhong");
		response.addCookie(c);
	%>
	
	\${cookie.userid.value } = ${cookie.userid.value }
	
	<p><hr><h2>스크립트릿에서 직접 Cookie 이용</h2>
	<%
		Cookie[] cs = request.getCookies();
		if (!(cs == null)) {
			for (Cookie ck : cs) {
				if (ck.getName().equals("userid"))
					out.println(ck.getValue());
			}
		}
	%>
</body>
</html>
