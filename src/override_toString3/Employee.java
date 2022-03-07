package override_toString3;

public class Employee {

//	private int id;
//	private String name;      // wenn die Fields/Attibute auf private sind kann ich in Main sie nicht aufrufen
	
	public int id;
	public String name;
	
	public Employee() {  // leeres constructor
		
	}
	
	public Employee(int id, String name) {  // 
		super(); // ---------------------------------> im Beispiel wird er automatisch generiert, wofür ist der da?
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + "]";
//	}
	
	
	
	
}
