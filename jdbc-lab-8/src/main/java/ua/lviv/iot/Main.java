package ua.lviv.iot;

import ua.lviv.iot.manegers.AirlineConnector;
import ua.lviv.iot.models.CargoAircraft;
import ua.lviv.iot.models.PassengerAircraft;

public class Main {

	public static void main(String[] args) {
		PassengerAircraft olivia = new PassengerAircraft(120,16000,2000,500,1000,6);
		CargoAircraft antonov = new CargoAircraft(210,60000,1000,600,1200,9);
		
		AirlineConnector db = new AirlineConnector();
		db.createAirplane(antonov);
		db.createAirplane(olivia);
	}
}
