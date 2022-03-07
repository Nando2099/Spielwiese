package StundenMinutenSekunden;

import java.util.Scanner;

public class Uhr {

	static int stunde;
	static int minute;
	static int sekunde;
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie die Anzahl von Sekunden ein: ");
		int input = scan.nextInt();
		
		Uhr uhr = new Uhr();
		uhr.berechneZeit(input);
		
		System.out.println(stunde +":"+ minute +":"+ sekunde);
		
	}


	public void berechneZeit(int input) {
		int rest = input%3600;
		Uhr.stunde = (input-rest)/3600;
		Uhr.minute = rest/60;
		Uhr.sekunde = rest%60;
	}

}