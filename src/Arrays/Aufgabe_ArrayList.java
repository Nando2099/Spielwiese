package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Aufgabe_ArrayList {

	public static void main(String[] args) {
		
		
		
		
		
		Scanner Eingabe = new Scanner(System.in);
		
		System.out.println("Bitte erstes Tier eingeben");
		String a = Eingabe.next();
		
		System.out.println("Bitte das zweite Tier eingeben");
		String b = Eingabe.next();
		
		System.out.println("Bitte das dritte Tier eingeben");
		String c = Eingabe.next();
		
		System.out.println("Bitte das vierte Tier eingeben");
		String d = Eingabe.next();
		
		ArrayList<String> Animales = new ArrayList<String>();
		
		Animales.add(a);
		Animales.add(b);
		Animales.add(c);
		Animales.add(d);
		
		System.out.println(" ");
		System.out.println("Eingegebene Tiere:");
		System.out.println(" ");
		
		for (int i = 0; i< Animales.size(); i++) {
			
			System.out.print(Animales.get(i) + " ");
		}
		
		System.out.println(" ");
		System.out.println("Eingegebene Tiere (enhanced for loop:");
		System.out.println(" ");
		
		for (String value : Animales) {
			System.out.println(value);
		}
		

	}

}
