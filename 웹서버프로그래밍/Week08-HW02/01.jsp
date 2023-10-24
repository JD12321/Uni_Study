"""
01.
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
<%-- 20231575 은지담
	|-------------------------------------------------------------------------------|
	|  태그 종류 	|              태그 형식							|      사용 용도		|
	|-------------------------------------------------------------------------------|
	|  include	|<jsp:include page="test.jsp />					|					|
	|			|												| 현재 JSP 페이지에서	|
	|   param	|<jsp:include page="test.jsp >					| 다른 페이지를 포함		|
	|			|<jsp:param name="id" value="hong />			|					|
	|			|</jsp:include>									|					|
	|-------------------------------------------------------------------------------|
	|  forward	|<jsp:forward page="test.jsp />					|					|
	|			|												|현재 JSP 페이지의 제어를	|
	|   param	|<jsp:forward page="test.jsp >					|다른 페이지에 전달		|
	|			|<jsp:param name="id" value="hong />			|					|
	|			|</jsp:forward>									|					|
	|-------------------------------------------------------------------------------|
	|  plugin	|<jsp:plugin type="applet" code="test" />		|자바 애플릿 등을 플러그인	|
	|-------------------------------------------------------------------------------|
	|  useBean	|<jsp:useBean id="login" class="LoginBean" />	|   자바 빈즈를 사용		|
	|-------------------------------------------------------------------------------|
	|setProperty|<jsp:setProperty name="login" property="pass"/>| 자바 빈지의 속성을		|
	|			|												| 지정하는 메소드를 호출	|
	|-------------------------------------------------------------------------------|
	|getProperty|<jsp:getProperty name="login" property="pass"/>| 자바 빈즈의 속성을		|
	|			|												| 반환하는 메소드를 호출	|
	|-------------------------------------------------------------------------------|
--%>
</body>
</html>
