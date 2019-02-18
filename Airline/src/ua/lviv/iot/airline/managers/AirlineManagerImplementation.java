package ua.lviv.iot.airline.managers;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.airline.models.Airplane;
import ua.lviv.iot.airline.models.SortOrder;


public class AirlineManagerImplementation implements AirlineManager<Airplane> {	
	@Override
	public List<Airplane> sortByMaxSpeed(List<Airplane> list, SortOrder order) {
		if (order == SortOrder.ASCENDING) {
			list.sort(Comparator.comparing(Airplane::getMaxSpeed));
		} else {
			Collections.reverse(list);
		}
		return list;
	}

	@Override
	public List<Airplane> sortByMaxDistance(List<Airplane> list, SortOrder order) {
		if (order == SortOrder.ASCENDING) {
			list.sort(Comparator.comparing(Airplane::getMaxDistance));
		} else {		
			Collections.reverse(list);
		}
		return list;
	}

	@Override
	public int countSeats(Airplane aircraft) {
		return (aircraft).getSeatsNumber();
	}

	@Override
	public double countMaxLoadCapacity(Airplane aircraft) {
		return (aircraft).getMaxLoadCapacity();
	}

}
