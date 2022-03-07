package Subclass_and_Superclass_Tutorial;

public class Main {

	public static void main(String[] args) {
		
		Shoe BaseShoe = new Shoe("Nike", 38.5);
		
		Running Rs1 = new Running(200.0, "Adidas", 42.0);
		
		System.out.println(Rs1.brand);
		
		Rs1.isRunning();
		Rs1.Sole();

	}

}
