package co.com.inspirar.controlador;

import java.util.ArrayList;
import java.util.List;

import java.sql.*;

import co.com.inspirar.DAO.UsuarioDAO;
import co.com.inspirar.modelo.Usuario;

public class DAOUsuarioImpl extends Conexion implements UsuarioDAO{


	@Override
	public void crearUsuario(Usuario usuario) throws Exception {
		this.conectar();
		try {
			PreparedStatement ps = this.conectar.prepareStatement("INSERT INTO usuario VALUES(?,?,?,?,?,?,?,?,?,?);");
			//Insertar datos
			ps.setNull(1, 0);
			ps.setInt(2, usuario.getIdTelefono());
			ps.setString(3, usuario.getNombres());
			ps.setString(4, usuario.getApellidos());
			ps.setString(5, usuario.getCorreo());
			ps.setString(6, usuario.getPassword());
			ps.setString(7, usuario.getTarjetaProf());
			ps.setString(8, usuario.getReTHUS());
			ps.setString(9, usuario.getIdentificacion());
			ps.setInt(10, usuario.getIdRol());
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
	public void editarUsuario(Usuario usuario) throws Exception {
		this.conectar();
		
	}

	@Override
	public List<Usuario> mostrarUsuarios() throws Exception {
		List<Usuario> lista = new ArrayList<Usuario>();
		try {
			this.conectar();
			System.out.println(this.conectar);
			Statement st = this.conectar.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM usuario;");
			while(rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setIdTelefono(rs.getInt("id_telefono"));
				usuario.setNombres(rs.getString("nombres_usuario"));
				usuario.setApellidos(rs.getString("apellidos_usuario"));
				usuario.setCorreo(rs.getString("correo_usuario"));
				usuario.setPassword(rs.getString("password_usuario"));
				usuario.setTarjetaProf(rs.getString("tarjetaProf_usuario"));
				usuario.setReTHUS(rs.getString("reTHUS_usuario"));
				usuario.setIdentificacion(rs.getString("documento_usuario"));
				usuario.setIdRol(rs.getInt("id_rol"));
				
				lista.add(usuario);
			}
			rs.close();
			st.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			this.cerrarConexion();
		}
		return lista;
	}

	@Override
	public void mostrarUsuario() throws Exception {
		this.conectar();
		
	}

	@Override
	public int validarLogin(String correo, String password) throws Exception {
		this.conectar();
		int rspta = 0;
		try {
			Statement st = this.conectar.createStatement();
			String querySql = "SELECT id_rol FROM usuario WHERE correo_usuario=+'"+ correo +"' AND password_usuario='" + password +"'"; 
			ResultSet rs = st.executeQuery(querySql);
			while(rs.next()) {
				rspta=rs.getInt("id_rol");
			}
			rs.close();
			st.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			this.cerrarConexion();
		}
		
		return rspta;
	}
	
	

}
