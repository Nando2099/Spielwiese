package Read_and_write_File;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader3000TryCatch {

	public static void main(String[] args) {
		
		File file = new File("src/Read_and_write_File/archivodetexto.txt");
		
		try {
			Scanner scan = new Scanner(file);
			
			while(scan.hasNextLine())   // <<<-------- wenn es eine weitere Zeile gibt dann..
				System.out.println(scan.nextLine());
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}