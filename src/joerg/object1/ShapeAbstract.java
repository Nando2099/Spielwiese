package joerg.object1;

import Joerg_Loesungen.Shape;

public abstract class ShapeAbstract implements Shape {
	private String color;
	
	@Override
	public abstract double berechneFlaeche();

	@Override
	public abstract double berechneUmfang();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}