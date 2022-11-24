package co.com.inspirar.modelo;

public class Usuario {
	
	private int idRol = 0;
    private String identificacion = "";
    private int idTelefono = 0;
    private String nombres = "";
    private String apellidos = "";
    private String password = "";
    private String correo = "";
    private String tarjetaProf = "";
    private String reTHUS = "";

    public Usuario() {

    }

    public Usuario(int idRol, String identificacion, int telefono, String nombres, String apellidos, 
    		String password, String correo, String tarjetaProf, String reTHUS) {

        this.idRol = idRol;
        this.identificacion = identificacion;
        this.idTelefono = telefono;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.password = password;
        this.correo = correo;
        this.tarjetaProf = tarjetaProf;
        this.reTHUS = reTHUS;
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


    public String getPassword() {
        return password;
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


    public void setPassword(String password) {
        this.password = password;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTarjetaProf(String tarjetaProf) {
        this.tarjetaProf = tarjetaProf;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public void setReTHUS(String reTHUS) {
        this.reTHUS = reTHUS;
    }
}
