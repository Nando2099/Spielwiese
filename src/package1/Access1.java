package package1;

public class Access1 {

	// default, public, private and protected
	
	//int hours = 3;
	//int minutes = 47;   DEFAULT
	
	//public int hours = 3;    PUBLIC se pueden accesar dedse otros packages
	//public int minutes = 47;
	
//	private int hours = 3;     PRIVATE se acceden solo desde el mismo archivo
//	private int minutes = 47; 
		
	protected int hours = 3;
	public int minutes = 47; 
	
	void imprimir(){
		System.out.println("yes");
	}
	
	void imprimir2() {
		System.out.println(hours);
	}
	
	public int getHours() {
		return hours;
	}
	
	}
	

