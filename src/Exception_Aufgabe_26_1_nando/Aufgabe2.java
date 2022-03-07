package Exception_Aufgabe_26_1_nando;

import java.util.Arrays;

public class Aufgabe2 {

	public static void main(String[] args) {
		System.out.println("Start-main");
		
		//String nachname = "lalo";     --> asi si funciona
		String nachname = null;
		
		System.out.println(nachname);
		
		try {
			
		System.out.println(nachname.toString());

			
		
		for (int i = 0; i < nachname.length(); i++)
			System.out.println(nachname.charAt(i));
		
		}catch(NullPointerException e) {
			System.out.println(e);
			System.out.println(Arrays.toString(e.getStackTrace()));
		}
		System.out.println("Ende-main");
	}

}
