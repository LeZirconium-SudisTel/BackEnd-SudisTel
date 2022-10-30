package pe.upc.edu.LeZirconiumSudisTel.ServicesInt;

import pe.upc.edu.LeZirconiumSudisTel.Entities.Role;

import java.util.List;
public interface IRoleService {
    public void insertar(Role role);
    List<Role> list();
}
