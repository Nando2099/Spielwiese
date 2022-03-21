package Abstract_Aufgabe_30_2;

public class KonzertTicket extends Ticket{
	

	public int sitzReihe; 
	
	public KonzertTicket(String eventOrt, String eventName, int basisPreis, int ticketPreis, int sitzReihe) {
		super(eventOrt, eventName, basisPreis, ticketPreis);
		this.sitzReihe=sitzReihe;
	}

	
	
	public void setBasisPreis(int a) {
		basisPreis=a;
	}
	public void setTicketPreis() {
		int a=12;
		ticketPreis=basisPreis+a;
	}
public void berechneTicketPreis() {
	setBasisPreis(40+40/sitzReihe);
	setTicketPreis();
}
	
	
	
	
	public void printTicketDaten() {
		System.out.println("Die ist ein "+ this.getClass().getSimpleName());
		System.out.println("Konzertort: "+this.eventOrt);
		System.out.println("Konzertname: "+this.eventName);
		System.out.println("Preis Konzertkarte: "+basisPreis+"€");
		System.out.println("Preis Konzertkarte + Snacks: "+ticketPreis+"€");
		System.out.println("Siztreihe: "+sitzReihe);	
		
	}
	
}