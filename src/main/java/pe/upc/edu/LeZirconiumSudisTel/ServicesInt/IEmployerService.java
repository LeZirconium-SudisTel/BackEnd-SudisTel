package pe.upc.edu.LeZirconiumSudisTel.ServicesInt;

import pe.upc.edu.LeZirconiumSudisTel.Entities.Employer;
import pe.upc.edu.LeZirconiumSudisTel.Entities.RespuestaEmployer;

import java.util.List;
import java.util.Optional;

public interface IEmployerService {
    public void insert(Employer employer);
    List<Employer> list();
    public void delete(int idEmployer);
    List<Employer> search(String first_nameEmployer);
    public Optional<Employer> listarid(int idEmployer);
    List<Employer> buscarEmail(String correo);
    List<Employer> buscarDominio();
    List<RespuestaEmployer> buscarCantidadRoles();
}
