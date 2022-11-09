package pe.upc.edu.LeZirconiumSudisTel.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.LeZirconiumSudisTel.Entities.HotelTask;
import pe.upc.edu.LeZirconiumSudisTel.Repositories.IHotelTaskRepository;
import pe.upc.edu.LeZirconiumSudisTel.ServicesInt.IHotelTaskService;

import java.util.List;
import java.util.Optional;
import java.util.Queue;
@Service
public class HotelTaskServiceImpl implements IHotelTaskService {
    @Autowired
    private IHotelTaskRepository tR;
    @Override
    public void insert(HotelTask hotelTask) {
        tR.save(hotelTask);

    }

    @Override
    public List<HotelTask> list() {
        return tR.findAll();
    }

    @Override
    public List<HotelTask> search(String status) {
        return tR.buscarStatus(status);
    }

    @Override
    public Optional<HotelTask> listarid(int id) {
        return tR.findById(id);
    }
}
