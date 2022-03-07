package Subclass_and_Superclass_Tutorial;

public class Running extends Shoe{

	public final double weight;
	
	Running(double weight, String brand, double size) {
		super(brand, size);
		this.weight = weight;
		
	}
	
	void isRunning() {
		
		if(brand == "Adidas") {
			
			
			System.out.println("Im Running with " + brand );
		}else {
			
			System.out.println("Im not running with " + brand);
		}
		
	}

}
