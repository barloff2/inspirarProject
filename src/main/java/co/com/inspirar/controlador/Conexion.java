package co.com.inspirar.controlador;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    protected Connection conectar;
    private final String URL = "jdbc:mysql://localhost:33060/Inspirar";
    private final String user = "?user=root";
    private final String passwd = "&password=inspirar123*";
    private final String noSSl = "&useSSL=false";

    public void conectar() {
        try {
        	System.out.println("Intentando conectar...");
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(URL+user+passwd+noSSl);
            System.out.println(conectar + "Conexion exitosa");
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
