package com.example.appt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class ApptApplication {
	public static final String databaseName = "appointment.db";
	public static final String connectionString = "jdbc:sqlite:D\\databases\\" + databaseName;

	public static final String appointmentsTable = "appointments";

	public static final String column_date = "date";
	public static final String column_time = "time";
	public static final String column_description = "description";


	public static void main(String[] args) {
		SpringApplication.run(ApptApplication.class, args);
		try {
			Connection connection = DriverManager.getConnection(connectionString);
			Statement statement = connection.createStatement();

			statement.execute("DROP TABLE IF EXISTS " + appointmentsTable);
			statement.execute("CREATE TABLE IF NOT EXISTS " + appointmentsTable +
									" (" + column_date + " text, " + column_time + " text, " + column_description + " text " + ")");


			statement.execute("INSERT INTO appointments(date, time, description)" + "VALUES('2018-10-22', '11:30', 'stuff')");

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
	}
}
