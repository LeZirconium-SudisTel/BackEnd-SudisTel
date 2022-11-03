package pe.upc.edu.LeZirconiumSudisTel.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Hotel;
import pe.upc.edu.LeZirconiumSudisTel.Repositories.IHotelRepository;
import pe.upc.edu.LeZirconiumSudisTel.ServicesInt.IHotelService;

import java.util.List;

@Service
public class HotelServiceImpl implements IHotelService {
    @Autowired
    private IHotelRepository hR;
    @Override
    public void insert(Hotel hotel){
        hR.save(hotel);
    }
    @Override
    public List<Hotel> list() {
        return hR.findAll();
    }
    @Override
    public List<Hotel> search(String province) {
        return hR.buscarProvincia(province);
    }

}


 