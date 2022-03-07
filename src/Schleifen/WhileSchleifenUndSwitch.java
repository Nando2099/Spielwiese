package Schleifen;

import java.util.Scanner;

public class WhileSchleifenUndSwitch {

	public static void main(String[] args) {

		System.out.println("Aufgabe A: ");
		int i = 4;
		while (i <= 3) {
			System.out.println(i);
			i = i + 1;
		}
		System.out.println();
		
		
		i = 4;
		do {
			System.out.println(i);
			i = i + 1;
		} while (i <= 3);

		System.out.println();
		
		
		
		
		System.out.println("Aufgabe B: ");
		int j = -10;
		while (j <= 0) {
			System.out.print(j + " ");
			j = j + 2;
		}

		
		
		System.out.println("\n");
		System.out.println("Aufgabe C: ");
		int k = 20;
		while (k >= 1) {
			System.out.print(k + " ");
			k = k - 4;
		}

		
		
		System.out.println("\n");
		System.out.println("Aufgabe D: ");
		i = 0;
		int zufall1 = 7, zufall2 = 8, zufall3 = 9;

		while (i < 3) {
			int zufall = (int) (Math.random() * 6 + 1);

			switch (i) {
			case 0:
				zufall1 = zufall;
				break;
			case 1:
				zufall2 = zufall;
				break;
			case 2:
				zufall3 = zufall;
				break;
			}

			if (!(zufall1 == zufall2 || zufall1 == zufall3 || zufall2 == zufall3))
				i++;
		}

		System.out.print(zufall1 + " " + zufall2 + " " + zufall3);

		System.out.println("\n");
		System.out.println("Aufgabe E: \n");
		Scanner s = new Scanner(System.in);

		int zufallszahl = (int) (Math.random() * 6 + 1);
		int eingabe = 0;
		int counter = 0;

		while (eingabe != zufallszahl) {
			System.out.print("\nGeben Sie die zu erratende Zahl ein: ");
			eingabe = s.nextInt();
			counter++;

			if (eingabe == zufallszahl) {
				System.out.println("\nrichtig!");
				System.out.println("Sie haben die Zahl " + zufallszahl + " erraten!");
				System.out.println("Sie haben " + counter + " Versuche benötigt!");
			} else
				System.out.println("falsch");
		} // Ende while Schleife
	}// Ende des Blocks

}