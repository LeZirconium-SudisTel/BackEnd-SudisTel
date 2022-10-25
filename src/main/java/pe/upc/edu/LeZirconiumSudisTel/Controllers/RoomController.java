package pe.upc.edu.LeZirconiumSudisTel.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Room;
import pe.upc.edu.LeZirconiumSudisTel.ServicesImpl.RoomServiceImpl;

import java.util.List;
@RestController
@RequestMapping("Room")

public class RoomController {

    @Autowired
    private RoomServiceImpl rService;

    @PostMapping
    public void insert(@RequestBody Room r) {
       rService.insert(r);
    }
    @GetMapping
    public List<Room> list(){
        return rService.list();
    }
    @PutMapping
    public void actualizar (@RequestBody Room r) {
        rService.insert(r);
    }
    @PostMapping
    public List<Room> buscar (@RequestBody Room r) {return  rService.search(r.getAvailableRoom());}

}
