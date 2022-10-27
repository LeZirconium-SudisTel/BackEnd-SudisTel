package pe.upc.edu.LeZirconiumSudisTel.Entities;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="reservations")
public class Reservation {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "idRoom", nullable = false)
    private Room room;

    @JsonSerialize(using = ToStringSerializer.class)
    @Column(name = "check_in", nullable = false)
    private Date check_in;

    @JsonSerialize(using = ToStringSerializer.class)
    @Column(name = "check_out", nullable = false)
    private Date check_out;

    @Column(name = "room_price" ,nullable = false)
    private int room_price;

    @Column(name = "status",length = 20,nullable = false)
    private String status;

    public Reservation() {
        super();
    }

    public Reservation(int id, Room room, Date check_in, Date check_out, int room_price, String status) {
        this.id = id;
        this.room = room;
        this.check_in = check_in;
        this.check_out = check_out;
        this.room_price = room_price;
        this.status = status;
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

    public Date getCheck_in() {
        return check_in;
    }

    public void setCheck_in(Date check_in) {
        this.check_in = check_in;
    }

    public Date getCheck_out() {
        return check_out;
    }

    public void setCheck_out(Date check_out) {
        this.check_out = check_out;
    }

    public int getRoom_price() {
        return room_price;
    }

    public void setRoom_price(int room_price) {
        this.room_price = room_price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
