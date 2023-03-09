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
			String querySql = "INSERT INTO Usuario VALUES(?,?,?,?,?,?,?,?);";
			PreparedStatement ps = this.conectar.prepareStatement(querySql);
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
			Statement st = this.conectar.createStatement();
			String querySql = "select U.cedula_usuario, "
					+ "U.nombres_usuario, U.apellidos_usuario, C.estado_usuario, "
					+ "R.tipo_rol FROM usuariorol C "
					+ "INNER JOIN rol R ON R.id_rol = C.id_rol "
					+ "INNER JOIN usuario U ON C.id_usuario = U.id_usuario "
					+ "ORDER BY U.cedula_usuario;";
			ResultSet rs = st.executeQuery(querySql);
			
			while (rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setIdentificacion(rs.getString("cedula_usuario"));
				usuario.setNombres(rs.getString("nombres_usuario"));
				usuario.setApellidos(rs.getString("apellidos_usuario"));
				usuario.setUsuRol(new UsuarioRol());
				usuario.getUsuRol().setRol(new Rol());
				usuario.getUsuRol().getRol().setTipo_rol(rs.getString("tipo_rol"));
				usuario.getUsuRol().setEstado_usuario(rs.getBoolean("estado_usuario"));
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
	public Usuario mostrarUsuario(Usuario usuario) throws Exception {
		this.conectar();
		Usuario user = null;
		Statement st = this.conectar.createStatement();
		String querySql = "SELECT * FROM usuario U WHERE U.cedula_usuario = '+"+usuario.getIdentificacion()+"';";
		ResultSet rs = st.executeQuery(querySql);
		if (rs.next()) {
			user = new Usuario();
			user.setId(rs.getInt("id_usuario"));
			user.setIdentificacion(usuario.getIdentificacion());
			user.setApellidos(rs.getString("apellidos_usuario"));;
			user.setIdTelefono(rs.getInt("id_telefono"));
			user.setNombres(rs.getString("nombres_usuario"));
			user.setCorreo(rs.getString("correo_usuario"));
			user.setTarjetaProf(rs.getString("tarjetaProf_usuario"));
			user.setReTHUS(rs.getString("reTHUS_usuario"));
		}
		return user;
	}
	
	

}
