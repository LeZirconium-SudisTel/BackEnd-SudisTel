package pe.upc.edu.LeZirconiumSudisTel.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Reservation;

public interface IReservationRepository extends JpaRepository<Reservation, Integer> {

}
