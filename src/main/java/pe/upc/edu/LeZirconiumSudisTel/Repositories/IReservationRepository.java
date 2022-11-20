package pe.upc.edu.LeZirconiumSudisTel.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Reservation;

import java.util.List;

public interface IReservationRepository extends JpaRepository<Reservation, Integer> {
    @Query(value = "SELECT cc.id_credit_card, count(r.id) from reservations r inner join credit_card cc on cc.id_credit_card = r.id_credit_card group by cc.id_credit_card", nativeQuery = true)
    List<String[]> buscarCantidadTarjetas();
}

