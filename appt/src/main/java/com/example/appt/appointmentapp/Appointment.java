package com.example.appt.appointmentapp;

public class Appointment {

    String date;

    String time;

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
