package com.example.tcu.checkinpro.employees;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
public class employeeTrackEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer TrackId;
    private String checkInTime;
    private String checkOutTime;
    private LocalDate checkInDate;
    private String checkOutDate;
    private String checkInLocation;
    private String checkOutLocation;
    private String position;

    @ManyToOne
    @JoinColumn(name = "employeeId", referencedColumnName = "id", insertable = false, updatable = false)
    private employeeEntity employee;

    public employeeTrackEntity() {
    }

    public Integer getTrackId() {
        return TrackId;
    }

    public void setTrackId(Integer trackId) {
        TrackId = trackId;
    }

    public String getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(String checkInTime) {
        this.checkInTime = checkInTime;
    }

    public String getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getCheckInLocation() {
        return checkInLocation;
    }

    public void setCheckInLocation(String checkInLocation) {
        this.checkInLocation = checkInLocation;
    }

    public String getCheckOutLocation() {
        return checkOutLocation;
    }

    public void setCheckOutLocation(String checkOutLocation) {
        this.checkOutLocation = checkOutLocation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public employeeEntity getEmployee() {
        return employee;
    }

    public void setEmployee(employeeEntity employee) {
        this.employee = employee;
    }
}
