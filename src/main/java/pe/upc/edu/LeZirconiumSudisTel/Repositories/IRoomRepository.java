package pe.upc.edu.LeZirconiumSudisTel.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Room;
@Repository

public interface IRoomRepository extends JpaRepository<Room,Integer> {
}




