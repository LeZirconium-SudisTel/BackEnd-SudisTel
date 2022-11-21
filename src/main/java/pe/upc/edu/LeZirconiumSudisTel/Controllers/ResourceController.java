package pe.upc.edu.LeZirconiumSudisTel.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Resources;
import pe.upc.edu.LeZirconiumSudisTel.Entities.RespuestaResource;
import pe.upc.edu.LeZirconiumSudisTel.ServicesInt.IResourceService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/resources")
public class ResourceController {
    @Autowired
    private IResourceService rResource;

    @PostMapping
    public void registrar(@RequestBody Resources r){
        rResource.insert(r);
    }
    @GetMapping
    public List<Resources> list(){
        return rResource.list();
    }

    @PutMapping
    public void modificar(@RequestBody Resources r) {rResource.insert(r);}
    @PostMapping("/buscar")
    public List<Resources> buscar(@RequestBody Resources r) {return rResource.search(r.getNameResource());}
    @GetMapping("/{id}")
    public Optional<Resources> listarid(@PathVariable ("id") Integer id) {return rResource.listarid(id);}

    @GetMapping("/sinstock")
    public List<Resources> buscarSinStock() {return rResource.buscarSinStock();}

    @GetMapping("/cantidadtipo")
    public List<RespuestaResource> buscarCantidadTipo() { return rResource.buscarCantidadTipo();}
}
