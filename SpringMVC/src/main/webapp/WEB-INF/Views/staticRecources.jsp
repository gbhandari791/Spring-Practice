<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<c:url value="/resources/css/staticR.css" />" >
<script type="text/javascript" src="<c:url value="/resources/js/staticR.js" />" ></script>

</head>
<body>
	<c:url value="" />
	<h1>This is static resources page</h1>
	<button type="button" onclick="showAlert()" >CLick Me</button>
	<img alt="iron-man" src="<c:url value="/resources/img/iron-man.jpg"/>" class="iron-img" >
	
	
</body>
</html>