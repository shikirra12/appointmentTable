package com.example.appt.appointmentapp;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.*;

//import javax.servlet.http.HttpServlet;


//@WebServlet("/")
public class AppointmentController {

        public static final String databaseName = "appointment.db";
        public static final String connectionString = "jdbc:sqlite:D\\databases\\" + databaseName;

        public static final String appointmentsTable = "appointments";

        public static final String column_date = "date";
        public static final String column_time = "time";
        public static final String column_description = "description";

    @PostMapping("/makeAppt")
    public String appointmentDatabase (@RequestBody Appointment appointment){

    try {
        Connection connection = DriverManager.getConnection(connectionString);
        Statement statement = connection.createStatement();

        statement.execute("DROP TABLE IF EXISTS " + appointmentsTable);
        statement.execute("CREATE TABLE IF NOT EXISTS " + appointmentsTable +
                " (" + column_date + " text, " + column_time + " text, " + column_description + " text " + ")");

//        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        preparedStatement.setString(1, column_date);
//        preparedStatement.setString(2, column_time);
//        preparedStatement.setString(3, column_description);
//        preparedStatement.executeUpdate();

       String appointmentDate = appointment.getDate();
       String appointmentTime = appointment.getTime();
       String appointmentDescription = appointment.getDescriptionOfAppt();

       Appointment createNewAppointment = new Appointment();

       createNewAppointment.setDate(appointmentDate);
       createNewAppointment.setTime(appointmentTime);
       createNewAppointment.setDescriptionOfAppt(appointmentDescription);

        statement.execute("INSERT INTO appointments(date, time, description)" + "VALUES('2018-10-22', '11:30', 'stuff')");
        statement.execute("INSERT INTO appointments(date, time, description)" + "VALUES('" + appointmentDate + "', " + appointmentTime + ", '" + appointmentDescription + "')");

        ResultSet resultSet = statement.executeQuery("SELECT * FROM " + appointmentsTable);
        while (resultSet.next()){
            System.out.println(resultSet.getString(column_date) + "" +
                    resultSet.getString(column_time) + "" +
                    resultSet.getString(column_description));
        }

        statement.close();
        connection.close();

    } catch (SQLException e){
        System.out.println("Connection failed: " + e.getMessage());
        e.printStackTrace();
    }
        return "appt_page.html";
    }

    //	public void insert(String date, String time, String description) {
//		String sql = "INSERT INTO appointments VALUES(?, ?, ?)";
//
//		try {
//
//			PreparedStatement preparedStatement =
//		}
//	}
//    @RequestMapping("/makeAppt")
//    public String createAppt (@RequestParam(value ="date"), String date, @RequestParam(value="time"), String time, @RequestParam(value ="description"), String description, Model model) {
//        Appointment appointment = new Appointment();
//
//        appointment.setDate(date);
//        appointment.setTime(time);
//        appointment.setDescriptionOfAppt(description);
//    }
//    public void insert(String date, String time, String description) {
//        String sql = "INSERT INTO appointments VALUES(?, ?, ?)";
//
//        try {
//            Connection connection = this.connect();
//        }
//    }
}
