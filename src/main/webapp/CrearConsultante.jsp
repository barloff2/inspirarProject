<%@page import="co.com.inspirar.modelo.Consultante" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
            <!DOCTYPE html>
            <html lang="">

            <head>
                <meta charset="utf-8">
                <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
                <title>Creación Consultante</title>
                <!-- Main Header and Footer -->
                <script type=module src=main.js></script>

                <!-- Bootstrap only -->
                <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
                    integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
                    crossorigin="anonymous">
                <!-- Bootstrap icons -->
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
                    integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
                    crossorigin="anonymous">
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
                    integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
                    crossorigin="anonymous"></script>

            </head>


            <body>
                <!-- Javascript Header-->
                <mn-header></mn-header>
                <!-- Body content  -->
                <div class="row">
                    <div class="col-sm-6">
                        <div class="card">
                            <div class="card-header">
                                Crear Consultante
                            </div>
                            <div class="card-body">
                                <form method="POST" enctype="multipart/form-data">
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="txtID">Numero de documento</label>
                                                <input type="text" required class="form-control" value="" name="txtID"
                                                    id="txtID">
                                            </div>
                                            <div class="form-group">
                                                <label for="txtTipoID">Tipo documento</label><br>
                                                <select id="txtTipoID" class="form-select"
                                                    aria-label="Default select example">
                                                    <option value="CC" selected>Cedula Ciudadadia</option>
                                                    <option value="RC">Registro Civil</option>
                                                    <option value="TI">Tarjeta Identidad</option>
                                                    <option value="CE">Cedula Extrajeria</option>
                                                </select>
                                            </div>

                                            <div class="form-group">
                                                <label for="txtNombre">Nombre Completo</label>
                                                <input type="text" required class="form-control" value=""
                                                    name="txtNombre" id="txtNombre">
                                            </div>

                                            <div class="form-group">
                                                <label for="txtFecha">Fecha Nacimiento</label>
                                                <input type="date" required class="form-control" value=""
                                                    name="txtFecha" id="txtFecha">
                                            </div>

                                            <div class="form-group">
                                                <label for="txtGenero">Genero</label>
                                                <input type="text" required class="form-control" value=""
                                                    name="txtGenero" id="txtGenero">
                                            </div>

                                            <div class="form-group">
                                                <label>Sexo</label><br>
                                                <input type="radio" value="masculino" name="txtSexo" id="txtSexo">
                                                <label for="txtSexo">Masculino</label>
                                                <input type="radio" value="femenino" name="txtSexo" id="txtSexo">
                                                <label for="txtSexo">Femenino</label>
                                            </div>


                                            <div class="form-group">
                                                <label for="txtEstadoCivil">Estado civil</label><br>
                                                <select id="txtEstadoCivil" class="form-select"
                                                    aria-label="Default select example">
                                                    <option value="soltero" selected>Soltero/a</option>
                                                    <option value="matrimonio">Casado/a</option>
                                                    <option value="divorcio">Divorciado/a</option>
                                                    <option value="Union Libre">Union Libre</option>
                                                </select>
                                            </div>

                                            <div class="form-group">
                                                <label for="txtEscolaridad">Escolaridad</label>
                                                <input type="text" required class="form-control" value=""
                                                    name="txtEscolaridad" id="txtEscolaridad">
                                            </div>

                                            <div class="form-group">
                                                <label for="txtOcupacion">Ocupacion</label>
                                                <input type="text" required class="form-control" value=""
                                                    name="txtOcupacion" id="txtOcupacion">
                                            </div>

                                            <div class="form-group">
                                                <label for="txtPais">País</label>
                                                <input type="text" required class="form-control" value="" name="txtPais"
                                                    id="txtPais">
                                            </div>
                                        </div>

                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="txtCiudad">Ciudad</label>
                                                <input type="text" required class="form-control" value=""
                                                    name="txtCiudad" id="txtCiudad">
                                            </div>


                                            <div class="form-group">
                                                <label for="txtLocalidad">Localidad</label>
                                                <input type="text" required class="form-control" value=""
                                                    name="txtLocalidad" id="txtLocalidad">
                                            </div>


                                            <div class="form-group">
                                                <label for="txtBarrio">Barrio</label>
                                                <input type="text" required class="form-control" value=""
                                                    name="txtBarrio" id="txtBarrio">
                                            </div>


                                            <div class="form-group">
                                                <label for="txtDireccion">Dirección</label>
                                                <input type="text" required class="form-control" value=""
                                                    name="txtDireccion" id="txtDireccion">
                                            </div>

                                            <div class="form-group">
                                                <label for="txtTelefono">Telefono Fijo</label>
                                                <input type="text" required class="form-control" value=""
                                                    name="txtTelefono" id="txtTelefono">
                                            </div>

                                            <div class="form-group">
                                                <label for="txtCelular">Celular</label>
                                                <input type="text" required class="form-control" value=""
                                                    name="txtCelular" id="txtCelular">
                                            </div>

                                            <div class="form-group">
                                                <label for="txtCorreo">Correo</label>
                                                <input type="email" required class="form-control" value=""
                                                    name="txtCorreo" id="txtCorreo">
                                            </div>

                                            <div class="form-group">
                                                <label for="txtEPS">EPS</label>
                                                <input type="text" required class="form-control" value="" name="txtEPS"
                                                    id="txtEPS">
                                            </div>

                                            <div class="form-group">
                                                <label for="txtRegimen">Regimen</label><br>
                                                <select id="txtRegimen" class="form-select"
                                                    aria-label="Default select example">
                                                    <option value="contributivo" selected>Contributivo</option>
                                                    <option value="subsidiado">Subsidiado</option>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                    <br>
                                    <!--botones-->
                                    <button type="submit" name="accion" value="Agregar"
                                        class="btn btn-outline-success">Agregar</button>
                                    <button type="submit" name="accion" value="Modificar"
                                        class="btn btn-outline-warning">Modificar</button>
                                    <button type="submit" name="accion" value="Cancelar"
                                        class="btn btn-outline-info">Cancelar</button>

                                </form>
                            </div>
                        </div>
                    </div>
                    <!--New Div for Table-->
                    <div class="col-sm-6">
                        <div class="card">
                            <div class="card-header">
                                Consultantes
                            </div>
                            <div class="card-body">
                                <table class="table table-bordered">
                                    <thead>
                                        <tr>
                                            <th>Cédula</th>
                                            <th>Nombres</th>
                                            <th>Acciones</th>
                                        </tr>
                                    </thead>
                                    <!--For Each para traer la tabla-->
                                    <!--<jsp:useBean id="mitabla" scope="application" class="co.com.inspirar.modelo.Consultante" />
                    <tbody>
                        <tr>
                            <c:forEach items="${mitabla}" begin="0" end="${mitabla}" var="usuario">
                                <td>
                                    <c:out value="${usuario.identificacion}" />
                                </td>
                                <td>
                                    <c:out value="${usuario.nombres}" />
                                </td>
                            </c:forEach>-->
                                    <jsp:useBean id="mitabla" scope="application" class="modelo.Consultante" />
                                    <tbody>
                                        <tr>
                                            <c:forEach items="${mitabla.}" begin="0" end="${mitabla..}" var="usuario">
                                                <td>
                                                    <c:out value="${usuario.identificacion}" />
                                                </td>
                                                <td>
                                                    <c:out value="${usuario.nombres}" />
                                                </td>
                                            </c:forEach>
                                            <!--Botones para seleccionar y borrar-->
                                            <td>
                                                <form method="POST">
                                                    <input type="hidden" name="txtID" id="txtID"
                                                        value="<?php echo $consultante['documento_identidad']; ?>" />
                                                    <input type="submit" name="accion" style="float:right;"
                                                        value="Seleccionar" class="btn btn-outline-warning btn-sm" />

                                                    <input type="submit" name="accion" style="float:right;"
                                                        value="Inactivar" class="btn btn-outline-danger btn-sm mr-2" />

                                                </form>
                                            </td>

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