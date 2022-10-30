package pe.upc.edu.LeZirconiumSudisTel.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.LeZirconiumSudisTel.Entities.CreditCard;
import pe.upc.edu.LeZirconiumSudisTel.Repositories.ICreditCardRepository;
import pe.upc.edu.LeZirconiumSudisTel.ServicesInt.ICreditCardService;

import java.util.List;

@Service
public class CreditCardImpl implements ICreditCardService {

    @Autowired
    private ICreditCardRepository ccr;

    @Override
    public void insert(CreditCard creditCard) {
        ccr.save(creditCard);
    }

    @Override
    public List<CreditCard> list(){
        return ccr.findAll();
    }

    @Override
    public void delete(int idCreditCard) {
        ccr.deleteById(idCreditCard);
    }
}
