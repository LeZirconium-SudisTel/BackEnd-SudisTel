package pe.upc.edu.LeZirconiumSudisTel.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Role;

import java.util.List;
@Repository
public interface IRoleRepository extends JpaRepository<Role, Integer> {
    @Query("FROM Role r where r.name_Role like %:name_Role%")
    List<Role> buscarNombre(@Param("name_Role") String name_Role);
}
