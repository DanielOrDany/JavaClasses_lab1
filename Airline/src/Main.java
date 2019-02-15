import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import models.airline.iot.lviv.ua.Airplane;
import models.airline.iot.lviv.ua.CargoAircraft;
import models.airline.iot.lviv.ua.PassengerAircraft;

public class Main {

	public static void main(String[] args) {
		PassengerAircraft olivia = new PassengerAircraft(120,16000,2000,500,1000,6);
		CargoAircraft antonov = new CargoAircraft(210,60000,1000,600,1200,9);
		LinkedList<Airplane> list = new LinkedList<Airplane>();
		list.add(olivia);
		list.add(antonov);
		sortByMaxSpeed(list, false);
		for(int i=0;i<list.size();i++){
			int speed = 0;
			if(list.get(i).equals(olivia)) {
				speed = olivia.getMaxSpeed();
			}else {
				speed = antonov.getMaxSpeed();
			}
		    System.out.println(" " + speed);
		} 
	}
	
	public static LinkedList sortByMaxSpeed(LinkedList list , boolean sortOrder) {
		if (sortOrder == true) {
			// ascending
			list.sort(Comparator.comparing(Airplane::getMaxSpeed));
		}else {
			// descending
			list.sort(Comparator.comparing(Airplane::getMaxSpeed).reversed());
		}
		return list;
	}
}
