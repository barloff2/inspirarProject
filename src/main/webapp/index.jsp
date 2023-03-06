<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="">

	<head>
		<!--AquÃ­ va el head importado.-->
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
	<%
		String mensaje="";
		if(request.getParameter("rspta") != null) {
			int rspta = Integer.parseInt(request.getParameter("rspta"));
			if(rspta == 0) {
				mensaje = "Error: usuario o clave incorrecta";
			} else {
				mensaje = "Volver a intentar más tarde.";
			}
		}
	%>
<body>
	<!-- Javascript Header-->
	<mn-header></mn-header>
	<!-- Body content  -->
	<section class="vh-100" style="background-color: #61729a;">
		<div class="container py-5 h-150">
		  <div class="row d-flex justify-content-center align-items-center h-100">
			<div class="col col-xl-10">
			  <div class="card" style="border-radius: 1rem;">
				<div class="row g-0">
				  <div class="col-md-6 col-lg-5 d-none d-md-block">
					<img src="Images/Login.jpg" class="img-fluid" alt="Responsive image"
					  alt="login form" class="img-fluid" style="border-radius: 1rem 0 0 1rem;" />
				  </div>
				  <div class="col-md-6 col-lg-7 d-flex align-items-center">
					<div class="card-body p-4 p-lg-5 text-black">
					  <form method="post" action="manage">
	  
						<div class="d-flex align-items-center mb-3 pb-1">
						  <span class="h1 fw-bold mb-0"><img src="Images/Logo.jpeg" class="img-fluid" alt="Responsive image"
							alt="login form" class="img-fluid" style="border-radius: 1rem 0 0 1rem;" /></span>
						</div>
	  
						<h5 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Sign into your account</h5>
	  
						<div class="form-outline mb-4">
						  <input type="email" id="username" name="username" class="form-control form-control-lg" />
						  <label class="form-label" for="username">Email address</label>
						</div>
	  
						<div class="form-outline mb-4">
						  <input type="password" id="password" name="password" class="form-control form-control-lg" />
						  <label class="form-label" for="password">Password</label>
						</div>
	  
						<div class="pt-1 mb-4">
						  <input class="btn btn-dark btn-lg btn-block" type="submit" name="accion" value="Login">
						</div>
						<p style="color: red"><%=mensaje %></p>
					  </form>
	  
					</div>
				  </div>
				</div>
			  </div>
			</div>
		  </div>
		</div>
	  </section>
	</main>
<!-- JavaScript footer -->
	<mn-footer></mn-footer>
</body>
</html>