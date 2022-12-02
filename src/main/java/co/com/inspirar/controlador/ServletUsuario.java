package co.com.inspirar.controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.com.inspirar.DAO.TelefonoDAO;
import co.com.inspirar.DAO.UsuarioDAO;
import co.com.inspirar.modelo.Telefono;
import co.com.inspirar.modelo.Usuario;

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
		int idTelefono = 0;
		String documento = request.getParameter("documento");
		String nombres = request.getParameter("nombres");
		String apellidos = request.getParameter("apellidos");
		String password = request.getParameter("password");
		String telefonoFijo = request.getParameter("telefonoFijo");
		String telefonoCelular = request.getParameter("telefonoCelular");
		String tarProf = request.getParameter("tarProf");
		String reTHUS = request.getParameter("reTHUS");
		String correo = request.getParameter("email");
		String accion = request.getParameter("accion");

		System.out.println(accion);
		// Instanciar usuario y telefono

		Telefono tel = new Telefono(telefonoFijo, telefonoCelular);
		TelefonoDAO telDao = new DAOTelefonoImpl();
		try {
			idTelefono = telDao.getIdTelefono(tel);
			if (idTelefono == 0) {
				telDao.crearTelefono(tel);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		Usuario user = new Usuario(2, documento, idTelefono, nombres, apellidos, password, correo, tarProf, reTHUS);
		UsuarioDAO userDao = new DAOUsuarioImpl();

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
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		try {
			usuarios = userDao.mostrarUsuarios();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		req.setAttribute("usuarios", usuarios);
		req.getRequestDispatcher("/Usuario.jsp").forward(req, resp);
	}

}
