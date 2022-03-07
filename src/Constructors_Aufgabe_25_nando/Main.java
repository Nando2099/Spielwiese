package Constructors_Aufgabe_25_nando;

public class Main {

	public static void main(String[] args) {
		
		
		KonstruktorVerkettung obj1 = new KonstruktorVerkettung();
		KonstruktorVerkettung obj2 = new KonstruktorVerkettung(1);
		KonstruktorVerkettung obj3 = new KonstruktorVerkettung(2,2);
		KonstruktorVerkettung obj4 = new KonstruktorVerkettung(3,3,3);
		
		
		System.out.println(obj1.attribut1);
		System.out.println(obj1.attribut2);
		System.out.println(obj1.attribut3);
		System.out.println("*******");
		
		System.out.println(obj2.attribut1);
		System.out.println(obj2.attribut2);
		System.out.println(obj2.attribut3);
		System.out.println("*******");
		
		System.out.println(obj3.attribut1);
		System.out.println(obj3.attribut2);
		System.out.println(obj3.attribut3);
		System.out.println("*******");
		
		System.out.println(obj4.attribut1);
		System.out.println(obj4.attribut2);
		System.out.println(obj4.attribut3);
		
		
		
	}

}
