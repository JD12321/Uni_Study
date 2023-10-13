"""
1.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP 예제 scriptlet.jsp</title>
</head>
<body>
	<% int i = 24; %>
	<%
		out.println("하루는 " + i + " 시간이며, <br>");
		out.println("하루는 " + i*60 + " 분 입니다.");
	%>
</body>
</html>



"""
2.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP 예제 expression.jsp</title>
</head>
<body>
	<% int year = 365; %>
	
	<% out.println("1년은 약 몇 주일까요? <p>"); %>
	<%= year / 7 %>
	<%= " 주 입니다." %>
</body>
</html>



"""
3.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP 예제 increment.jsp</title>
</head>
<body>
	<% int i = 0; %>
	i = <%= ++i %>
</body>
</html>



"""
4.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP 예제 error.jsp</title>
</head>
<body>
	<% String []str = {"감사합니다.", "Thank you."}; %>
	한국어로 [<%= str[0]; %>]는 <br>
	영어로 [<%= str[2] %>]이다.
</body>
</html>



"""
5.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP 예제 runerror.jsp</title>
</head>
<body>
	<% String []str = {"감사합니다.", "Thank you."}; %>
	한국어로 [<%= str[0] %>]는 <br>
	영어로 [<%= str[2] %>]이다.
</body>
</html>



"""
6.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP 예제 runerrorhandle.jsp</title>
</head>
<body>
	<% String []str = {"감사합니다.", "Thank you."};%>
	한국어로 [<%= str[0] %>]는 <br>
	영어로 [<%= str[1] %>]이다.
</body>
</html>



"""
7.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP 예제 declaration.jsp</title>
</head>
<body>
	<%! double radius = 4.8; %>
	<%!
		public double getArea(double r) {
			return r * r * 3.14;
		}
	%>
	반지름이 <%= radius %>인 원의 면적은 <%= getArea(radius) %>이다.
</body>
</html>



"""
8.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP 예제 membervar.jsp</title>
</head>
<body>
	<% int i = 0; %>
	[지역변수] i = <%= ++i %>
	<p>
	[소속변수] memi = <%= ++memi %>
	<%! int memi = 0; %>
</body>
</html>



"""
9.
"""
<%@page import="java.util.AbstractCollection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP 예제 jspcomments.jsp</title>
</head>
<body>
<h1> HTML 주석과 JSP 주석의 차이 </h1>
<!-- 이것은 HTML 주석으로 웹 브라우저의 [소스 보기]에서 보입니다. -->
	<%-- 다음은 자바 코드의 스크립트릿입니다. --%>
	<%
		String str;
		if (java.util.Calendar.getInstance().get(java.util.
			Calendar.HOUR_OF_DAY) >= 12)
			str = "오후";
		else
			str = "오전";
	%>
	<!-- 지금은 <%= str %>입니다. -->
	지금 시각은 <%= new java.util.Date() %> 입니다.
</body>
</html>



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




"""
11.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page info="page 지시자를 다루는 예제 페이지" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP 예제 info.jsp</title>
</head>
<body>
<h2> page 지시자 </h2>
&lt;%@ page info="page 지시자를 다루는 예제 페이지" %&gt;
</body>
</html>



"""
12.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP 예제 import.jsp</title>
</head>
<body>
	<h2> page 지시자의 import 속성 </h2>
	<%@ page import="java.util.Date" %>
	현재 시각 : <%= new Date().toLocaleString() %>
</body>
</html>



"""
13.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP 예제 errorpage.jsp</title>
</head>
<body>
	<%@ page errorPage="exception.jsp" %>
	<% String []str = {"감사합니다.", "Thank you."}; %>
	한국어로 [<%= str[0] %>]는 <br>
	영어로 [<%= str[2] %>]이다.
</body>
</html>



"""
14.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP 예제 exception.jsp</title>
</head>
<body>
	<%@ page isErrorPage="true" %>
	<h2> 처리 중 문제 발생 </h2>
	빠른 시일 내에 복구하도록 하겠습니다. <p>
	exception.getMessage() : <%= exception.getMessage() %> <p>
	exception.toString() : <%= exception.toString() %>
</body>
</html>



"""
15.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP 예제 include.jsp</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<hr> <p>
	include 지시자: &lt;%@ include file="file_name" %gt; <p>
	<hr> <p>
	<%@ include file="footer.html" %>
</body>
</html>



"""
16.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP 예제</title>
</head>
<body>
	<h2><font color=blue>JSP 지시자 예제</font></h2>
</body>
</html>



"""
17.
"""
<%@ page contentType="text/html; charset=EUC-KR" %>
<center>
<font color=red>Copyright (주)Infinity Books</font>
</center>
