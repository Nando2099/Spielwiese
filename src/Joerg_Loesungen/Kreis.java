package Joerg_Loesungen;

import joerg.object1.ShapeAbstract;

public class Kreis extends ShapeAbstract {
	private double radius;

	public Kreis(double radius) {
		setRadius(radius);
	}

	@Override
	public double berechneFlaeche() {
		return Math.PI * Math.pow(getRadius(), 2.0);
	}

	@Override
	public double berechneUmfang() {
		return 2 * Math.PI * getRadius();
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}