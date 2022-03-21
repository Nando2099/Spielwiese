package Abstract_Aufgabe_30_2;

public abstract class Ticket {

	public String eventOrt;
	public String eventName;
	public int basisPreis;
	public int ticketPreis;
	
	public Ticket(String eventOrt, String eventName, int basisPreis, int ticketPreis) {
		
		this.eventOrt=eventOrt;
		this.eventName=eventName;
		this.basisPreis=basisPreis;
		this.ticketPreis=ticketPreis;
	}	
	public abstract void printTicketDaten();
	public abstract void berechneTicketPreis();
	
}