package pe.upc.edu.LeZirconiumSudisTel.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Reservation;
import pe.upc.edu.LeZirconiumSudisTel.Repositories.IReservationRepository;
import pe.upc.edu.LeZirconiumSudisTel.ServicesInt.IReservationService;

import java.util.List;

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
}
