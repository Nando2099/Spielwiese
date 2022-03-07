package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListProj {

	public static void main(String[] args) {
		
		String[] fruits = new String[4];    // un String Array
		
		fruits[0] = "Mango";
		fruits[1] = "Pear";
		fruits[2] = "Apple";
		fruits[3] = "Whatever";
		System.out.println(fruits[1]);  // man kann eine Liste so machen, prints "Pear"
		System.out.println(fruits.length); // imprime el tamano del Array (cuantas posiciones)
		
		
		System.out.println("-------------------------------");
		
		
		String[] fruits2 = {"Mango2", "Pear2", "Apple2", "Whatever2"};
		System.out.println(fruits2[2]);		// imprimir un valor en
		
		fruits2[1] = "Frambuesa";     	// cambiar un valor en un Array
		System.out.println(fruits2[1]);  
		
		System.out.println("-------------------------------");
		
		
		ArrayList fruitList = new ArrayList();  // und ArrayList. ArrayList can only hold objects, not primitives
		
		fruitList.add("Mango");
		fruitList.add("Pear");
		fruitList.add("Apple");
		fruitList.add("Whatever");
		
		System.out.println(fruitList);
		System.out.println(fruitList.contains("Papaya"));   // bota falso
		
		System.out.println("-------------------------------");
		
		ArrayList<String> fruitList2 = 
				new ArrayList<>(Arrays.asList("Maracuja","Cereza","Pacae"));
		System.out.println(fruitList2);			//imprimir todos los valores
		System.out.println(fruitList2.get(2));  // imprimir un solo valor
		System.out.println(fruitList2.size()); 	// imprime el tamano del arrayList
		
		fruitList2.add("Sandia");					// sumar un valor al ArrayList
		System.out.println(fruitList2.get(3));		// imprimir ese valor nuevo
		
		System.out.println("-------------------------------");
	}

}
