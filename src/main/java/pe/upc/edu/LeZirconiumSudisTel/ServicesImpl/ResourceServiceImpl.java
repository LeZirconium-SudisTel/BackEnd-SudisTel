package pe.upc.edu.LeZirconiumSudisTel.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Resources;
import pe.upc.edu.LeZirconiumSudisTel.Repositories.IResourceRepository;
import pe.upc.edu.LeZirconiumSudisTel.ServicesInt.IResourceService;

import java.util.List;

@Service
public class ResourceServiceImpl implements IResourceService {

    @Autowired
    private IResourceRepository rR;
    @Override
    public void insert (Resources resources){
        rR.save(resources);
    }

    @Override
    public List<Resources> list(){
        return rR.findAll();
    }
}
