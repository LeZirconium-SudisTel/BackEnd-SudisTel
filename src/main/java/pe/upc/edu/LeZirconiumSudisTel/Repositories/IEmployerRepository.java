package pe.upc.edu.LeZirconiumSudisTel.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Employer;

import java.util.List;

@Repository
public interface IEmployerRepository extends JpaRepository<Employer,Integer>{
    @Query("FROM Employer e where e.first_nameEmployer like %:first_nameEmployer%")
    List<Employer> buscarNombre(@Param("first_nameEmployer") String first_namePropietario);
}
