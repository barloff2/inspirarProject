package co.com.inspirar.controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.com.inspirar.DAO.UsuarioRolDAO;
import co.com.inspirar.modelo.Rol;
import co.com.inspirar.modelo.Usuario;
import co.com.inspirar.modelo.UsuarioRol;

public class DAOUsuarioRolImpl extends Conexion implements UsuarioRolDAO {

	@Override
	public UsuarioRol validarLogin(UsuarioRol userRol, String correo) throws Exception {
		this.conectar();
		UsuarioRol usu = null;
		try {
			Statement st = this.conectar.createStatement();
			String querySql = "SELECT U.cedula_usuario , R.tipo_rol FROM UsuarioRol E " +
					"INNER JOIN Rol R ON E.id_rol = R.id_rol " +
					"INNER JOIN Usuario U ON E.id_usuario = U.id_usuario " +
					"WHERE E.estado_usuario = 1 AND E.clave_usuario = '"+ userRol.getClave_usuario() +"' " +
					"AND U.correo_usuario = '" + correo + "';"; 
			ResultSet rs = st.executeQuery(querySql);
			if (rs.next()) {
				usu = new UsuarioRol();
				usu.setClave_usuario(userRol.getClave_usuario());
				usu.setRol(new Rol());
				usu.getRol().setTipo_rol(rs.getString("tipo_rol"));
				usu.setEstado_usuario(true);
			}
			rs.close();
			st.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			this.cerrarConexion();
		}
		return usu;
	}

	@Override
	public UsuarioRol obtenerRol(Usuario user) throws Exception {
		UsuarioRol userRol = null;
		this.conectar();
		try {
			Statement st = this.conectar.createStatement();
			String querySql = "SELECT Ur.id_rol, Ur.estado_usuario, R.tipo_rol FROM usuariorol Ur "
					+ "INNER JOIN rol R ON R.id_rol = Ur.id_rol "
					+ "WHERE Ur.id_usuario = "+user.getId()+";";
			ResultSet rs = st.executeQuery(querySql);
			if (rs.next()) {
				userRol = new UsuarioRol();
				userRol.setEstado_usuario(rs.getBoolean("estado_usuario"));
				userRol.setRol(new Rol());
				userRol.getRol().setTipo_rol(rs.getString("tipo_rol"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			this.cerrarConexion();
		}
		return userRol;
	}

	@Override
	public void asignarRol(Usuario user) throws Exception {
		this.conectar();
		int rol = (user.getUsuRol().getRol().getTipo_rol() == "administrador") ? 1 : 2;
		try {
			String querySql = "INSERT INTO usuariorol VALUES (?,?,?,?);";
			PreparedStatement ps = this.conectar.prepareStatement(querySql);
			ps.setInt(1, user.getId());
			ps.setInt(2, rol);
			ps.setBoolean(3, user.getUsuRol().isEstado_usuario());
			ps.setString(4, user.getUsuRol().getClave_usuario());
			
			ps.execute();
			ps.close();
		} catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}finally {
			this.cerrarConexion();
		}
		
	}

	@Override
	public List<Rol> listarRoles() throws Exception {
		List<Rol> listaRoles = new ArrayList<Rol>();
		try {
			this.conectar();
			Statement st = this.conectar.createStatement();
			String querySql = "select R.id_rol, R.tipo_rol FROM rol R;";
			ResultSet rs = st.executeQuery(querySql);
			while (rs.next()) {
				Rol rol = new Rol();
				rol.setTipo_rol(rs.getString("tipo_rol"));
				listaRoles.add(rol);
			}
			rs.close();
			st.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			this.cerrarConexion();
		}
		return listaRoles;
	}
	
	

}
