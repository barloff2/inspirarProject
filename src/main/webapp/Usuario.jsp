<%@page import="co.com.inspirar.modelo.Usuario"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	if(session.getAttribute("Administrador") != null) {
		
%>
<!DOCTYPE html>
<html lang="">

<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Creaci髇 de Usuarios</title>
<!-- Main Header and Footer -->
<script type=module src=main.js></script>

<!-- Bootstrap only -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">
<!-- Bootstrap icons -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
	crossorigin="anonymous"></script>

</head>

<body>
	<!-- Javascript Header-->
	<mn-header></mn-header>
	<!--Card que contiene al formiulario-->
	<!-- Body content  -->
	<div class="row">
		<div class="col-sm-6">
			<div class="card">
				<div class="card-header">Crear Usuarios</div>
				<div class="card-body">

					<form method="POST" enctype="multipart/form-data"
						action="ServletUsuario">
						<!--Secci贸n para el numero de identificaci贸n-->
						<div class="form-group">
							<label for="documento">Numero de documento</label>
							<!--En el value hab铆a un echo con el mismo dato: <?php echo $txtID; ?>-->
							<input type="text" required class="form-control" value=""
								name="documento" id="documento"
								placeholder="N鷐ero de documento">
						</div>
						<!--Secci贸n para el Nombre-->
						<div class="form-group">
							<label for="nombres">Nombres</label> <input type="text" required
								class="form-control" value="" name="nombres" id="nombres"
								placeholder="Nombres Completos">
						</div>
						<div class="form-group">
							<label for="apellidos">Apellidos</label> <input type="text"
								required class="form-control" value="" name="apellidos"
								id="apellidos" placeholder="Apellidos Completos">
						</div>
						<!--Secci贸n para el Contrase帽a-->
						<div class="form-group">
							<label for="password">Contrase馻</label> <input type="password"
								required class="form-control" value="" name="password"
								id="password" placeholder="Contrase馻">
						</div>
						<!--Secci贸n para el Tel閒ono Fijo-->
						<div class="form-group">
							<label for="telefonoFijo">Tel閒ono Fijo</label> <input
								type="text" required class="form-control" value=""
								name="telefonoFijo" id="telefonoFijo"
								placeholder="Tel閒ono Fijo">
						</div>
						<!--Secci贸n para el Tel閒ono Celular-->
						<div class="form-group">
							<label for="telefonoCelular">Tel閒ono Celular</label> <input
								type="text" required class="form-control" value=""
								name="telefonoCelular" id="telefonoCelular"
								placeholder="Tel閒ono Celular">
						</div>
						<!--Secci贸n para la tarjeta profesional-->
						<div class="form-group">
							<label for="tarProf">Tarjeta Profesional</label> <input
								type="text" required class="form-control" value=""
								name="tarProf" id="tarProf"
								placeholder="N鷐ero Tarjeta Profesional">
						</div>
						<!--Secci贸n para el ReTHUS-->
						<div class="form-group">
							<label for="reTHUS">ReTHUS</label> <input type="text" required
								class="form-control" value="" name="reTHUS" id="reTHUS"
								placeholder="ReTHUS">
						</div>
						<!--Secci贸n para el correo-->
						<div class="form-group">
							<label for="email">Correo Electr髇ico</label> <input type="email"
								required class="form-control" value="" name="email" id="email"
								placeholder="Correo Electr髇ico">
						</div>

						<br>
						<!--botones-->
						<!-- <?php echo ($accion=="Seleccionar")?"disabled":""; ?-->
						<input type="submit" name="accion" value="Agregar" id="accion"
							class="btn btn-outline-secondary">
						<!-- <?php echo ($accion=="Seleccionar")?"disabled":""; ?-->
						<input type="submit" name="accion" value="Modificar" id="accion"
							class="btn btn-outline-secondary">
						<!-- <?php echo ($accion=="Seleccionar")?"disabled":""; ?-->
						<input type="submit" name="accion" value="Cancelar" id="accion"
							class="btn btn-outline-secondary">
					</form>
				</div>
			</div>
		</div>
		<!--New Div for Table-->
		<div class="col-sm-6">
			<div class="card">
				<div class="card-header">Usuarios</div>
				<div class="card-body">
					<table class="table table-bordered">
						<thead>
							<tr>
								<th>Cedula</th>
								<th>Nombre</th>
								<th>Acciones</th>
							</tr>
						</thead>
						<!-- For Each para traer la tabla-->
						<jsp:useBean id="mitabla" scope="application"
							class="co.com.inspirar.modelo.Usuario" />
						<tbody>

							<c:forEach var="usuario" items="${usuarios}">
								<tr>
									<td><c:out value="${usuario.identificacion}" /></td>
									<td><c:out value="${usuario.nombres} ${usuario.apellidos}" /></td>


									<!--Botones para seleccionar y borrar  -->
									<td>
										<form method="POST">
											<input type="hidden" name="txtID" id="txtID"
												value="${usuario.identificacion}"> <input
												type="submit" name="accion" style="float: right;"
												value="Seleccionar" class="btn btn-outline-warning btn-sm ">
											<input type="submit" name="accion" style="float: right;"
												value="Inactivar" class="btn btn-outline-danger btn-sm mr-2">

										</form>
									</td>
							</c:forEach>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<!-- JavaScript footer -->
	<mn-footer></mn-footer>
</body>

</html>
<%
	}else {
		response.sendRedirect("index.jsp");
	}
%>