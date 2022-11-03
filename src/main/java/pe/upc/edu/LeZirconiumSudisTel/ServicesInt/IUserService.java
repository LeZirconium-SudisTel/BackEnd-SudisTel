package pe.upc.edu.LeZirconiumSudisTel.ServicesInt;

import pe.upc.edu.LeZirconiumSudisTel.Entities.User;

import java.util.List;

public interface IUserService {

        public void insert(User user);
        List<User> list();
        public void delete(int id);

}
