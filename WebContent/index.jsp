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
<title>Dashbord banque system</title>
</head>
<body>

	<%@include file="header.jsp"%>
	<div class="container-fluid">
		<div class="row">

			<p></p>

			<div class="col-md-6">
				<div>
					<h3 class="mx-auto">Ajoute un client</h3>
				</div>
				<form action="ajoutClient.html" method="post">
					<div class="form-group">
						<label for="formGroupExampleInput">Type client</label> <input
							type="text" class="form-control" name="type" placeholder=" Type">
					</div>
					<div class="form-group">
						<label for="formGroupExampleInput2"> Nom client</label> <input
							type="text" class="form-control" name="nom" placeholder="Nom">
					</div>
					<div class="form-group">
						<label for="formGroupExampleInput2"> Prenom client</label> <input
							type="text" class="form-control" name="prenom"
							placeholder="Prenom">
					</div>
					<div class="form-group">
						<label for="formGroupExampleInput2"> Code client</label> <input
							type="text" class="form-control" name="code" placeholder="code">
					</div>
					<input type="submit" value="Ajouter" class="btn btn-primary">
				</form>
			</div>


			<div class="col-md-6">
				<div class="panel panel-primary">
					<p></p>
					<div class="panel-heading">Recheche des clients :</div>
					<p></p>
					<div class="panel-body">
						<form action="chercher.html" method="get">
							<label> Nom Du Client</label> <input type="text" name="motCle"
								value="${model.motCle }" />
							<button type="submit" class="btn-primary">chercher</button>
						</form>
						<table class="table table-striped">
							<tr>
								<th>Id</th>
								<th>Nom</th>
								<th>Prenom</th>
								<th>code</th>
								<th>Type</th>
								<th>Action</th>
								<th>Action</th>
							</tr>
							<c:forEach items="${model.listClients }" var="clt">
								<tr>
									<td>${clt.id}</td>
									<td>${clt.nom}</td>
									<td>${clt.prenom}</td>
									<td>${clt.code}</td>
									<td>${clt.type}</td>
									<td><a onclick="return confirm('confirmés la supression')" href="update.html?id=${clt.id}"> Update</a></td>
									<td><a onclick="return confirm('confirmés la supression')" href="delete.html?id=${clt.id}">delete</a></td>

								</tr>
							</c:forEach>
						</table>
					</div>

				</div>
			</div>
		</div>
	</div>
</body>
</html>