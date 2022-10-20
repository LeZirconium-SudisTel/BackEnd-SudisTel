package pe.upc.edu.LeZirconiumSudisTel.ServicesInt;

import pe.upc.edu.LeZirconiumSudisTel.Entities.Employer;

import java.util.List;

public interface IEmployerService {
    public void insert(Employer employer);
    List<Employer> list();
}
