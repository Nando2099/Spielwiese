package Schleifen;
import java.util.Scanner;

public class SwitchMonth {

	public static void main(String[] args) {
		
		
		Scanner Eingabe = new Scanner(System.in);
		
		System.out.println("Bitte Nummer eingeben / Please enter a number");
		byte day = (byte)Eingabe.nextInt();
		
		if (day <= 3 ) 
			System.out.println("Er liegt im 1. Quartal \n This month.. ");
					
		if (day >= 4 && day <= 8) 
			System.out.println("Er liegt im 2. Quartal \n This month.. ");
		
		if (day >= 9 && day <= 12) 
					System.out.println("Dieser Monat liegt im 3. Quartal \n This month.. ");	
		
		
		switch (day) {
		  case 1:
		    System.out.println("Der Monat ist Januar\n The Month is January");
		    break;
		  case 2:
		    System.out.println("Der Monat ist Februar\n The Month is February");
		    break;
		  case 3:
		    System.out.println("Der Monat ist März \n The Month is March");
		    break;
		  case 4:
		    System.out.println("Der Monat ist April\n The Month is April");  // Outputs "Thursday" (day 4)
		    break;
		  case 5:
			System.out.println("Der Monat ist Mai\n The Month is May");
			break;
		  case 6:
		    System.out.println("Der Monat ist Juni\n The Month is June");
		    break;
		  case 7:
		    System.out.println("Der Monat ist Juli\n The Month is July");
		    break;
		  case 8:
		    System.out.println("Der Monat ist August\n The Month is August");
		    break;
		  case 9:
			System.out.println("Der Monat ist September\n The Month is September");
			break;
		  case 10:
			System.out.println("Der Monat ist Oktober\n The Month is October");
			break;
		  case 11:
			System.out.println("Der Monat ist November\n The Month is November");
			break;
		  case 12:
			System.out.println("Der Monat ist Dezember\n The Month is December");
			break;
		
		  default:
			System.out.println("ist kein gültiger Monat \n is not a valid Moth");
		}
		
	}

}


