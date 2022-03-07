package klassen_Aufgabe_1;


public class Produkt {

	String ProduktName; 
	String EAN;
	String Beschreibung;
	double NettoPreis;
	double BruttoPreis;
	int MwSt = 19; 
	int Anzahl;
	double Lagerwert;   // -> zwei verschiedene Werte int + float übertragen?
	
	
	
	public double getLagerwert() {
		return Lagerwert;
	}
		
		// stückzahl * nettopreis
	public void setLagerwert() {
		
		Lagerwert = (double) (Anzahl * NettoPreis); //Anzahl, ein int, wird mit NettoPreis als double gecastet
		
	}
	
	
	
	public String getProduktName() {
		return ProduktName;
		
	}
	public void setProduktName(String produktName) {
		ProduktName = produktName;
	}
	
	
	
	public String getEAN() {
		return EAN;
	}
	public void setEAN(String string) {
		EAN = string;
	}
	
	
	
	public String getBeschreibung() {
		return Beschreibung;
	}
	public void setBeschreibung(String beschreibung) {
		Beschreibung = beschreibung;
	}
	
	
	
	public double getNettoPreis() {
		return NettoPreis;
	}
	public void setNettoPreis(double nettoPreis) {
		NettoPreis = nettoPreis;
	}
	
	
	
	public double getBruttoPreis() {
		return BruttoPreis;
	}
	public void setBruttoPreis(double bruttoPreis) {
		BruttoPreis = bruttoPreis;
	}
	
	
	
	public int getAnzahl() {
		return Anzahl;
	}
	public void setAnzahl(int anzahl) {
		Anzahl = anzahl;
	}
	
	
	
	
}
