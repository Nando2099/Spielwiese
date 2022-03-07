package Arrays;

public class ParameterizedMain {

	public static void main(String[] args) {
		
		// String array 'args' kommt aus der Kommandozeile in der Konsole
		// oder wird in einer Batch Datei gesetzt
		String par = "";
		
		if(args.length > 0) {
			par = args[0];
			System.out.println(par);
		}
		else
			System.out.println("nothing found");
	}
}
