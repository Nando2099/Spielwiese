package Abstract_Aufgabe_30_1;

public class Quadrat extends Rechteck{
	
	
	
	public Quadrat(double kantenlaenge) {
		super(kantenlaenge,kantenlaenge);
		
	}

	
}

// Quadrat extends Rechteck, en "super" van los atributos de la clase de la que
// se hereda. En este caso el constructor de Reachteck pide dos double, asi que
// para cumplir ese requisito se introducen dos parametros 