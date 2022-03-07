package Ueberlauf;

public class QuersummerMitShort {

	public static int erg;
	
	public static void main(String[] args) {
				
		rechne();
		gebeAus();
		
	}
	
	//Eingabe in CHAR
	public static final short ZIFFER_1 = '1';
	public static final short ZIFFER_2 = '2';
	public static final short ZIFFER_3 = '3';
	public static final short ZIFFER_4 = '4';
	public static final short ZIFFER_5 = '5';
	
	public static void rechne() {
		
		erg=(int)(ZIFFER_1 -'0');
		erg=erg+(int)(ZIFFER_2 -'0');
		erg=erg+(int)(ZIFFER_3 -'0');
		erg=erg+(int)(ZIFFER_4 -'0');
		erg=erg+(int)(ZIFFER_5 -'0');
		
		
	}

	public static void gebeAus() {
		System.out.println("Die Quersumme is: \t" +erg);
	}
	
}
