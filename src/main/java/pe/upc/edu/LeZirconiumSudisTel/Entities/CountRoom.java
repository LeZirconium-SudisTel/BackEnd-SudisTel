package pe.upc.edu.LeZirconiumSudisTel.Entities;

public class CountRoom {

    private String hotel;
    private String contador;

    public CountRoom(String hotel, String contador) {
        this.hotel = hotel;
        this.contador = contador;

    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getContador() {
        return contador;
    }

    public void setContador(String contador) {
        this.contador = contador;
    }

    public CountRoom() {
    }
}

