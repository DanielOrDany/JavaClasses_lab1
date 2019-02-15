package managers.airline.iot.lviv.ua;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import models.airline.iot.lviv.ua.Airplane;
import models.airline.iot.lviv.ua.CargoAircraft;
import models.airline.iot.lviv.ua.PassengerAircraft;

public class AirlineManagerImplementation implements AirlineManager<Object> {
	public static void main(String[] args) {
		PassengerAircraft Boeing747 = new PassengerAircraft("Boeing747", 120, 16000, 2000, 500, 1000, 6);
		CargoAircraft Antonov = new CargoAircraft("Antonov", 510, 100000, 900, 900, 1200, 12);
		PassengerAircraft Boeing777 = new PassengerAircraft("Boeing777", 550, 90000, 950, 892, 1300, 9);
		LinkedList<Airplane> list = new LinkedList<Airplane>();
		list.add(Boeing747);
		list.add(Boeing777);
		list.add(Antonov);

		AirlineManagerImplementation manager = new AirlineManagerImplementation();

		System.out.println("List elements (" + list.size() + "):");
		for (int i = 0; i < list.size(); i++) {		
			if (list.get(i) instanceof Airplane) {
				System.out.println(list.get(i).getName());
			}
		}

		manager.sortByMaxSpeed(list, true);

		System.out.println("\nSort by maximum speed - ascending:");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Airplane) {
				System.out.println(list.get(i).getName() +" = " + list.get(i).getMaxSpeed());
			}
		}
		
		manager.sortByMaxSpeed(list, false);
		
		System.out.println("\nSort by maximum speed - descending:");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Airplane) {
				System.out.println(list.get(i).getName() +" = "  + list.get(i).getMaxSpeed());
			}
		}
		
		manager.sortByMaxDistance(list, true);
		
		System.out.println("\nSort by maximum speed - ascending:");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Airplane) {
				System.out.println(list.get(i).getName() +" = " + list.get(i).getMaxDistance());
			}
		}
		
		manager.sortByMaxDistance(list, false);
		
		System.out.println("\nSort by maximum speed - descending:");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Airplane) {
				System.out.println(list.get(i).getName() +" = " + list.get(i).getMaxDistance());
			}
		}
		
		System.out.println("\nCount seats:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName()+" = "+manager.countSeats(list.get(i)));
		}
	
		System.out.println("\nCount maximum load capacity:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName()+" = "+manager.countMaxLoadCapacity(list.get(i)));
		}
	}

	@Override
	public List<Airplane> sortByMaxSpeed(List<Airplane> list, boolean sortOrder) {
		if (sortOrder == true) {
			// ascending
			list.sort(Comparator.comparing(Airplane::getMaxSpeed));
		} else {
			// descending
			list.sort(Comparator.comparing(Airplane::getMaxSpeed).reversed());
		}
		return list;
	}

	@Override
	public List<Airplane> sortByMaxDistance(List<Airplane> list, boolean sortOrder) {
		if (sortOrder == true) {
			// ascending
			list.sort(Comparator.comparing(Airplane::getMaxDistance));
		} else {
			// descending
			list.sort(Comparator.comparing(Airplane::getMaxDistance).reversed());
		}
		return list;
	}

	@Override
	public int countSeats(Object aircraft) {
		return ((Airplane) aircraft).getSeatsNumber();
	}

	@Override
	public double countMaxLoadCapacity(Object aircraft) {
		return ((Airplane) aircraft).getMaxLoadCapacity();
	}

}
