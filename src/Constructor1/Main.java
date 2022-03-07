package Constructor1;


public class Main {
	
	public static void main(String[] args) {
	
	Shirt s = new Shirt();
	s.setColor("White");
	s.setSize('M');
	
	s.putOn();  // aufruf putOn Methode
	System.out.println(s.color);  // 
	System.out.println(s.size);  // 
}
}



// A constructor in Java is a special method that is used to initialize objects. 
//The constructor is called when an object of a class is created. 
//It can be used to set initial values for object attributes.