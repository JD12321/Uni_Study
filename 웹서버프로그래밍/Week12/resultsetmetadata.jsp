<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
<%@page import="java.sql.*" %>

<h2>테이블 student의 테이블 메타데이터 조회 프로그램</h2>	
	
<hr><center>
<h2>인터페이스 ResultSetMetaData 이용</h2>

<%
	Connection con = null;
	Statement stmt = null;
	//String driverName = "org.git.mm.mysql.Driver";
	String driverName = "com.mysql.jdbc.Driver";
	String dbURL = "jdbc:mysql://localhost:3306/univdb";
	
	try {
		Class.forName(driverName);
		con = DriverManager.getConnection(dbURL, "root", "");
		stmt = con.createStatement();
		ResultSet result = stmt.executeQuery("select * from student;");
		ResultSetMetaData rsmd = result.getMetaData();
		int cCount = rsmd.getColumnCount();
%>
	<table width=100% border=2 cellpadding=1>
	<tr>
		<td align=center><b> 아이디</b></td>
		<td align=center><b> 암호</b></td>
		<td align=center><b> 이름</b></td>
		<td align=center><b> 입학년도</b></td>
		<td align=center><b> 학번</b></td>
		<td align=center><b> 학과</b></td>
		<td align=center><b> 휴대폰1</b></td>
		<td align=center><b> 휴대폰2</b></td>
		<td align=center><b> 주소</b></td>
		<td align=center><b> 이메일</b></td>
	</tr>
<%
	for (int i = 1; i <= cCount; i++) {
%>
	<td align=center><%= rsmd.getColumnName(i) %></td>
<%
	}
%>
	</tr>
	<tr>
<%
	for (int i = 1; i <= cCount; i++) {
%>
	<td align=center><%= rsmd.getColumnTypeName(i) %></td>
<%
	}
%>	
	</tr>
	<tr>
<%
for (int i = 1; i <= cCount; i++) {
%>
	<td align=center><%= rsmd.getPrecision(i) %></td>
<%
	}
%>
	</tr>
<%
	result.close();
	}
	catch(Exception e) {
		out.println("MySql 데이터 베이스 univdb의 student 조회에 문제가 있습니다. <hr>");
		out.println(e.toString());
		e.printStackTrace();
	}
	finally {
		if (stmt != null) stmt.close();
		if (con != null) con.close();
	}
%>
</table>
</center>

</body>
</html>
