package pe.upc.edu.LeZirconiumSudisTel.Entities;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "Type")
public class Type implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idType;

    @Column(name = "nameType", length = 25,nullable = false)
    private String nameType;

    public Type() {
    }

    public Type(int idType, String nameType) {
        this.idType = idType;
        this.nameType = nameType;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }
}
