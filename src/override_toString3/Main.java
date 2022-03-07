package override_toString3;

public class Main {

	public static void main(String[] args) {
		
		String data = "Hello World";
		System.out.println(data.toString());  // man kann auch System.out.println(data); schreiben da toString bei print 
											//automatisch aufgerufen wird.
		
		
		Employee emp = new Employee(35, "Juan");
		System.out.println(emp.toString());   // um hier keinen Hash zu bekommen muss ich die toString methode
												// in der Klasse Employee überschreiben
		System.out.println(emp.name);
		System.out.println(emp.getName());
	}

}
