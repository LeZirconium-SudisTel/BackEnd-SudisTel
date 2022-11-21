package pe.upc.edu.LeZirconiumSudisTel.Entities;

import javax.persistence.*;
@Entity
@Table(name = "rooms")
public class Room {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int idRoom;
    @Column(name = "numberRoom", length = 45, nullable = false)
    private int numberRoom;
    @Column(name = "availableRoom", length = 45, nullable = false)
    private String availableRoom;
    @ManyToOne
    @JoinColumn(name="idHotel", nullable = false)
    private Hotel hotel;

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }

    public String getAvailableRoom() {
        return availableRoom;
    }

    public void setAvailableRoom(String availableRoom) {
        this.availableRoom = availableRoom;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Room(int idRoom, int numberRoom, String availableRoom, Hotel hotel) {
        this.idRoom = idRoom;
        this.numberRoom = numberRoom;
        this.availableRoom = availableRoom;
        this.hotel = hotel;
    }

    public Room() {
    }
}



    