package co.com.inspirar.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.com.inspirar.modelo.LoginBean;

public class LoginDAO {
    protected Connection conectar;
    private final String URL = "proyecto.db";
	public boolean validate(LoginBean loginBean) throws ClassNotFoundException {
		boolean status = false;

		Class.forName("org.sqlite.JDBC");

		try (Connection connection = DriverManager
				.getConnection("jdbc:sqlite:" + URL);
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection
						.prepareStatement("select login_usuario, password_usuario from Usuario where username = ? and password = ? ")) {
/*SELECT tipo_rol, login_usuario, password_usuario
FROM fakeUsuario c, fakeRol t, fakeUsuario_Rol d
WHERE c.id_usuario=d.id_usuario
AND d.id_rol=t.id_rol */

			preparedStatement.setString(1, loginBean.getUsername());
			preparedStatement.setString(2, loginBean.getPassword());

			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			status = rs.next();

		} catch (SQLException e) {
			// process sql exception
			printSQLException(e);
		}
		return status;
	}

	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}
}
