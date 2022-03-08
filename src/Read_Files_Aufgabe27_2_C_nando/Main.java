package Read_Files_Aufgabe27_2_C_nando;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// public - it can be called from anywhere
// static - it doesn't have any object state, so you can call it without instantiating an object
// void - it doesn't return anything
//File reading con FileNotFoundException en vez de Try Catch, linea 9!

public class Main {

	

	
	public static void main(String[] args) throws FileNotFoundException{
		
		String dateiadresse = "src/Read_Files_Aufgabe27_2_C_nando/daten1.txt";
		String dateiadresse2 = "src/Read_Files_Aufgabe27_2_C_nando/daten2.txt";
		
		ArrayList<String> etwas = new ArrayList<>();
		ArrayList<String> etwas2 = new ArrayList<>();

		
		etwas.add(dateiadresse);
		etwas2.add(dateiadresse2);
		

		
		leseDateiAnUndZeigeSieAn(etwas);
		leseDateiAnUndZeigeSieAn(etwas2);  // 1.- el valor de retorno "ArrayListreturn" de leseDatei... se guarda aqui
		

		
//		zeigeListeAn(etwas);
//		zeigeListeAn(etwas2);
		
		zeigeListeAn(leseDateiAnUndZeigeSieAn(etwas));
		zeigeListeAn(leseDateiAnUndZeigeSieAn(etwas2));   // 2.- !! y ese valor se puede enviar a zeigeListeAn para procesamiento
		
//		/System.out.println(zeigeListeAn());
		
	}

	
			// METODO 
	
	
		public static ArrayList<String> leseDateiAnUndZeigeSieAn(ArrayList<String> IO ) throws FileNotFoundException{
			// System.out.println(etwas); hasta aqui ok
			
			ArrayList<String> ArrayListreturn = new ArrayList<>();
			String str = "";
			String str2 = "";
			
			for (String s : IO) {
			    str+= s;
			    
			}
			
			//System.out.println(str);// hasta aaqui ok
			File file = new File(str);
			
			try {
				Scanner scan = new Scanner(file);
			
				while(scan.hasNextLine()){   // <<<------solange es eine weitere Zeile gibt dann..
				//System.out.println(scan.nextLine());  << -- imrpime el String
				str2 = scan.nextLine();
				ArrayListreturn.add(str2);
				
				
				}
				
			}catch(FileNotFoundException e) {
				System.out.println("Catch");
				System.out.println(e.getMessage());
			}
			//System.out.println(ArrayListreturn);   <<<- iprime el ArrayListreturn
			return ArrayListreturn;
			
		}
		
		
		
		public static void zeigeListeAn(ArrayList<String> etwas ) {
			
			System.out.println(etwas);
			
		}
		
		
		
}