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
	
</head>
<body>
    <mn-header></mn-header>
    <div>
        <div class="card-header">Crear Usuarios</div>
        <div class="card-body justify-content-center">
            <form method="POST" action="ServletUsuario">
                <!--SecciÃ³n para el numero de identificaciÃ³n-->
                <div class="form-group">
                    <label for="documento">N&#250mero de documento</label>
                    <!--En el value habÃ­a un echo con el mismo dato: <?php echo $txtID; ?>-->
                    <input type="text" required class="form-control" value=""
                        name="documento" id="documento"
                        placeholder="N&#250mero de documento">
                </div>
                <!--SecciÃ³n para el Nombre-->
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
                <!--SecciÃ³n para el ContraseÃ±a-->
                <div class="form-group">
                    <label for="password">Contrase&#241a</label> <input type="password"
                        required class="form-control" value="" name="password"
                        id="password" placeholder="Contrase&#241a">
                </div>
                <!--SecciÃ³n para el Teléfono Fijo-->
                <div class="form-group">
                    <label for="telefonoFijo">Tel&#233fono Fijo</label> <input
                        type="text" required class="form-control" value=""
                        name="telefonoFijo" id="telefonoFijo"
                        placeholder="Tel&#233fono Fijo">
                </div>
                <!--SecciÃ³n para el Teléfono Celular-->
                <div class="form-group">
                    <label for="telefonoCelular">Tel&#233fono Celular</label> <input
                        type="text" required class="form-control" value=""
                        name="telefonoCelular" id="telefonoCelular"
                        placeholder="Tel&#233fono Celular">
                </div>
                <!--SecciÃ³n para la tarjeta profesional-->
                <div class="form-group">
                    <label for="tarProf">Tarjeta Profesional</label> <input
                        type="text" required class="form-control" value=""
                        name="tarProf" id="tarProf"
                        placeholder="N&#250mero Tarjeta Profesional">
                </div>
                <!--SecciÃ³n para el ReTHUS-->
                <div class="form-group">
                    <label for="reTHUS">ReTHUS</label> <input type="text" required
                        class="form-control" value="" name="reTHUS" id="reTHUS"
                        placeholder="ReTHUS">
                </div>
                <!--SecciÃ³n para el correo-->
                <div class="form-group">
                    <label for="email">Correo Electr&#243nico</label> <input type="email"
                        required class="form-control" value="" name="email" id="email"
                        placeholder="Correo Electr&#243nico">
                </div>
                <div class="form-group">
                	<label for="email">Rol</label>
                	<select class="form-control" name="rol" autofocus="" required="">
                		<option disabled selected> Seleccione un rol </option>
                		<c:forEach items="${roles}" var="rol">
                			<option value="${rol.tipo_rol}">${rol.tipo_rol}</option>
                		</c:forEach>
                	</select>
                </div>
                <br>
                <!--botones-->
                <!-- <?php echo ($accion=="Seleccionar")?"disabled":""; ?-->
                <input type="submit" name="accion" value="Agregar" id="accion"
                    class="btn btn-outline-secondary">
                <!-- <?php echo ($accion=="Seleccionar")?"disabled":""; ?-->
                <input type="submit" name="accion" value="Cancelar" id="accion"
                    class="btn btn-outline-secondary" onclick="location.href='manage';">
            </form>
        </div>
    </div>
</body>
</html>
<%
	} else {
	response.sendRedirect("index.jsp");
	}
%>