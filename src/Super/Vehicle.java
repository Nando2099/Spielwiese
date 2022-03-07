package Super;

// EJEMPLO DE SUPER KEYWORD PARA VARIABLES Y METODOS

// esta es la super clase
class Vehicle {
	int maxSpeed = 120;
	
	public void vroom() {
		System.out.println("Vroom Vroom");
	}
}

// esta es la sub-clase
class Car extends Vehicle {
	
	int maxSpeed = 100;
	
	public void vroom() {
		super.vroom(); // <- bezieht, da "super", auf die Methode in Zeile 9
	}
	public void display() {
		System.out.println(maxSpeed);   // imprime el valor de maxSpeed en la sub-clase Car
		System.out.println(super.maxSpeed); // imprime el valor de maxSpeed en la superclase Vehiculo
	}
}


	