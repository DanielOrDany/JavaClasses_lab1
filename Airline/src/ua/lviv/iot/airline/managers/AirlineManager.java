package ua.lviv.iot.airline.managers;


import java.util.List;

import ua.lviv.iot.airline.models.Airplane;
import ua.lviv.iot.airline.models.SortOrder;

public interface AirlineManager<A> {

	List<Airplane> sortByMaxSpeed(List<Airplane> list, SortOrder order);

	List<Airplane> sortByMaxDistance(List<Airplane> list, SortOrder order);

	int countSeats(A aircraft);

	double countMaxLoadCapacity(A aircraft);
 
}
