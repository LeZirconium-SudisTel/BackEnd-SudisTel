package pe.upc.edu.LeZirconiumSudisTel.Entities;

public class RespuestaReservation {
    private String credit_card;
    private String cantidad;

    public RespuestaReservation() {
    }

    public RespuestaReservation(String credit_card, String cantidad) {
        this.credit_card = credit_card;
        this.cantidad = cantidad;
    }

    public String getCredit_card() {
        return credit_card;
    }

    public void setCredit_card(String credit_card) {
        this.credit_card = credit_card;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
