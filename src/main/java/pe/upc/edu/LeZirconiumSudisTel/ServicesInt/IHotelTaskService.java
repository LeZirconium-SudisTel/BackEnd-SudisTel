package pe.upc.edu.LeZirconiumSudisTel.ServicesInt;

import pe.upc.edu.LeZirconiumSudisTel.Entities.HotelTask;
import pe.upc.edu.LeZirconiumSudisTel.Entities.RespuestaHotelTask;

import java.util.List;
import java.util.Optional;

public interface IHotelTaskService {
    public void insert(HotelTask hotelTask);
    List<HotelTask> list();
    List<HotelTask> search(String status);

    public Optional<HotelTask> listarid(int id);

List<RespuestaHotelTask> buscarCantidadTareas();

List<HotelTask> buscarEnProceso();
}
