package klassen_Aufgabe_1;

public class Main {

	public static void main(String[] args) {
		
		// variablen soll ich per Konvention klein anfangen!
		
		Produkt Buch1 = new Produkt();
		Produkt Buch2 = new Produkt();
		Produkt Buch3 = new Produkt();
		
		Buch1.setProduktName("The Shining");
		Buch1.setBeschreibung("BlaBlaBla");
		Buch1.setEAN("EAN9780345806789");
		Buch1.setBruttoPreis(16.10);
		Buch1.setNettoPreis(20.11);
		Buch1.setAnzahl(25);
		Buch1.setLagerwert(); // hier darf kein vorgegebener Wert rein da die Methode 
								//mit anderen Variablen was ausrechnen soll
		
		System.out.println(Buch1.getProduktName());
		System.out.println("Der Lagerpreis ist: " + Buch1.getLagerwert());
		
		
		Buch2.setProduktName("The Thing");
		Buch2.setBeschreibung("BlaBlaBla");
		Buch2.setEAN("EAN9780345806787");
		Buch2.setBruttoPreis(16);
		Buch2.setNettoPreis(20);
		Buch2.setAnzahl(30);
		Buch2.setLagerwert();
		
		System.out.println(Buch2.getProduktName());
		System.out.println("Der Lagerpreis ist: " + Buch2.getLagerwert());
		
		Buch3.setProduktName("The Shiny Thing");
		Buch3.setBeschreibung("BlaBlaBla");
		Buch3.setEAN("EAN9780345806788");
		Buch3.setBruttoPreis(16);
		Buch3.setNettoPreis(20);
		Buch3.setAnzahl(35);
		Buch3.setLagerwert();
		
		
		System.out.println(Buch3.getProduktName());
		System.out.println("Der Lagerpreis ist: " + Buch3.getLagerwert());
		
		System.out.println(Buch1.getLagerwert() + Buch2.getLagerwert() + Buch3.getLagerwert());
	}

}
