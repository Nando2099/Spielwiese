package Scanners;
import java.util.Scanner;

public class GroessteZahlperTastatur {

	public static void main(String[] args) {
		
		Scanner Eingabe = new Scanner(System.in);
		
		System.out.println("Bitte erste Nummer eingeben");
		int a = Eingabe.nextInt();
		
		System.out.println("Bitte zweite Nummer eingeben");
		int b = Eingabe.nextInt();
		
		System.out.println("Bitte dritte Nummer eingeben");
		int c = Eingabe.nextInt();
		
		
//		int a = 5;
//		int b = 3;
//		int c = 2;
		
		if (a >= b && a >= c)
			System.out.print( a + " ist die höchste Zahl" );
			if (b >= c && b >= a)
				System.out.print( b + " ist die höchste Zahl" );
				if (c >= a && c >= b)
					System.out.print( c + " ist die höchste Zahl" );
		
		
	}

}
