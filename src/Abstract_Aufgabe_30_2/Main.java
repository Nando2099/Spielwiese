package Abstract_Aufgabe_30_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	SportTicket fussball=new SportTicket("Koeln", "Tabellenspiel", 45, 48, 2);
	fussball.berechneTicketPreis();
	fussball.printTicketDaten();
	AutoKinoTicket autofilm=new AutoKinoTicket("Parkplatz4","Blade Runner 2049",15,2000,160,2);
	autofilm.printTicketDaten();
	
	
	}	
	
}