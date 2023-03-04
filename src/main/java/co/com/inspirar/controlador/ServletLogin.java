package co.com.inspirar.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.com.inspirar.DAO.UsuarioDAO;
import co.com.inspirar.modelo.Usuario;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
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
		int rol = 0;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		Usuario user = new Usuario();
		user.setCorreo(username);
		user.setPassword(password);
		UsuarioDAO userDao = new DAOUsuarioImpl();
		
		try {
			rol = userDao.validarLogin(username, password);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		switch (rol) {
			case 1 :
				response.sendRedirect("ServletUsuario");
				break;
			case 2:
				response.sendRedirect("Consultante.jsp");
				break;
			default:
				response.sendRedirect("index.jsp?rspta=" + rol);
				break;
		}
		
	}

}
