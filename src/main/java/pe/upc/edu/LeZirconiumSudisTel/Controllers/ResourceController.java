package pe.upc.edu.LeZirconiumSudisTel.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Resources;
import pe.upc.edu.LeZirconiumSudisTel.ServicesInt.IResourceService;

import java.util.List;
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
}
