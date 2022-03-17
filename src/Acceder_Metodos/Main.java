package Acceder_Metodos;

public class Main { // 					LLAMAR METODOS ESTATICOS Y PUBLICOS
	
		static String Pepito;
		String Jorge;
	
	  // STATIC VOID METHOD
	  static void myStaticMethod() {
	    System.out.println("Static methods can be called without creating objects");
	    
	  }
	  
	  
	  //STATIC VOID METHOD WITH PARAMETERS
	  static void myStaticMethodWithParameters(String name) {
		  
		  System.out.println(name);
		  Pepito = "frfr";          // <- Ich kann aus der static methode auf statische attr. zugreifen
		  Main.Pepito = "fefe";		// <- Ich kann aus der static methode auf statische attr. zugreifen
		  
		  //Jorge = "vsvs";			// <- Ich kann aus der static methode NICHT auf statische attr. zugreifen
	  }
	  
	  
	  //STATIC INT METHOD WITH PARAMETERS
	  static int myStaticIntMethodWithParameters(int nummer) {
		  System.out.println(nummer);
		  return nummer;   // no es void, por eso necesita un return
	  }
	  
	  
	  
	  
	  
	  

	  // PUBLIC VOID METHOD
	  public void myPublicMethod() {
	    System.out.println("Public methods must be called by creating objects");
	    Main.Pepito = "ww"; 		// <- Ich kann aus der PUBLIC methode auf statische attr. zugreifen
	    Pepito = "xaxa";			// <- Ich kann aus der PUBLIC methode auf statische attr. zugreifen
	    
	    Jorge = "xyxy";				// <- ich kann aus der PUBLIC methode auf NICHT statische attr. zugreifen
	  }
	  
	  
	  // PUBLIC VOID METHOD WITH PARAMETERS
	  public void myPublicMethodWithParameters(String name) {
	    System.out.println(name);
	  }

	  
	  // PUBLIC INT METHOD WITH PARAMETERS
	  public int myPublicIntMethodWithParameters(int numero) {
		  System.out.println(numero);
		  return numero;
	  }
	  
	  
	  
	  
	  
	  // MAIN METHOD
	  public static void main(String[] args) {
		  
		  // ++++++++++++ STATIC METHODS +++++++++++
		  
	    myStaticMethod(); 													// Call the STATIC method
	    // myPublicMethod(); This would compile an error

	    
	    myStaticMethodWithParameters("Pedro");  							// call the STATIC METHOD WITH PARAMETERS
	    
	    
	    myStaticIntMethodWithParameters(99);								// se puede enviar al metodo para impr o return
	    Main.myStaticIntMethodWithParameters(8);
	    																	
	    
	    int y = 0;
	    y = myStaticIntMethodWithParameters(99);							// se puede enviar y el resultado que bota el met se guarda en "y"
	    
	    System.out.println(myStaticIntMethodWithParameters(101));			//*** no hay que usar un objeto!
	    
	    
	    
	    
	    // +++++++++++++++PUBLIC METHODS +++++++++++++
	    
	    
	    Main myObj = new Main(); // Create an object of Main
	    myObj.myPublicMethod(); 											// Call the PUBLIC method on the object
	    
	    
	    Main myObj2 = new Main(); // Create an object of Main
	    myObj2.myPublicMethodWithParameters("Juana"); 						// Call the PUBLIC METHOD WITH PARAMETERS
	    
	    
	    Main myObj3 = new Main();
	    myObj3.myPublicIntMethodWithParameters(555);
	    System.out.println(myObj3.myPublicIntMethodWithParameters(777));  	// *** hay que usar el objeto myOjb3 !
	    
	    myObj.Jorge = "dada";  // objeto de la clase Main puede cambiar el atributo no estatico
	    Main.Pepito = "dudu"; // aqui hay que llamar a la clase Main y a su atributo estatico para cambiarlo
	    
	  }
	}


//			PARA LLAMAR A UN METODO ESTATICO NO SE NECESITA CREAR UN OBJETO
//			PARA LLAMAR A UN METODO PUBLICO HAY QUE CREAR UN OBJETO


			// PUBLIC NECESITA UN OBJETO PARA SER LLAMADO -> myObj3.myPublicIntMethodWithParameters(555);
			// STATIC NO NECESITA UN OBJETO PARA SER LLAMADO -> myStaticIntMethodWithParameters(99);

			// METODOS CON VOID NO NECESITA UN RETURN . METODO VOID NO RETORNA NADA!
			// METODOS SIN VOID NECESITAN UN RETURN
