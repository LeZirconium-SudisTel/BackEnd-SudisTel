package pe.upc.edu.LeZirconiumSudisTel.ServicesInt;

import pe.upc.edu.LeZirconiumSudisTel.Entities.Reservation;

import java.util.List;

public interface IReservationService {

    public void insert(Reservation reservation);
    List<Reservation> list();
    public void delete(int idReservation);
}
