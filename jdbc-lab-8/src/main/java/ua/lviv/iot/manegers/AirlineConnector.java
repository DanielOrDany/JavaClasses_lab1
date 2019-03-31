package ua.lviv.iot.manegers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import ua.lviv.iot.models.Airplane;
import ua.lviv.iot.models.CargoAircraft;

public class AirlineConnector {
	
	 public Airplane getAirplane() {

		 	Airplane airplane = null;

	        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/airplanes?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root",
	                "rooot")) {
	            Statement stmt = con.createStatement();
	            ResultSet rs = stmt.executeQuery("select * from airplanes");

	            if (rs.next()) {

	            	airplane = new CargoAircraft(0, 0.0, 0, 0, 0, 0);
	            	airplane.setSeatsNumber(rs.getInt(1));
	            	airplane.setMaxLoadCapacity(rs.getDouble(2));
	            	airplane.setMaxDistance(rs.getInt(3));
	            	airplane.setMaxSpeed(rs.getInt(4));
	            	airplane.setFlightRange(rs.getInt(5));
	            	airplane.setFuselageDiameter(rs.getInt(6));	            	
	            }

	        } catch (Exception exception) {
	            exception.printStackTrace();
	        }

	        return airplane;
	    }

	    public Airplane createAirplane(Airplane airplane) {

	        
	        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/airplanes?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "rooot")) {
	            Statement stmt = con.createStatement();
	            stmt.executeUpdate("INSERT INTO airplanes (seatsNumber, maxLoadCapacity, maxDistance, maxSpeed, flightRange, fuselageDiameter) "
	                    + " VALUES ("+airplane.getSeatsNumber()+","+airplane.getMaxLoadCapacity()+","+airplane.getMaxDistance()+","+airplane.getMaxSpeed()+","+airplane.getFlightRange()+","+airplane.getFuselageDiameter()+")");
	            System.out.println("+1");
	        } catch (Exception e) {
	            e.printStackTrace();	            
	        }
	        return airplane;
	    }
}
