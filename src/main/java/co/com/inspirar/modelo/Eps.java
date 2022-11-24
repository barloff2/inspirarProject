package co.com.inspirar.modelo;

public class Eps {
    private String nombre = "";
    private String tipoRegimen = "";

    public Eps() {
    }

    public Eps(String nombre, String tipoRegimen) {
        this.nombre = nombre;
        this.tipoRegimen = tipoRegimen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoRegimen() {
        return tipoRegimen;
    }

    public void setTipoRegimen(String tipoRegimen) {
        this.tipoRegimen = tipoRegimen;
    }
}	
