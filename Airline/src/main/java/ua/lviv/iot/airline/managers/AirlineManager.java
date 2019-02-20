package main.java.ua.lviv.iot.airline.managers;

import java.util.List;
import main.java.ua.lviv.iot.airline.models.Airplane;
import main.java.ua.lviv.iot.airline.models.CargoAircraft;
import main.java.ua.lviv.iot.airline.models.SortOrder;

public interface AirlineManager<A> {

	List<Airplane> sortByMaxSpeed(SortOrder order);

	List<Airplane> sortByMaxDistance(SortOrder order);

	int countSeats(A aircraft);

	double countMaxLoadCapacity(A aircraft);

	void addAircraft(CargoAircraft cargoaircraft);
 
}
