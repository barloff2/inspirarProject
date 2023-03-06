package co.com.inspirar.modelo;

public class UsuarioRol {
	
	private boolean estado_usuario = false;
	private String clave_usuario = "";
	private Rol rol = new Rol();
	
	public UsuarioRol() {
		
	}



	public UsuarioRol(boolean estado_usuario, String clave_usuario, Rol rol) {
		super();
		this.estado_usuario = estado_usuario;
		this.clave_usuario = clave_usuario;
		this.rol = rol;
	}



	public String getClave_usuario() {
		return clave_usuario;
	}

	public void setClave_usuario(String clave_usuario) {
		this.clave_usuario = clave_usuario;
	}

	public boolean isEstado_usuario() {
		return estado_usuario;
	}

	public void setEstado_usuario(boolean estado_usuario) {
		this.estado_usuario = estado_usuario;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
	
}
