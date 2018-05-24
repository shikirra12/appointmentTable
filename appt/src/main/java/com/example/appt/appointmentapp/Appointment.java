package com.example.appt.appointmentapp;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Table;
import java.sql.Time;
import java.util.Date;

@EntityScan
@Table(name = "appointments")
public class Appointment {

    @Column(name = "date", nullable = false)
    Date date;

    @Column(name = "time", nullable = false)
    Time time;

    @Column(name = "description", nullable = false)
    String descriptionOfAppt;

    public Appointment(){

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getDescriptionOfAppt() {
        return descriptionOfAppt;
    }

    public void setDescriptionOfAppt(String descriptionOfAppt) {
        this.descriptionOfAppt = descriptionOfAppt;
    }

}
