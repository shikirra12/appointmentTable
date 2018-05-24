package com.example.appt.appointmentapp;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Table;

@EntityScan
@Table(name = "appointments")
public class Appointment {

    @Column(name = "date", nullable = false)
    String date;

    @Column(name = "time", nullable = false)
    String time;

    @Column(name = "description", nullable = false)
    String descriptionOfAppt;

    public Appointment(String date, String time, String descriptionOfAppt){
        this.date = date;
        this.time = time;
        this.descriptionOfAppt = descriptionOfAppt;
    }

    public Appointment() {

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescriptionOfAppt() {
        return descriptionOfAppt;
    }

    public void setDescriptionOfAppt(String descriptionOfAppt) {
        this.descriptionOfAppt = descriptionOfAppt;
    }

}
