package pe.upc.edu.LeZirconiumSudisTel.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Type;
import pe.upc.edu.LeZirconiumSudisTel.ServicesInt.ITypeService;

import java.util.List;

@RestController
@RequestMapping("/types")
public class TypeController {
    @Autowired
    private ITypeService tService;
    @PostMapping
    public void registrar(@RequestBody Type t) { tService.insertar(t);}
    @GetMapping
    public List<Type> listar() { return  tService.list(); }
}
