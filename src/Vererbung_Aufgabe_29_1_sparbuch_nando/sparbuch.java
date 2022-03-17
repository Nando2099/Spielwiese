package Vererbung_Aufgabe_29_1_sparbuch_nando;
import Vererbung_Aufgabe_29_1_konto_nando.konto;



public class sparbuch extends konto{
	
	

	private double zinssatz; // private?
	
	
	public sparbuch(double saldo, double zinssatz) {  // konstruktor
		super(saldo);
		this.zinssatz = zinssatz;
	}
	
	
	public double berechneZinsenJahr() {
		double Zinsen;
		
		Zinsen = (super.getSaldo() * zinssatz * 365) / 36000;
		
		return Zinsen;
	}


	public static void main (String[] args) {
		
//		sparbuch sb2 = new sparbuch(0.0, 1.0);  // saldo , zinssatz
//		sb2.berechneZinsenJahr();
		
		
		
	}
	
	
}