package pe.upc.edu.LeZirconiumSudisTel.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Hotel;

import java.util.List;

@Repository
public interface IHotelRepository extends JpaRepository<Hotel, Integer> {
    @Query("FROM Hotel h where h.province like %:province%")
    List<Hotel> buscarProvincia(@Param("province") String province);
}
