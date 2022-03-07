package if_Else;
import java.util.Scanner;

public class ifelseTest {

	public static void main(String[] args) {
	
		
		int a = 10;
		int b = 100;
		
		// AUFGABE EINS
		Scanner Eingabe = new Scanner(System.in);
		
		System.out.println("Bitte Nummer eingeben");
		int x = Eingabe.nextInt();
			
//		if (x >= a && x <= b) {
//			
//			System.out.println("drin");
//		}else {
//			System.out.println("Ausserhalb");
//		}
		
		
		// AUFGABE ZWEI
		
		
		if (x >= a) {
			if (x <= b) {
				System.out.println("ist drin");
			}
		}else {
			System.out.println("ist ausserhalb");
		}
		

	}

}
