package pe.upc.edu.LeZirconiumSudisTel.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.LeZirconiumSudisTel.Entities.CountRoom;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Room;
import pe.upc.edu.LeZirconiumSudisTel.Repositories.IRoomRepository;
import pe.upc.edu.LeZirconiumSudisTel.ServicesInt.IRoomService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

        @Override
        public Optional<Room> ListarPorId(int id) {
                return rR.findById(id);
        }

        @Override
        public List<Room> buscarEstado() {return rR.buscarEstado(); }


        public List<CountRoom> searchCantidad()  {
                List<CountRoom> lista= new ArrayList<>();
                rR.searchCantidad().forEach(y->{
                        CountRoom c= new CountRoom();
                        c.setHotel(y[0]);
                        c.setContador(y[1]);
                        lista.add(c);
                });
                return lista;
        }
}

