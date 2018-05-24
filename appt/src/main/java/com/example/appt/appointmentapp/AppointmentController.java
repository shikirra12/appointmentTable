package com.example.appt.appointmentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.Time;
import java.util.Date;

@Controller
public class AppointmentController {

    @Autowired
    AppointmentRepository appointmentRepository;

    @PostMapping("/")
    public String appointmentForm (@RequestBody Appointment appointment){

        Date  apptDate = appointment.getDate();

        Time  apptTime = appointment.getTime();

        String apptDescription = appointment.getDescriptionOfAppt();

        Appointment createNewAppointment = new Appointment();

        createNewAppointment.setDate(apptDate);
        createNewAppointment.setTime(apptTime);

        appointmentRepository.add(createNewAppointment);

//        if (apptDate == null || apptTime == null || apptDescription == null){
//            return "please fill in each field";
//        } else if (){
//
//        }
            return "new appointment was created";

    }
}
