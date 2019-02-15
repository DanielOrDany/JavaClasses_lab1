package managers.airline.iot.lviv.ua;

import java.util.LinkedList;
import java.util.List;

import models.airline.iot.lviv.ua.Airplane;



public interface AirlineManager <A>{
	LinkedList<Airplane> list = new LinkedList<Airplane>(); 
	List<Airplane> sortByMaxSpeed(List<Airplane> list, boolean sortOrder);
	List<Airplane> sortByMaxDistance(List<Airplane> list, boolean sortOrder);
	int countSeats(Object aircraft);
	double countMaxLoadCapacity(Object aircraft);
	
	
}
