package pe.upc.edu.LeZirconiumSudisTel.Entities;

public class RespuestaEmployer {
    private String role;
    private String cantidad;

    public RespuestaEmployer() {
    }

    public RespuestaEmployer(String role, String cantidad) {
        this.role = role;
        this.cantidad = cantidad;
    }

    public String getRole() {
        return role;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
