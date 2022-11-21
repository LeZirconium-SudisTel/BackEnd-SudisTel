package pe.upc.edu.LeZirconiumSudisTel.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Reservation;
import pe.upc.edu.LeZirconiumSudisTel.Entities.RespuestaReservation;
import pe.upc.edu.LeZirconiumSudisTel.Repositories.IReservationRepository;
import pe.upc.edu.LeZirconiumSudisTel.ServicesInt.IReservationService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ReservationServiceImpl implements IReservationService {

    @Autowired
    private IReservationRepository rR;

    @Override
    public void insert(Reservation reservation) {
        rR.save(reservation);
    }

    @Override
    public List<Reservation> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int idReservation) {
        rR.deleteById(idReservation);
    }

    @Override
    public Optional<Reservation> ListarPorId(int idReservation) {
        return rR.findById(idReservation);
    }

    public List<RespuestaReservation> buscarCantidadTarjetas() {
        List<RespuestaReservation> lista = new ArrayList<>();
        rR.buscarCantidadTarjetas().forEach(y->{
            RespuestaReservation r=new RespuestaReservation();
            r.setCredit_card(y[0]);
            r.setCantidad(y[1]);
            lista.add(r);
        });
        return lista;
    }
}
