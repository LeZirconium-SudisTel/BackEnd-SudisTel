package pe.upc.edu.LeZirconiumSudisTel.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import pe.upc.edu.LeZirconiumSudisTel.Entities.User;


public interface IUserRepository extends JpaRepository<User, Integer>{
}
