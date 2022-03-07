package LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Aufgabe_23_2_jens {

	public static void main(String[] args) {
		
		System.out.println("Aufgabe Datum/Zeit Objekte – Teil2\n");

		
		System.out.println("Erstellen je ein beliebiges Datums-, Zeit- und DatumZeit-Objekt,\nz.B. mit der of()-Methode: \n");
		
		System.out.println("Geben Sie die 3 Objekte nun jeweils in folgenden Formaten aus:\n");
		
		System.out.println("a) Im ISO-Standard-Fomat\n");
		
		LocalDate datumJetzt = LocalDate.now();
		LocalTime uhrzeitJetzt = LocalTime.now();
		LocalDateTime datumUhrzeitJetzt = LocalDateTime.now();

		System.out.println("Geben Sie die Objekte aus!\n");
		System.out.println(datumJetzt);
		System.out.println(uhrzeitJetzt);
		System.out.println(datumUhrzeitJetzt);
		
		
		System.out.println("\nb) Mit Hilfe der Getter-Methoden \r\n"
				+ "11.02.2022\r\n"
				+ "10:44 Uhr\r\n"
				+ "Heute ist der 11.Februar 22, es ist 10 Uhr 44.\r\n"
				+ "\n");
		
		

		System.out.println("Geben Sie die Objekte aus!\n");
		System.out.println(datumJetzt.getDayOfMonth() +"." +datumJetzt.getMonthValue()+"."+datumJetzt.getYear());
		System.out.println(uhrzeitJetzt.getHour()+":"+uhrzeitJetzt.getMinute()+" Uhr");
		System.out.println("Heute ist der "+ datumUhrzeitJetzt.getDayOfMonth() + "." + datumUhrzeitJetzt.getMonth()+" "+datumUhrzeitJetzt.getYear()+
				", es ist " + datumUhrzeitJetzt.getHour()+" Uhr "+datumUhrzeitJetzt.getMinute()+"."
				);
		
		System.out.println("\nc) Den SHORT und MEDIUM Formaten der format()-Methode,\nspeziell mit dem DateTimeFormatter und seiner ofLocalizedDate()-Methode\n");
		
				
		DateTimeFormatter dtfShort = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter dtfMedium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		
		System.out.println("Geben Sie die Objekte aus!\n");
		
		System.out.println(dtfShort.format(datumJetzt));
		//System.out.println(dtfShort.format(uhrzeitJetzt)); // geht nicht!
		System.out.println(dtfShort.format(datumUhrzeitJetzt));
		
		System.out.println(dtfMedium.format(datumJetzt));
		//System.out.println(dtfMedium.format(uhrzeitJetzt)); // geht nicht!
		System.out.println(dtfMedium.format(datumUhrzeitJetzt));
		
		System.out.println("\nd) Mit folgenden speziellen Formaten, die mit ofPattern() erzeugt werden können! Bitte die Formate im PowerPoint oder Internet nachschlagen!\r\n"
				+ "\r\n"
				+ "11. Februar 22\r\n"
				+ "10 Uhr 44 Minuten\r\n"
				+ "Heute ist der 11.Februar 2022, es ist 10 Uhr 44 Minuten.\r\n"
				+ "\n");
		
		DateTimeFormatter dtfDatum = DateTimeFormatter.ofPattern("dd. MMMM yy");
		LocalDate datum = LocalDate.parse("11. Februar 22",dtfDatum);
		
		DateTimeFormatter dtfZeit = DateTimeFormatter.ofPattern("HH 'Uhr' mm 'Minuten'");
		LocalTime uhrzeit = LocalTime.parse("10 Uhr 44 Minuten",dtfZeit);
		
		DateTimeFormatter dtfDatumUhrzeit = DateTimeFormatter.ofPattern("'Heute ist der' dd.MMMM yyyy', es ist 'HH 'Uhr' mm 'Minuten.'");
		
		LocalDateTime datumUhrzeit = LocalDateTime.parse("Heute ist der 11.Februar 2022, es ist 10 Uhr 44 Minuten.",dtfDatumUhrzeit);

		System.out.println("Geben Sie die Objekte aus!\n");
		System.out.println(datum);
		System.out.println(uhrzeit);
		System.out.println(datumUhrzeit);

	}

}