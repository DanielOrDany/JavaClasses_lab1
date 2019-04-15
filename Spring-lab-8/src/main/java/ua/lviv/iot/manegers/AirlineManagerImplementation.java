package ua.lviv.iot.manegers;

import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.models.Airplane;

public class AirlineManagerImplementation implements AirlineManager<Object>{
	
	@Override
	public List<Airplane> sortByMaxSpeed(List<Airplane> list, boolean sortOrder) {
		if (sortOrder == true) {
			// ascending
			list.sort(Comparator.comparing(Airplane::getMaxSpeed));
		}else {
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
		}else {
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