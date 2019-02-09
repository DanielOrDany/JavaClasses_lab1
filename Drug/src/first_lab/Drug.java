package first_lab;

public class Drug {
	public static int price; 
	private String name;
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
	
	public Drug(String name, int price,int maxDose,double valumeActiveSubstance,double milliliters,String activeSubstance,String producer,String description,boolean license) {
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
	public String getName() {
		return name;
	}
	public String getProdecer() {
		return producer;
	}
	/*Setters*/
	public void setPrice(int newPrice) {
		this.price = newPrice;
	}
	public void setProducer(String newProducer) {
		this.producer = newProducer;
	}
	/*Methods*/
	public String toString() {
		return String.format("Name: %s Description: %s Price: %d MaxDoses: %d Active substance: %s valumeActiveSubstance: %f Milliliters: %f Producer: %s License: %s", name, description, price, maxDose, activeSubstance, valumeActiveSubstance, milliliters, producer, license);
	}
	public static void printStaticPrice() {
		System.out.println("Price: "+price);
	}
	public void printPrice() {
		System.out.println("Price: "+price);
	}
	public void resetValues(String name, int price,int maxDose,double valumeActiveSubstance,double milliliters,String activeSubstance,String producer,String description, boolean license) {
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
