package pe.upc.edu.LeZirconiumSudisTel.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Resources;

@Repository
public interface IResourceRepository extends JpaRepository<Resources,Integer> {
}
