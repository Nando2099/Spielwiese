package Vererbung_1;

public class Lehrertest {
	  public static void main(String[] args) {
	    
	    Lehrer meinLehrer;
	    meinLehrer = new Lehrer("Meier", 1982, "Mathe", "Bio");
	    
	    System.out.println(meinLehrer.getName());
	    
	    meinLehrer.schreibeInfo();
	  }
	}
