package co.com.inspirar.DAO;

import java.util.List;
import co.com.inspirar.modelo.Direccion;

public interface DireccionDAO {
    public List<Direccion> mostrarDireccion() throws Exception;

    public void crearDireccion() throws Exception;

    public void editarDireccion() throws Exception;
}
