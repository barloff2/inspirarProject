package co.com.inspirar.controlador;

import java.util.ArrayList;
import java.util.List;

import java.sql.*;

import co.com.inspirar.DAO.UsuarioDAO;
import co.com.inspirar.modelo.Rol;
import co.com.inspirar.modelo.Usuario;
import co.com.inspirar.modelo.UsuarioRol;

public class DAOUsuarioImpl extends Conexion implements UsuarioDAO{


	@Override
	public void crearUsuario(Usuario usuario) throws Exception {
		this.conectar();
		try {
			PreparedStatement ps = this.conectar.prepareStatement("INSERT INTO Usuario VALUES(?,?,?,?,?,?,?,?);");
			//Insertar datos
			ps.setNull(1, 0);
			ps.setInt(2, usuario.getIdTelefono());
			ps.setString(3, usuario.getIdentificacion());
			ps.setString(4, usuario.getNombres());
			ps.setString(5, usuario.getApellidos());
			ps.setString(6, usuario.getCorreo());
			ps.setString(7, usuario.getTarjetaProf());
			ps.setString(8, usuario.getReTHUS());
			
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
			ResultSet rs = st.executeQuery("SELECT * FROM Usuario;");
			while(rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setIdTelefono(rs.getInt("id_telefono"));
				usuario.setNombres(rs.getString("nombres_usuario"));
				usuario.setApellidos(rs.getString("apellidos_usuario"));
				usuario.setCorreo(rs.getString("correo_usuario"));
				usuario.setTarjetaProf(rs.getString("tarjetaProf_usuario"));
				usuario.setReTHUS(rs.getString("reTHUS_usuario"));
				usuario.setIdentificacion(rs.getString("documento_usuario"));
				
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
	
	

}
