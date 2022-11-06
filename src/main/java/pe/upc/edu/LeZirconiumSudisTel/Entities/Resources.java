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

    @ManyToOne
    @JoinColumn (name = "typeResource", nullable = false)
    private Type type;

    @Column(name = "stock", length = 25,nullable = false)
    private int stock;

    @Column(name = "status", length = 25,nullable = false)
    private String status;

    public Resources() { super();
    }

    public Resources(int idResource, String nameResource, Type type, int stock, String status) {
        this.idResource = idResource;
        this.nameResource = nameResource;
        this.type = type;
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
