package Joerg_Loesungen;

public class Manager extends Chef {
	private final static double MANAGER_BONUS = 200.0;
	private String abteilung;
	private int anzSekretaer;

	@Override
	public void printData() {
		super.printData();

		System.out.println(String.format("Abteilung: '%s'", getAbteilung()));
		System.out.println(String.format("Anzahl Sekretär: %s", getAnzSekretaer()));
	}

	public String getAbteilung() {
		return abteilung;
	}

	public void setAbteilung(String abteilung) {
		this.abteilung = abteilung;
	}

	public int getAnzSekretaer() {
		return anzSekretaer;
	}

	public void setAnzSekretaer(int anzSekretaer) {
		this.anzSekretaer = anzSekretaer;
	}
	
	@Override
	public void gehaltErhoehen(double erhoehung) {
		super.gehaltErhoehen(erhoehung);
		super.gehaltErhoehen(MANAGER_BONUS);
	}
}