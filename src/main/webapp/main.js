class MnHeader extends HTMLElement {
  connectedCallback() {
    this.innerHTML = `
	<header>
		<div class="container d-flex justify-content-center">
			<img Style="height: 300px" src="Images/Header.jpg" class="img-fluid" alt="Responsive image">		
		</div>
		<svg class="bi me-2" width="40" height="12" role="img" aria-label="Bootstrap">
		</svg>
	</header>`;
	  }
	}

customElements.define('mn-header', MnHeader);

class MnFooter extends HTMLElement {
  connectedCallback() {
    this.innerHTML = `
	<div>
	<svg class="bi me-2" width="40" height="32" role="img" aria-label="Bootstrap"></svg>
</div>
<footer">
	<!--Carousel div-->
	<div id="myCarousel" class="carousel slide" data-bs-ride="carousel">
		<div class="carousel-indicators">
			<button type="button" data-bs-target="#myCarousel" data-bs-slide-to="0" class="active"
				aria-current="true" aria-label="Slide 1"></button>
			<button type="button" data-bs-target="#myCarousel" data-bs-slide-to="1" aria-label="Slide 2"></button>
			<button type="button" data-bs-target="#myCarousel" data-bs-slide-to="2" aria-label="Slide 3"></button>
		</div>
		<!--Carousel Inner-->
		<div class="carousel-inner">
			<div class="carousel-item active">
				<svg class="bd-placeholder-img" width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
					aria-hidden="true" preserveAspectRatio="xMidYMid slice" focusable="false">
					<rect width="100%" height="100%" fill="#93a8c7" />
				</svg>
				<div class="container" style="padding-top: 2rem">
					<div class="carousel-caption text-start">
						<h1 style="padding-top: 3rem">Contáctenos.</h1>
						<p><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
								class="bi bi-telephone" viewBox="0 0 16 16">
								<path
									d="M3.654 1.328a.678.678 0 0 0-1.015-.063L1.605 2.3c-.483.484-.661 1.169-.45 1.77a17.568 17.568 0 0 0 4.168 6.608 17.569 17.569 0 0 0 6.608 4.168c.601.211 1.286.033 1.77-.45l1.034-1.034a.678.678 0 0 0-.063-1.015l-2.307-1.794a.678.678 0 0 0-.58-.122l-2.19.547a1.745 1.745 0 0 1-1.657-.459L5.482 8.062a1.745 1.745 0 0 1-.46-1.657l.548-2.19a.678.678 0 0 0-.122-.58L3.654 1.328zM1.884.511a1.745 1.745 0 0 1 2.612.163L6.29 2.98c.329.423.445.974.315 1.494l-.547 2.19a.678.678 0 0 0 .178.643l2.457 2.457a.678.678 0 0 0 .644.178l2.189-.547a1.745 1.745 0 0 1 1.494.315l2.306 1.794c.829.645.905 1.87.163 2.611l-1.034 1.034c-.74.74-1.846 1.065-2.877.702a18.634 18.634 0 0 1-7.01-4.42 18.634 18.634 0 0 1-4.42-7.009c-.362-1.03-.037-2.137.703-2.877L1.885.511z" />
							</svg> &nbsp +57(322)427-6903</p>
						<p><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
								class="bi bi-envelope" viewBox="0 0 16 16">
								<path
									d="M0 4a2 2 0 0 1 2-2h12a2 2 0 0 1 2 2v8a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V4Zm2-1a1 1 0 0 0-1 1v.217l7 4.2 7-4.2V4a1 1 0 0 0-1-1H2Zm13 2.383-4.708 2.825L15 11.105V5.383Zm-.034 6.876-5.64-3.471L8 9.583l-1.326-.795-5.64 3.47A1 1 0 0 0 2 13h12a1 1 0 0 0 .966-.741ZM1 11.105l4.708-2.897L1 5.383v5.722Z" />
							</svg>&nbsp inspirarpsicologiam@gmail.com</p>
					</div>
				</div>
			</div>
			<div class="carousel-item">
				<svg class="bd-placeholder-img" width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
					aria-hidden="true" preserveAspectRatio="xMidYMid slice" focusable="false">
					<rect width="100%" height="100%" fill="#93a8c7" />
				</svg>
				<div class="container" style="padding-top: 2rem">
					<div class="carousel-caption text-start">
						<h1>Misión</h1>
						<p>Brindar acompañamiento psicológico integral que atienda las necesidades personales,
							sociales y laborales; siempre enfocados en el individuo como pilar de la comunidad y
							creador de progreso.</p>
					</div>
				</div>
			</div>
			<div class="carousel-item">
				<svg class="bd-placeholder-img" width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
					aria-hidden="true" preserveAspectRatio="xMidYMid slice" focusable="false">
					<rect width="100%" height="100%" fill="#93a8c7" />
				</svg>
				<div class="container" style="padding-top: 2rem">
					<div class="carousel-caption text-start">
						<h1>Visión</h1>
						<p>Consolidarnos como un referente de inspiración, calidad y pluralismo, que utiliza la
							Psicología como herramienta para dar respuesta a cualquier necesidad planteada por
							nuestros clientes.</p>
					</div>
				</div>
			</div>
		</div>
		<!--End Carrousel Inner-->
		<button class="carousel-control-prev" type="button" data-bs-target="#myCarousel" data-bs-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span>
			<span class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" type="button" data-bs-target="#myCarousel" data-bs-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span>
			<span class="visually-hidden">Next</span>
		</button>
	</div>
	<!--End Carousel div-->
<!--Home Div-->
<div class="card text-center">
	<a href="index.jsp" class="nav-link px-2 text-muted"><svg xmlns="http://www.w3.org/2000/svg" width="16"
			height="16" fill="currentColor" class="bi bi-house" viewBox="0 0 16 16">
			<path
				d="M8.707 1.5a1 1 0 0 0-1.414 0L.646 8.146a.5.5 0 0 0 .708.708L2 8.207V13.5A1.5 1.5 0 0 0 3.5 15h9a1.5 1.5 0 0 0 1.5-1.5V8.207l.646.647a.5.5 0 0 0 .708-.708L13 5.793V2.5a.5.5 0 0 0-.5-.5h-1a.5.5 0 0 0-.5.5v1.293L8.707 1.5ZM13 7.207V13.5a.5.5 0 0 1-.5.5h-9a.5.5 0 0 1-.5-.5V7.207l5-5 5 5Z" />
		</svg>&nbsp Home</a>
</div>
</footer>`;

  }
}

customElements.define('mn-footer', MnFooter);
