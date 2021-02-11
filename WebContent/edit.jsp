<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" type="text/css" href="css/min.css">
<title>Update Clients</title>
</head>
<body>

	<%@include file="header.jsp"%>
	<div class="container-fluid">
		<div class="row">

			<p></p>

			<div class="col-md-10 col-md-offset-2">
				<div>
					<h3 class="mx-auto text-center">Modifier un client</h3>
				</div>
				<form action="updateClient.html?id=${client.id }" method="post">
					<div class="form-group">
						<label for="formGroupExampleInput">Type client</label> <input
							type="text" class="form-control" value="${client.id }" name="id"
							placeholder=" Id" disabled>
					</div>
					<div class="form-group">
						<label for="formGroupExampleInput">Type client</label> <input
							type="text" class="form-control" value="${client.type }"
							name="type" placeholder=" Type">
					</div>
					<div class="form-group">
						<label for="formGroupExampleInput2"> Nom client</label> <input
							type="text" class="form-control" value="${client.nom }"
							name="nom" placeholder="Nom">
					</div>
					<div class="form-group">
						<label for="formGroupExampleInput2"> Prenom client</label> <input
							type="text" class="form-control" value="${client.prenom }"
							name="prenom" placeholder="Prenom">
					</div>
					<div class="form-group">
						<label for="formGroupExampleInput2"> Code client</label> <input
							type="text" class="form-control" value="${client.code }"
							name="code" placeholder="code">
					</div>
					<input type="submit" value="Update" class="btn btn-primary">
				</form>
			</div>
		</div>




	</div>
	</div>
</body>
</html>