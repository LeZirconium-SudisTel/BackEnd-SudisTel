package pe.upc.edu.LeZirconiumSudisTel.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.LeZirconiumSudisTel.Entities.User;
import pe.upc.edu.LeZirconiumSudisTel.ServicesImpl.UserServiceImpl;


import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceImpl userService;
    @PostMapping
    public void insert(@RequestBody User u) {userService.insert(u);
    }

    @PutMapping
    public void update(@RequestBody User u) {userService.insert(u);
    }
    @GetMapping
    public List<User> list(){
        return userService.list();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){ userService.delete(id); }
}
