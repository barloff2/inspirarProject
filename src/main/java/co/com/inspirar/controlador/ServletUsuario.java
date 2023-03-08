package co.com.inspirar.controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.com.inspirar.DAO.TelefonoDAO;
import co.com.inspirar.DAO.UsuarioDAO;
import co.com.inspirar.DAO.UsuarioRolDAO;
import co.com.inspirar.modelo.Telefono;
import co.com.inspirar.modelo.Usuario;
import co.com.inspirar.modelo.UsuarioRol;

/**
 * Servlet implementation class ServletUsuario
 */
@WebServlet("/ServletUsuario")
public class ServletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	UsuarioDAO userDao = new DAOUsuarioImpl();
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*int idTelefono = 0;
		String documento = request.getParameter("documento");
		String nombres = request.getParameter("nombres");
		String apellidos = request.getParameter("apellidos");
		String password = request.getParameter("password");
		String telefonoFijo = request.getParameter("telefonoFijo");
		String telefonoCelular = request.getParameter("telefonoCelular");
		String tarProf = request.getParameter("tarProf");
		String reTHUS = request.getParameter("reTHUS");
		String correo = request.getParameter("email");
		
		*/
		String accion = request.getParameter("accion");
		switch (accion) {
		case "Login":
			listarUsuarios(request, response);
			break;
		case "Seleccionar":
			HttpSession session;
			String documento = request.getParameter("documento");
			Usuario user = new Usuario();
			UsuarioRol userRol = new UsuarioRol();
			user.setIdentificacion(documento);
			try {
				user = userDao.mostrarUsuario(user);
				UsuarioRolDAO userRolDao = new DAOUsuarioRolImpl();
				userRol = userRolDao.obtenerRol(user);
				
				if (user == null || userRol == null) {
					response.sendRedirect("AgregarUsuario.jsp?rspta=0");
				}
			} catch (Exception e) {
				System.out.println("Error" + e.getMessage());
			}
			session = request.getSession();
			session.setAttribute("Administrador");
			this.getServletConfig().getServletContext()
				.getRequestDispatcher("/AgregarUsuario.jsp").forward(request, response);
			break;
		case "Inactivar":
			break;
		default:
			break;
		}
		// Instanciar usuario y telefono

		/*Telefono tel = new Telefono(telefonoFijo, telefonoCelular);
		TelefonoDAO telDao = new DAOTelefonoImpl();
		try {
			idTelefono = telDao.getIdTelefono(tel);
			if (idTelefono == 0) {
				telDao.crearTelefono(tel);
				idTelefono = telDao.getIdTelefono(tel);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		//Usuario user = new Usuario(documento, idTelefono, nombres, apellidos, correo, tarProf, reTHUS);
		

		/*switch (accion) {
		case "Agregar":
			try {
				userDao.crearUsuario(user);
				response.sendRedirect("ServletUsuario");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage());
			}
			break;
		case "Modificar":
			try {
				userDao.editarUsuario(user);
				response.sendRedirect("ServletUsuario");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		default:
			response.sendRedirect("ServletUsuario");
			break;
		}*/

	}
	
	private void listarUsuarios(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Usuario> usuarios = null;
		UsuarioDAO userDao = new DAOUsuarioImpl();
		try {
			usuarios = userDao.mostrarUsuarios();
			request.setAttribute("usuarios", usuarios);
		} catch (Exception e) {
			response.sendRedirect("Usuario.jsp");
		}
		this.getServletConfig().getServletContext()
			.getRequestDispatcher("/Usuario.jsp").forward(request, response);
	}


}
