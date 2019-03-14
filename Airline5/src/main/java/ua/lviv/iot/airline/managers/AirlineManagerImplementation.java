package ua.lviv.iot.airline.managers;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import ua.lviv.iot.airline.models.Airplane;
import ua.lviv.iot.airline.models.SortOrder;

public class AirlineManagerImplementation implements AirlineManager<Airplane> {
	private List<Airplane> list = new LinkedList<Airplane>();

	@Override
	public List<Airplane> sortByMaxSpeed(List<Airplane> listForSorting, SortOrder order) {
		if (order == SortOrder.DESCENDING) {
			listForSorting.sort(Comparator.comparing(Airplane::getMaxSpeed).reversed());
		}
		if (order == SortOrder.ASCENDING) {
			listForSorting.sort(Comparator.comparing(Airplane::getMaxSpeed));
		} 
		return listForSorting;
	}

	@Override
	public List<Airplane> sortByMaxDistance(List<Airplane> listForSorting, SortOrder order) {
		if (order == SortOrder.DESCENDING) {	
			listForSorting.sort(Comparator.comparing(Airplane::getMaxDistance).reversed());
		}
		if (order == SortOrder.ASCENDING) {
			listForSorting.sort(Comparator.comparing(Airplane::getMaxDistance));
		}
		return listForSorting;
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
		if (sortedBy.equals("speed")) {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getName() + " = " + list.get(i).getMaxSpeed());				
			}
		} else if (sortedBy.equals("distance")) {
			for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName() + " = " + list.get(i).getMaxDistance());				
			}	
		} 
		
	}

	public void setList(LinkedList<Airplane> list) {
		this.list = list;
	}

	public List<Airplane> getList() {
		return this.list;
	}

	public void setNewListOfAirplanes(LinkedList<Airplane> newList) {
		try {
			setList(newList);
		} catch (Exception e) {
			System.out.println("New list Exception -> " + e.getMessage());
		}
	}

}
