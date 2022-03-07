package Strings;


public class BuildStrings {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("Hello");
		StringBuilder sb3 = new StringBuilder(20);
		
		//druckt die Länge von null, von Hello und von 20
		System.out.println(sb1.length() + " " + sb2.length() + " " + sb3.length());
		
		System.out.println(sb1.length()); //druckt eine 0 aus
		
		sb1.append(sb2 + " you");	//druckt Hello You 
		System.out.println(sb1);	// druckt nichts aus	
		System.out.println(sb3);	// druckt nichts aus
		
		//insert in sb1 den String "and welcome " ab der 6. Stelle in "Hello you"
		sb1.insert(6, "and welcome ");
		System.out.println(sb1);
		
		
		// delete ab der 5. Stelle
		sb1.delete(5,17);
		System.out.println(sb1);
	}
}
