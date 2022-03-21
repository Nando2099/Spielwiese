

// al colocar un metodo abstracto "poop" dentro de la clase abstracta "Dog" es necesario
// instanciar un metodo "poop" dentro de la clase que extiende "chihuahua". 
// la clase abstracta se usa para crear metodos abstractos que las clases que la 
// extienden tienen que tener. En este caso chihuahua extiende Dog y tiene que 
// crear su propio metodo "poop" pero no su propio metodo "bark". 
// * la clase abstracta Dog NO puede crear objetos!


abstract class Dog{ // -------------------------> CLASE ABSTRACTA DOG
	
	String breed;
	
	public void bark() {// ----------------------> chihuahua no tiene que implementar
		System.out.println("Bark!");			//bark ya que no es abstract
	}
	
	public abstract void poop();  // ------------> la clase que la subclase tiene q 
									// 				implementar. NO tiene cuerpo!
}

 
class chihuahua extends Dog{ // ----------------> CLASE NORMAL CHIHUAHUA EXTIENDE DOG
	
	public void poop() { //--------------------> metodo poop que chihuahua tuvo que implementar (con cuerpo!)
		System.out.println("Dog pooped!");
	}
	
}



public class Abstract_Demo {

	
public static void main(String[] args) {
		
		chihuahua c = new chihuahua();
		
		c.bark();
		c.poop();

	}

}
