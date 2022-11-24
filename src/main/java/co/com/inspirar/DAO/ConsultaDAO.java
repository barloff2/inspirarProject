package co.com.inspirar.DAO;

import java.util.List;

import co.com.inspirar.modelo.Consulta;
public interface ConsultaDAO {
    public List<Consulta> mostrarConsulta() throws Exception;
    public void crearConsulta() throws Exception;
    public void editarConsulta() throws Exception;
}
