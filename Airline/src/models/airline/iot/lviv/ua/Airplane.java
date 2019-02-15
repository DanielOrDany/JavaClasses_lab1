package models.airline.iot.lviv.ua;

public abstract class Airplane {
	private String name;
	private int seatsNumber;
	private double maxLoadCapacity;
	private int maxDistance;
	private int maxSpeed;
	private int flightRange;
	private int fuselageDiameter;
	private CabinNarrow cabinNarrow;

	public Airplane() {

	}

	public Airplane(String name, int seatsNumber, double maxLoadCapacity, int maxDistance, int maxSpeed, int flightRange,
			int fuselageDiameter) {
		this.name = name;
		this.seatsNumber = seatsNumber;
		this.maxLoadCapacity = maxLoadCapacity;
		this.maxDistance = maxDistance;
		this.maxSpeed = maxSpeed;
		this.flightRange = flightRange;
		this.fuselageDiameter = fuselageDiameter;
	}

	public int getSeatsNumber() {
		return seatsNumber;
	}

	public void setSeatsNumber(int seatsNumber) {
		this.seatsNumber = seatsNumber;
	}

	public double getMaxLoadCapacity() {
		return maxLoadCapacity;
	}

	public void setMaxLoadCapacity(double maxLoadCapacity) {
		this.maxLoadCapacity = maxLoadCapacity;
	}

	public int getMaxDistance() {
		return maxDistance;
	}

	public void setMaxDistance(int maxDistance) {
		this.maxDistance = maxDistance;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getFlightRange() {
		return flightRange;
	}

	public void setFlightRange(int flightRange) {
		this.flightRange = flightRange;
	}

	public int getFuselageDiameter() {
		return fuselageDiameter;
	}

	public void setFuselageDiameter(int fuselageDiameter) {
		this.fuselageDiameter = fuselageDiameter;
	}

	public CabinNarrow getCabinNarrow() {
		return cabinNarrow;
	}

	public void setCabinNarrow(CabinNarrow cabinNarrow) {
		this.cabinNarrow = cabinNarrow;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
