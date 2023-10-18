"""
1.
"""
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



