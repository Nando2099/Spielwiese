package Abstract_Aufgabe_30_1;

public class Dreieck extends GeometrischeForm{

	private double hoehe, grundseite;
	
	
	
	public Dreieck(double hoehe, double grundseite) {
		super();
		this.hoehe = hoehe;
		this.grundseite = grundseite;
	}

	@Override
	public double berechneFlaeche() {
		return (hoehe * grundseite)/2;
	}
	
	

}