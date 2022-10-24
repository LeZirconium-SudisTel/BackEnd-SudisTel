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
}
