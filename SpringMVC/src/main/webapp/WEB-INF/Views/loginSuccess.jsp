<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- Using @RequestParam Anno  -->
	<%-- <h1> Hello ${userName } </h1>
	<h1> Your PassWord is ${passWord }  </h1>
	<h1> Your Age is ${age }  </h1> --%>
	
	<!-- Using @ModelAttribute Anoo -->
	
	<h1>${loginHeader }</h1>
	<p> ${description } </p>
	
	<h3> Hello ${loginForm.userName } </h3>
	<h3> Your Password is ${loginForm.passWord }  </h3>
	<h3> Your Age is ${loginForm.age }  </h3>
	<h3>Your Generated User Id is ${userId }</h3>
	
</body>
</html>