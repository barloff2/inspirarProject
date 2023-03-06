package co.com.inspirar.DAO;

import java.util.List;

import co.com.inspirar.modelo.Usuario;

public interface UsuarioDAO {
    public List<Usuario> mostrarUsuarios() throws Exception;

    public void crearUsuario(Usuario usuario) throws Exception;

    public void editarUsuario(Usuario usuario) throws Exception;
    
    public void mostrarUsuario() throws Exception;
    
}
