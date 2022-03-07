package Static_Atribute_and_Method;

public class Estatico3 {
	  // Static method
	  static void myStaticMethod() {
	    System.out.println("Static methods can be called without creating objects");
	  }

	  // Public method
	  public void myPublicMethod() {
	    System.out.println("Public methods must be called by creating objects");
	  }

	  // Main method
	  public static void main(String[] args) {
	    myStaticMethod(); // Call the static method

	    Estatico3 myObj = new Estatico3(); // Create an object of MyClass
	    myObj.myPublicMethod(); // Call the public method
	  }
	}



// linea 5: el metodo estatico puede ser usado como en linea 16 sin necesidad de crear un objeto
// linea 10: el metodo NO ESTATICO solo puede ser usado creando un objeto como en linea 18/19