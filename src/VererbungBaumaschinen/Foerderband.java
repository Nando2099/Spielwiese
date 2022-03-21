package VererbungBaumaschinen;

public class Foerderband extends Transportgeraet{
    
    
    private float bandbreite;

    public Foerderband(int motorleistung, float bandbreite) {
        super(motorleistung);
        this.bandbreite = bandbreite;
    }

    public float getBandbreite() {
        return bandbreite;
    }

    public void setBandbreite(float bandbreite) {
        this.bandbreite = bandbreite;
    }
}