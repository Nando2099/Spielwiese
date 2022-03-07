package Exception_ReadFile_Aufgabe_26;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> liste = new ArrayList<>();

		File f = new File("src/Read_File_Exception_Aufgabe_26/daten.txt");
		String zeile = "";

		try {

			Scanner scanner = new Scanner(f);

			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				try {
					zeile = scanner.nextLine();
					System.out.println(zeile);
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

		for (String z : liste) {
			System.out.println(z);
		}
		System.out.println("");

		liste.remove(2);
		for (String z : liste) {
			System.out.println(z);

			String[] ar = z.split(","); // indexOf() ->substr()
			if (   ar[1].equals("3") && ar[0].equals("Brot")  ) {
				System.out.println("Ja die 3 ist in Brot enthalten");
			}
		}
	}

}
