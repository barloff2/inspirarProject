package co.com.inspirar.modelo;

public class Usuario {
	
	private int id = 0;
    private String identificacion = "";
    private int idTelefono = 0;
    private String nombres = "";
    private String apellidos = "";
    private String correo = "";
    private String tarjetaProf = "";
    private String reTHUS = "";
    private UsuarioRol usuRol = new UsuarioRol();

    public Usuario() {

    }

    public Usuario(int id, String identificacion, int telefono, String nombres, String apellidos, 
    		String correo, String tarjetaProf, String reTHUS, UsuarioRol usuRol) {

        this.id = id;
    	this.identificacion = identificacion;
        this.idTelefono = telefono;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.tarjetaProf = tarjetaProf;
        this.reTHUS = reTHUS;
        this.usuRol = usuRol;
    }

    public int getIdTelefono() {
		return idTelefono;
	}

	public void setIdTelefono(int idTelefono) {
		this.idTelefono = idTelefono;
	}

	public String getIdentificacion() {
        return identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTarjetaProf() {
        return tarjetaProf;
    }

    public String getReTHUS() {
        return reTHUS;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTarjetaProf(String tarjetaProf) {
        this.tarjetaProf = tarjetaProf;
    }

    public void setReTHUS(String reTHUS) {
        this.reTHUS = reTHUS;
    }

	public UsuarioRol getUsuRol() {
		return usuRol;
	}

	public void setUsuRol(UsuarioRol usuRol) {
		this.usuRol = usuRol;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
    
}
