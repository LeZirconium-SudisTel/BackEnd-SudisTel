package pe.upc.edu.LeZirconiumSudisTel.Entities;
import javax.persistence.*;
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "username", length = 45, nullable = false)
    private String username;

    @Column(name = "email", length = 45, nullable = false)
    private String email;

    @Column(name = "User_type", length = 45, nullable = false)
    private String User_type;

    @Column(name = "Password", length = 45, nullable = false)
    private String Password;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser_type() {
        return User_type;
    }

    public void setUser_type(String user_type) {
        User_type = user_type;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;



    }
    public User(int id, String username, String email, String User_type, String Password) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.User_type = User_type;
        this.Password = Password;
    }

    public User() {

    }
}

