package VererbungBaumaschinenMain;

import VererbungBaumaschinen.*;

public class Main {

    public static void main(String[] args) {

        Baumaschine myBaumaschine = new Baumaschine(100);
        myBaumaschine.getMotorleistung();
        
	    Bagger myBagger = new Bagger(100,1);

        SeilBagger mySeilbagger = new SeilBagger(123,2,10);

        SchaufelradBagger mySchaufelradbagger = new SchaufelradBagger(190,2,33);

        Transportgeraet myTransportgeraet = new Transportgeraet(33) ;

        Foerderband myFoerderband = new Foerderband(1345,2);

        Kipplaster myKipplaster = new Kipplaster(120,40);


        // wie lange benoetigt es bis alle auf der baustelle sind
        //
        int x = 150; // km

        // wer is der langsamste?
        double min_speed=Double.MAX_VALUE;


        if (myBagger.getMaxGeschwindigkeit() < min_speed)
            min_speed = myBagger.getMaxGeschwindigkeit();

        if (mySeilbagger.getMaxGeschwindigkeit() < min_speed)
            min_speed = mySeilbagger.getMaxGeschwindigkeit();

        if (mySchaufelradbagger.getMaxGeschwindigkeit() < min_speed)
            min_speed = mySchaufelradbagger.getMaxGeschwindigkeit();

        if (myKipplaster.getMaxGeschwindigkeit() < min_speed)
            min_speed = myKipplaster.getMaxGeschwindigkeit();

        System.out.println("Es dauert für " + x + " km zur Baustelle " + (x/min_speed) +" Stunden. Der langsamste fährt: "+min_speed + "km/h" );

    }
}