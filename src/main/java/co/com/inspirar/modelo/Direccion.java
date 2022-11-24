package co.com.inspirar.modelo;

public class Direccion {
	private String nomenclatura = "";
    private String pais = "";
    private String ciudad = "";
    private String localidad = "";
    private String barrio = "";

    public Direccion() {
    }

    public Direccion(String nomenclatura, String pais, String ciudad, String localidad, String barrio) {
        this.nomenclatura = nomenclatura;
        this.pais = pais;
        this.ciudad = ciudad;
        this.localidad = localidad;
        this.barrio = barrio;
    }

    public String getNomenclatura() {
        return nomenclatura;
    }

    public void setNomenclatura(String nomenclatura) {
        this.nomenclatura = nomenclatura;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

}
