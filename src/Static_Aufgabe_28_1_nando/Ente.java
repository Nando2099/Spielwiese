package Static_Aufgabe_28_1_nando;

public class Ente {
	
	
	String name;
	String ort;
	
	
	void schwimmWohin(String ort) {
		this.ort = ort;
		System.out.println(this.name + ": ich bin jetzt hier: " + ort);
	}
	
	String woBistDu() {
		return this.name + ": ich bin immer noch hier: " + this.ort;
	}
	

	public static void main(String[] args) {
		
		Ente pato = new Ente();
		pato.name = "Paco";
		pato.ort = "Lima";
		pato.schwimmWohin("Madrid");
		//pato.schwimmWohin(pato.ort);
		System.out.println(pato.woBistDu());
		
		
		
		Ente pato2 = new Ente();
		pato2.name = "Paca";
		pato2.ort = "Miami";
		pato2.schwimmWohin(pato2.ort);
		System.out.println(pato2.woBistDu());

	}

}
