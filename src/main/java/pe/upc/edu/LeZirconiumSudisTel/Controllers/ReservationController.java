package pe.upc.edu.LeZirconiumSudisTel.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Employer;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Reservation;
import pe.upc.edu.LeZirconiumSudisTel.ServicesInt.IReservationService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    @Autowired
    private IReservationService rService;

    @GetMapping
    public List<Reservation> listar(){
        return rService.list();
    }

    @GetMapping("/{id}")
    public Optional<Reservation> ListarPorId(@PathVariable ("id") Integer id){return rService.ListarPorId(id);}

    @PostMapping
    public void registrar(@RequestBody Reservation r){
        rService.insert(r);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        rService.delete(id);
    }
}
