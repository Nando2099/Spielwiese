package Hashcode_to_String_Print;

public class Hund { 		// Klasse
	
		String name;          // Instanz
	
		Hund(String newName) {    // constructor
			this.name = newName;
				
			}
			
		public String toString() {    // Override del metodo toString para que no bote Hashcode
			return(name);
		}
		
			
}
