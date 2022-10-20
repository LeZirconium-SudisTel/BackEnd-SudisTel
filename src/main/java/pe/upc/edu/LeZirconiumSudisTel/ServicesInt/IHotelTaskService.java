package pe.upc.edu.LeZirconiumSudisTel.ServicesInt;

import pe.upc.edu.LeZirconiumSudisTel.Entities.HotelTask;

import java.util.List;

public interface IHotelTaskService {
    public void insert(HotelTask hotelTask);
    List<HotelTask> list();
}
