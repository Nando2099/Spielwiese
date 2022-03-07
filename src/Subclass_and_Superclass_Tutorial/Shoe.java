package Subclass_and_Superclass_Tutorial;

public class Shoe {

	public final String brand;
	public final double size;
	
	Shoe(String brand,double size) {
		this.brand =  brand;
		this.size = size;
	}
	
	void Sole(){
		System.out.println("These shoes have rubber soles!");
	}
	
}
