package LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Aufgabe_23_1_jens {

	public static void main(String[] args) {
		
		System.out.println("Aufgabe „Datum/Zeit Objekte – Teil1\n");

		
		System.out.println("Erstellen Sie:\n");
		
		System.out.println("a) je ein Datums-, Zeit- und DatumZeit-Objekt mit der Methode now()\n");
		
		LocalDate datumJetz = LocalDate.now();
		LocalTime uhrzeitJetz = LocalTime.now();
		LocalDateTime datumUhrzeitJetz = LocalDateTime.now();

		System.out.println("Geben Sie die Objekte aus!\n");
		System.out.println(datumJetz);
		System.out.println(uhrzeitJetz);
		System.out.println(datumUhrzeitJetz);
		
		System.out.println("\nWie heisst dieses Format?\n");
		System.out.println("ISO_LOCAL_DATE bzw. ISO_LOCAL_TIME bzw. ISO_LOCAL_DATE_TIME");
		System.out.println("Siehe auch: https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#predefined");

		
		System.out.println("\nb) je ein beliebiges Datums-, Zeit- und DatumZeit-Objekt mit der Methode of()\n");
		
		LocalDate datum1 = LocalDate.of(2022,8,29);
		LocalTime uhrzeit1 = LocalTime.of(14,15,0);
		LocalDateTime datumUhrzeit1 = LocalDateTime.of(2022,8,29,14,15,0);

		System.out.println("Geben Sie die Objekte aus!\n");
		System.out.println(datum1);
		System.out.println(uhrzeit1);
		System.out.println(datumUhrzeit1);
		
		System.out.println("\nc) je ein beliebiges Datums-, Zeit- und DatumZeit-Objekt mit der Methode parse(),\nwählen Sie für die Eingabe das folgende deutsche DatumZeitFormat: 11.02.2022 10:33:01\n");
				
		DateTimeFormatter dtfDatum2 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate datum2 = LocalDate.parse("11.02.2022",dtfDatum2);
		
		DateTimeFormatter dtfZeit2 = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime uhrzeit2 = LocalTime.parse("10:33:01",dtfZeit2);
		
		DateTimeFormatter dtfDatumUhrzeit2 = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
		LocalDateTime datumUhrzeit2 = LocalDateTime.parse("11.02.2022 10:33:01",dtfDatumUhrzeit2);

		System.out.println("Geben Sie die Objekte aus!\n");
		System.out.println(datum2);
		System.out.println(uhrzeit2);
		System.out.println(datumUhrzeit2);
		
		System.out.println("\nje ein beliebiges Datums-, Zeit- und DatumZeit-Objekt mit der Methode parse(),\nwählen Sie für die Eingabe das folgende amerikanische DatumZeitFormat:\n");
		System.out.println("M/D/YYYY 	2/11/2022   dies entspricht dem 11.Februar 2022\n"
				+ "H:MM AM/PM 7:49 PM die entspricht 19:49 Uhr\n");
		DateTimeFormatter dtfDatum3 = DateTimeFormatter.ofPattern("M/d/yyyy");
		LocalDate datum3 = LocalDate.parse("2/11/2022",dtfDatum3);
		
		DateTimeFormatter dtfZeit3 = DateTimeFormatter.ofPattern("h:mm a");
		LocalTime uhrzeit3 = LocalTime.parse("10:33 AM",dtfZeit3);
		
		DateTimeFormatter dtfDatumUhrzeit3 = DateTimeFormatter.ofPattern("M/d/yyyy h:mm a");
		LocalDateTime datumUhrzeit3 = LocalDateTime.parse("2/11/2022 10:33 AM",dtfDatumUhrzeit3);

		System.out.println("Geben Sie die Objekte aus!\n");
		System.out.println(datum3);
		System.out.println(uhrzeit3);
		System.out.println(datumUhrzeit3);

	}

}