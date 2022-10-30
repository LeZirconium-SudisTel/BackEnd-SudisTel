package pe.upc.edu.LeZirconiumSudisTel.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.LeZirconiumSudisTel.Entities.Role;
import pe.upc.edu.LeZirconiumSudisTel.ServicesInt.IRoleService;

import java.util.List;
@RestController
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    private IRoleService rService;
    @PostMapping
    public void registrar(@RequestBody Role r) {
        rService.insertar(r);
    }
    @GetMapping
    public List<Role> listar() {
        return rService.list();
    }
}
