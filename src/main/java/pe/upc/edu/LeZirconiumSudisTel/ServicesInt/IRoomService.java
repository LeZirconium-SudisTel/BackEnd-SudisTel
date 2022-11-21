package pe.upc.edu.LeZirconiumSudisTel.ServicesInt;

import pe.upc.edu.LeZirconiumSudisTel.Entities.CountRoom;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Room;

import java.util.List;
import java.util.Optional;

public interface IRoomService {
    public void insert(Room room);
    List<Room> list();
    List<Room> search(String availableRoom);
    public Optional<Room> ListarPorId(int id);

    List<Room> buscarEstado();

    List<CountRoom> searchCantidad();
}
