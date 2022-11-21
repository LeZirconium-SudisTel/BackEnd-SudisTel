package pe.upc.edu.LeZirconiumSudisTel.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import pe.upc.edu.LeZirconiumSudisTel.Entities.HotelTask;
import pe.upc.edu.LeZirconiumSudisTel.Entities.RespuestaHotelTask;
import pe.upc.edu.LeZirconiumSudisTel.ServicesInt.IHotelTaskService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hotel_tasks")

public class HotelTaskCotroller {
    @Autowired
    private IHotelTaskService tService;

    @PostMapping
    public void registrar(@RequestBody HotelTask t){
        tService.insert(t);
    }
    @GetMapping
    public List<HotelTask> listar(){
        return tService.list();
    }
    @PutMapping
    public void modificar(@RequestBody HotelTask t){
        tService.insert(t);
    }
    @PostMapping("/buscar")
    public List<HotelTask> buscar(@RequestBody HotelTask t) {return tService.search(t.getStatus());}
    @GetMapping("/{id}")
    public Optional<HotelTask> listarid(@PathVariable ("id") Integer id){return tService.listarid(id);}
    @GetMapping("/cantidadtarea")
    public List<RespuestaHotelTask> buscarCantidadTareas() { return tService.buscarCantidadTareas();}
    @GetMapping("/enproceso")
    public  List<HotelTask> buscarEnProceso() {return  tService.buscarEnProceso();}
}
