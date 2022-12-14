package pe.upc.edu.LeZirconiumSudisTel.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Resources;

import java.util.List;

@Repository
public interface IResourceRepository extends JpaRepository<Resources,Integer> {
    //JPQL
    @Query("FROM Resources r where r.nameResource like %:nameResource%")
    List<Resources> buscarNombre(@Param("nameResource") String namePropietario);

    @Query(value = "select * from resource where status='Sin Stock'", nativeQuery = true)
    List<Resources> buscarSinStock();

    @Query(value = "select t.name_type, count (r.id_resource) from resource r left join type t on r.type_resource=t.id_type group by t.id_type", nativeQuery = true)
    List<String[]> buscarCantidadTipo();
}
