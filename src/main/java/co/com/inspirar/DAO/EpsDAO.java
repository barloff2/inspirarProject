package co.com.inspirar.DAO;

import java.util.List;
import co.com.inspirar.modelo.Eps;
public interface EpsDAO {
    public List<Eps> mostrarEps() throws Exception;
    public void crearEps() throws Exception;
    public void editarEps() throws Exception;
}
