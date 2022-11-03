package pe.upc.edu.LeZirconiumSudisTel.ServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.LeZirconiumSudisTel.Entities.User;
import pe.upc.edu.LeZirconiumSudisTel.Repositories.IUserRepository;
import pe.upc.edu.LeZirconiumSudisTel.ServicesInt.IUserService;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository uR;

    @Override
    public void insert(User user) {uR.save(user);}


    @Override
    public List<User> list() {return uR.findAll();}


    @Override
    public void delete(int id) {uR.deleteById(id);
    }
}

