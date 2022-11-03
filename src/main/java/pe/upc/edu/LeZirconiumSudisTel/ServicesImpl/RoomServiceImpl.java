package pe.upc.edu.LeZirconiumSudisTel.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Room;
import pe.upc.edu.LeZirconiumSudisTel.Repositories.IRoomRepository;
import pe.upc.edu.LeZirconiumSudisTel.ServicesInt.IRoomService;

import java.util.List;
@Service
public class RoomServiceImpl implements IRoomService {
        @Autowired
        private IRoomRepository rR;

        @Override
        public void insert(Room room) { rR.save(room);}

        @Override
        public List<Room> list() {return rR.findAll();}

        @Override
        public List<Room> search(String availableRoom) {
                return rR.buscarDisponible(availableRoom);
        }
}

