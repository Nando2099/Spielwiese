package if_Else;

public class IfElse_Aufgabe1 {

	public static void main(String[] args) {
		
			boolean wert = true;
		
			//Primera
		
			if (wert)
				System.out.println(9);
			else
				System.out.println(12);
			
			//Segunda
			
			int ausdruck = wert? 9:12;
			System.out.println(ausdruck);
		
			
			//Tercera
			
			int ausdruck2;
			if (wert) {
				ausdruck2 = 9;
			}else {
				ausdruck2 = 12;
			}
			System.out.println(ausdruck2);
			
			//cuarta
			
			if (wert) {
				ausdruck2 = 9;
				
			}else {
				ausdruck2 = 12;
			}
			System.out.println(ausdruck2);
	}

}
