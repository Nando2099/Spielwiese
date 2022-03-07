package Arrays;

import java.util.Scanner;

public class ArraysUebungNando {

	public static void main(String[] args) {
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		String[] array = new String [4];
		
		System.out.println("Geben Sie den 1. Vornamen ein");
		array[0] = scan.next();
		
		System.out.println("Geben Sie den 2. Vornamen ein");
		array[1] = scan.next();
		
		System.out.println("Geben Sie den 3. Vornamen ein");
		array[2] = scan.next();
		
		System.out.println("Geben Sie den 4. Vornamen ein");
		array[3] = scan.next();
		
		
	
		
//		AUFGABE B
		
//		FOR SCHLEIFE********************
		
//		for (int i = 0; i < array.length; i++) {
//			
//			System.out.println(array[i]);
//		}
		
//		
//		WHILE SCHLEIFE******************
		
//		int i = 0;
//		while (i < array.length){
//			System.out.println(array[i]);
//			i++;
//		}
		
//		DO WHILE SCHLEIFE **************
		
		int i = 0;
		do {
			System.out.println(array[i]);
			i++;
		}while(i < array.length);
		

	}

}
