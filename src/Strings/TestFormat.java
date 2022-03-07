package Strings;

import java.util.Calendar;
import java.util.Locale;

public class TestFormat {

    public static void main(String[] args) {
      long n = 461012;
      System.out.format("%d hallo\n", n);            //  -->  461012 hallo
      System.out.format("%08d%n", n);                //  -->  00461012
      System.out.format("%+8d%n", n);                //  -->   +461012
      System.out.format("%,8d%n", n);                //  -->   461,012
      System.out.format("%+,8d%n%n", n);             //  -->  +461,012

      double pi = Math.PI;
      System.out.format("%f%n", pi);                 //  -->  3.141593
      System.out.format("%.3f%n", pi);               //  -->  3.142
      System.out.format("%10.3f%n", pi);             //  -->       3.142
      System.out.format("%-10.3f%n", pi);            //  -->  3,142
      System.out.format(Locale.US,
                        "%-10.4f%n%n", pi);          //  -->  3.1416

      Calendar c = Calendar.getInstance();
      System.out.format(Locale.US,"a)  %tB %te, %tY%n", c, c, c);  	//  -->  May 29, 2006
      System.out.format("b)  %tl:%tM %tp%n", c, c, c);   	//  -->  2:34 am
      System.out.format("c)  %1$tm %1$te,%1$tY%n", c);   			//  -->  01 13,2022
      System.out.format("d)  %tD%n", c);                 			//  -->  01/13/22
    }
}