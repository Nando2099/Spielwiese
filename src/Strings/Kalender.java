package Strings;

import java.util.*;
import java.text.*;

class Kalender  {
static final String[] DayName = {"Sonntag","Montag","Dienstag","Mittwoch","Donnerstag","Freitag","Samstag"};

public static void main(String[] args)
        {
        int day=14, month=11, year=2008;
        if (args.length==3) {
                day=Integer.parseInt(args[0]);
                month=Integer.parseInt(args[1]);
                year=Integer.parseInt(args[2]);
                }
        //----- das ist alles :
        GregorianCalendar myCal = new GregorianCalendar(year, month-1, day);
        int d = myCal.get(Calendar.DAY_OF_WEEK); // result:  1 to 7
        System.out.println("der "+day+"."+month+"."+year + "  ist ein  " + DayName[d-1]);

        //------------Und die Praesentation mit SimpleDateFormat--------
        Date date = new Date(myCal.getTimeInMillis());
        String format_pattern = "'Formatierte Ausgabe :'yyyy.MM.dd ' '  G ' ' HH:mm:ss ";
        SimpleDateFormat sdf = new SimpleDateFormat (format_pattern);
        String dateOutput = sdf.format(date);
        System.out.println(dateOutput);
        //------------
}



}