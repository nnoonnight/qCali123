<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
회원가입 양식
<form:form commandName="isnertForm" action="${pageContext.request.contextPath}/member/isnert" method="post" >

	<input type="submit" value="도서 등록">
</form:form>

</body>
</html>