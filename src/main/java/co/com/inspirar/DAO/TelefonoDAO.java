package co.com.inspirar.DAO;


import co.com.inspirar.modelo.Telefono;

public interface TelefonoDAO {
    public Telefono mostrarTelefono() throws Exception;
    public void crearTelefono(Telefono telefono) throws Exception;
    public void editarTelefono() throws Exception;
    public int getIdTelefono(Telefono telefono) throws Exception;
}
