package first_lab;

public class Main {

	public static void main(String[] args) {
		Drug drug1 = new Drug();
		Drug drug2 = new Drug(2.0,1.7,"cytiazine",2);
		Drug drug3 = new Drug("Tabex", 312, 6 , 1.5 , 5.5 ,"cytiazine","Sopharma","Stop smoking!", true);
		
		System.out.println("Method - toString:");
		System.out.println(drug1.toString());
		System.out.println(drug2.toString());
		System.out.println(drug3.toString());
		System.out.println("Method - printStaticName:");
		drug1.printStaticName();
		drug2.printStaticName();
		drug3.printStaticName();
		System.out.println("Method - printName:");
		drug1.printName();
		drug2.printName();
		drug3.printName();
	}

}
