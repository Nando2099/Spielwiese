package Constructor2;


public class Main {
	
	public static void main(String[] args) {
	
	Shirt s = new Shirt("White",'M');
	Shirt f = new Shirt("Red",'S'); // <<<-- si le saco el static a la clase este objeto imprime "RED, S"
	
	
	
	System.out.println(s.color);
	System.out.println(s.size);
	
	
	
	
	System.out.println(f.color); 
	System.out.println(f.size);
	

}
}

//A constructor in Java is a special method that is used to initialize objects. 
//The constructor is called when an object of a class is created. 
//It can be used to set initial values for object attributes.