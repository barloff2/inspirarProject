package co.com.inspirar.DAO;

import co.com.inspirar.modelo.UsuarioRol;

public interface UsuarioRolDAO {
	public UsuarioRol validarLogin(UsuarioRol userRol, String correo) throws Exception;
}
