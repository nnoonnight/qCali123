<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Main</title>
</head>
<body>
<h1>
메인 페이지
</h1>

<P>  The time on the server is ${serverTime}. </P>
<a href="/login">로그인 페이지로 이동 </a>
<a href="/insert">회원가입 페이지로 이동 </a>

</body>
</html>
