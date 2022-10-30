package pe.upc.edu.LeZirconiumSudisTel.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.upc.edu.LeZirconiumSudisTel.Entities.CreditCard;

public interface ICreditCardRepository extends JpaRepository<CreditCard,Integer> {
}
