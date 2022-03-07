package Acceder_Metodo_de_otra_Clase;


   //**** LA IDEA DE CONSTRUCTORES ES QUE NOS PERMITEN CREAR OBJETOS CON DIFERENTES VALORES PREDEFINIDOS ******//


class calcular{  // no puede ser public a menos que   // -------------------> CLASE CALCULAR
				// sea en un archivo separado
	int x;
	int y;
	
	
	calcular(int x, int y){   // Konstruktor
		this.x = x;
		this.y = y;
		
	}
	
	public void MetodoCalcular() {
		
		System.out.println(x + y + " resultado del metodo calcular");
	}
	
	
	
}



public class rechne {

	
	public static void main(String[] args) {  // ------------> MAIN
		int a = 2;
		int b = 3;
		int d = 5;
		int e = 6;

		berechnen(a,b);
	
		
		calcular obj = new calcular(a,b);  // el "calcular" verde representa el contructor de la clase calcular
		calcular obj1 = new calcular(d,e);
		obj.MetodoCalcular(); 
		obj1.MetodoCalcular();
		
		System.out.println(obj1.x + " asi se accede una variable");
		
	}

	 private static void berechnen(int a, int b) {   // ------------ >> METODO BERECHNEN de la clase rechne
			int c = 0;
			
			c = a + b; 
			System.out.println(c + " resulado del metodo berechnen");
			
			
			
			

		}
	 
	 
}

