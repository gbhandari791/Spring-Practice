<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>

	<div class="container" style="margin-top: 2rem;" >
	
	
	
	<div class="alert alert-danger" role="alert">
  		<form:errors path="complexForm.*" />
	</div>
	
	<form action="processComlexForm" method="post" >
		
		<div class="form-group">
			<label >id</label> 
			<input type="text" class="form-control" name="id" >
		</div>
		
		<div class="form-group">
			<label>Name</label> 
			<input type="text" class="form-control" name="name" >
		</div>
		
		<div class="form-group">
			<label>Date of Birth</label> 
			<input type="date" class="form-control" name="date" />
		</div>
		
		<div>
			<div class="form-check">
			  <input class="form-check-input" type="radio" name="gender" value="male"> 
			  <label class="form-check-label">
			    Male
			  </label>
			</div>
			
			<div class="form-check">
			  <input class="form-check-input" type="radio" name="gender" value="female" >
			  <label class="form-check-label">
			    Female
			  </label>
			</div>
		</div>
		
		<div class="form-group">
			<label>State</label> 
			<select	class="form-control" name="state" >
				<option>Maharashtra</option>
				<option>Delhi</option>
				<option>Haryana</option>
			</select>
		</div>
		
		<button type="submit" class="btn btn-primary mt-3 btn-submit">Submit</button>
		
	</form>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>