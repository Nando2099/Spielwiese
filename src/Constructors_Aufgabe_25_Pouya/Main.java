package Constructors_Aufgabe_25_Pouya;



import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList <KonstruktorVerkettung> aryL = new ArrayList<KonstruktorVerkettung>();
		KonstruktorVerkettung k1 = new KonstruktorVerkettung();
		KonstruktorVerkettung k2 = new KonstruktorVerkettung(1);
		KonstruktorVerkettung k3 = new KonstruktorVerkettung(1,2);
		KonstruktorVerkettung k4 = new KonstruktorVerkettung(1,2,3);
		
		
		aryL.add(k1);
		aryL.add(k2);
		aryL.add(k3);
		aryL.add(k4);
		for(KonstruktorVerkettung i : aryL ) {
			
			System.out.println(i.toString());
			
		}
	}

}


//A constructor in Java is a special method that is used to initialize objects. 
//The constructor is called when an object of a class is created. 
//It can be used to set initial values for object attributes.