package Joerg_Loesungen;

public class Mitarbeiter {
	private double gehalt;

	public void gehaltErhoehen(double erhoehung) {
		setGehalt(erhoehung + getGehalt());
	}

	public double getGehalt() {
		return gehalt;
	}

	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}

	public void printData() {
		System.out.println(String.format("Gehalt: %.2f", getGehalt()));
	}
}