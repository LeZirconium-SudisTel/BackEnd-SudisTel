package pe.upc.edu.LeZirconiumSudisTel.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.upc.edu.LeZirconiumSudisTel.Entities.HotelTask;

@Repository
public interface IHotelTaskRepository extends JpaRepository<HotelTask,Integer> {
}
