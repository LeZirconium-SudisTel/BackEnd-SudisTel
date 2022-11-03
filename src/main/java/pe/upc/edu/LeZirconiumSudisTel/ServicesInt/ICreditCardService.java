package pe.upc.edu.LeZirconiumSudisTel.ServicesInt;

import pe.upc.edu.LeZirconiumSudisTel.Entities.CreditCard;

import java.util.List;

public interface ICreditCardService {
    public void insert(CreditCard creditCard);

    List<CreditCard> list();

    public void delete(int idCreditCard);
}
