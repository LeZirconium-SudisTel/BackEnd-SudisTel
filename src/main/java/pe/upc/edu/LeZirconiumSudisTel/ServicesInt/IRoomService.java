package pe.upc.edu.LeZirconiumSudisTel.ServicesInt;

import pe.upc.edu.LeZirconiumSudisTel.Entities.Room;

import java.util.List;
public interface IRoomService {
    public void insert(Room room);
    List<Room> list();
    List<Room> search(String availableRoom);

}
