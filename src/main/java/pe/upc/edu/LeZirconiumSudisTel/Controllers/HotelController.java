package pe.upc.edu.LeZirconiumSudisTel.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Hotel;
import pe.upc.edu.LeZirconiumSudisTel.ServicesInt.IHotelService;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private IHotelService hS;

    @GetMapping
    public List<Hotel> list(){
        return hS.list();
    }

    @PostMapping
    public void registrar(@RequestBody Hotel h){
        hS.insert(h);
    }
}
