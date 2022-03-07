package Strings;

import java.text.*;
import java.util.*;

//----------------------------------------
// Kulturabhängige Zahlenformatierung
//----------------------------------------

class NumberFormatTest {

public static void main(String[] s) {
        StringBuffer sbuf;
        System.out.println("\nBeispiele mit der NumberFormat-Klasse");

        Locale country = Locale.GERMANY; //Locale.GERMANY; //Locale.US

        NumberFormat nf = NumberFormat.getInstance(country);
        //NumberFormat nf = NumberFormat.getInstance(); // default (nach Betriebssystem)

        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        nf.setMinimumIntegerDigits(6);
        nf.setGroupingUsed(true);
        System.out.println(nf.format(34));
        System.out.println(nf.format(12345.4));
        System.out.println(nf.format(123456.4567));
        System.out.println(NumberFormat.getPercentInstance().format(0.68));
  }
}