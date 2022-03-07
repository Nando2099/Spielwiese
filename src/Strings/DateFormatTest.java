package Strings;

import java.text.*;
import java.util.*;

class DateFormatTest {

public static void main(String[] s) {

DateFormat df = DateFormat.getDateInstance(DateFormat.LONG,Locale.US);
Date datum = new Date(System.currentTimeMillis());
System.out.println(df.format(datum));

DateFormat dtf = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT,Locale.US);
System.out.println(dtf.format(datum) );

DateFormat t = DateFormat.getTimeInstance(DateFormat.MEDIUM);
System.out.println(t.format(datum));

SimpleDateFormat formatter = new SimpleDateFormat ("EEEEEE    MMMMMM.dd.yyyy G 'at' hh:mm:ss zzz");
Date currentTime_1 = new Date();
System.out.println(formatter.format(currentTime_1));
}
}