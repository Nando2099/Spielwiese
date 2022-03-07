package StundenMinutenSekunden;

import java.util.Scanner;

public class HoursMinutesSeconds3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int s;
		System.out.println("Geben Sie die Sekunden ein");
		s =input.nextInt();
		
		int totalSecs = s;
		String TimeString;
		
		
		int hours = totalSecs / 3600;
		int minutes = (totalSecs % 3600) / 60;
		int seconds = totalSecs % 60;

		TimeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
		
		System.out.println(TimeString);
	}

}
