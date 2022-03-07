package Read_Files_Aufgabe27_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	ArrayList<String> liste1=null; // deklaration
    	ArrayList<String> liste2=null; // deklaration
    	
    		
    	
    	liste1 = datenDateiEinlesenUndAnzeigen("src/Read_Files_Aufgabe27_1/daten1.txt");
    	
       	anzeigen(liste1);
    	
    	liste2 = datenDateiEinlesenUndAnzeigen("src/Read_Files_Aufgabe27_1/daten2.txt");
    	
    	anzeigen(liste2);
    }
    
    
    public static ArrayList<String> datenDateiEinlesenUndAnzeigen(String dateiname) {
    	ArrayList<String> liste = new ArrayList<>();

		File f = new File(dateiname);
		String zeile = "";

		
        try {
			Scanner scanner = new Scanner(f);

			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				try {
					zeile = scanner.nextLine();
					//System.out.println(zeile);
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
    
    
    
    
    

    // liste ist jetzt eine lokale Variable in der Methode hier!
    public static void anzeigen (ArrayList<String> liste ) {
    	
    	
    	
    	// Alle Zeilen anzeigen
    			System.out.println("Alle eingelesenen Zeilen ausgeben:");
    			for (String z : liste) {
    				System.out.println(z);
    			}
    			System.out.println("Jetzt sind alle Daten da! in Liste");
    }
}