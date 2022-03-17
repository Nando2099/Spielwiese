package Static_Aufgabe_28_2_nando;


public class EnteStatisch {
	
	
	static String name;
	static String ort;
	static EnteStatisch pato3;
	static private int InstanzZaehler;
	
	
	static void schwimmWohin(String ort) {
		//ort = ort;
		System.out.println(name + ": ich bin jetzt hier: " + ort);
	}
	
	static String woBistDu() {
		return name + ": ich bin immer noch hier: " + ort;
	}
	
	public int getInstanzZaehler() {
		
		InstanzZaehler++;
		return  InstanzZaehler;
		
	}
	

	public static void main(String[] args) {
		
		EnteStatisch pato = new EnteStatisch();
		pato.name = "Paco";
		pato.ort = "Lima";
		pato.schwimmWohin(pato.ort);
		pato.ort = "Madrid";
		System.out.println(pato.woBistDu());
		
		System.out.println("Die Anzahl der Instanzen ist: " + pato.getInstanzZaehler());
		
		System.out.println("********************");
		
		EnteStatisch pato2 = new EnteStatisch();
		pato2.name = "Paca";
		pato2.ort = "Miami";
		pato2.schwimmWohin(pato2.ort);  // methode nicht statisch aufgerufen
		schwimmWohin(ort);				// methode statisch aufgerufen
		System.out.println(pato2.woBistDu());   // methode nicht statisch aufgerufen
		System.out.println(woBistDu());			// methode statisch aufgerufen
		
		System.out.println("Die Anzahl der Instanzen ist: " + pato2.getInstanzZaehler());
		
		System.out.println("********************");
		
		pato3 = new EnteStatisch();
		pato3.ort = "Alaska";
		EnteStatisch.pato3.schwimmWohin(ort);
		pato3.name = "Paquin";
		pato3.schwimmWohin(ort);
		System.out.println(pato3.woBistDu());
		
		System.out.println("Die Anzahl der Instanzen ist: " + pato3.getInstanzZaehler());

	}

}