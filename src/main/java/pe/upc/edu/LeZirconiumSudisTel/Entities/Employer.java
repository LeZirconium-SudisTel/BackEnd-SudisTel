package pe.upc.edu.LeZirconiumSudisTel.Entities;

import javax.persistence.*;

@Entity
@Table(name="Employer")
public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmployer;
    @Column(name = "emailEmployer",length = 45,nullable = false)
    private String emailEmployer;
    @Column(name = "first_nameEmployer",length = 45,nullable = false)
    private String first_nameEmployer;
    @Column(name = "last_nameEmployer",length = 45,nullable = false)
    private String last_nameEmployer;
    @Column(name = "phone_numberEmployer",length = 9,nullable = false)
    private String phone_numberEmployer;
    @Column(name = "dniEmployer",length = 8,nullable = false)
    private int dniEmployer;
    @Column(name = "photoEmployer",length = 45,nullable = false)
    private String photoEmployer;
    @ManyToOne
    @JoinColumn(name = "idRole", nullable = false)
    private Role role;

    public Employer() {
        super();
    }

    public Employer(int idEmployer, String emailEmployer, String first_nameEmployer, String last_nameEmployer, String phone_numberEmployer, int dniEmployer, String photoEmployer, Role role) {
        this.idEmployer = idEmployer;
        this.emailEmployer = emailEmployer;
        this.first_nameEmployer = first_nameEmployer;
        this.last_nameEmployer = last_nameEmployer;
        this.phone_numberEmployer = phone_numberEmployer;
        this.dniEmployer = dniEmployer;
        this.photoEmployer = photoEmployer;
        this.role=role;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getIdEmployer() {
        return idEmployer;
    }

    public String getEmailEmployer() {
        return emailEmployer;
    }

    public String getFirst_nameEmployer() {
        return first_nameEmployer;
    }

    public String getLast_nameEmployer() {
        return last_nameEmployer;
    }

    public String getPhone_numberEmployer() {
        return phone_numberEmployer;
    }

    public int getDniEmployer() {
        return dniEmployer;
    }

    public String getPhotoEmployer() {
        return photoEmployer;
    }

    public void setIdEmployer(int idEmployer) {
        this.idEmployer = idEmployer;
    }

    public void setEmailEmployer(String emailEmployer) {
        this.emailEmployer = emailEmployer;
    }

    public void setFirst_nameEmployer(String first_nameEmployer) {
        this.first_nameEmployer = first_nameEmployer;
    }

    public void setLast_nameEmployer(String last_nameEmployer) {
        this.last_nameEmployer = last_nameEmployer;
    }

    public void setPhone_numberEmployer(String phone_numberEmployer) {
        this.phone_numberEmployer = phone_numberEmployer;
    }

    public void setDniEmployer(int dniEmployer) {
        this.dniEmployer = dniEmployer;
    }

    public void setPhotoEmployer(String photoEmployer) {
        this.photoEmployer = photoEmployer;
    }
}
