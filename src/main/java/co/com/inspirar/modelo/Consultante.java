package co.com.inspirar.modelo;

public class Consultante {
	private String identificacion = "";
    private String telefono = "";
    private String direccion = "";
    private String idEps = "";
    private String fechaNacimiento = "";
    private String nombres = "";
    private String apellidos = "";
    private String tipoDocument = "";
    private String sexo = "";
    private String genero = "";
    private String estadoCivil = "";
    private String escolaridad = "";
    private String ocupacion = "";

    public Consultante() {
    }

    public Consultante(String identificacion, String telefono, String direccion, String idEps, String fechaNacimiento,
            String nombres, String apellidos, String tipoDocument, String sexo, String genero, String estadoCivil,
            String escolaridad, String ocupacion) {
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.direccion = direccion;
        this.idEps = idEps;
        this.fechaNacimiento = fechaNacimiento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocument = tipoDocument;
        this.sexo = sexo;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.escolaridad = escolaridad;
        this.ocupacion = ocupacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getIdEps() {
        return idEps;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTipoDocument() {
        return tipoDocument;
    }

    public String getSexo() {
        return sexo;
    }

    public String getGenero() {
        return genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setIdEps(String idEps) {
        this.idEps = idEps;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setTipoDocument(String tipoDocument) {
        this.tipoDocument = tipoDocument;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
}
