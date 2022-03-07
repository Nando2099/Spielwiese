package tests;

import java.util.Scanner;

public class Kapitalverdoppelung {

	public static void main(String[] args) {
		
		Scanner tastatur = new Scanner(System.in);
		
		System.out.println("Startkapital: ");
		float sk = tastatur.nextFloat();
		
		System.out.println("Zinsatz: ");
		float zs = tastatur.nextFloat();
		
		int jahr = 0;
		
		float Kapital = sk;
		
		do {
			Kapital = Kapital * (1 + zs/100);
			jahr = jahr + 1;
		} while(Kapital <2 * sk);
		
		System.out.print(Kapital);
		System.out.print("Kapitalverdoppelung nach " + jahr + " Jahren");

	}

}
