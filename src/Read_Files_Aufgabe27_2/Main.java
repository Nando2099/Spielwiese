package Read_Files_Aufgabe27_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> liste1 = datenDateiEinlesen("src/Read_Files_Aufgabe27_2/daten1.txt");
		datenDateiAnzeigen(liste1);
		
		ArrayList<String> liste2 = datenDateiEinlesen("src/Read_Files_Aufgabe27_2/daten2.txt");
		datenDateiAnzeigen(liste2);
		
		// und nocheinmal die 1. Datei anzeigen
		datenDateiAnzeigen(liste1);
		
		
	}
	

	public static ArrayList<String> datenDateiEinlesen(String dateiname) {
		ArrayList<String> liste = new ArrayList<>();

		File f = new File(dateiname);
		String zeile = "";

		try {
			Scanner scanner = new Scanner(f);

			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				try {
					zeile = scanner.nextLine();
					// System.out.println(zeile);
					liste.add(zeile);
				} catch (NoSuchElementException e) {
					// Ende der Schleife
					break;
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("Catch");
			System.out.println(e.getMessage());

		}
		
		return liste;
	}

	public static void datenDateiAnzeigen(ArrayList<String> liste) {

		// Alle Zeilen anzeigen
		System.out.println("\nAlle eingelesenen Zeilen ausgeben:");
		for (String z : liste) {
			System.out.println(z);
		}
		

	}

}