package pe.upc.edu.LeZirconiumSudisTel.Entities;

import org.springframework.scheduling.support.SimpleTriggerContext;

import javax.persistence.*;

@Entity
@Table(name="HotelTasks")

public class HotelTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name",length = 20,nullable = false)
    private String name;
    @Column(name = "description",length = 45,nullable = false)
    private String description;
    @Column(name = "status",length = 20,nullable = false)
    private String status;

    public HotelTask() {
    }

    public HotelTask(int id, String name, String description, String status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
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
}
