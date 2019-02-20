package main.ua.lviv.iot.airline.managers;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.ua.lviv.iot.airline.managers.AirlineManager;
import main.java.ua.lviv.iot.airline.managers.AirlineManagerImplementation;
import main.java.ua.lviv.iot.airline.models.Airplane;
import main.java.ua.lviv.iot.airline.models.SortOrder;

class AirlineManagerImplementationTest {

	private List<Airplane> airplane;
	
	private AirlineManager airlineManager;
	
	@BeforeEach
	public void setUp() {
		airlineManager = new AirlineManagerImplementation();
		//airlineManager.addAircraft(new main.java.ua.lviv.iot.airline.models.CargoAircraft("TEST_Aircraft_1", 100, 90070, 34449, 678,1460, 9));
		//airlineManager.addAircraft(new main.java.ua.lviv.iot.airline.models.CargoAircraft("TEST_Aircraft_2", 200, 70070, 14449, 278,1560, 6));
	}
	
	@Test
	void testsortByMaxSpeed() {
		List<Airplane> list = airlineManager.sortByMaxSpeed(SortOrder.ASCENDING);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName() + " = " + list.get(i).getMaxSpeed());
		}
		//Assertions.assertEquals(0, result.size());
		//Assertions.assertEquals(0, airlineManager.sortByMaxSpeed(SortOrder.ASCENDING).size());
		//Assertions.assertEquals(1, airlineManager.sortByMaxSpeed(SortOrder.ASCENDING).size());
		//Assertions.assertEquals(3, airlineManager.sortByMaxSpeed(SortOrder.ASCENDING).size());
		
	}
	
	@Test
	   public void testFindShipsWithNegativeTonnage() {
	       assertThrows(IllegalArgumentException.class,
	               () -> airlineManager.sortByMaxSpeed(SortOrder.ASCENDING),
	               "Expected doThing() to throw, but it didn't"); //text which will be shown in console, if sortByMaxSpeed crash
	   }

}
