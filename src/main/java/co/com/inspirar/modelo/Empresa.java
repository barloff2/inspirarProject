package co.com.inspirar.modelo;

public class Empresa {
	private String nit = "";
    private String telefono = "";
    private String direccion = "";
    private String nombre = "";
    private String correo = "";

    public Empresa() {

    }

    public Empresa(String nit, String telefono,
            String direccion, String nombre, String correo) {
        this.nit = nit;
        this.telefono = telefono;
        this.direccion = direccion;
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNit() {
        return nit;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
