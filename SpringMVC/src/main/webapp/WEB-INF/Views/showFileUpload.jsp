<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>File Upload</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT"
	crossorigin="anonymous">
</head>
<body>

	<div class="container p-5">
		<form action="<c:url value='/fileUpload/processFileUpload' />"
			enctype="multipart/form-data" method="post">

			<div class="form-group">
				<label for="exampleFormControlFile1">Upload File:</label> <br>
				<br> <input type="file" class="form-control-file"
					name="fileUploaded" id="exampleFormControlFile1" />

				<div class="pt-3">
					<button type="submit" class="btn btn-outline-primary">Upload</button>
				</div>
			</div>
		</form>
	</div>



	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO"
		crossorigin="anonymous"></script>
</body>
</html>