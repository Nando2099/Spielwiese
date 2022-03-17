package Vererbung_1;

public class Person {
	
	  // Attribute
	  private String name;
	  private int geburtsjahr;
	  
	  
	  // Konstruktor
	  public Person(String pName, int pGeburtsjahr){
	    name = pName;
	    geburtsjahr = pGeburtsjahr;
	  }
	  
	  
	  // get-Methoden
	  public String getName(){
	    return name;
	  }
	  
	  
	  public int getGeburtsjahr(){
	    return geburtsjahr;
	  }
	  
	  public void schreibeInfo() {
		System.out.println("Mein Name ist: " + name + "." + " Ich in im Jahr " + geburtsjahr + " geboren.");  
		
	  }
	  
	}