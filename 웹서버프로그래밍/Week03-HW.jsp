1. '''
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP 예제 ex01.jsp</title>
</head>
<body>
	<%-- 스크립트 태그
	지시어:	 <%@    %>	-> JSP 페이지의 속성을 지정
	선언:		 <%!    %>	-> 소속변수 선언과 메소드 정의
	표현식: 	 <%=    %>	-> 변수, 계산식, 함수 호출 결과를 문자열 형태로 출력
	스크립트릿:	 <%     %>	-> 자바 코드를 기술
	주석:		 <%-- --%>	-> JSP 페이지의 설명 추가
	--%>
	
	<%-- 번외
	----------------------------------------------------------
		ㅣ<jsp: include page="test.jsp" />
		ㅣ -> 현재 JSP 페이지에서 다른 페이지를 포함
		ㅣ<jsp: forward page="test.jsp" />
		ㅣ -> 현재 JSP 페이지의 제어를 다른 페이지에 전달
	액션 	ㅣ<jsp: plugin type="applet" code="test" />
	태그	ㅣ -> 자바 애플릿을 플러그인
		ㅣ<jsp: useBean id="login" class="LoginBean" />
		ㅣ -> 자바빈을 사용
		ㅣ<jsp: setProperty name="login" property="pass" />
		ㅣ -> 자바빈의 속성을 지정하는 메소드를 호출
		ㅣ<jsp: getProperty name="login" property="pass" />
		ㅣ -> 자바빈의 속성을 반환하는 메소드를 호출
	----------------------------------------------------------
	커스텀ㅣ<tag: printData dbname="mydb" table="memb" />
	태그	ㅣ -> 사용자가 직접 정의한 태그를 이용
	----------------------------------------------------------
	 --%>
	 
</body>
</html>
'''

2. '''
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP 예제 ex02.jsp</title>
</head>
<body>
	<% String name = "홍길동"; %>
	<% long num = 20501430; %>
	
	<%= "이름: " %>
	<%= name %> <br>
	<%= "학번: " %>
	<%= num %>
	
</body>
</html>
'''

3. '''
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<html>
<head>
<title>JSP 예제 ex03.jsp</title>
</head>
<body>

	<%! String s1 = "소속변수"; %>
	<% String s1 = "지역변수"; %>
	s1 = <%= s1 %> <br>
	this.s1 = <%= this.s1 %>
	
	<%-- 결과
	s1 = 지역변수
	this.s1 = 소속변수
	 --%>
</body>
</html>
'''
![ex03 실행 결과](https://github.com/JD12321/1-2-ME/assets/127118453/4fac4ee2-bfb5-411c-8954-d9e06d083d60)


4. '''
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<html>
<head>
<title>JSP 예제 ex04.jsp</title>
</head>
<body>

	원주율은 <%= Math.PI %> 이다.

</body>
</html>
'''

5. '''
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<html>
<head>
<title>JSP 예제 ex05.jsp</title>
</head>
<body>
	
	<% int i, j; %>
	<%
		for (i=2; i<10; i++) {
			for (j=1; j<10; j++) {
				out.print("[" + i + "*" + j + "=" + i*j + "]");
			}
			out.print("<br>");
		}
	%>
	
	<%-- 실행 결과
	[2*1=2][2*2=4][2*3=6][2*4=8][2*5=10][2*6=12][2*7=14][2*8=16][2*9=18]
	[3*1=3][3*2=6][3*3=9][3*4=12][3*5=15][3*6=18][3*7=21][3*8=24][3*9=27]
	[4*1=4][4*2=8][4*3=12][4*4=16][4*5=20][4*6=24][4*7=28][4*8=32][4*9=36]
	[5*1=5][5*2=10][5*3=15][5*4=20][5*5=25][5*6=30][5*7=35][5*8=40][5*9=45]
	[6*1=6][6*2=12][6*3=18][6*4=24][6*5=30][6*6=36][6*7=42][6*8=48][6*9=54]
	[7*1=7][7*2=14][7*3=21][7*4=28][7*5=35][7*6=42][7*7=49][7*8=56][7*9=63]
	[8*1=8][8*2=16][8*3=24][8*4=32][8*5=40][8*6=48][8*7=56][8*8=64][8*9=72]
	[9*1=9][9*2=18][9*3=27][9*4=36][9*5=45][9*6=54][9*7=63][9*8=72][9*9=81]
	 --%>
</body>
</html>
'''
![ex05 실행 결과](https://github.com/JD12321/1-2-ME/assets/127118453/1ab05187-d882-4f85-b54d-a31e96dc04fa)


6. '''
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP 예제 ex06.jsp</title>
</head>
<body>
	
	<% int x; %>
	<% int total = 0; %>
	<%
		for (x=1; x<=100; x++) {
			total = total + x;
		}
	%>
	1부터 100까지의 합은 <%= total %>이다.
</body>
</html>
'''
