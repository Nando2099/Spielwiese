package VererbungBaumaschinen;

public class Bagger extends Baumaschine {

    private int anzahlGrabwerkzeuge;

    public Bagger(int motorleistung, int anzahlGrabwerkzeuge) {
        super(motorleistung);
        this.anzahlGrabwerkzeuge = anzahlGrabwerkzeuge;
    }

    public int getAnzahlGrabwerkzeuge() {
        return anzahlGrabwerkzeuge;
    }

    public void setAnzahlGrabwerkzeuge(int anzahlGrabwerkzeuge) {
        this.anzahlGrabwerkzeuge = anzahlGrabwerkzeuge;
    }

    public double getMaxGeschwindigkeit() {
      return 80.0;
    }
    
    
}