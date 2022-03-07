package Exception_Aufgabe_26_1_nando;

import java.util.Arrays;

public class Aufgabe3 {

	public static void main(String[] args) {
		
		System.out.println("Start-main()");
		
		int [] zahlen = {0,2,3};
		
		try {
		System.out.println(zahlen[1]/ zahlen[0]);
		System.out.println(zahlen[4]);
		}catch(ArithmeticException e) {
		
		System.out.println(e);
		System.out.println(Arrays.toString(e.getStackTrace()));
		}
		System.out.println("Ende-main");

	}

}
