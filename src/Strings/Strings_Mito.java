package Strings;

public class Strings_Mito {

	public static void main(String[] args) {
		
		String texto = "Domingo lluvioso";
		char captura = texto.charAt(4);  //bota el caracter en posicion 4 del String "texto"
		
		System.out.println(captura);
		
		/////////////////////////////////////// -->> COMPARE 2 STRINGS
		
		String texto2 = "Domingo iLuvioso";
		
		System.out.println(texto.compareTo(texto2));  // si bota un numero(int!) otro que cero
													  // los Strings NO son identicos
		
		System.out.println(texto.compareToIgnoreCase(texto2));  // compara pero ignora 	
																// mayusculas y minusculas
		
		
		
		/////////////////////////////////////--> CONCATENA STRINGS
		
		System.out.println(texto.concat(texto2)); 
		
		
		
		///////////////////////////////////-->> SI UN STRING CONTIENE OTRO
		
		System.out.println(texto.contains(texto2)); // -> bota falso
		
		
		
		//////////////////////////////////--> posicion de un string o caracter dentro del string
		
		System.out.println(texto.indexOf("Dom")); // -> bota falso
		
		
		
		//////////////////////////////////-->  cantidad de caracteres
		
		System.out.println(texto.length()); // -> bota 16 (incluye espacios vacios)
		
		
		///////////////////////////////--> substrae caracteres del string con parametros
		
		System.out.println(texto.substring(3,9)); // desde el caracter 3 al 9 extrae todo
		
		
		
	}

}
