<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<meta charset="UTF-8">
<title>Main</title>
</head>
<body>
<h1>
메인 페이지
</h1>

<P>  The time on the server is ${serverTime}. </P>
<a href="${pageContext.request.contextPath }/member/login">로그인 페이지로 이동 </a><br><br>
<a href="${pageContext.request.contextPath }/member/insert">회원가입 페이지로 이동 </a>
<a href="${pageContext.request.contextPath }/member/insert">카카오톡으로 회원가입 </a>

</body>
</html>
