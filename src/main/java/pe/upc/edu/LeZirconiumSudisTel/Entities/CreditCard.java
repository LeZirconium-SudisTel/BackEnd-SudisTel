package pe.upc.edu.LeZirconiumSudisTel.Entities;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table (name = "CreditCard")
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCreditCard;

    @Column(name = "numberCard", nullable = false)
    private double numberCard;

    @Column(name = "ccv", nullable = false)
    private int ccv;

    @Column(name = "ExpireDate")
    private String ExpireDate;

    public CreditCard() {
    }

    public CreditCard(int idCreditCard, double numberCard, int ccv, String expireDate) {
        this.idCreditCard = idCreditCard;
        this.numberCard = numberCard;
        this.ccv = ccv;
        ExpireDate = expireDate;
    }

    public int getIdCreditCard() {
        return idCreditCard;
    }

    public void setIdCreditCard(int idCreditCard) {
        this.idCreditCard = idCreditCard;
    }

    public double getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(double numberCard) {
        this.numberCard = numberCard;
    }

    public int getCcv() {
        return ccv;
    }

    public void setCcv(int ccv) {
        this.ccv = ccv;
    }

    public String getExpireDate() {
        return ExpireDate;
    }

    public void setExpireDate(String expireDate) {
        ExpireDate = expireDate;
    }
}
