<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"   %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1> ${about  }</h1>
	<c:forEach var="fruit" items="${fruits}" >
		<h1>${fruit}</h1>
	</c:forEach>
	
</body>
</html>