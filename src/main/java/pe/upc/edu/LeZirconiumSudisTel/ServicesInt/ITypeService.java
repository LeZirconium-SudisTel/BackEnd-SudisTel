package pe.upc.edu.LeZirconiumSudisTel.ServicesInt;

import pe.upc.edu.LeZirconiumSudisTel.Entities.Type;

import java.util.List;

public interface ITypeService {
    public void insertar(Type type);
    List<Type> list();
}
