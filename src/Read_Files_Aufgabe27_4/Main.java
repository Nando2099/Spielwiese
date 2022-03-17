package Read_Files_Aufgabe27_4;


import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	
	  public  static  void main(String[] args) {

		// Objekt/Instanz für die 1. Datei
		DatenDatei datei1 = new DatenDatei("src/Read_Files_Aufgabe27_4/daten1.txt",",");
		
		datei1.datenDateiAnzeigen(); // anzeigen
		
		// Objekt/Instanz für die 2. Datei
		DatenDatei datei2 = new DatenDatei("src//Read_Files_Aufgabe27_4/daten2.txt",";");
		
		datei2.datenDateiAnzeigen(); // anzeigen

			
		datei1.datenDateiAnzeigen(); // zur Sicherheit nochmal die 1. anzeigen!

		// einzelne Zeile ausgeben
		datei1.datenDateiAnzeigen(1);

		// einzelne Zelle einer Zeile ausgeben
		datei1.datenDateiAnzeigen(2, 1);
        String element = datei1.datenDateiAnzeigen(2, 1);

						
		// die 2.spalte als int aufnehmen
		System.out.println("Dieser Wert ist nun kein String mehr, sondern ein int!");
		int zahl = datei1.konvertiereStringZuInt(element); // Die 2.Spalte enthält Zahlen!
		System.out.println(zahl);

		// einzelne Zeile ausgeben
		datei2.datenDateiAnzeigen(1);
		System.out.println("***");

		// einzelne Zelle einer Zeile ausgeben
		datei2.datenDateiAnzeigen(1, 0);
		String element2 = datei2.datenDateiAnzeigen(1, 1);

		// die 2.spalte als int aufnehmen
		System.out.println("Dieser Wert ist nun kein String mehr, sondern ein int!");
		int zahl2 = datei2.konvertiereStringZuInt(element2); // Die 2.Spalte enthält Zahlen!
		System.out.println(zahl2);
	}
}

class DatenDatei {
	// Fields
	private String dateiname;
	private ArrayList<String> liste;
	private String trennzeichen;
	

	// Methods

	// Konstrukto(ren)
	public DatenDatei(String dateiname,String trennzeichen) {
		this.trennzeichen = trennzeichen;
		this.dateiname = dateiname;
		this.liste = new ArrayList<>();

		this.datenDateiEinlesen();
	}


	public String getDateiname() {
		return dateiname;
	}


	public ArrayList<String> getListe() {
	

		ArrayList<String> kopierteListe = new ArrayList<>(liste);

		return kopierteListe;
	}

	
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

	public void datenDateiAnzeigen(int zeilenNummer) {

		// Eine Zeile anzeigen
		System.out.println("\nEine eingelesene Zeile mit der Zeilennummer " + zeilenNummer + " ausgeben:");
		System.out.println(liste.get(zeilenNummer));

	}

	public String datenDateiAnzeigen(int zeilenNummer, int spaltenNummer) {

		// Eine Zelle anzeigen
		System.out.println("\nEine eingelesene Zelle mit der Zeilennummer " + zeilenNummer + " und"
				+ " der Spaltennummer " + spaltenNummer + " ausgeben:");

		String zeile = liste.get(zeilenNummer);

		String elemente[] = zeile.split(trennzeichen);
		System.out.println(elemente[spaltenNummer]);

		return elemente[spaltenNummer];
	}

	public  int konvertiereStringZuInt(String wert) {

		return Integer.parseInt(wert);
	}
}