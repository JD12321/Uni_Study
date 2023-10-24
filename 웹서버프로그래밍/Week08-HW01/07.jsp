"""
07.jsp.
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
