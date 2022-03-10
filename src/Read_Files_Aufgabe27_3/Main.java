package Read_Files_Aufgabe27_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		DatenDatei datei1 = new DatenDatei("src/Read_Files_Aufgabe27_3/text1.txt");
		datei1.datenDateiAnzeigen();
		
		DatenDatei datei2 = new DatenDatei("src/Read_Files_Aufgabe27_3/text2.txt");
		datei2.datenDateiAnzeigen();
		
		datei1.datenDateiAnzeigen();
		
		ArrayList<String> liste1= datei1.getListe();
		liste1.add("hallo"); 
		System.out.println(liste1);
		
		datei1.datenDateiAnzeigen();
		
	}
}




class DatenDatei{
	// Fields
	private String dateiname;
	private ArrayList<String> liste;
	

	
	
													// CONSTRUCTOR
	public DatenDatei(String dateiname) {
		this.dateiname = dateiname;
		this.liste = new ArrayList<>();
		
		datenDateiEinlesen();
	}
	

	

	
	public String getDateiname() {
		return dateiname;
	}


	
	
	
	public ArrayList<String> getListe() {

		ArrayList<String> kopierteListe = new ArrayList<>(liste);
		
		return kopierteListe;
	}

	
	
	
	
	
	// andere Methoden
	public void datenDateiEinlesen() {
		
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
		
		
	}

	
	
	
	
	public void datenDateiAnzeigen() {

		// Alle Zeilen anzeigen
		System.out.println("\nAlle eingelesenen Zeilen ausgeben:");
		for (String z : liste) {
			System.out.println(z);
		}
	}

	
}