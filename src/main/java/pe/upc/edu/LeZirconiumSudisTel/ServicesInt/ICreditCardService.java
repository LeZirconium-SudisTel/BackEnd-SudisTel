package pe.upc.edu.LeZirconiumSudisTel.ServicesInt;

import pe.upc.edu.LeZirconiumSudisTel.Entities.CreditCard;


import java.util.List;
import java.util.Optional;

public interface ICreditCardService {
    public void insert(CreditCard creditCard);

    List<CreditCard> list();

    public void delete(int idCreditCard);

    public Optional<CreditCard> listarid(int idCreditCard);

}
