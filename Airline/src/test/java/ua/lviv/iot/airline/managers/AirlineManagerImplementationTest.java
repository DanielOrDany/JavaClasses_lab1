package ua.lviv.iot.airline.managers;

import java.util.LinkedList;

import org.junit.jupiter.api.AfterAll;
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
	}

	@Test
	@DisplayName("Sort airplanes by maximum speed test in ascending")
	void testSortByMaxSpeedByAscendingInEachAircraft() {
		System.out.println("\nAscending-Sort by maximum speed:");
		manager.sortByMaxSpeed(manager.getList(),SortOrder.ASCENDING);
		if(manager.getList().get(0).getMaxSpeed()<manager.getList().get(1).getMaxSpeed()) {
			System.out.println("Sort is ascending!");
		} else {
			System.out.println("Sort is not ascending!");
		}
		//manager.printListOfAirplanes("speed");
	}

	@Test
	@DisplayName("Sort airplanes by maximum speed test in descending")
	void testSortByMaxSpeedByDescendingInEachAircraft() {
		System.out.println("\nDescending-Sort by maximum speed:");
		manager.sortByMaxSpeed(manager.getList(),SortOrder.DESCENDING);
		if(manager.getList().get(0).getMaxSpeed()>manager.getList().get(1).getMaxSpeed()) {
			System.out.println("Sort is descending!");
		} else {
			System.out.println("Sort is not descending!");
		}
		//manager.printListOfAirplanes("speed");
	}

	@Test
	@DisplayName("Sort airplanes by maximum distance test in ascending")
	void testSortByMaxDistanceByAscendingInEachAircraft() {
		System.out.println("\nAscending-Sort by maximum distance:");
		manager.sortByMaxDistance(manager.getList(),SortOrder.ASCENDING);
		if(manager.getList().get(0).getMaxDistance()<manager.getList().get(1).getMaxDistance()) {
			System.out.println("Sort is ascending!");
		} else {
			System.out.println("Sort is not ascending!");
		}
		//manager.printListOfAirplanes("distance");
	}

	@Test
	@DisplayName("Sort airplanes by maximum distance test in descending")
	void testSortByMaxDistanceByDescendingInEachAircraft() {
		System.out.println("\nDescending-Sort by maximum distance:");
		manager.sortByMaxDistance(manager.getList(),SortOrder.DESCENDING);
		if(manager.getList().get(0).getMaxDistance()>manager.getList().get(1).getMaxDistance()) {
			System.out.println("Sort is desscending!");
		}else {
			System.out.println("Sort is not descending!");
		}
		//manager.printListOfAirplanes("distance");
	}

	@AfterAll
	@DisplayName("Sort empty airplanes by maximum speed test in ascending")
	static void testSortEmptyListByMaxSpeedInEachAircraft() {
		System.out.println("\nEmpty EmptyListByMaxSpeed");
		manager.clearAirplaneList();
		manager.sortByMaxSpeed(manager.getList(),SortOrder.ASCENDING);
		manager.printListOfAirplanes("speed");
		manager.sortByMaxSpeed(manager.getList(),SortOrder.DESCENDING);
		manager.printListOfAirplanes("speed");
	}

	@AfterAll
	@DisplayName("Sort empty airplanes by maximum distance test in descending")
	static void testSortEmptyListByMaxDistanceInEachAircraft() {
		System.out.println("\nEmpty EmptyListByMaxDistance");
		manager.clearAirplaneList();
		manager.sortByMaxDistance(manager.getList(),SortOrder.ASCENDING);
		manager.printListOfAirplanes("distance");
		manager.sortByMaxDistance(manager.getList(),SortOrder.DESCENDING);
		manager.printListOfAirplanes("distance");
	}

	@Test
	@DisplayName("Add null element to list of airplanes")
	void testListWithNewNullElement() {
		manager.addAirplane(null);
	}

	@Test
	@DisplayName("Test PrintListOfAirplanes with null input parameter")
	void testPrintWithNullInputParameter() {
		manager.printListOfAirplanes(null);
	}

	@Test
	@DisplayName("Test countSeats(Airplane example)")
	void testCountSeats() {
		int result = manager.countSeats(new PassengerAircraft("Test", 333, 3000, 300, 300, 3200, 3));
		System.out.println("\nCount Seats Airplane Parameter = " + result);
	}

	@Test
	@DisplayName("Test countSeats(null)")
	void testCountSeatsWithNullParameter() {
		int result = manager.countSeats(null);
		System.out.println("\nCount Seats Null Parameter = " + result);
	}

	@Test
	@DisplayName("Test countSeatsWithNoneParameter()")
	void testCountSeatsWithNoneParameter() {
		int result = manager.countSeats(new PassengerAircraft());
		System.out.println("\nCount Seats None Parameter = " + result);
	}

	@Test
	@DisplayName("Test countMaxLoadCapacity(Airplane example)")
	void testCountMaxLoadCapacity() {
		double result = manager.countMaxLoadCapacity(new PassengerAircraft("Test", 333, 3000, 300, 300, 3200, 3));
		System.out.println("\nCount Max Load Capacity Airplane Parameter = " + result);
	}

	@Test
	@DisplayName("Test countMaxLoadCapacity(null)")
	void testCountMaxLoadCapacityWithNullParameter() {
		double result = manager.countMaxLoadCapacity(null);
		System.out.println("\nCount Max Load Capacity With Null Parameter = " + result);
	}

	@Test
	@DisplayName("Test countMaxLoadCapacity with none parameter")
	void testCountMaxLoadCapacityWithNoneParameter() {
		double result = manager.countMaxLoadCapacity(new CargoAircraft());
		System.out.println("\nCount Max Load Capacity With None Parameter = " + result);
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
		manager.printListOfAirplanes("speed");
	}

	@Test
	@DisplayName("Check exist enum CabinNarrow")
	void testGetEnumCabinNarrow() {
		System.out.println("\n~CabinNarrow~");
		System.out.println((CabinNarrow.FIVEABREAST).equals(CabinNarrow.THREEBREAST));
	}

	@Test
	@DisplayName("Check exist enum ComfortLevel")
	void testGetEnumComfortLevel() {
		System.out.println("\n~ComfortLevel~");
		System.out.println((ComfortLevel.BUSINESS).equals(ComfortLevel.ECONOMY));
	}

}
