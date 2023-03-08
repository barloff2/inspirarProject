package co.com.inspirar.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.com.inspirar.DAO.UsuarioDAO;
import co.com.inspirar.DAO.UsuarioRolDAO;
import co.com.inspirar.modelo.Usuario;
import co.com.inspirar.modelo.UsuarioRol;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet(name = "ServletLogin", urlPatterns = {"/manage"})
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accion = request.getParameter("accion");	
		try {
			if (accion != null) {
				switch (accion) {
				case "Login":
					verificar(request, response);
					break;
				case "Logout":
					System.out.println("logout");
					cerrarSesion(request, response);
					break;
				default:
					response.sendRedirect("index.jsp");
					break;
				}
			} else {
				response.sendRedirect("index.jsp");
			}
		} catch (Exception e) {
			try {
				this.getServletConfig().getServletContext().getRequestDispatcher("/index.jsp?rspta=2").forward(request, response);
			} catch (Exception ex) {
				System.out.println("Error " + ex.getMessage());
			}
		}
	}

	private void cerrarSesion(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		session.setAttribute("usuario", null);
		session.invalidate();
		response.sendRedirect("index.jsp");
	}

	private void verificar(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session;
		Usuario user = new Usuario();
		UsuarioRol userRol = new UsuarioRol();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		user.setCorreo(username);
		userRol.setClave_usuario(password);
		UsuarioRolDAO userRolDao = new DAOUsuarioRolImpl();
		try {
			userRol = userRolDao.validarLogin(userRol, user.getCorreo());
			if (userRol != null && userRol.getRol().getTipo_rol().equals("administrador")) {
				session = request.getSession();
				session.setAttribute("Administrador", userRol.getRol().getTipo_rol());
				this.getServletConfig().getServletContext().getRequestDispatcher("/ServletUsuario").forward(request, response);
			} else if (userRol != null && userRol.getRol().getTipo_rol().equals("psicologo")) {
				session = request.getSession();
				session.setAttribute("Psicologo", userRol.getRol().getTipo_rol());
				this.getServletConfig().getServletContext().getRequestDispatcher("/Consultante.jsp").forward(request, response);
			} else {
				response.sendRedirect("index.jsp?rspta=0");
			}
		} catch (Exception e) {
			try {
				this.getServletConfig().getServletContext().getRequestDispatcher("/index.jsp?rspta=2").forward(request, response);
			} catch (Exception ex) {
				System.out.println("Error " + ex.getMessage());
			}
		}
		
	}

}
