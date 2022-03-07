package Strings;

public class String_To_Int_to_String {

	public static void main(String[] args) {
		
		String decimal = "88";
		String texto = "99";
		int suma = Integer.parseInt(texto) + 1;
		
		
		
		//////////////////////////VOLVER String a int
		
		System.out.println(suma);  //Bota 100
		
		//oder
		
		System.out.println(Integer.parseInt(texto) + 4); //bota 103

		
		////////////////////////// VOLVER String a boolean
		System.out.println(Boolean.parseBoolean(decimal));   // bota false
		
		
		//////////////////////////VOLVER String a double
		System.out.println(Double.parseDouble(decimal));    // bota 88.0
		
		
		
		///////////////////////// VOLVER INT A STRING ->
		
		int n = 11;
		int f = 14;
		System.out.println(Integer.toString(n) + f);  // bota 11 14
		
		
		//////////////////////// String a int con caracteres mezcaldos ->
		
		String s = "age: 47";
		s = s.replaceAll("\\D+", "");
		System.out.println(s);                      // bota "47"
		System.out.println(Integer.parseInt(s));	// bota 47 (numero integral)
		
	}

}

// 

//Integer: this class provides several methods for convertingan int to a String and a String to an int,
//as well as other constants and methods useful whendealing with an int.

// convierte el 99 (como String) en un 99 numérico y este se puede sumar con un numérico.