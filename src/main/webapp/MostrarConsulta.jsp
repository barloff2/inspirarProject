<%@page import="co.com.inspirar.modelo.Consulta"%>
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
    <div class="col-md-12">
        <div class="card">
            <div class="card-body">
                <h3 class="card-title"><center>Consulta</center></h3>
                <br>
                <form enctype="multipart/form-data">
                    <label><strong>Descargar Genograma: </strong></label>
                    <!--HREF y DOWNLOAD PARA TRAER GENOGRAMA, HAY QUE ARREGLAR LA VARIABLE QUE GUARDA EL GENOGRAMA-->
                    <a href="Genograma/${}" download="${}" ><i class="fas fa-download"></i></a>
                    <div class="row">
                        <div class="col-md-6">
    
                            <!--Motivo Consulta-->
                            <br><br>
                            <label for="motivoConsulta">Motivo Consulta</label>
                            <br>
                            <textarea readonly name="motivoConsulta" id="motivoConsulta" cols="62" rows="10" maxlength="1000"> ${Consulta.motivo} </textarea>
    
                            <!--Antecedentes clinicos Patologicos-->                        
                            <br><br>
                            <label for="antecedentesCliPat">Antecedentes Clinicos Patologicos</label>
                            <br>
                            <textarea readonly name="antecedentesCliPat" id="antecedentesCliPat" cols="62" rows="10" maxlength="1000"> ${Consulta.antecedentesCliPat} </textarea>
    
                            <!-- Examen Mental Inicial -->
                            <br><br>
                            <label for="examenMentIni">Examen Mental Inicial</label>
                            <br>
                            <textarea readonly name="examenMentIni" id="examenMentIni" cols="62" rows="10" maxlength="1000">${Consulta.examenMentIni}</textarea>  
    
                            <!--Notas-->
                            <br><br>
                            <label for="notas">Notas</label>
                            <br>
                            <textarea readonly name="notas" id="notas" cols="62" rows="10" maxlength="2000" require>${Consulta.notas}</textarea>
    
                        </div>
                        <div class="col-md-6">
                            <!--Historia Problema Actual-->
                            <br><br>
                            <label for="hProblemaActual">Historia del Problema Actual</label>
                            <br>
                            <textarea readonly name="hProblemaActual" id="hProblemaActual" cols="62" rows="10" maxlength="1000" >${Consulta.hProblemaActual}</textarea>
    
                            <!--Antecedentes Clinicos no Patologicos-->
                            <br><br>
                            <label for="antecedentesCliNoPat">Antecedenetes Clinicos no Patologicos</label>
                            <br>
                            <textarea readonly name="antecedentesCliNoPat" id="antecedentesCliNoPat" cols="62" rows="10" maxlength="1000">${Consulta.antecedentesCliNoPat}</textarea>
    
                            <!--Plan Terapeutico-->
                            <br><br>
                            <label for="planTerapeutico">Plan Terapeutico</label>
                            <br>
                            <textarea readonly name="planTerapeutico" id="planTerapeutico" cols="62" rows="10" maxlength="1000">${Consulta.planTerapeutico}</textarea>
    
                            <!--Historia Familiar-->
                            <br><br>
                            <label for="historiaFamiliar">Historia Familiar</label>
                            <br>
                            <textarea readonly name="historiaFamiliar" id="historiaFamiliar" cols="62" rows="10" maxlength="1500">${Consulta.historiaFamiliar}</textarea>
                        </div>
                    </div>   
                    <br><br>
                    <label for="diagDif"><center>Diagnostico Diferencial</center></label>   
                    <br>
                    <textarea readonly name="diagDif" id="diagDif" cols="130" rows="10">${Consulta.diagDif}</textarea>              
                </form>
            </div>
        </div>
    </div> 
<!-- JavaScript footer -->
<mn-footer></mn-footer>
</body>
</html>