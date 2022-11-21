package pe.upc.edu.LeZirconiumSudisTel.Entities;

public class RespuestaResource {
    private String tipo;
    private String cantidad;

    public RespuestaResource() {
    }

    public RespuestaResource(String tipo, String cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
