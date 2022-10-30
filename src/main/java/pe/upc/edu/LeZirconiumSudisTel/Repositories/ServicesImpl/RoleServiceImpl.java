package pe.upc.edu.LeZirconiumSudisTel.Repositories.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Role;
import pe.upc.edu.LeZirconiumSudisTel.Repositories.IRoleRepository;
import pe.upc.edu.LeZirconiumSudisTel.ServicesInt.IRoleService;

import java.util.List;
@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private IRoleRepository rR;
    @Override
    public void insertar(Role role){
        rR.save(role);
    }
    @Override
    public List<Role> list(){
        return rR.findAll();
    }
}
