package Constructors_Aufgabe_25_nando;

public class KonstruktorVerkettung {

	
	int attribut1;
	int attribut2;
	int attribut3;
	
	KonstruktorVerkettung(){
		attribut1 = 9; // --------------> wären hier keine Werte wäre die Ausgabe 0 0 0 
		attribut2 = 9;
		attribut3 = 9;
	}
	
	KonstruktorVerkettung(int attribut1){
		this(); // -----------------------------> füllt die fehlenden werte attribut2 und attribut3 mit "9". attribut1 bleibt erhalten 
		this.attribut1 = attribut1;
	}


	KonstruktorVerkettung(int attribut1,int attribut2){
		//this();  ------------------------------------------> !
		this.attribut1 = attribut1;
		this.attribut2 = attribut2;
	}

	
	KonstruktorVerkettung(int attribut1, int attribut2, int attribut3){
		this.attribut1 = attribut1;
		this.attribut2 = attribut2;
		this.attribut3 = attribut3;
	}

	@Override
	public String toString() {
		return "KonstruktorVerkettung [attribut1=" + attribut1 + ", attribut2=" + attribut2 + ", attribut3=" + attribut3
				+ "]";
	}
	
	
	
}
