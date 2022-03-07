package Read_and_write_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// File reading con FileNotFoundException en vez de Try Catch, linea 12!


public class FileReader3000 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("src/Read_and_write_File/archivodetexto.txt");
		
		Scanner scan = new Scanner(file);
		
		while(scan.hasNextLine())   // <<<-------- wenn es eine weitere Zeile gibt dann..
		System.out.println(scan.nextLine());
		
		
		
	}

}
