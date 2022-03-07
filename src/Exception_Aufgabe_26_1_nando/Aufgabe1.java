package Exception_Aufgabe_26_1_nando;

import java.util.Arrays;

public class Aufgabe1 {

	public static void main(String[] args) {
		
		
		
		
		// ERSTE ÜBUNG MIT NULLPOINTER EXCEPTION
		
		System.out.println("Start-Übung 1");
		
		try {
		
		String vorname ="Jens";
		String nachname = null;
		
		
		
		System.out.println(vorname);
		System.out.println(nachname);
		
		System.out.println(vorname.toString());
		System.out.println(nachname.toString());
		}catch(Exception e){
			System.out.println(e);
			System.out.println(Arrays.toString(e.getStackTrace()));
		}
		System.out.println("Ende-Übung");
		
		
		
		
		
		
		
		
		
		// ZWEITE ÜBUNG MIT NUMBERFORMAT EXCEPTION
		System.out.println("**********************");
		
	
		
		try {
		
		String ersteNummer ="1";
		String zweiteNummer = "Nummer";
		
		
		
		System.out.println(ersteNummer);
		System.out.println(zweiteNummer);
		
		int i = Integer.parseInt(ersteNummer);
		int j = Integer.parseInt(zweiteNummer);
		
		
		System.out.println(i + j );
		
		}catch(NumberFormatException e){
			System.out.println(e);
			System.out.println(Arrays.toString(e.getStackTrace()));
		
		
		}
		System.out.println("Ende-Übung");
		
		
		
		
		
		
		// DRITTE ÜBUNG MIT RUNTIMEEXCEPTION
		
		
		
        int[] a = new int[] { 1, 2, 3, 4, 5 };
        
        // execute for loop
        try {
        	
        
        for (int i = 0; i < 6; i++) {
            // print the value of array
            System.out.println(a[i]);
        }
		
        }catch(ArrayIndexOutOfBoundsException e) {
        	
        }
		
		
		
		
		
		
		
		
		
	}

}
