package pe.upc.edu.LeZirconiumSudisTel.Entities;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "idRoom", nullable = false)
    private Room room;

    @JsonSerialize(using = ToStringSerializer.class)
    @Column(name = "check_in", nullable = false)
    private String check_in;

    @JsonSerialize(using = ToStringSerializer.class)
    @Column(name = "check_out", nullable = false)
    private String check_out;

    @Column(name = "room_price" ,nullable = false)
    private int room_price;

    @Column(name = "payment_method",length = 20, nullable = false)
    private String payment_method;

    @ManyToOne
    @JoinColumn(name="id_credit_card")
    private CreditCard credit_card;


    public Reservation() {
        super();
    }

    public Reservation(int id, Room room, String check_in, String check_out, int room_price, String payment_method, CreditCard credit_card) {
        this.id = id;
        this.room = room;
        this.check_in = check_in;
        this.check_out = check_out;
        this.room_price = room_price;
        this.payment_method = payment_method;
        this.credit_card = credit_card;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getCheck_in() {
        return check_in;
    }

    public void setCheck_in(String check_in) {
        this.check_in = check_in;
    }

    public String getCheck_out() {
        return check_out;
    }

    public void setCheck_out(String check_out) {
        this.check_out = check_out;
    }

    public int getRoom_price() {
        return room_price;
    }

    public void setRoom_price(int room_price) {
        this.room_price = room_price;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public CreditCard getCredit_card() {
        return credit_card;
    }

    public void setCredit_card(CreditCard credit_card) {
        this.credit_card = credit_card;
    }
}
