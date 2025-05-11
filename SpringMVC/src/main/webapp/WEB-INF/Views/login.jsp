<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-SgOJa3DmI69IUzQ2PVdRZhwQ+dy64/BUtbMJw1MZ8t5HZApcHrRKUc4W0kG879m7"
	crossorigin="anonymous">

<style type="text/css">
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

#formContainer{
	display: flex;
	justify-content: center;
	width: 100vw;
	height: 100vh;
}

.input-width{
	width: 20rem;
}
#fields-container{
	display: flex;
	flex-direction: column;
}
</style>
</head>
<body>

	<div id="formContainer" >
		<form action="processLogin" method="post"  class="m-5">
			<div id="fields-container" >
				<div class="form-group">
					<label for="exampleInputEmail1">User Name:</label> 
					<input type="text" class="form-control input-width" name="userName"  >
				</div>
				<div class="form-group mt-3">
					<label for="exampleInputPassword1">Password:</label> 
					<input type="password" class="form-control input-width" name="passWord" >
				</div>
				<div class="form-group mt-3">
					<label for="exampleInputPassword1">Age:</label> 
					<input type="number" class="form-control input-width" name="age" >
				</div>
				<button type="submit" class="btn btn-primary mt-3 btn-submit">Submit</button>
			</div>
		</form>
		
	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-k6d4wzSIapyDyv1kpU366/PK5hCdSbCRGRCMv+eplOQJWyd1fbcAu9OCUj5zNLiq"
		crossorigin="anonymous"></script>
</body>
</html>