<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
회원가입 양식
<form:form commandName="memberVO" action="${pageContext.request.contextPath}/member/insert" method="post" >

<table border="1">
		<tr>
			<th>이메일</th><td><form:input path="memberId"/></td>
		</tr>
		<tr>
			<th>비밀번호</th><td><form:input path="memberPw"/></td>
		</tr>
		<tr>
			<th>비밀번호 확인</th><td><form:input path="memberPwCheck"/></td>
		</tr>
		<tr>
			<th>닉네임</th><td><form:input path="memberNickname"/></td>
		</tr>
		<tr>
			<th>생년월일</th><td><form:input path="memberBirthDay"/></td>
		</tr>
		
	</table>
	<br>
	<input type="submit" value="회원가입">
</form:form>

</body>
</html>