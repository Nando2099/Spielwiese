package GettersAndSetters;

public class Account {

	String name;
	int age;
	
	
	
	public static void main(String[] args) {
		
		Account a = new Account();
		
//		a.age = 34;			// diese deklaration wird nicht mehr gebraucht wenn man mit setage deklariert, line20
//		a.name = "Pablo";  // diese deklaration wird nicht mehr gebraucht wenn man mit setName deklariert, line21
		
//		System.out.println(a.age);
//		System.out.println(a.name);
		
		
		a.setName("Pablox"); //hiermit ändere ich den Wert der in newName reinkommt und mit "age" gleichgemacht wird
		a.setAge(39);
		
		a.printDetails(); // print nachdem ich den Wert geändert habe also print Pablox und nicht Pablo
		
		System.out.println(a.getName());
		System.out.println(a.getAge());
		
		
	}
	
	public void setName(String newName) { // Setter method!
		this.name = newName;
	}
	
	
	public void setAge(int newAge) { // Setter method!
		this.age = newAge;
	}
	
	
	
	
	public String getName() {        // Getter method!
		return this.name;
	}
	
	
	public int getAge() {        // Getter method!
		return this.age;
	}
	
	
	
	
	public void printDetails() {
		System.out.println(name + "," + age);
	}
	
	
}
