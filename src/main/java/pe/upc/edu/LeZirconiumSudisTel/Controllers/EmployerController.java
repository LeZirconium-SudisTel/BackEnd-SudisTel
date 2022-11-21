package pe.upc.edu.LeZirconiumSudisTel.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Employer;
import pe.upc.edu.LeZirconiumSudisTel.Entities.RespuestaEmployer;
import pe.upc.edu.LeZirconiumSudisTel.ServicesInt.IEmployerService;

import java.util.List;
import java.util.Optional;

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
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){ eService.delete(id); }
    @PutMapping
    public void modificar(@RequestBody Employer e) { eService.insert(e); }
    @PostMapping("/buscar")
    public List<Employer> buscar(@RequestBody Employer e) {return eService.search(e.getFirst_nameEmployer());}
    @GetMapping("/{id}")
    public Optional<Employer> listarid(@PathVariable ("id") Integer id){return eService.listarid(id);}
    @PostMapping("/buscaremail")
    public List<Employer> buscarEmail(@RequestBody String email){return eService.buscarEmail(email);}
    @GetMapping("/buscardominio")
    public List<Employer> buscarDominio(){return eService.buscarDominio();}
    @GetMapping("/cantidadroles")
    public List<RespuestaEmployer> buscarCantidadRoles(){
        return eService.buscarCantidadRoles();
    }
}
