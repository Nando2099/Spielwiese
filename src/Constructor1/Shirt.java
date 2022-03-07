package Constructor1;



public class Shirt {

	public static String color;   // instanz variable
	public static char size;		// instanz variable
	
	
	public static void putOn() {
		System.out.println("Shirt is on!");  // Methode
	}
	
	public static void putOff() {
		System.out.println("Shirt is off!"); // Methode
	}
	
	public static void setColor(String newColor) { //metodo Set para color
		color = newColor;
	}
	
	public static void setSize(char newSize) { //metodo Set para size
		size = newSize;
	}
}
