package Strings;

import java.util.Arrays;
import java.util.List;

public class StringBuilder1 {

	public static void main(String[] args) {
		
		
		List<String> trees = Arrays.asList("oak","birch", "ash", "elm","yew");
		
		System.out.println(listToString(trees));
		System.out.println(listWithSeparator(trees, ","));
		System.out.println(trees);

	}
				
	
																//// ------> método para convertir una lista de varios Strings en un solo String 
	private static String listToString(List<String> list) { 	// ------> parametro: tipo List<String> y un nombre nuevo que senala "que" entra (una lista)
		
		StringBuilder sb = new StringBuilder(32);
		
		for (String element : list) {   				// <---- el element es el i itinerante y el list es el objeto que entra
			sb.append(element).append(" ");   			// <<<<<<--- le mete el String element (las posiciones de i en una for normal) al StringBuilder sb. 
		}									 			// Dsps appends und espacio vacio con " ". 
		 return sb.toString();
	}
	
	
	
	
	private static String listWithSeparator(List<String>list, String separator) {   // --> aqui se puede meter otro elemento del tipo string
		
		StringBuilder sb2 = new StringBuilder(32);
		
		boolean First = true;
		String asterisco = "*";
		
		for (String element : list) {
		
			if (First) {   //------------> si si hay un elemento, entonces imprime un asterisco
				
				sb2.append(asterisco);
				First = false;            //----> cambia a false para que la for loop pueda entrar a la else
			}else {
				
				sb2.append(element + " ");  //--------> appends al sb2 los elementos + un espacio vacio
				sb2.append(element + separator);  //--------> appends al sb2 los elementos + separador
				 
			}
		
		}
		return sb2.toString();
		
		
	}

}
