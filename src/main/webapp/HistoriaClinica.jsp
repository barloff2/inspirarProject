<%@page import="co.com.inspirar.modelo.Consulta"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="">

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<title>Historia Clínica</title>
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

    <div class="col-md-12">
        <div class="card">
          <div class="card-header text-center">
                            <a><h2>Historia Clínica</h4></a>
                        </div>
          <div class="card-body text-center">
            <a><h3> ${Consultante.nombres} </h3></a>
          </div>
   </div>
      </div>
  
                    <!--For Each para traer la tabla-->
<jsp:useBean id="mitabla" scope="application" class="co.com.inspirar.modelo.Consulta" />
     <c:forEach items="${mitabla.}" begin="0" end="${mitabla..}" var="Consulta">
       <c:out value=${Consulta.fecha} />
          <c:out value=${Consultante.nombres} />
  </c:forEach> 
<div class="col-md-2">
    <br><br>
    <div class="card text-center">
      <div class="card-header text-center">
                            <h4 class="card-title">${Consulante.fecha}</h4>  
                        </div>
        <div class="card-body">
                 
            <a class="btn btn-outline-info" href="MostrarConsulta.jsp" role="button">Ver consulta</a>
        </div>
    </div>
</div>
<!-- JavaScript footer -->
<mn-footer></mn-footer>
</body>
</html>