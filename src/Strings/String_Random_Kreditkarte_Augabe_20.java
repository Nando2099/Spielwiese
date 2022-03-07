package Strings;

import java.util.Random;

public class String_Random_Kreditkarte_Augabe_20 {
	
	public static void main(String[] args) {
		
		
		
		
		
//		for (int i = 0; i < 19; i++) {
//			Random r = new Random();
//			int randomInt = r.nextInt(9) + 1;
//			
//			System.out.print(randomInt);
//			if ( i == 4 | i == 9 | i == 14 ) {
//			System.out.print("-");
//			}
//		}
		
	
		
//////////////////   GIBT AUS EINE int KK-Nummer mit Bindestriche
		
		
		
//		for (int i = 0; i < 16; i++) {
//			Random r = new Random();
//			int randomInt = r.nextInt(9) + 1;
//			
//			String randomNum = Integer.toString(randomInt);
//			
//			System.out.print(randomNum);
//			if ( i == 3 | i == 7 | i == 11 ) {
//			System.out.print("-");
//			}
//		}
		
		
///////////// GIBT AUS EINE String KK-Nummer mit Bindestrichen (2 Strings)
		
		
		
//		for (int i = 0; i < 16; i++) {
//			Random r = new Random();
//			int randomInt = r.nextInt(9) + 1;
//			
//			String randomNum = Integer.toString(randomInt);
//			
//			
//			if ( i == 3 | i == 7 | i == 11 ) {
//			randomNum = randomNum.concat("-");
//			System.out.print(randomNum);
//			
//			}else {
//				System.out.print(randomNum);
//			}
//			
//		}
		
		
		
//////////// GIBT AUS EINE String KK-Nummer mit Bindestrichen (1 String)
		
//		for (int i = 0; i < 16; i++) {
//			Random r = new Random();
//			int randomInt = r.nextInt(9) + 1;
//			
//			String randomNum = Integer.toString(randomInt);
//			String randomNum2;
//			
//			if ( i == 3 | i == 7 | i == 11 ) {
//			randomNum2 = randomNum.concat("-");
//			
//			
//			}else {
//			randomNum2 = randomNum;
//			}
//			
//			System.out.print(randomNum2);
//		}
		
///////////////////////// KREDITKARTENNUMMER AUSGABE UND MASKIERUNG ------>>>>
		
		String randomNum ="";
		int randomInt;
		Random r = new Random();
		
		for (int i = 0; i < 16; i++) {
			
			randomInt = r.nextInt(9) + 1;

			randomNum += Integer.toString(randomInt);
			
			
			if ( i == 3 | i == 7 | i == 11 ) 
				randomNum += "-";

			
		}  // end of for
		
		System.out.print(randomNum);
		String randomNumSub = randomNum.substring(15,19);
		System.out.print(" "); // es solo un espacio
		//System.out.println(randomNumSub);
		System.out.println("xxxx-xxxx-xxxx-" + randomNumSub);
		
		
		
		///////////////////////// PRÜFT OB "5555" IM STRING VORHANDEN IST------------------------->>
		
	
	    int var5555 = 0;
	    var5555 = randomNum.indexOf("5555",0);  // Si el index 0 no contiende 5555 el valor volcado a var5555 es -1
		if (var5555 == -1) {
			System.out.println(randomNum + " Enthält nicht 5555");
		}else {
			System.out.println(randomNum + " Enthält 5555");
		}
		
		//////////////////////// PRÜFT OB "0" ganz vorne oder hinten IM STRING VORHANDEN IST------->>
		
		boolean StartsWith0;
		boolean EndsWith0;
		
	    StartsWith0 = randomNum.startsWith("0");  // Si el index 0 no contiende 5555 el valor volcado a var5555 es -1
	    EndsWith0 = randomNum.endsWith("0");
	    
	    if (StartsWith0 == true & EndsWith0 == true) {
			System.out.println(randomNum + " Anfang und Ende sind 0");
		}else {
			System.out.println(randomNum + " Anfang und Ende sind nicht 0");
		}
		
		
	    ////////////////////////PRÜFT OB "0" ganz vorne oder hinten IM STRING VORHANDEN IST------->>
	    
	    boolean Contains4711;
	    Contains4711 = randomNum.contains("4711");
	    
	    if (Contains4711 == true) {
			System.out.println(randomNum + " enthält 4711");
		}else {
			System.out.println(randomNum + " enthält nicht 4711");
		}
	    
	    
	}

}























