package co.com.inspirar.DAO;

import java.util.List;

import co.com.inspirar.modelo.Rol;
import co.com.inspirar.modelo.Usuario;
import co.com.inspirar.modelo.UsuarioRol;

public interface UsuarioRolDAO {
	public UsuarioRol validarLogin(UsuarioRol userRol, String correo) throws Exception;
	public UsuarioRol obtenerRol(Usuario user) throws Exception;
	public void asignarRol(Usuario user) throws Exception;
	public List<Rol> listarRoles() throws Exception;
}
