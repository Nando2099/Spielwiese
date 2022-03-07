package tests;


interface WaterbottleInterface{
	
	String color = "blue";
	
	void fillUp();
	void pourOut();
}


	public class interfaceExample implements WaterbottleInterface{

	public static void main(String[] args) {
	 System.out.println(color);
	 
	 interfaceExample ex = new interfaceExample();
	 ex.fillUp();

	}

	@Override
	public void fillUp() {
		System.out.println("It is filled");
		
	}

	@Override
	public void pourOut() {
		// TODO Auto-generated method stub
		
	}

}
