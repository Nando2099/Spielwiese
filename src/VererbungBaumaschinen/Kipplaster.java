package VererbungBaumaschinen;

public class Kipplaster extends Transportgeraet {

    private float winkel;


    public Kipplaster(int motorleistung, float winkel) {
        super(motorleistung);
        this.winkel = winkel;
    }

    public float getWinkel() {
        return winkel;
    }

    public void setWinkel(float winkel) {
        this.winkel = winkel;
    }

    public double getMaxGeschwindigkeit() {
        return 50.0;
    }
    
}