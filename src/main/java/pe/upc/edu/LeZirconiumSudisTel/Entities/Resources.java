package pe.upc.edu.LeZirconiumSudisTel.Entities;


import javax.persistence.*;

@Entity
@Table(name = "Resource")
public class Resources {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idResource;

    @Column(name = "nameResource", length = 25,nullable = false)
    private String nameResource;

    @Column(name = "typeResource", length = 25,nullable = false)
    private String typeResource;

    @Column(name = "stock", length = 25,nullable = false)
    private int stock;

    @Column(name = "status", length = 25,nullable = false)
    private String status;

    public Resources() {
    }

    public Resources(int idResource, String nameResource, String typeResource, int stock, String status) {
        this.idResource = idResource;
        this.nameResource = nameResource;
        this.typeResource = typeResource;
        this.stock = stock;
        this.status = status;
    }

    public int getIdResource() {
        return idResource;
    }

    public void setIdResource(int idResource) {
        this.idResource = idResource;
    }

    public String getNameResource() {
        return nameResource;
    }

    public void setNameResource(String nameResource) {
        this.nameResource = nameResource;
    }

    public String getTypeResource() {
        return typeResource;
    }

    public void setTypeResource(String typeResource) {
        this.typeResource = typeResource;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
