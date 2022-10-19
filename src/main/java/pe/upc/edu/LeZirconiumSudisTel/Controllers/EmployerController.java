package pe.upc.edu.LeZirconiumSudisTel.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Employer;
import pe.upc.edu.LeZirconiumSudisTel.ServicesInt.IEmployerService;

import java.util.List;
@RestController
@RequestMapping("/employers")
public class EmployerController {
    @Autowired
    private IEmployerService eService;

    @PostMapping
    public void registrar(@RequestBody Employer e){
        eService.insert(e);
    }
    @GetMapping
    public List<Employer> listar(){
        return eService.list();
    }
}
