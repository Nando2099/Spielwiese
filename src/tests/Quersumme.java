package tests;

public class Quersumme {
	
	
	
	
	// Gegeben ist Nummer 123
	// Modulo Rechnung -> 123 % 10 = 3 (addiert die 3 zu Summe)
	// neue Zahl ist zahl / 10 = 12,3
	
	
	
	public static int berechneQuersumme(int zahl) {
		int summe = 0;
		while (0 != zahl) {
			// addiere die letzte ziffer der uebergebenen zahl zur summe
			summe = summe + (zahl % 10);
			// entferne die letzte ziffer der uebergebenen zahl
			zahl = zahl / 10;
		}
		return summe;
	}

	public static void main(String[] args) {
		

		int a = 123;
		System.out.println(berechneQuersumme(a));
	}

}
