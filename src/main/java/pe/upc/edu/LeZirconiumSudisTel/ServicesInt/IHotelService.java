package pe.upc.edu.LeZirconiumSudisTel.ServicesInt;

import pe.upc.edu.LeZirconiumSudisTel.Entities.Hotel;

import java.util.List;

public interface IHotelService {
    public void insert(Hotel hotel);
    List<Hotel> list();
    List<Hotel> search(String province);
}
