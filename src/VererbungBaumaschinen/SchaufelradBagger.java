package VererbungBaumaschinen;

public class SchaufelradBagger extends Bagger{
    private float durchmesserSchaufelrad;


    public SchaufelradBagger(int motorleistung, int anzahlGrabwerkzeuge, float durchmesserSchaufelrad) {
        super(motorleistung, anzahlGrabwerkzeuge);
        this.durchmesserSchaufelrad = durchmesserSchaufelrad;
    }

    public float getDurchmesserSchaufelrad() {
        return durchmesserSchaufelrad;
    }

    public void setDurchmesserSchaufelrad(float durchmesserSchaufelrad) {
    	System.out.println(this.motorleistung);
    	System.out.println(this.getMotorleistung());
        this.durchmesserSchaufelrad = durchmesserSchaufelrad;
    }

    @Override
    public double getMaxGeschwindigkeit() {
      return 10.0;
    }
    
}