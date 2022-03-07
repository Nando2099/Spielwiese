package Strings;

public class CharAt {

	public static void main(String[] args) {

		String vorname = "Jens";

		System.out.println(vorname);

		// 1. charAt()-Methode
		System.out.println(vorname.charAt(0)); // Position beginnt ab 0, also hier ist 0 ein 'J'
		System.out.println(vorname.charAt(1)); // Position beginnt ab 0, also hier ist 1 ein 'e'
		System.out.println(vorname.charAt(2)); // Position beginnt ab 0, also hier ist 2 ein 'n'
		System.out.println(vorname.charAt(3)); // Position beginnt ab 0, also hier ist 3 ein 's'
		System.out.println();

		// 2 Ausgabe / Verarbeitung per for-Schleife
		for (int i = 0; i < vorname.length(); i++) {
			System.out.println(vorname.charAt(i));
		}
		
		// 3 Ausgabe / Verarbeitung per erweiterter for-Schleife
		// NICHT ERLAUBT!
//		for (char c : vorname) {
//			System.out.println(c);
//		}

	}

}