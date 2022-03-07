package Subclass_and_Superclass_Tutorial;

public class Walking extends Shoe{

	public final boolean goreTex;
	
	Walking(boolean goreTex, String brand, double size){
		super(brand,size); // es necesario (en ese orden y ANTES de goreTex linea 9) para usar brand y size del otro constructor. 
		this.goreTex = goreTex;
	}
	
}
