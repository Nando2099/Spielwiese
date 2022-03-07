package ArrayListCollections;

public class Persona {   // clase Persona
	
	private int id;           // atributos de Persona
	private String nombre;
	private int edad;
	
	public Persona(int id, String nombre, int edad) {        // metodo constructor de Persona
		this.id =id;
		this.nombre = nombre;
		this.edad = edad;
		
	}
	
	
	public int getId() {          // Get
		return id;
	}
	
	public void setId(int id) {   // Set
		this.id = id;
	}
	
	
	
	public String getNombre() {              // Get
		return nombre;
	}
	 
	public void setNombre(String nombre) {     // Set
		this.nombre = nombre;
	}
	
	
	public int getEdad() {                  // Get
		return edad;
	}
	
	public void setEdad(int edad) {            // Set
		this.edad = edad;
	}
	
	
}
