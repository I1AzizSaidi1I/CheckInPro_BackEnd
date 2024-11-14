package com.example.tcu.checkinpro.employees;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.List;

@Entity
public class employeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    private String name;

    @Column(unique = true)
    private String email;
    private String password;
    private String phone;
    private String department;
    private String status;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<employeeTrackEntity> tracks;


    public employeeEntity() {
    }

    public employeeEntity(String name, String email, String password, String phone, String department, String status) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.department = department;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<employeeTrackEntity> getTracks() {
        return tracks;
    }

    public void setTracks(List<employeeTrackEntity> tracks) {
        this.tracks = tracks;
    }
}
