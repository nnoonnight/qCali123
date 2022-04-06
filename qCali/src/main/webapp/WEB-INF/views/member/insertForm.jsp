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
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<script type="text/javascript">
		$(document).ready(function(){
			// 취소
			$(".cencle").on("click", function(){
				location.href = "/";
			})
			
			$("#submit").on("click", function(){
				if($("#mId").val()==""){
					alert("아이디를 입력해주세요.");
					$("#mId").focus();
					return false;
				}
				
				var idChkVal = $("#idDup").val();
				if(idChkVal == "N"){
					alert("중복확인 버튼을 눌러주세요.");
				}else if(idChkVal == "Y"){
					$("#insertForm").submit();
				}
			});
		})
		
		function fn_idDup(){
			$.ajax({
				url : "/member/idDup",
				type : "post",
				dataType : "json",
				data : {"mId" : $("#mId").val()},
				success : function(data){
					if(data == 1){
						alert("중복된 아이디입니다.");
					}else if(data == 0){
						$("#idDup").attr("value", "Y");
						alert("사용가능한 아이디입니다.");
					}
				}
			})
		}
	</script>
<body>


회원가입 양식
<form:form commandName="InsertCommand" action="${pageContext.request.contextPath}/member/insert" id="insertForm" >

<table border="1">
		<tr>
			<th>이메일</th><td><form:input path="mId" id="mId"/><form:errors path="mId"/>&nbsp;&nbsp;
			<button class="idDup" type="button" id="idDup" onclick="fn_idDup();" value="N">중복확인</button>
				<br></td>
		</tr>
		<tr>
			<th>비밀번호</th><td><form:password path="mPassword"/><form:errors path="mPassword"/></td>
		</tr>
		<tr>
			<th>비밀번호 확인</th><td><form:password path="mPasswordCheck"/><form:errors path="mPasswordCheck"/></td>
		</tr>
		<tr>
			<th>닉네임</th><td><form:input path="mNickname"/><form:errors path="mNickname"/></td>
		</tr>
		<tr>
			<th>생년월일</th><td><form:input path="mBirthday" placeholder="yyyy-mm-dd"/><form:errors path="mBirthday"/></td>
		</tr>
		
	</table>
	<br>
	<input type="submit" value="회원가입">
</form:form>

</body>
</html>