package Arrays;

import java.util.ArrayList;

public class ArrayList_ForLoop {

	public static void main(String[] args) {
		
		
		System.out.println("**************con Strings************");
		
		String txt = new String("1");
		
		System.out.println(txt);
		
		
		
		ArrayList<String> fruits = new ArrayList<String>();
		
		fruits.add("Pera");
		fruits.add("Manzana");
		fruits.add("Sandia");
		fruits.add("Platano");
		fruits.add("Melon");
		
		// fruits.set(0, "Volkswagen"); reemplaza Pera por Volkswagen
		// fruits.add(2, "Mercedes Benz"); coloca a Mercedes Benz en pos 2
		
		System.out.println(fruits.contains("Sandia")); // busca objeto Sandia (boolean)
		
		for (int i = 0; i< fruits.size(); i++) {
			
			System.out.println(fruits.get(i));
		}
		
		
		System.out.println("**************con integrales************");
		
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		
		Integer zahl = 99;
		numeros.add(zahl);
			
		System.out.println(numeros.get(0));
		
		System.out.println(numeros.contains(2)); // busca int 2 (boolean)
		
		for (int i = 0; i< numeros.size(); i++) {
			
			System.out.print(" " + numeros.get(i));
		}

	}

}
