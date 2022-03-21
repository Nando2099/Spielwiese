package Abstract_Aufgabe_30_2;

public class KinoTicket extends Ticket{

	public int filmDauer; 
	
	public KinoTicket(String eventOrt, String eventName, int basisPreis, int ticketPreis, int filmDauer) {
		super(eventOrt, eventName, basisPreis, ticketPreis);
		this.filmDauer=filmDauer;
	}
	
	
		public void setBasisPreis(int a) {
			basisPreis=a;
		}
		public void setTicketPreis() {
			int a=12;
			ticketPreis=basisPreis+a;
		}
	public void berechneTicketPreis() {
		if (filmDauer>=120) {
			setBasisPreis(12);
			setTicketPreis();
		}
		else {
			setBasisPreis(10);
			setTicketPreis();
		}
		}
	
	
	public void  printTicketDaten() {
		System.out.println("Die ist ein "+ this.getClass().getSimpleName());
		System.out.println("Kinoort: "+this.eventOrt);
		System.out.println("Filmtitel: "+this.eventName);
		System.out.println("Preis Kinokarte: "+basisPreis+"€");
		System.out.println("Preis Kinokarte + Snacks: "+ticketPreis+"€");
		System.out.println("Filmdauer: "+filmDauer+" minuten");	
	}

	

	
	
}