package Vererbung_1;

public class Lehrer extends Person {
	
	
	  // Attribute
	  private String erstesFach;
	  private String zweitesFach;
	  
	  
	  // Konstruktor
	  public Lehrer(String pName, int pGeburtsjahr, String pErstesFach, String pZweitesFach){
	    super(pName,pGeburtsjahr);
	    erstesFach = pErstesFach;
	    zweitesFach = pZweitesFach;
	  }
	  
	  
	  // get-Methoden
	  public String getErstesFach(){
	    return erstesFach;
	  }
	  
	  
	  public String getZweitesFach(){
	    return zweitesFach;
	  }
	  
	  public void schreibeInfo() {
		  super.schreibeInfo(); // super para llamar al metodo de la clase padre
		  System.out.println("Ich unterrichte: " + erstesFach + " und " + zweitesFach);
	  }
	}