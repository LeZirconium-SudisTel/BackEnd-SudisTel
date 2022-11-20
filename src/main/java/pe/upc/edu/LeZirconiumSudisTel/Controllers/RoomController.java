package pe.upc.edu.LeZirconiumSudisTel.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Room;
import pe.upc.edu.LeZirconiumSudisTel.ServicesImpl.RoomServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rooms")

public class RoomController {
    @Autowired
    private RoomServiceImpl roomService;
    @PostMapping
    public void insert(@RequestBody Room r) {
        roomService.insert(r);
    }
    @GetMapping("/{id}")
    public Optional<Room> ListarPorId(@PathVariable("id") Integer id){
     return roomService.ListarPorId(id);
    }
    @GetMapping
    public List<Room> list(){
        return roomService.list();
    }
    @PutMapping
    public void actualizar(@RequestBody Room r) {
        roomService.insert(r);
    }
    @PostMapping("/buscar")
    public List<Room> buscarDisponible(@RequestBody Room r){
        return roomService.search(r.getAvailableRoom());
    }
}
