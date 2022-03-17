package Vererbung_Aufgabe_29_1_girokonto_nando;
import Vererbung_Aufgabe_29_1_konto_nando.konto;
import java.time.LocalDate;



public class girokonto extends konto{

	
	private boolean plusSparer;
	private LocalDate stichtag;//= LocalDate.of(2022, 4, 01);
	
	
	public girokonto(double saldo,boolean plusSparer, LocalDate stichtag) {
		super(saldo);
		this.plusSparer = plusSparer;
		this.stichtag = stichtag;
	}

	
	
	public boolean isPlusSparer(){
		if (false) 
			System.out.println("Ist kein Plus Sparer");
		else 
			System.out.println("Ist Plus Sparer");
		
		return plusSparer;
		
		
	}
	
	public void setStichtag(LocalDate date) {
		this.stichtag = date;
		System.out.println("Stichtag : " + stichtag);
		
	}

	public static void main (String[] args) {
		
	
//		girokonto gk1 = new girokonto(0.0, false, null);  //saldo, plussparer, stichtag
//		LocalDate date = LocalDate.of(2022, 4, 01);
//		gk1.setStichtag(date);
//		System.out.println("Stichtag: " + gk1.stichtag);
//		gk1.getSaldo(); 
//		
//
//		konto k1 = new konto(1.1); //neues objekt klasse konto
//		k1.getSaldo(); // zugriff von objekt klasse konto auf methode in der klasse konto
		
		
		
	}
	
}