package co.com.inspirar.controlador;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    protected Connection conectar;
    private final String URL = "jdbc:mysql://localhost:3306/inspirar";
    private final String user = "?user=root";
    private final String passwd = "&password=Zeq2790*";
    private final String noSSl = "&useSSL=false";

    public void conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(URL+user+passwd+noSSl);
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void cerrarConexion() throws SQLException {
    	if (conectar != null && !conectar.isClosed()) {
    		conectar.close();
    	}
    }
}



