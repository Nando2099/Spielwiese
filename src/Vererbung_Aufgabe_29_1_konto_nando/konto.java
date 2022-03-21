package Vererbung_Aufgabe_29_1_konto_nando;

import java.time.LocalDate;

import Vererbung_Aufgabe_29_1_girokonto_nando.girokonto;
import Vererbung_Aufgabe_29_1_sparbuch_nando.sparbuch;

public class konto {

	
	private double saldo;
	
	
	public konto(double saldo) {   // konstruktor
		super();
		this.saldo = saldo;
	}
	
	public double getSaldo(){
		//System.out.println("Neues Saldo " + saldo);
		return saldo;
	}
	
	public void hebeGeldAb(double betrag) {
		//double betrag2;
		saldo = saldo - betrag;
		System.out.println("Abgehobener Betrag " + betrag);
		
		
	}
	
	public void zahleGeldEin(double betrag) {
		this.saldo = betrag;
		System.out.println("Eingezahlter Betrag " + betrag);
	}

	
	
		public static void main (String[] args) {
		
		girokonto gk2 = new girokonto(0.0,true, null);  // saldo ,PlusSparer, Stichtag
		
		gk2.zahleGeldEin(4000);
		gk2.hebeGeldAb(350);
		gk2.getSaldo();
		gk2.isPlusSparer();
		LocalDate date = LocalDate.of(2022, 4, 01);
		gk2.setStichtag(date);
		
		System.out.println("****************");
		
		konto k2 = new konto (0.0); //saldo
		
		k2.zahleGeldEin(3692);
		k2.hebeGeldAb(100);
		k2.getSaldo();
		
		
		System.out.println("****************");
		
		sparbuch sb1 = new sparbuch(0.0,0.1);  // saldo und Zinsatz
		
		sb1.zahleGeldEin(2000);
		sb1.hebeGeldAb(199);
		double z = sb1.getSaldo();
		System.out.println("Aktueller Saldo " + z);  // correcto
		//System.out.println(sb1.getSaldo()); // <- tambien asi se puede
		System.out.println("Zinsen basierend auf aktuellem Saldo: " + sb1.berechneZinsenJahr());
		
		
		
	}
	
	
	
}
