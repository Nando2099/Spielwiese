package Read_Files_Aufgabe27_3_nando;


	class DatenDatei{   //                             classe
	
		public String Dateiname;
		public String Liste;
	
	
	
	DatenDatei(String dateiname, String Liste) {  // constructor
		//super();
		this.Dateiname = dateiname;
		this.Liste = Liste;
	}
	

	public String getDateiname() {  // Getters and setters
		return Dateiname;
	}

	public void setDateiname(String dateiname) {
		Dateiname = dateiname;
	}

	public String getListe() {
		return Liste;
	}

	public void setListe(String liste) {
		Liste = liste;
	}
	
	
	
	public void metodoDeDatenDatei() {
		
		System.out.println(Dateiname + Liste);
	}
	
	
}




public class Main {


	public static void main(String[] args) {
		
		
		DatenDatei obj1 = new DatenDatei("Lista1","Lista2");
		
		obj1.metodoDeDatenDatei();
		System.out.println(obj1.Dateiname);
		
	}
	
	
	
}
