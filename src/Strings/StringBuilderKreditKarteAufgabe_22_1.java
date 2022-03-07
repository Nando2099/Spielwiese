package Strings;

import java.util.Scanner;

public class StringBuilderKreditKarteAufgabe_22_1 {

public static void main(String[] args) {
		
		String kkNummer;
		String kkNummerSub;
		String full;
		String ikses = "xxxx-xxxx-xxxx-" ;
		
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		
		System.out.println("Geben Sie die Kredikkartennummer mit Bindestrichen ein");
		kkNummer = sc.nextLine();
		kkNummerSub = kkNummer.substring(15, 19);
		
		System.out.println("Die Nummer im Klartext lautet:");
		System.out.println(kkNummer);
		
		System.out.println("Die maskierte Nummer lautet:");
		full =sb.append(ikses).append(kkNummerSub).toString();
		System.out.println(full);

	}

}