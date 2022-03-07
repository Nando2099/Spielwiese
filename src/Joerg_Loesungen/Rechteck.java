package Joerg_Loesungen;

import joerg.object1.ShapeAbstract;

public class Rechteck extends ShapeAbstract {
	private double seiteA;
	private double seiteB;

	public Rechteck(double seiteA, double seiteB) {
		setSeiteA(seiteA);
		setSeiteB(seiteB);
	}

	@Override
	public double berechneFlaeche() {
		return 2 * (getSeiteA() + getSeiteB());
	}

	@Override
	public double berechneUmfang() {
		return getSeiteA() * getSeiteB();
	}

	public double getSeiteA() {
		return seiteA;
	}

	public void setSeiteA(double seiteA) {
		this.seiteA = seiteA;
	}

	public double getSeiteB() {
		return seiteB;
	}

	public void setSeiteB(double seiteB) {
		this.seiteB = seiteB;
	}
}