package GettersAndSetters;

public class Vehicle{
	
	private String color;
	private int Baujahr;
	
	// Getter and Setter Color
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String c) {
		this.color = c;
		
	}
	
	
	// Getter and Setter Baujahr
	
	
	public int getBaujahr() {
		return Baujahr;
	}
	
	
	public void setBaujahr(int b) {  //dejo validez a Bj. 1980 a 2000 
		if (b < 1980 || b > 2000) {
			throw new IllegalArgumentException(); //si no cumple bota error
		}
		this.Baujahr = b;
	}
	
}