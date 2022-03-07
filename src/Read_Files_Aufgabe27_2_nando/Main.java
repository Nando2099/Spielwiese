package Read_Files_Aufgabe27_2_nando;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

// public - it can be called from anywhere
// static - it doesn't have any object state, so you can call it without instantiating an object
// void - it doesn't return anything
//File reading con FileNotFoundException en vez de Try Catch, linea 9!

public class Main {

	

	
	public static void main(String[] args) throws FileNotFoundException{
		
		String dateiadresse = "src/Read_Files_Aufgabe27_2_nando/daten1.txt";
		String dateiadresse2 = "src/Read_Files_Aufgabe27_2_nando/daten2.txt";
		
		ArrayList<String> etwas = new ArrayList<>();
		ArrayList<String> etwas2 = new ArrayList<>();

		
		etwas.add(dateiadresse);
		etwas2.add(dateiadresse2);
		
		
		leseDateiAnUndZeigeSieAn(etwas);
		leseDateiAnUndZeigeSieAn(etwas2);
		

	}

	
			// METODO 
	
	
		public static void leseDateiAnUndZeigeSieAn(ArrayList<String> etwas ) throws FileNotFoundException{
			System.out.println(etwas);
			
			String str = "";
			
			for (String s : etwas) {
			    str+= s;
			    str+= "\t";
			}
			
			System.out.println(str);// hasta aaqui ok
			
			
			File file = new File(str);
			
			//try {
				Scanner scan = new Scanner(file);
			
				while(scan.hasNextLine()) {   // <<<------solange es eine weitere Zeile gibt dann..
				System.out.println(scan.nextLine());
			
//			}catch(FileNotFoundException e) {
//				System.out.println("Catch");
//				System.out.println(e.getMessage());
//			}
// ************	
	
		}
		
	}

		
}