package co.com.inspirar.DAO;

import java.util.List;
import co.com.inspirar.modelo.Empresa;
public interface EmpresaDAO {
    public List<Empresa> mostrarEmpresa() throws Exception;
    public void crearEmpresa() throws Exception;
    public void editarEmpresa() throws Exception;
}
