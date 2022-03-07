package Constructors_Aufgabe_25_Pouya;

public class KonstruktorVerkettung {

	
	
	private int attribut1;
	private int attribut2;
	private int attribut3;
	private static boolean erster=true;

	
	
// InitialisierungsBlock
	{
		attribut1 = 888;
		attribut2 = 888;
		attribut3 = 888;
		
		if (erster) {

			System.out.println("Bin da wer noch? ");
			erster = false;
	
		}else
			System.out.println("Ich bin auch da!");
	}

	
	
	
	KonstruktorVerkettung(){
			System.out.println("Guten Tag, mein Name ist Zero");
		attribut1 = 999;
		attribut3 = 999;
		attribut2 =999;
			
	}
	
	
	KonstruktorVerkettung(int attribut1){
		this();                              // this ruft die den default konstruktor mit seinen werten auf (linie 32) 
		System.out.println("Guten Tag mein, name ist Alan");
		this.attribut1 = attribut1;
	}	
	
	
	KonstruktorVerkettung(int attribut1 , int attribut2){
		//this();											// wäre hier this(); aktiv würde in der ausgabe 999 anstatt 888 stehen
		System.out.println("Gutene Tag, mein Name ist Bert");
		this.attribut1 = attribut1;
		this.attribut2 = attribut2;
	}
	
	
	KonstruktorVerkettung(int attribut1 , int attribut2 ,int attribut3){
		System.out.println("Guten Tag, mein Name ist Chris");
		this.attribut1 = attribut1;
		this.attribut2 = attribut2;
		this.attribut3 = attribut3;
		
	}

	
	@Override
	public String toString() {
		return "KonstruktorVerkettung [attribut1= " + attribut1 + ", attribut2= " + attribut2 + ", attribut3= " + attribut3
				+ "]";
	}


//	https://stackoverflow.com/questions/2374269/what-does-this-do-in-a-constructor
//	The "this()" in your last constructor is just telling that constructor to call the default constructor 
//	as part of the process of constructing the object. It does not create two objects, it just runs the 
//	code in the def. constructor, which in your case, does nothing.


	
	
}