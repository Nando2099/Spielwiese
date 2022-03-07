package Constructor2;

public class Shirt {

	public String color;   // instanz variable
	public char size;		// instanz variable
	
	
	Shirt(){} // tambien constructor, sin parametros
		
	Shirt(String newColor, char newSize) {  //Constructor de la clase Shirt
		color = newColor;
		size = newSize;
	}
	
	
	
	public static void putOn() {
		System.out.println("Shirt is on!");  // Methode
	}
	
	public static void putOff() {
		System.out.println("Shirt is off!"); // Methode
	}
	
	
	
	public void setColor(String newColor) { //metodo Set para color
		color = newColor;
	}
	
	public void setSize(char newSize) { //metodo Set para size
		size = newSize;
	}
}
