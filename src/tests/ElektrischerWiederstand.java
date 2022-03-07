package tests;

public class ElektrischerWiederstand {
	
        public static void main(String[] args) {

                double laenge = 1;
                double durchmesser = 0.001;
                double widerstandKupfer = 1.78E-8;
                double widerstandSilizium = 2300;
                double flaeche = (durchmesser * durchmesser / 4) * Math.PI;
                double widerstandK = widerstandKupfer * ( laenge / flaeche);
                double widerstandS = widerstandSilizium * ( laenge / flaeche);

                System.out.println("A \n" + "Fläche: \t" + flaeche);
                System.out.println("------------------------------------------------------------");
                System.out.println("B");
                System.out.println("Der Widerstand (in Ohm [Ω]) beträgt: \nFür Kupfer: \t" +  widerstandK + " Ω\n" + "Für Silizium:\t" + widerstandS + " Ω");

                }


}
