package Read_and_write_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// File reading con FileNotFoundException en vez de Try Catch, linea 12!


public class FileReader3000_PlusWriter {

	public static void main(String[] args) throws IOException {
		
		File file = new File("src/Read_and_write_File/archivodetexto.txt");
		Scanner scan = new Scanner(file);
		
		String fileContent = "";   // <<<- AQUI puedo escribir texto y se guarda dentro del 
									//nuevo archivo en linea 28 !!
		
		while(scan.hasNextLine()) { // <<<-------- wenn es eine weitere Zeile gibt dann..
			fileContent = fileContent.concat(scan.nextLine() + "\n");
		}
		
		//System.out.println(fileContent);	
			
		FileWriter writer = new FileWriter("src/Read_and_write_File/archivoCreadoConWriter.txt");
		writer.write(fileContent); //<< el primer write es el de 28 el otro es un metodo que escribe un String, en el parametro va otro String
		writer.close();
		
	}

}
