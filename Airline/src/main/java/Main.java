package main.java;

import java.util.LinkedList;
import main.java.ua.lviv.iot.airline.managers.AirlineManager;
import main.java.ua.lviv.iot.airline.managers.AirlineManagerImplementation;
import main.java.ua.lviv.iot.airline.models.Airplane;
import main.java.ua.lviv.iot.airline.models.CargoAircraft;
import main.java.ua.lviv.iot.airline.models.PassengerAircraft;
import main.java.ua.lviv.iot.airline.models.SortOrder;

public class Main {
	public static void main(String[] args) {
		AirlineManager<Airplane> manager = new AirlineManagerImplementation();
		AirlineManagerImplementation listManager = new AirlineManagerImplementation();
		PassengerAircraft boeing747 = new PassengerAircraft("Boeing747", 120, 16000, 2000, 500, 1000, 6);
		CargoAircraft antonov = new CargoAircraft("Antonov", 510, 100000, 900, 900, 1200, 12);
		PassengerAircraft boeing777 = new PassengerAircraft("Boeing777", 550, 90000, 950, 892, 1300, 9);
		
		LinkedList<Airplane> list = listManager.getList();
		list.add(boeing747);
		list.add(boeing777);
		list.add(antonov);

		System.out.println("List elements (" + list.size() + "):");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());

		}

		manager.sortByMaxSpeed( SortOrder.ASCENDING);

		System.out.println("\nSort by maximum speed - ascending:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName() + " = " + list.get(i).getMaxSpeed());

		}

		manager.sortByMaxSpeed( SortOrder.DESCENDING);

		System.out.println("\nSort by maximum speed - descending:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName() + " = " + list.get(i).getMaxSpeed());

		}

		manager.sortByMaxDistance( SortOrder.ASCENDING);

		System.out.println("\nSort by maximum speed - ascending:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName() + " = " + list.get(i).getMaxDistance());

		}

		manager.sortByMaxDistance( SortOrder.DESCENDING);

		System.out.println("\nSort by maximum speed - descending:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName() + " = " + list.get(i).getMaxDistance());

		}

		System.out.println("\nCount seats:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName() + " = " + manager.countSeats(list.get(i)));
		}

		System.out.println("\nCount maximum load capacity:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName() + " = " + manager.countMaxLoadCapacity(list.get(i)));
		}

	}
}