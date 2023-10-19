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
