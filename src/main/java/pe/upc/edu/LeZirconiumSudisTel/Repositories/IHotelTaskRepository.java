package pe.upc.edu.LeZirconiumSudisTel.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.upc.edu.LeZirconiumSudisTel.Entities.HotelTask;

import java.util.List;

@Repository
public interface IHotelTaskRepository extends JpaRepository<HotelTask,Integer> {
    @Query("FROM HotelTask t where t.status like %:status%")
    List<HotelTask> buscarStatus(@Param("status") String status);
}
