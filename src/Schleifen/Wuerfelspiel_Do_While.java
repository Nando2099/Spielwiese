package Schleifen;

import java.util.Random;


public class Wuerfelspiel_Do_While {

	public static void main(String[] args) {
		
		Random zufallszahl = new Random();
		int counter = 0, zahl = 0;
		
		do {
			zahl = zufallszahl.nextInt(7);
			counter = counter + 1;
			
		}while(zahl !=6);
		
		System.out.print(counter);

	}

}


// el resultado es cuantas veces se tuvo que tirar los dados 
// hasta que salio el numero 6