package LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentTimeJavaTime {

	public static void main(String[] args) {
		
		
		
		// DATES
		System.out.println("********DATES********");
		
		LocalDate ld = LocalDate.of(2022,Month.FEBRUARY, 28);
		
		System.out.println(ld);//     ->2022-02-28
		
		ld = ld.plusDays(5);   // speichere ld.plusDays in ld. nachdem ich 5 Tage addiert habe
		System.out.println(ld); //    -> 2022-03-05
		
		ld = ld.plusMonths(1);
		System.out.println(ld); //    -> 2022-04-05   -> 1 Monat addiert
		
		ld =ld.minusDays(15);
		System.out.println(ld); //    -> 2022-03-21   -> 15 Tage subtrahiert
		
		
		// DATE TIME FORMATTER
		System.out.println("********DATE TIME FORMATTER********");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MMMM.yyyy");
		System.out.println(ld.format(dtf));  // --> ld -> 21.März.2022
		
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		System.out.println(ld.format(dtf2));  // --> ld -> 21.03.2022
		
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd MM yyyy");
		System.out.println(ld.format(dtf3));  // --> ld -> 21 03 2022
		
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd MM yy");
		System.out.println(ld.format(dtf4));  // --> ld -> 21 03 22
		System.out.println(dtf4.format(ld));  // --> ld -> 21 03 22 schreibweise umgekehrt output gleich
		
		
		
		// TIMES
		System.out.println("********TIME*******");
		
		LocalTime lt = LocalTime.of(14, 38);
		
		System.out.println(lt); // 14:38
		
		lt = lt.plusMinutes(129);  // addiert 129 Minuten
		System.out.println(lt);
		
		
		
		
		
		// DATE AND TIMES 
		System.out.println("********DATE AND TIME*******");
		
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		
		
		
		// ZONE DATE AND TIMES 
		System.out.println("********ZONE DATE AND TIMES*******");
		
//		for (String zone : ZoneId.getAvailableZoneIds()) {
//			System.out.println(zone);  // --------------------Imprime todos los codigos de zonas
//		}
		
		
		
		ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("America/Santiago"));
		System.out.println(zdt);
	}

}





// https://www.youtube.com/watch?v=0XgdX5hDL4U





