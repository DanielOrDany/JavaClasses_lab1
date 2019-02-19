import java.util.LinkedList;

import ua.lviv.iot.airline.managers.AirlineManager;
import ua.lviv.iot.airline.managers.AirlineManagerImplementation;
import ua.lviv.iot.airline.models.Airplane;
import ua.lviv.iot.airline.models.CargoAircraft;
import ua.lviv.iot.airline.models.PassengerAircraft;
import ua.lviv.iot.airline.models.SortOrder;

public class Main {
	public static void main(String[] args) {
		PassengerAircraft Boeing747 = new PassengerAircraft("Boeing747", 120, 16000, 2000, 500, 1000, 6);
		CargoAircraft Antonov = new CargoAircraft("Antonov", 510, 100000, 900, 900, 1200, 12);
		PassengerAircraft Boeing777 = new PassengerAircraft("Boeing777", 550, 90000, 950, 892, 1300, 9);
		LinkedList<Airplane> list = new LinkedList<Airplane>();
		list.add(Boeing747);
		list.add(Boeing777);
		list.add(Antonov);

		AirlineManager manager = new AirlineManagerImplementation();

		System.out.println("List elements (" + list.size() + "):");
		for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getName());
		}

		manager.sortByMaxSpeed(list, SortOrder.ASCENDING);

		System.out.println("\nSort by maximum speed - ascending:");
		for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getName() + " = " + list.get(i).getMaxSpeed());
		}

		manager.sortByMaxSpeed(list, SortOrder.DESCENDING);

		System.out.println("\nSort by maximum speed - descending:");
		for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getName() + " = " + list.get(i).getMaxSpeed());
		}

		manager.sortByMaxDistance(list, SortOrder.ASCENDING);

		System.out.println("\nSort by maximum speed - ascending:");
		for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getName() + " = " + list.get(i).getMaxDistance());
		}

		manager.sortByMaxDistance(list, SortOrder.DESCENDING);

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
