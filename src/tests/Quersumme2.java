package tests;

public class Quersumme2 {

	public static void main(String[] args) {
		
		int zahl = 155;
		
		System.out.print("Quersumme = " + quersumme(zahl));

	}
	
	public static int quersumme(int zahl) {
		
		if (zahl <= 9) 
			return zahl;
		
			return zahl%10 + quersumme(zahl/10);
		
	}

}
