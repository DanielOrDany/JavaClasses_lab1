package first_lab;

public class Main {

	public static void main(String[] args) {
		Drug drug1 = new Drug();
		Drug drug2 = new Drug(2.0,1.7,"cytiazine",2);
		Drug drug3 = new Drug("Tabex", 312, 6 , 1.5 , 5.5 ,"cytiazine","Sofarma","Stop smoking!", true);
		
		System.out.println("Method - toString:");
		System.out.println(drug1.toString());
		System.out.println(drug2.toString());
		System.out.println(drug3.toString());
		System.out.println("Method - printStaticName:");
		drug1.printStaticPrice();
		drug2.printStaticPrice();
		drug3.printStaticPrice();
		System.out.println("Method - printName:");
		drug1.printPrice();
		drug2.printPrice();
		drug3.printPrice();
	}

}
