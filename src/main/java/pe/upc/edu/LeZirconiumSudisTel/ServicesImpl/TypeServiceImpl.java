package pe.upc.edu.LeZirconiumSudisTel.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Type;
import pe.upc.edu.LeZirconiumSudisTel.Repositories.ITypeRepository;
import pe.upc.edu.LeZirconiumSudisTel.ServicesInt.ITypeService;

import java.util.List;

@Service
public class TypeServiceImpl implements ITypeService {
    @Autowired
    private ITypeRepository tR;
    @Override
    public void insertar(Type type) { tR.save(type);}
    @Override
    public List<Type> list() {return tR.findAll();}
}
