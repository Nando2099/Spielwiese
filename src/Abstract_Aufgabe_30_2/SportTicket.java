package Abstract_Aufgabe_30_2;

public class SportTicket extends Ticket{
	public int pokalStufe;
	public SportTicket (String a, String b, int c, int d, int pokalStufe) {
		super(a, b, c, d);
		this.pokalStufe=pokalStufe;
	}
	
	
	public void setBasisPreis(int a) {
		basisPreis=a;
	}
	public void setTicketPreis() {
		int a=12;
		ticketPreis=basisPreis+a;
	}
public void berechneTicketPreis() {
	setBasisPreis(50+50/10*pokalStufe);
	setTicketPreis();
}
	
	
	public void printTicketDaten() {
		System.out.println("Die ist ein "+ this.getClass().getSimpleName());
		System.out.println("Arenaort: "+this.eventOrt);
		System.out.println("Eventname: "+this.eventName);
		System.out.println("Preis Sportticket: "+basisPreis+"€");
		System.out.println("Preis Sportticket + Snacks: "+ticketPreis+"€");
		System.out.println("Pokalstufe: "+pokalStufe);	
		
	}

	
}