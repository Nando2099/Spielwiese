package Schleifen;

import java.util.Scanner;

public class SwitchMonthQuartal {
	
	public static void PruefeQuartal(byte day) {
		
		byte dia = day;
		
		if (dia <= 3 ) 
			System.out.println("Er liegt im 1. Quartal \n This month.. ");
					
		if (dia >= 4 && dia <= 6) 
			System.out.println("Er liegt im 2. Quartal \n This month.. ");
		
		if (dia >= 7 && dia <= 9) 
			System.out.println("Dieser Monat liegt im 3. Quartal \n This month.. ");
		
		if (dia >= 10 && dia <= 12) 
			System.out.println("Dieser Monat liegt im 4. Quartal \n This month.. ");
	}

	public static void main(String[] args) {
		

	Scanner Eingabe = new Scanner(System.in);
		
		System.out.println("Bitte Nummer eingeben / Please enter a number");
		byte day = (byte)Eingabe.nextInt();
				
			
		
		switch (day) {
		  case 1:
		    System.out.println("Der Monat ist Januar.\n The Month is January.");
		    PruefeQuartal(day);
		    break;
		  case 2:
		    System.out.println("Der Monat ist Februar.\n The Month is February");
		    PruefeQuartal(day);
		    break;
		  case 3:
		    System.out.println("Der Monat ist März.\n The Month is March");
		    PruefeQuartal(day);
		    break;
		  case 4:
		    System.out.println("Der Monat ist April.\n The Month is April");
		    PruefeQuartal(day);
		    break;
		  case 5:
			System.out.println("Der Monat ist Mai.\n The Month is May");
			PruefeQuartal(day);
			break;
		  case 6:
		    System.out.println("Der Monat ist Juni.\n The Month is June");
		    PruefeQuartal(day);
		    break;
		  case 7:
		    System.out.println("Der Monat ist Juli.\n The Month is July");
		    PruefeQuartal(day);
		    break;
		  case 8:
		    System.out.println("Der Monat ist August.\n The Month is August");
		    PruefeQuartal(day);
		    break;
		  case 9:
			System.out.println("Der Monat ist September.\n The Month is September");
			PruefeQuartal(day);
			break;
		  case 10:
			System.out.println("Der Monat ist Oktober.\n The Month is October");
			PruefeQuartal(day);
			break;
		  case 11:
			System.out.println("Der Monat ist November.\n The Month is November");
			PruefeQuartal(day);
			break;
		  case 12:
			System.out.println("Der Monat ist Dezember.\n The Month is December");
			PruefeQuartal(day);
			break;
		
		  default:
			System.out.println("ist kein gültiger Monat \n is not a valid Moth");
			
		
						
		}
		
	}

}