package first_lab;

public class Drug {
	public static String name; 
	private double price;
	public int maxDose;
	public double valumeActiveSubstance;
	public double milliliters;
	public String activeSubstance;
	private String producer;
	protected String description;
	protected boolean license;
	
	public Drug() {
		/*Nothing to do*/
	}
	
	public Drug(double valumeActiveSubstance, double milliliters,String activeSubstance,int maxDose) {
		this.maxDose = maxDose;
		this.valumeActiveSubstance = valumeActiveSubstance;
		this.milliliters = milliliters;
		this.activeSubstance = activeSubstance;
	}
	
	public Drug(String name, double price,int maxDose,double valumeActiveSubstance,double milliliters,String activeSubstance,String producer,String description,boolean license) {
		this.name = name;
		this.price = price;
		this.maxDose = maxDose;
		this.valumeActiveSubstance = valumeActiveSubstance;
		this.milliliters = milliliters;
		this.activeSubstance = activeSubstance;
		this.producer = producer;
		this.description = description;
		this.license = license;
	}
	
	/*Getters*/
	public double getPrice() {
		return price;
	}
	public String getProdecer() {
		return producer;
	}
	/*Setters*/
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}
	public void setProducer(String newProducer) {
		this.producer = newProducer;
	}
	/*Methods*/
	public String toString() {
		return String.format("Name: %s Description: %s Price: %f MaxDoses: %d Active substance: %s valumeActiveSubstance: %f Milliliters: %f Producer: %s License: %s", name, description, price, maxDose, activeSubstance, valumeActiveSubstance, milliliters, producer, license);
	}
	public static void printStaticName() {
		System.out.println("Name: "+name);
	}
	public void printName() {
		System.out.println("Name: "+name);
	}
	public void resetValues(String name, double price,int maxDose,double valumeActiveSubstance,double milliliters,String activeSubstance,String producer,String description, boolean license) {
		this.name = name;
		this.price = price;
		this.maxDose = maxDose;
		this.valumeActiveSubstance = valumeActiveSubstance;
		this.milliliters = milliliters;
		this.activeSubstance = activeSubstance;
		this.producer = producer;
		this.description = description;
		this.license = license;
	}
	
}
