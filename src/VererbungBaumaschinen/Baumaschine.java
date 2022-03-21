package VererbungBaumaschinen;

public  class Baumaschine  {

	// Fields
	protected int motorleistung; // in PS oder kW ja nach Wunsch

	// Methods

	// Konstruktor
	public Baumaschine(int motorleistung) {
		this.motorleistung = motorleistung;
		
	}

	
	// Getter/Setter
	public int getMotorleistung() {
	
		return motorleistung;
	}

	public void setMotorleistung(int motorleistung) {
		this.motorleistung = motorleistung;
		
	}

}