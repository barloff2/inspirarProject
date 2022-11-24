package co.com.inspirar.DAO;

import java.util.List;
import co.com.inspirar.modelo.Consultante;

public interface ConsultanteDAO {
    public List<Consultante> mostrarConsultante() throws Exception;
    public void crearConsultante() throws Exception;
    public void editarConsultante() throws Exception;

}
