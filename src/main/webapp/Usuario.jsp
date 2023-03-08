<%@page import="co.com.inspirar.modelo.Usuario"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
if (session.getAttribute("Administrador") != null) {
%>
<!DOCTYPE html>
<html lang="">

<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Creaci&#243n de Usuarios</title>
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
<!-- datatables -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<link href="https://cdn.datatables.net/1.13.3/css/jquery.dataTables.css">
<script src="https://cdn.datatables.net/1.13.3/js/jquery.dataTables.js"></script>

<!-- CSS datatables -->
<link 
	rel="stylesheet"
	href="https://cdn.datatables.net/1.13.3/css/jquery.dataTables.min.css">
</head>

<body class="m-0 vh-100 row justify-content-center align-items-center">
	<!-- Javascript Header-->
	<mn-header></mn-header>
	<!-- Body content  -->
	<div>
		<input name="agregar" id="agregar" class="btn btn-dark" type="button"
			value="Agregar" onclick="location.href='AgregarUsuario.jsp';" />
	</div>
	<div class="row">
		<div class="card justify-content-center">
			<div class="card-header text-center">Usuarios</div>
			<div class="card-body justify-content-center">
				<table id="usuarios" class="display" style="width:100%">
					<thead class="thead-dark">
						<tr>
							<th>#</th>
							<th>Cedula</th>
							<th>Nombre</th>
							<th>Estado</th>
							<th>Rol</th>
							<th>Acciones</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="usuario" items="${usuarios}" varStatus="iteracion">
							<tr>
								<td>${iteracion.index +1}</td>
								<td>${usuario.identificacion}</td>
								<td>${usuario.nombres} ${usuario.apellidos}</td>
								<c:if test="${usuario.usuRol.estado_usuario == false}">
									<td><span class="badge bg-info active">Usuario
											Inactivo</span></td>
								</c:if>
								<c:if test="${usuario.usuRol.estado_usuario == true}">
									<td><span class="badge bg-success active">Usuario
											Activo</span></td>
								</c:if>
								<td>${usuario.usuRol.rol.tipo_rol}</td>
								<!--Botones para seleccionar y borrar  -->
								<td>
									<form method="POST" action="ServletUsuario">
										<input type="hidden" name="documento" id="documento"
											value="${usuario.identificacion}"> <input
											type="submit" name="accion" value="Seleccionar"
											class="btn btn-outline-warning btn-sm "> <input
											type="submit" name="accion" value="Inactivar"
											class="btn btn-outline-danger btn-sm mr-2">

									</form>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<script>
		$(document).ready(function() {
		    $('#usuarios').DataTable({
		    	scrollY: '50vh',
		    	scrollCollapse: true,
		    	paging: false,
		    });
		});
	</script>
	<!-- JavaScript footer -->
	<mn-footer></mn-footer>
</body>

</html>
<%
} else {
response.sendRedirect("index.jsp");
}
%>