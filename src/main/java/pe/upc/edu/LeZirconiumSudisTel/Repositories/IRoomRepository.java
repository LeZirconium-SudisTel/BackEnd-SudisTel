package pe.upc.edu.LeZirconiumSudisTel.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.upc.edu.LeZirconiumSudisTel.Entities.CountRoom;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Room;

import java.util.List;

@Repository

public interface IRoomRepository extends JpaRepository<Room,Integer> {

    @Query("FROM Room r WHERE r.availableRoom LIKE %:availableRoom%")
    List<Room> buscarDisponible(@Param("availableRoom") String availableRoom);

    @Query(value = "Select * from rooms r WHERE r.available_room like 'Disponible' ", nativeQuery = true)
    List<Room> buscarEstado();

    @Query(value = "select h.name, count(r.id_room) from rooms r inner join hotels h on r.id_hotel = h.id group by h.name ", nativeQuery = true)
    List<String[]> searchCantidad();
}




