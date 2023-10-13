"""
1.
"""
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP 예제 question1</title>
</head>
<body>

	<%-- JSP 내장 객체 9개를 기술하시오.
		JSP 내장 객체 9개
		1. request
		2. response
		3. session
		4. application
		5. config
		6. exception
		7. page
		8. pageContext
		9. out
	 --%>

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
<meta charset="EUC-KR">
<title>JSP 예제 question2</title>
</head>
<body>
	<%! int application = 1; %>
	<%= application %>
	
	<%--
	다음 프로그램의 실행 결과는 1이 아니다.
	그 이유를 기술하시오.
	--> application이라는 이름의 변수가 내장 객체인 application과
	이름이 같아 충돌하기 때문에 실행 결과는 1이 아닙니다.
	--%>
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
<meta charset="EUC-KR">
<title>JSP 예제 question3</title>
</head>
<body>
	<%= exception %>
	
	<%--
	다음 프로그램은 오류가 발생한다.
	그 이유를 기술하시오.
	--> exception 내장 객체는 오류 페이지 즉, 오류가 발생 했을 때
	사용자에게 보여지는 페이지에서만 사용이 가능한데 코드 내에 오류 페이지로 지정하는
	코드가 없어 오류 페이지로 지정되어 있지 않아 오류가 발생합니다.
	 --%>
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
<meta charset="EUC-KR">
<title>JSP 예제 question4</title>
</head>
<body>
	<%--
	------------------------------------------------------
	   내장 긱체	|	   소속 패키지		|	   클래스 이름
	------------------------------------------------------
	request		|javax.servlet.http	|<<interface>>
				|					|HttpServletRequest
	------------------------------------------------------
	response	|javax.servlet.http	|<<interface>>
				|					|HttpServletResponse
	------------------------------------------------------			
	application	|javax.servlet		|<<interface>>
				|					|ServletContext
	------------------------------------------------------			
	exception	|java.lang			|<<interface>>
				|					|Throwable
	------------------------------------------------------
	out			|javax.servlet.jsp	|<class>
				|					|JspWriter
	------------------------------------------------------
	 --%>
	
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
<meta charset="EUC-KR">
<title>JSP 예제 question5</title>
</head>
<body>
	<%= "1. request" %> <br>
	<%= "2. response" %> <br>
	<%= "3. out" %> <br>
	<% out.clear(); %>
	<%= "4. application" %> <br>
	<%= "5. exception" %> <br>
	
	<%-- 실행 결과
	 4. application 
	 5. exception 
	--%>
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
<title>JSP 예제 question6</title>
</head>
<body>
	<%--
	JSP 내장 객체 중에서 JSP 페이지에 관한 정보와 다른 페이지로 제어권을 넘겨줄 때
	이용되는 메소드를 제공하며, 8개의 다른 내부 객체를 얻을 수 있는
	메소드를 제공하는 객체는 무엇인가?
	--> pageContext 객체
	 --%>
</body>
</html>



"""
7.
"""
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>예제 question7</title>
<style>
	table,td {
  border: 1px solid black;
}
td {
	padding: 5px;
}
</style>
</head>
<body>
	
<h1>기술정보 이력서</h1>
	
<form method="post" action="ch07.jsp">
	
	<table>
		<tr>
			<td>이름</td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td>주민등록번호</td>
			<td><input type="text" name="rrn1"> - <input type="text" name="rrn2"></td>
		</tr>
		<tr>
			<td>학력</td>
			<td><input type="radio" name="grdate" value="고졸"> 고졸
				<input type="radio" name="grdate" value="대졸" checked> 대졸
				<input type="radio" name="grdate" value="대학원졸"> 대학원졸 </td>
		</tr>
		<tr>
			<td>전공</td>
			<td><select name="major">
				<option SELECTED value="산업공학과">산업공학과</option>
				<option value="전산과">전산과</option>
				<option value="기계과">기계과</option>
				<option value="경영학과">경영학과</option>
				<option value="자유전공과">자유전공과</option>
			</select></td>
		</tr>
		<tr>
			<td>사용가능 플랫폼</td>
			<td><select multiple name="pltfom">
					<option value="Windows PC">Windows 계열 PC</option>
					<option value="Windows 서버">Windows 계열 서버</option>
					<option value="UNIX">UNIX</option>
					<option value="IBM OS/390">IBM OS/390</option>
					<option value="MAC OS">MAC OS</option>
			</select></td>
		</tr>
		<tr>
			<td><input type="submit" value="확인"></td>
			<td><input type="reset" value="취소"></td>
		</tr>
	</table>
</form>

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
<meta charset="EUC-KR">
<title>JSP 예제 question7</title>
</head>
<body>

<%
	request.setCharacterEncoding("euc-kr");
%>

<%
	String name = request.getParameter("name");
	String rrn1 = request.getParameter("rrn1");
	String rrn2 = request.getParameter("rrn2");
	String grdate = request.getParameter("grdate");
	String major = request.getParameter("major");
	String[] pltfoms = request.getParameterValues("pltfom");
%>

<h1>기술정보 이력서</h1>

이름 : <%= name %> <br>
주민번호 : <%= rrn1 %> - <%= rrn2 %><br>
학력 : <%= grdate %><br>
전공 : <%= major %> <br>
경험 플랫폼 : <%
			if (pltfoms == null) {
				out.println("전공 없음");
			} else {
				for (int i=0; i < pltfoms.length; i++)
					out.println("[" + pltfoms[i] + "]" + " ");
			}
		%> 

</body>
</html>
