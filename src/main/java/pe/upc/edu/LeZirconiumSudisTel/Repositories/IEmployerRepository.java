package pe.upc.edu.LeZirconiumSudisTel.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Employer;

@Repository
public interface IEmployerRepository extends JpaRepository<Employer,Integer>{
}
