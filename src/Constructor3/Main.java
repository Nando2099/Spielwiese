package Constructor3;

public class Main {
	
	
	public static void main(String[] args) {
		Person paul = new Person("Paul", 24);
	    Person ada = new Person("Ada", 21);

	    System.out.println(paul);
	    System.out.println(ada);
	    
	    paul.isAdult();
	}
	
	
	

	

}


//A constructor in Java is a special method that is used to initialize objects. 
//The constructor is called when an object of a class is created. 
//It can be used to set initial values for object attributes.