package ua.lviv.iot.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "passenger_airplanes")
public class PassengerAircraft extends Airplane {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "name")
	private String name;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private ComfortLevel comfortLevel;
	@Column(name = "wifi")
	private boolean wifi;
	
	public PassengerAircraft() {
		super();		
	}
	
	public PassengerAircraft(String name, boolean wifi) {
		this.name = name;
		this.wifi = wifi;
	}
	
	public PassengerAircraft(int seatsNumber, double maxLoadCapacity, int maxDistance, int maxSpeed, int flightRange, int fuselageDiameter) {
		super(seatsNumber, maxLoadCapacity, maxDistance, maxSpeed, flightRange, fuselageDiameter);
	}

	public ComfortLevel getComfortLevel() {
		return comfortLevel;
	}

	public void setComfortLevel(ComfortLevel comfortLevel) {
		this.comfortLevel = comfortLevel;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}	
	
}
