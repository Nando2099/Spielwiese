package Read_Files_Aufgabe27_1_nando;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

// public - it can be called from anywhere
// static - it doesn't have any object state, so you can call it without instantiating an object
// void - it doesn't return anything
//File reading con FileNotFoundException en vez de Try Catch, linea 9!

public class Main {

	

	
	public static void main(String[] args) throws FileNotFoundException{

		
		String dateiadresse = "src/Read_Files_Aufgabe27_1_nando/daten1.txt";
		String dateiadresse2 = "src/Read_Files_Aufgabe27_1_nando/daten2.txt";
		
		leseDateiAnUndZeigeSieAn(dateiadresse);
		leseDateiAnUndZeigeSieAn(dateiadresse2);
		System.out.println("************");
		leseDateiAnUndZeigeSieAnFor(dateiadresse);
		leseDateiAnUndZeigeSieAnFor(dateiadresse2);

	}

	
	
			// METODO 
	
	
		public static void leseDateiAnUndZeigeSieAn(String dateiadresse)throws FileNotFoundException {
			
			File file = new File(dateiadresse);
			
			Scanner scan = new Scanner(file);
			
			while(scan.hasNextLine()) {   // <<<------solange es eine weitere Zeile gibt dann..
			System.out.println(scan.nextLine());
			}
		}

		
		
			// METODO CON FORLOOP 
		
		
		public static void leseDateiAnUndZeigeSieAnFor(String dateiadresse){
			String allezeilen = "";
			
			File file = new File(dateiadresse); //file puede ser declarado fuera del try
			
			try {
				
				Scanner scan = new Scanner(file); // scan tiene que ser declarado dentro del try
			
				for (int i = 0; i < Integer.MAX_VALUE; i++) {
				
					try {
						allezeilen = scan.nextLine();
				
					}catch (NoSuchElementException e){
						break;
						
					}
						System.out.println(allezeilen);
				}
				
				
			
			}catch(FileNotFoundException e){
				System.out.println("Catch");
				System.out.println(e.getMessage());
			}
		}
		
}
