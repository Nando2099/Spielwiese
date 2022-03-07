package ArrayListCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Persona> lista = new ArrayList<>();		// el array "lista" metiendo objetos de la clase Persona
		lista.add(new Persona(1,"Antonio",25));           
		lista.add(new Persona(2,"Barbara",24));
		lista.add(new Persona(3,"Cassandra",23));
		
//		List<String> listaString = new ArrayList<>(); // otra forma de hacer un array 
//		listaString.add("Pepe");
//		listaString.add("Juan");
//		listaString.add("Pedro");
		
		//Collections.sort(lista, new NombreComparator());  // ordena de menor a mayor
		Collections.sort(lista, new Comparator<Persona>() {

			@Override
			public int compare(Persona per1, Persona per2) {
				
				int rpta = 0;
				if (per1.getEdad() > per2.getEdad()) {
					rpta = 1;
				
				}else if (per1.getEdad() < per2.getEdad()) {
					rpta = -1;
				}else{
					
					rpta = 0;
				}
				return rpta;
			}
				
		});
				
		//Collections.reverse(lista); // ordena en el orden contrario que en la lista (linea 12 a 14)
		
//		Collections.sort(listaString);
//		Collections.reverse(listaString);
		
		for(Persona p : lista) {
			System.out.println(p.getId());
		}
		
		for(Persona p : lista) {
			System.out.println(p.getNombre());
		}
		
		for(Persona p : lista) {
			System.out.println(p.getEdad());
		}
		
		System.out.println(lista);
//		System.out.println(listaString);
	}

}
