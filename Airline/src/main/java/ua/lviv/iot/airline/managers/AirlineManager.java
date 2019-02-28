package ua.lviv.iot.airline.managers;

import java.util.LinkedList;
import java.util.List;
import ua.lviv.iot.airline.models.Airplane;
import ua.lviv.iot.airline.models.SortOrder;

public interface AirlineManager<A> {

	List<Airplane> getList();

	List<Airplane> sortByMaxSpeed(List<Airplane> list, SortOrder order);

	List<Airplane> sortByMaxDistance(List<Airplane> getlist2, SortOrder order);

	int countSeats(A aircraft);

	double countMaxLoadCapacity(A aircraft);

	void addAirplane(Airplane airplane);
	
	void clearAirplaneList();

	void printListOfAirplanes(String sortedBy);
	
	void setNewListOfAirplanes(LinkedList<Airplane> newList);
 
}
