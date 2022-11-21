package pe.upc.edu.LeZirconiumSudisTel.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Resources;
import pe.upc.edu.LeZirconiumSudisTel.Entities.RespuestaResource;
import pe.upc.edu.LeZirconiumSudisTel.Repositories.IResourceRepository;
import pe.upc.edu.LeZirconiumSudisTel.ServicesInt.IResourceService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    @Override
    public Optional<Resources> listarid(int idResource) {return rR.findById(idResource);}

    @Override
    public List<Resources> buscarSinStock() {
        return rR.buscarSinStock();
    }

    @Override
    public List<RespuestaResource> buscarCantidadTipo() {
        List<RespuestaResource> lista= new ArrayList<>();
        rR.buscarCantidadTipo().forEach(y -> {
            RespuestaResource r = new RespuestaResource();
            r.setTipo(y[0]);
            r.setCantidad(y[1]);
            lista.add(r);
        });
        return lista;
    }

    @Override
    public List<Resources> search(String nameResource) { return rR.buscarNombre(nameResource);}

}
