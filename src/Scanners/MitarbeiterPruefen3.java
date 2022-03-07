package Scanners;

import java.util.Scanner;

public class MitarbeiterPruefen3 {

	public static void main(String[] args) {


		
		
		Scanner Eingabe = new Scanner(System.in);
		
		System.out.println("Bitte Name eingeben");
		String x = Eingabe.next();
		
		if (x.equals("Jens") || x.equals("Ellen")){
			System.out.println("Ist Mitarbeiter");
			
		
		}else {
			System.out.println("Ist Kein MA");
		}
		
		
	}




}


