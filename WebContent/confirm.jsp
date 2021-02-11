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
<title>confirmation d'ajoute</title>
</head>
<body>

	<%@include file="header.jsp"%>
	<div class="container-fluid">
		<div class="row">

			<div class="col-md-8 col-offset-2">
				<div>
					<h3 class="mx-auto">Ajoute un client</h3>
				</div>
				<form>
					<div class="form-group">
						<label for="formGroupExampleInput">Id client :</label> <label>${client.id}</label>
					</div>
					<div class="form-group">
						<label for="formGroupExampleInput">Type client :</label> <label>${client.type}</label>
					</div>
					<div class="form-group">
						<label for="formGroupExampleInput">Nom client :</label> <label>${client.nom}</label>
					</div>
					<div class="form-group">
						<label for="formGroupExampleInput">prenom client :</label> <label>${client.prenom}</label>
					</div>
					<div class="form-group">
						<label for="formGroupExampleInput">code client :</label> <label>${client.code}</label>
					</div>

				</form>
			</div>

		</div>
	</div>
</body>
</html>