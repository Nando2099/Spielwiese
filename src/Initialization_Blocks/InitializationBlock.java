package Initialization_Blocks;

public class InitializationBlock {
	
	{
		System.out.println("Instance Block 1");
	}
	
	
	
	static {
		System.out.println("static block 1");
	}
	
	
	
	{
		System.out.println("Instance Block 2");
	}
	
	
	
	static {
		System.out.println("static block 2");
	}

	
	public static void main(String[] args) {
		
		// sin objetos creados al ejecutar la clase solo se imprimen los static blocks
		
		// con objetos creados se ejecutan todos. Los static blocks solo una vez.
		
		InitializationBlock obj1 = new InitializationBlock();
		System.out.println("********");
		InitializationBlock obj2 = new InitializationBlock();

	}

}
