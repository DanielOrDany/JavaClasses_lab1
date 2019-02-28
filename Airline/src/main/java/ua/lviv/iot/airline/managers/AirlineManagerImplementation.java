package ua.lviv.iot.airline.managers;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import ua.lviv.iot.airline.models.Airplane;
import ua.lviv.iot.airline.models.SortOrder;

public class AirlineManagerImplementation implements AirlineManager<Airplane> {
	private LinkedList<Airplane> list = new LinkedList<Airplane>();

	@Override
	public List<Airplane> sortByMaxSpeed(SortOrder order) {
		try {
			if (!list.isEmpty()) {
				if (order == SortOrder.ASCENDING) {
					list.sort(Comparator.comparing(Airplane::getMaxSpeed));
				} else if (order == SortOrder.DESCENDING) {
					list.sort(Comparator.comparing(Airplane::getMaxSpeed));
					Collections.reverse(list);
				}
			} else {
				System.out.println("-> List of airplanes is empty");
			}
			
		} catch (NullPointerException e) {
			System.out.println("Speed-Sort airplane exception ->" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Speed-Sort airplane exception ->" + e.getMessage());
		}

		return list;
	}

	@Override
	public List<Airplane> sortByMaxDistance(SortOrder order) {
		try {
			if (!list.isEmpty()) {
				if (order == SortOrder.ASCENDING) {
					list.sort(Comparator.comparing(Airplane::getMaxDistance));
				} else if (order == SortOrder.DESCENDING) {
					list.sort(Comparator.comparing(Airplane::getMaxDistance));
					Collections.reverse(list);
				}
			} else {
				System.out.println("-> List of airplanes is empty");
			}
		} catch (NullPointerException e) {
			System.out.println("Distance-Sort airplane exception ->" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Distance-Sort airplane exception ->" + e.getMessage());
		}
		return list;
	}

	@Override
	public int countSeats(Airplane aircraft) {
		if (aircraft == null) {
			return 0;
		} else {
			return aircraft.getSeatsNumber();
		}
	}

	@Override
	public double countMaxLoadCapacity(Airplane aircraft) {
		if (aircraft == null) {
			return 0.0;
		} else {
			return aircraft.getMaxLoadCapacity();
		}
	}

	@Override
	public void addAirplane(Airplane airplane) {
		try {
			System.out.println("Yoy added \"" + airplane.getName() + "\" to list of airplanes");
			list.add(airplane);
		} catch (NullPointerException e) {
			System.out.println("\nAdd airplane exception -> " + e.getMessage());
		} catch (Exception e) {
			System.out.println("\nAdd airplane exception -> " + e.getMessage());
		}
	}

	@Override
	public void clearAirplaneList() {
		list.clear();
	}

	@Override
	public void printListOfAirplanes(String sortedBy) {
		try {
			if (sortedBy == "speed") {
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).getName() + " = " + list.get(i).getMaxSpeed());

				}
			} else if (sortedBy == "distance") {
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).getName() + " = " + list.get(i).getMaxDistance());

				}
			} else {
				System.out.println("\nInput Parameter mast be \"speed\" or \"distance\" (printListOfAirplanes)");
			}
		} catch (NullPointerException e) {
			System.out.println("Exception printListOfAirplanes ->" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Add airplane exception ->" + e.getMessage());
		}

	}

	public void setList(LinkedList<Airplane> list) {
		this.list = list;
	}
	
	public void setNewListOfAirplanes(LinkedList<Airplane> newList) {
		try {
			setList(newList);
		}catch(Exception e) {
			System.out.println("New list Exception -> "+e.getMessage());
		}
	}

}
