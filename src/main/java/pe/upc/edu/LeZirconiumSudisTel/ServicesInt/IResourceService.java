package pe.upc.edu.LeZirconiumSudisTel.ServicesInt;

import pe.upc.edu.LeZirconiumSudisTel.Entities.Resources;
import pe.upc.edu.LeZirconiumSudisTel.Entities.RespuestaResource;

import java.util.List;
import java.util.Optional;

public interface IResourceService {

    public void insert(Resources resources);
    List<Resources> list ();
    List<Resources> search(String nameResource);
    public Optional<Resources> listarid(int idResource);

    List<Resources> buscarSinStock();

    List<RespuestaResource> buscarCantidadTipo();
}
