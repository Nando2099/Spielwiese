package Abstract_Aufgabe_30_1;

public class Main {

	public static void main(String[] args) {
		Quadrat q = new Quadrat(5.3);
		System.out.println("Quadrat");
		System.out.println("Die Fl�che betr�gt " + q.berechneFlaeche() + " Quadratzentimeter");
		System.out.println("===========================================");
		
		Rechteck r = new Rechteck(4.5, 3.5);
		System.out.println("Rechteck");
		System.out.println("Die Fl�che betr�gt " + r.berechneFlaeche() + " Quadratzentimeter");
		System.out.println("===========================================");
		
		Dreieck d = new Dreieck(5, 4.8);
		System.out.println("Dreieck");
		System.out.println("Die Fl�che betr�gt " + d.berechneFlaeche() + " Quadratzentimeter");
		System.out.println("===========================================");
		
		Kreis k = new Kreis(7.4);
		System.out.println("Kreis");
		System.out.println("Die Fl�che betr�gt " + k.berechneFlaeche() + " Quadratzentimeter");
		System.out.println("===========================================");
	}

}