package Static_Atribute_and_Method;

public class Estatico {

	//private static String frase = "primera frase";  ->>> !!!  // the class OWNS the member/method
	private String frase = "primera frase";
	
	
	public static void main(String[] args) {
		
		Estatico obj1 = new Estatico();
		Estatico obj2 = new Estatico();
		
		obj2.frase = "segunda frase";
		
		System.out.println(obj1.frase);
		System.out.println(obj2.frase);

	}

}

// 						ATRIBUTO ESTATICO
// EXPLICACION ->>> cada objeto hace una copia del atributo "frase" de la
// clase Estatico. Si el atributo ES "ESTATICO" una modificacion como 
// en linea 14 cambia el valor de "frase"("primera frase") y este cambio
//es valido para todos los demas objetos. En ese caso el atributo le pertenece
// a la clase. 

// Si el atributo NO ES estatico, el cambio en linea 14 solo es valido
// para la copia de "frase" que esta usando obj2, pero no para la copia
// de "frase" que usa obj1. Esa copia de "frase"que casa objeto usa le pertenece
// a cada objeto. 

// si el atributo es estatico no tengo que crear un objeto, puedo usar "frase" en mi Main
// escribiendo el nombre de la clase y el atributo, (Estatico.frase)p.e. sysout(Estatico.frase)