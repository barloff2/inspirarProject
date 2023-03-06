package co.com.inspirar.controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import co.com.inspirar.DAO.TelefonoDAO;
import co.com.inspirar.modelo.Telefono;

public class DAOTelefonoImpl  extends Conexion implements TelefonoDAO{

	@Override
	public Telefono mostrarTelefono() throws Exception {
		this.conectar();
		return null;
	}

	@Override
	public void crearTelefono(Telefono telefono) throws Exception {
		this.conectar();
		try {
			PreparedStatement ps = this.conectar.prepareStatement("INSERT INTO Telefono VALUES(?,?,?);");
			//Insertar datos
			ps.setNull(1, 0);
			ps.setString(2, telefono.getTelFijo());
			ps.setString(3, telefono.getTelCel());
			ps.execute();
			ps.close();
			//setSaldo(ingreso.getIngreso());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: " + e.getMessage());
		}finally {
			this.cerrarConexion();
		}
		
	}

	@Override
	public void editarTelefono() throws Exception {
		this.conectar();
		
	}

	@Override
	public int getIdTelefono(Telefono telefono) throws Exception {
		this.conectar();
		int id = 0;
		try {
			Statement st = this.conectar.createStatement();
			String querySql = "SELECT id_telefono FROM Telefono WHERE fijo_telefono='" + telefono.getTelFijo() + "' OR celular_telefono='" + telefono.getTelCel() + "'";
			ResultSet rs = st.executeQuery(querySql);
			if (rs.next()) {
				id = rs.getInt("id_telefono");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			this.cerrarConexion();
		}
		return id;
	}

}
