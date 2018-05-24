package com.example.appt.appointmentapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class AppointmentController extends HttpServlet {

    protected void getPostInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String searchValue = request.getParameter("search");
        String apptDate = request.getParameter("date");
        String apptTime = request.getParameter("time");
        String apptDescription = request.getParameter("description");

        Appointment appointment = new Appointment();

        appointment.setDate(apptDate);
        appointment.setTime(apptTime);
        appointment.setDescriptionOfAppt(apptDescription);

        System.out.println("Search: " + searchValue);
        System.out.println("Date: " + apptDate);
        System.out.println("Time: " + apptTime);
        System.out.println("Description: " +apptDescription);
    }

    public static void writeIt (Appointment appointment){
        try{
            appointment.
        }
    }

//    @Autowired
//    AppointmentRepository appointmentRepository;

//    @PostMapping("/")
//    public String appointmentForm (@RequestBody Appointment appointment){
//
//        Date  apptDate = appointment.getDate();
//
//        Time  apptTime = appointment.getTime();
//
//        String apptDescription = appointment.getDescriptionOfAppt();
//
//        Appointment createNewAppointment = new Appointment();
//
//        createNewAppointment.setDate(apptDate);
//        createNewAppointment.setTime(apptTime);
//
//        appointmentRepository.add(createNewAppointment);
//
//        if (apptDate == null || apptTime == null || apptDescription == null){
//            return "please fill in each field";
//        } else if (){
//
//        }
//            return "new appointment was created";
//
//    }
//    Scanner scanner = new Scanner(System.in);

//    String searchInput = scanner.hasNext(#sear);


}
