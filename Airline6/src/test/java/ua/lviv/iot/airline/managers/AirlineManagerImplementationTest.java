package ua.lviv.iot.airline.managers;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.util.LinkedList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.airline.models.Airplane;
import ua.lviv.iot.airline.models.CabinNarrow;
import ua.lviv.iot.airline.models.CargoAircraft;
import ua.lviv.iot.airline.models.ComfortLevel;
import ua.lviv.iot.airline.models.PassengerAircraft;
import ua.lviv.iot.airline.models.SortOrder;

@DisplayName("A special test case")
class AirlineManagerImplementationTest {
	static AirlineManager<Airplane> manager;
	LinkedList<Airplane> list;

	@BeforeAll
	public static void setUp() {
		manager = new AirlineManagerImplementation();
		manager.addAirplane(new PassengerAircraft("Boeing747", 120, 16000, 2000, 500, 1000, 6));
		manager.addAirplane(new CargoAircraft("Antonov", 510, 100000, 900, 900, 1200, 12));
		manager.addAirplane(new PassengerAircraft("Boeing777", 550, 90000, 950, 892, 1300, 9));
		
		File file = new File("D:\\Java\\Eclipse\\projects_java_eclipse\\Airline6\\airplanes.csv");
		AirlineWriter.writeToFile(manager.getList());
		assertTrue(file.exists());
	}

	@Test
	@DisplayName("Sort airplanes by maximum speed test in ascending")
	void testSortByMaxSpeedByAscendingInEachAircraft() {
		System.out.println("\nAscending-Sort by maximum speed:");
		manager.sortByMaxSpeed(manager.getList(),SortOrder.ASCENDING);
		Assertions.assertEquals(3, manager.getList().size());
		Assertions.assertEquals(500, manager.getList().get(0).getMaxSpeed());
		Assertions.assertEquals(892, manager.getList().get(1).getMaxSpeed());
		Assertions.assertEquals(900, manager.getList().get(2).getMaxSpeed());
		
	}

	@Test
	@DisplayName("Sort airplanes by maximum speed test in descending")
	void testSortByMaxSpeedByDescendingInEachAircraft() {
		System.out.println("\nDescending-Sort by maximum speed:");
		manager.sortByMaxSpeed(manager.getList(),SortOrder.DESCENDING);
		Assertions.assertEquals(3, manager.getList().size());
		Assertions.assertEquals(500, manager.getList().get(2).getMaxSpeed());
		Assertions.assertEquals(892, manager.getList().get(1).getMaxSpeed());
		Assertions.assertEquals(900, manager.getList().get(0).getMaxSpeed());
	}

	@Test
	@DisplayName("Sort airplanes by maximum distance test in ascending")
	void testSortByMaxDistanceByAscendingInEachAircraft() {
		System.out.println("\nAscending-Sort by maximum distance:");
		manager.sortByMaxDistance(manager.getList(),SortOrder.ASCENDING);
		Assertions.assertEquals(3, manager.getList().size());
		Assertions.assertEquals((double)900, manager.getList().get(0).getMaxDistance());
		Assertions.assertEquals((double)950, manager.getList().get(1).getMaxDistance());
		Assertions.assertEquals((double)2000, manager.getList().get(2).getMaxDistance());
	}

	@Test
	@DisplayName("Sort airplanes by maximum distance test in descending")
	void testSortByMaxDistanceByDescendingInEachAircraft() {
		System.out.println("\nDescending-Sort by maximum distance:");
		manager.sortByMaxDistance(manager.getList(),SortOrder.DESCENDING);
		Assertions.assertEquals(3, manager.getList().size());
		Assertions.assertEquals((double)900, manager.getList().get(2).getMaxDistance());
		Assertions.assertEquals((double)950, manager.getList().get(1).getMaxDistance());
		Assertions.assertEquals((double)2000, manager.getList().get(0).getMaxDistance());
		//manager.printListOfAirplanes("distance");
	}

	@AfterAll
	@DisplayName("Sort empty airplanes by maximum speed test in ascending")
	static void testSortEmptyListByMaxSpeedInEachAircraft() {
		System.out.println("\nEmpty EmptyListByMaxSpeed");
		manager.clearAirplaneList();
		Assertions.assertEquals(0, manager.getList().size());
	}

	@Test
	@DisplayName("Add null element to list of airplanes")
	void testListWithNewNullElement() {
		manager.addAirplane(null);
		Assertions.assertEquals(3, manager.getList().size());
	}

	@Test
	@DisplayName("Test PrintListOfAirplanes with null input parameter")
	void testPrintWithNullInputParameter() {
		Assertions.assertEquals(manager.printListOfAirplanes("speed"),"notNull");
	}

	@Test
	@DisplayName("Test countSeats(Airplane example)")
	void testCountSeats() {
		int result = manager.countSeats(new PassengerAircraft("Test", 333, 3000, 300, 300, 3200, 3));
		Assertions.assertEquals(result,333);
	}

	@Test
	@DisplayName("Test countSeats(null)")
	void testCountSeatsWithNullParameter() {
		int result = manager.countSeats(null);
		Assertions.assertEquals(result,0);
	}

	@Test
	@DisplayName("Test countSeatsWithNoneParameter()")
	void testCountSeatsWithNoneParameter() {
		int result = manager.countSeats(new PassengerAircraft());
		Assertions.assertEquals(result,0);
	}

	@Test
	@DisplayName("Test countMaxLoadCapacity(Airplane example)")
	void testCountMaxLoadCapacity() {
		double result = manager.countMaxLoadCapacity(new PassengerAircraft("Test", 333, 3000, 300, 300, 3200, 3));
		Assertions.assertEquals(result,3000);
	}

	@Test
	@DisplayName("Test countMaxLoadCapacity(null)")
	void testCountMaxLoadCapacityWithNullParameter() {
		double result = manager.countMaxLoadCapacity(null);
		Assertions.assertEquals(result,0.0);
	}

	@Test
	@DisplayName("Test countMaxLoadCapacity with none parameter")
	void testCountMaxLoadCapacityWithNoneParameter() {
		double result = manager.countMaxLoadCapacity(new CargoAircraft());
		Assertions.assertEquals(result,0);
	}

	@Test
	@DisplayName("Test Set New List Of Ariplanes")
	void testSetNewListOfAriplanes() {
		System.out.println("\n~Set New List Of Ariplanes~");
		manager = new AirlineManagerImplementation();
		list = new LinkedList<Airplane>();
		list.add(new PassengerAircraft("TestNewListItemAirplane1", 100, 10000, 1000, 110, 1001, 1));
		list.add(new CargoAircraft("TestNewListItemAirplane2", 200, 20000, 2000, 220, 2002, 2));
		list.add(new PassengerAircraft("TestNewListItemAirplane3", 300, 30000, 30000, 330, 3004, 3));
		manager.setNewListOfAirplanes(list);
		Assertions.assertEquals(3,manager.getList().size());
	}

	@Test
	@DisplayName("Check exist enum CabinNarrow")
	void testGetEnumCabinNarrow() {
		Assertions.assertFalse(CabinNarrow.FIVEABREAST==CabinNarrow.THREEBREAST);
	}

	@Test
	@DisplayName("Check exist enum ComfortLevel")
	void testGetEnumComfortLevel() {
		Assertions.assertFalse(ComfortLevel.BUSINESS==ComfortLevel.ECONOMY);
	}

}
