package pe.upc.edu.LeZirconiumSudisTel.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.LeZirconiumSudisTel.Entities.CreditCard;
import pe.upc.edu.LeZirconiumSudisTel.ServicesInt.ICreditCardService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("CreditCard")
public class CreditCardController {

    @Autowired
    private ICreditCardService ccService;

    @PostMapping
    public void registrar (@RequestBody CreditCard cc) {ccService.insert(cc);}

    @GetMapping
    public List<CreditCard> list() {return ccService.list();}

    @DeleteMapping("/{id}")
    public void eliminar (@PathVariable ("id") Integer id) {ccService.delete(id);}

    @GetMapping("/{id}")
    public Optional<CreditCard> listarid(@PathVariable ("id") Integer id) {return ccService.listarid(id);}
}
