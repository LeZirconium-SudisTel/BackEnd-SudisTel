package pe.upc.edu.LeZirconiumSudisTel.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Room;

import java.util.List;

@Repository

public interface IRoomRepository extends JpaRepository<Room,Integer> {
    @Query("FROM Room r where r.availableRoom like %:avaiableRoom%")
    List<Room> buscarDisponible(@Param("availableRoom") String availableRoom);
}




