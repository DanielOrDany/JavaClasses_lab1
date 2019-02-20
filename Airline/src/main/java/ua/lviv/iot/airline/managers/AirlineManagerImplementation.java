package main.java.ua.lviv.iot.airline.managers;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import main.java.ua.lviv.iot.airline.models.Airplane;
import main.java.ua.lviv.iot.airline.models.CargoAircraft;
import main.java.ua.lviv.iot.airline.models.SortOrder;

public class AirlineManagerImplementation implements AirlineManager<Airplane> {
	private LinkedList<Airplane> list = new LinkedList<Airplane>();
	
	@Override
	public List<Airplane> sortByMaxSpeed( SortOrder order) {
		if (list == null) {
			
		}else {
			if (order == SortOrder.ASCENDING) {			
				list.sort(Comparator.comparing(Airplane::getMaxSpeed));			
			} else {
				Collections.reverse(list);
			}
		}
		return list;
	}

	@Override
	public List<Airplane> sortByMaxDistance( SortOrder order) {
		if (order == SortOrder.ASCENDING) {
			list.sort(Comparator.comparing(Airplane::getMaxDistance));
		} else {		
			Collections.reverse(list);
		}
		return list;
	}

	@Override
	public int countSeats(Airplane aircraft) {
		return aircraft.getSeatsNumber();
	}

	@Override
	public double countMaxLoadCapacity(Airplane aircraft) {
		return aircraft.getMaxLoadCapacity();
	}

	public LinkedList<Airplane> getList() {
		return list;
	}

	public void setList(LinkedList<Airplane> list) {
		this.list = list;
	}

	@Override
	public void addAircraft(CargoAircraft cargoaircraft) {
		list.add(cargoaircraft);
		
	}

}
