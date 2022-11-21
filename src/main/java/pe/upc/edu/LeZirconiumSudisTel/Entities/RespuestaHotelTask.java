package pe.upc.edu.LeZirconiumSudisTel.Entities;

public class RespuestaHotelTask {
    private String nombre;
    private String cantidad;


    public RespuestaHotelTask(String nombre, String cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public RespuestaHotelTask() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
