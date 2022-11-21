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
    List<Employer> findByemailEmployer(String valor);
    @Query(value="SELECT * FROM employer e where e.email_employer like '%@gmail.com'", nativeQuery = true)
    List<Employer> buscarDominio();
    @Query(value = "SELECT r.name_role, count(e.id_employer) from employer e inner join roles r on e.id_role=r.id_role group by r.name_role",
            nativeQuery = true)
    List<String[]> buscarCantidadRoles();
}
