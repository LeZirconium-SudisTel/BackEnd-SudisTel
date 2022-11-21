package pe.upc.edu.LeZirconiumSudisTel.ServicesInt;

import pe.upc.edu.LeZirconiumSudisTel.Entities.Reservation;
import pe.upc.edu.LeZirconiumSudisTel.Entities.RespuestaReservation;

import java.util.List;
import java.util.Optional;

public interface IReservationService {
    public void insert(Reservation reservation);
    List<Reservation> list();
    public void delete(int idReservation);
    public Optional<Reservation> ListarPorId(int idReservation);
    List<RespuestaReservation> buscarCantidadTarjetas();
}
