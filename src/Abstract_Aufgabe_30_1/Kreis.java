package Abstract_Aufgabe_30_1;

public class Kreis extends GeometrischeForm{
	
	private double radius;
	
	public Kreis(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double berechneFlaeche() {
		return Math.rint(Math.PI * Math.pow(radius, 2)*100)/100;
	}

}