package pe.upc.edu.LeZirconiumSudisTel.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Employer;
import pe.upc.edu.LeZirconiumSudisTel.Repositories.IEmployerRepository;
import pe.upc.edu.LeZirconiumSudisTel.ServicesInt.IEmployerService;

import java.util.List;
import java.util.Optional;

@Service
public class EmployerServiceImpl implements IEmployerService{
    @Autowired
    private IEmployerRepository eR;
    @Override
    public void insert(Employer employer){
        eR.save(employer);
    }
    @Override
    public List<Employer> list(){
        return eR.findAll();
    }
    @Override
    public Optional<Employer> listarid(int idEmployer){return eR.findById(idEmployer);}
    @Override
    public void delete(int idEmployer){
        eR.deleteById(idEmployer);
    }
    @Override
    public List<Employer> search(String first_nameEmployer){return eR.buscarNombre(first_nameEmployer);
    }
}
