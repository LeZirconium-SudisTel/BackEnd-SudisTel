package pe.upc.edu.LeZirconiumSudisTel.Entities;

import javax.persistence.*;

@Entity
@Table(name= "hotels")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", length = 45, nullable = false)
    private String name;
    @Column(name = "number_of_stars", nullable = false)
    private String number_of_stars;
    @Column(name = "average_price", nullable = false)
    private int average_price;
    @Column(name = "contact_number", nullable = false)
    private long contact_number;
    @Column(name = "province", length = 20, nullable = false)
    private String province;
    @Column(name = "address", length = 45, nullable = false)
    private String address;

    public Hotel() {
    }

    public Hotel(int id, String name, String number_of_stars, int average_price, long contact_number, String province, String address) {
        this.id = id;
        this.name = name;
        this.number_of_stars = number_of_stars;
        this.average_price = average_price;
        this.contact_number = contact_number;
        this.province = province;
        this.address = address;
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

    public String getNumber_of_stars() {
        return number_of_stars;
    }

    public void setNumber_of_stars(String number_of_stars) {
        this.number_of_stars = number_of_stars;
    }

    public int getAverage_price() {
        return average_price;
    }

    public void setAverage_price(int average_price) {
        this.average_price = average_price;
    }

    public long getContact_number() {
        return contact_number;
    }

    public void setContact_number(long contact_number) {
        this.contact_number = contact_number;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
