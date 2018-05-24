package com.example.appt.appointmentapp;

import org.springframework.stereotype.Repository;

import java.util.List;

public interface AppointmentRepository extends Repository {
    void add(Appointment appointment);
    List<Appointment> get();
    void save(Appointment appointment);

}
