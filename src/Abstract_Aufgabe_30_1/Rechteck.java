package Abstract_Aufgabe_30_1;

public class Rechteck extends GeometrischeForm{
	
	private double laenge, breite;
	
	public Rechteck(double laenge, double breite) {
		super();
		this.laenge = laenge;
		this.breite = breite;
	}
	
	
	@Override
	public double berechneFlaeche() {
		return laenge * breite;
	}

}