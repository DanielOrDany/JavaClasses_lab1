package ua.lviv.iot.models;

@SuppressWarnings("serial")
public class CargoAircraft extends Airplane {
	private boolean loadingAndUnloadingSystem;
	private String cargoAircraftCategory;
	
	public CargoAircraft() {
		super();
	}
	
	public CargoAircraft(int seatsNumber, double maxLoadCapacity, int maxDistance, int maxSpeed, int flightRange, int fuselageDiameter) {
		super(seatsNumber, maxLoadCapacity, maxDistance, maxSpeed, flightRange, fuselageDiameter);
	}

	public boolean isLoadingAndUnloadingSystem() {
		return loadingAndUnloadingSystem;
	}

	public void setLoadingAndUnloadingSystem(boolean loadingAndUnloadingSystem) {
		this.loadingAndUnloadingSystem = loadingAndUnloadingSystem;
	}

	public String getCargoAircraftCategory() {
		return cargoAircraftCategory;
	}

	public void setCargoAircraftCategory(String cargoAircraftCategory) {
		this.cargoAircraftCategory = cargoAircraftCategory;
	}	
	
}