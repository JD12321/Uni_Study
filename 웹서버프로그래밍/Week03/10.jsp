"""
10.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP 예제 comments.jsp</title>
</head>
<body>
<!-- 이것은 HTML 주석으로 웹 브라우저의 [소스 보기]에서 보입니다. -->
	<%-- 이것은 JSP 주석으로 브라우저의 [소스 보기]에서 안보입니다. --%>
	<%!
		/*
			절대값을 반환하는 메소드 abs()
		*/
		public int abs(int a) { //메소드 구현
			//if 문장을 활용
			if (a < 0) return -a;	//음수이면 양수로 반환
			else return a; 			//양수이면 그대로 반환
	}
	%>
	원주율은 <%= Math.PI %>이다. <br>
	-3의 절대값은 <%= abs(-3) %>이다.
</body>
</html>
