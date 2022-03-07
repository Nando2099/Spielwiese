package LocalDateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Aufgabe_23_LocalTime {

	public static void main(String[] args) {
		
		
		
		
		
		System.out.println("*******LOCAL DATE********");
		// LOCAL DATE
		
		
		// MIT NOW
		LocalDate ld = LocalDate.now(); 	// Create a date object
	    System.out.println(ld);              // 2022-03-01
	    
	    
	    //MIT OF
	    LocalDate ldo = LocalDate.of(2022, 2, 11);
	    System.out.println(ldo);
		
	    
	    //MIT PARSE
	    LocalDate ldp = LocalDate.parse("2022-02-11"); // nimmt nur diese Reiehnfolge an
	    System.out.println(ldp);
	    
	    
	    // MIT DATETIMEFORMATTER
	    DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(
	            FormatStyle.MEDIUM).withLocale(Locale.GERMANY);
	    LocalDate ldtpFormatted = LocalDate.parse("11.02.2022", dtf);
	    System.out.println(ldtpFormatted); 
	    
	    
	    // MIT DATETIMEFORMATTER    + OFPATTERN
	    DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd MM yyyy");
	    LocalDate ldtpFormatted2 = LocalDate.parse("11 02 2022",dtf2);  // gibt aus 2023 03 01
	    System.out.println(ldtpFormatted2); 
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    System.out.println("*******LOCAL TIME********");
	    // LOCAL TIME 
	    
	    
	    // MIT NOW
	    LocalTime lt = LocalTime.now();      
	    System.out.println(lt);				 // 11:57:00.430416600
	    
	    
	    //MIT OF
	    LocalTime lto = LocalTime.of(10, 35);
	    System.out.println(lto);
	    
	    
	    // MIT PARSE
	    LocalTime ltp = LocalTime.parse("15:31:59");
	    System.out.println(ltp);   // 15:31:59
	    
	    
	    // MIT DATETIMEFORMATTER + ISO
	    LocalTime ltp2 = LocalTime.of(15,44,23,2563);
	    System.out.println(ltp2.format(DateTimeFormatter.ISO_LOCAL_TIME));
	    
	    
	    // MIT OF PATTERN
	    LocalTime ltp3 = LocalTime.parse("10:33:01");
	    DateTimeFormatter f1 = DateTimeFormatter.ofPattern("hh:mm:ss");
	    System.out.println(ltp3.format(f1));
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    System.out.println("*******LOCAL DATE TIME********");
	    // LOCAL DATE TIME
	    
	    // MIT NOW
	    LocalDateTime ldt = LocalDateTime.now();
	    System.out.println(ldt);
	    

	    // MIT OF  --> 2022-02-11T10:33:01.000063
	    LocalDateTime ldt2 = LocalDateTime.of(2022,Month.FEBRUARY,11,10,33,01,63000);  // 2022-03-01T11:57:00.431414900
	    System.out.println(ldt2);													 // 2017-02-03T06:30:40.000050
	    //System.out.println(ldt2.getHour());											 // 6
	   

	    // MIT PARSE  --> 2022-02-11T10:33:01.630
	    LocalDateTime ldtp = LocalDateTime.parse("2022-02-11T10:33:01.63");
	    System.out.println(ldtp);

	    
	    // MIT PARSE MEDIUM --> 11.02.2022, 10:33:01
	    LocalDateTime ldtp2 = LocalDateTime.parse("2022-02-11T10:33:01.63");
	    DateTimeFormatter mediumDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
	    System.out.println(mediumDateTime.format(ldtp2));    
	    
	    
	    // MIT DATETIMEFORMATTER + PARSE + OFPATTERN
	    
	    LocalDateTime ldtp3 = LocalDateTime.parse("2022-02-11T10:33:01.63");
	    //DateTimeFormatter f = DateTimeFormatter.ofPattern("MMM 'der' dd.,yyyy, hh:mm");
	    DateTimeFormatter f = DateTimeFormatter.ofPattern("'der' dd. MMMM ,yyyy, hh:mm");
	    System.out.println(ldtp3.format(f));
	    
	   
	    
	    
	    System.out.println("*******AUFGABE ZWEI********");
	    // AUFGABE 2
	    
	    
	    // LOCAL DATE OBJECT
	    LocalDate zeit1 = LocalDate.of(2022,Month.FEBRUARY,22);
	    System.out.println(zeit1.format(DateTimeFormatter.ISO_LOCAL_DATE));
	    
	    LocalDate zeit1b = LocalDate.of(2022,02,22);
	    System.out.println(zeit1b.format(DateTimeFormatter.ISO_LOCAL_DATE));
	    
	    
	    // LOCAL TIME OBJECT
	    LocalTime zeit2 = LocalTime.of(23,59,59);
	    System.out.println(zeit2.format(DateTimeFormatter.ISO_LOCAL_TIME));
	    
	    
	    // LOCAL DATE TIME OBJECT
	    LocalDateTime zeit3 = LocalDateTime.of(2022,Month.FEBRUARY,22,23,59,59,63000);
	    System.out.println(zeit3.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
	  
	    
	}

}
