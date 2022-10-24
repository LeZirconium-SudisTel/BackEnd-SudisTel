package pe.upc.edu.LeZirconiumSudisTel.ServicesInt;

import pe.upc.edu.LeZirconiumSudisTel.Entities.Resources;
import java.util.List;

public interface IResourceService {

    public void insert(Resources resources);

    List<Resources> list ();

    List<Resources> search(String nameResource);
}
