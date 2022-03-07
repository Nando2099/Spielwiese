package Super;

public class Main {
	
	public static void main(String[] args) {
	
	Car c = new Car();
	System.out.println(c.maxSpeed); // maxSpeed es un atributo de la superclase Vehicle y la Subclase Car
	c.display(); // display es un metodo en la subclase Car
	c.vroom(); // vroom es un metodo de la clase )
}
}