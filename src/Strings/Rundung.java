package Strings;

import java.math.*;

public class Rundung {

public static void main (String[] ar)  {

double x =  0.00138 ;
double y =  0.01 ;
System.out.println (x/y);

BigDecimal bdX = new BigDecimal(Double.toString(x));
BigDecimal bdY = new BigDecimal(Double.toString(y));
System.out.println (bdX.divide(bdY, RoundingMode.HALF_UP).doubleValue());




//----------------------------------------------
// abschneiden/runden ab kommastelle: "precision"
//----------------------------------------------
        System.out.println("-------------------------");
        int precision = 4;
        double d = -5.123458224;
        BigDecimal bd = BigDecimal.valueOf(d);
        double rounded = bd.setScale(precision, RoundingMode.HALF_UP).doubleValue();
        System.out.printf(d+" gerundet ab der Stelle %s ist: "+rounded, precision );

//-----------------------------------------------
//      Abschneiden, runden ab Kommastelle
//-----------------------------------------------
        System.out.println("-------------------------");
        double dz =  Math.round( d * 10000 ) / 10000. ;
        System.out.println("Gerundet mit Math.round() : "+dz);
//-----------------------------------------------
//      Abschneiden, runden in der formatierten Ausgabe
//-----------------------------------------------
        System.out.println("-------------------------");
        double d2 = 19.98523456;
        System.out.format("%.2f%n", d2);
        System.out.println(d2);


}
//-----------------------------------------------
}