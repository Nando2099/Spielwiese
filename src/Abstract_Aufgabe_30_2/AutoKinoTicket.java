package Abstract_Aufgabe_30_2;

public class AutoKinoTicket extends KinoTicket{


	public int anzahlPersonen;
	
	public AutoKinoTicket(String eventOrt, String eventName, int basisPreis, int ticketPreis, int filmDauer, int anzahlPersonen) {
		super(eventOrt, eventName, basisPreis, ticketPreis, filmDauer);
		this.anzahlPersonen=anzahlPersonen;
		
	}
	
	
	public void setBasisPreis() {
		basisPreis=10;
	}
	public void setTicketPreis(int anzahlPersonen) {
		
		ticketPreis=basisPreis*anzahlPersonen+12;
	}
//public void berechneTicketPreis() {
//	setBasisPreis();
//	setTicketPreis(anzahlPersonen);
//	}
	
	
	
	
	
	
public void  printTicketDaten() {
		
		super.printTicketDaten();
		System.out.println("Dieses Ticket ist für "+anzahlPersonen+" Personen gültig.");
	}
	
	
}