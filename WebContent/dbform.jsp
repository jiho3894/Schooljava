<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 데이터 입력 페이지</title>
</head>
<body>
	<div> 학생 정보 등록 페이지</div>
	<form action="whiter.jsp" method="post">
		<table border=1>
		<tr>
			<th> 이름 </th>
			<td> <input type="text" name="name"> </td>
		</tr>
		<tr>
			<th> 주소 </th>
			<td> <input type="text" name="address"> </td>
		</tr>
		<tr>
			<th> 입학년도 </th>
			<td> <input type="text" name="birthym"> </td>
		</tr>
		<tr>
			<th> 학과 </th>
			<td> <input type="text" name="dept"> </td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="저장">
				<input type="reset" value="취소">
			</td>
		</tr>
		</table>
	</form>
</body>
</html>