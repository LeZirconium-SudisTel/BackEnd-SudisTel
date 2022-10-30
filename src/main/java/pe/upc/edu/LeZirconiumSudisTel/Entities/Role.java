package pe.upc.edu.LeZirconiumSudisTel.Entities;

import java.io.Serializable;
import javax.persistence.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Entity
@Table(name = "roles")
public class Role implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRole;
    @Column(name="name_Role",length = 60,nullable = false)
    private String name_Role;

    public Role() {}

    public Role(int idRole, String name_Role ) {
        this.idRole = idRole;
        this.name_Role = name_Role;
    }

    public int getIdRole() {
        return idRole;
    }

    public String getName_Role() {
        return name_Role;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public void setName_Role(String name_Role) {
        this.name_Role = name_Role;
    }
}
