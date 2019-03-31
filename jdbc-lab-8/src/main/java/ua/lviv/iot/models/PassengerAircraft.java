package ua.lviv.iot.models;

public class PassengerAircraft extends Airplane {
	private ComfortLevel comfortLevel;
	private boolean wifi;
	
	public PassengerAircraft() {
		super();		
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
