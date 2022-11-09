package pe.upc.edu.LeZirconiumSudisTel.Entities;

import org.springframework.scheduling.support.SimpleTriggerContext;

import javax.persistence.*;

@Entity
@Table(name="HotelTasks")

public class HotelTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name",length = 45,nullable = false)
    private String name;
    @Column(name = "description",length = 100,nullable = false)
    private String description;
    @Column(name = "status",length = 20,nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "idEmployer")
    private Employer employer;

    public HotelTask() {super();
    }

    public HotelTask(int id, String name, String description, String status, Employer employer) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.employer = employer;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
}
