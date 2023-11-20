<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%@ page import="java.sql.*" %>
<% request.setCharacterEncoding("euc-kr"); %>

<h2>테이블 student에서 이름으로 조회하는 프로그램</h2>
<hr><center>
<h2>학생정보 조회</h2>

<%
	Connection con = null;
	PreparedStatement pstmt = null;
	String driverName = "org.git.mm.mysql.Driver";
	String dbURL = "jdbc:mysql://localhost:3306/univdb";
	String sql = "select * from student where name like ?";
	String name = request.getParameter("sname") + "%";
	int rowCount=0;
	
	try {
		Class.forName(driverName);
		con = DriverManager.getConnection(dbURL, "root", "");
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, name);
		ResultSet result = pstmt.executeQuery();
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
		while (result.next()) {
%>
	<tr>
		<td align=center><%= result.getString(1) %></td>
		<td align=center><%= result.getString(2) %></td>
		<td align=center><%= result.getString(3) %></td>
		<td align=center><%= result.getString(4) %></td>
		<td align=center><%= result.getString(5) %></td>
		<td align=center><%= result.getString(6) %></td>
		<td align=center><%= result.getString(7) %></td>
		<td align=center><%= result.getString(8) %></td>
		<td align=center><%= result.getString(9) %></td>
		<td align=center><%= result.getString(10) %></td>
	</tr>
<%
			rowCount++;
		}
		result.close();
	}
	catch(Exception e) {
		out.println("MySql 데이터 베이스 univdb의 student 조회에 문제가 있습니다. <hr>");
		out.println(e.toString());
		e.printStackTrace();
	}
	finally {
		if(pstmt != null) pstmt.close();
		if(con != null) con.close();
	}
%>
</table>
</center>

<p><hr><font color=blue>
<%
	if (rowCount == 0)
		out.println("조회된 결과가 없습니다.");
	else
		out.println("조회된 결과가 " + rowCount + "건 입니다.");
%>
</font>
</body>
</html>
