<%@page import="co.com.inspirar.modelo.Consultante"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<!DOCTYPE html>
	<html lang="">
	
		<head>
			<meta charset="utf-8">
			<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
			<title>Login Inspirar</title>
			<!-- Main Header and Footer -->
			<script type=module src=main.js></script>
		
			<!-- Bootstrap only -->
			<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
				integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
			<!-- Bootstrap icons -->
			<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
				integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
			<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
				integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
				crossorigin="anonymous"></script>
		
		</head>
	
	<body>
	<!-- Javascript Header-->
	<mn-header></mn-header>
	<!-- Body content  -->
			<div class="card">
				<nav class="nav justify-content-center bg-secundary text-secondary"">
				<a class="nav-link" href="CrearConsultante.jsp"><h4>Crear Consultante</h4></a>
				</nav>
			</div>
	<!--<?php foreach ($listaConsultantes as $consultante) { ?> -->  
			<div class="col-xs-3">
				<br><br>
				<div class="card text-center">
					<div class="card-body">
						<!--<?php echo $consultante['nombreCompleto'];?>-->
						<h4 class="card-title" ></h4>
						
						<a class="btn btn-outline-success" href="CrearConsulta.jsp" role="button">Agregar Consulta</a>
						<a class="btn btn-outline-info" href="HistorioClinica.jsp" role="button">Historia Clinica</a>
					</div>
				</div>
			</div>

			<div><br></div>
<!-- JavaScript footer -->
<mn-footer></mn-footer>
</body>
</html>