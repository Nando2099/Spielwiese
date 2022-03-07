package Arrays;
import java.util.*;

public class PruebaArrayList {

	
	
	// Gegeben ist Nummer 123
	// Modulo Rechnung -> 123 % 10 = 3 (addiert die 3 zu Summe)
	// neue Zahl ist zahl / 10 = 12,3
	
	
	
	public static int berechneQuersumme(int zahl) {
		int summe = 0;
		while (0 != zahl) {
			// addiere die letzte ziffer der uebergebenen zahl zur summe
			summe = summe + (zahl % 10);
			// entferne die letzte ziffer der uebergebenen zahl
			zahl = zahl / 10;
		}
		return summe;
	}

	public static void main(String[] args) {
		
		
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();
        for (int j = 1; j <= 20; ++j)
            list.add(j);
        //Collections.shuffle(list, rand);
        System.out.println(list);
		

		//int a = 123;
		System.out.println(berechneQuersumme(list));
	}

	
	
	
	private static char[] berechneQuersumme(List<Integer> list) {
		// TODO Auto-generated method stub
		return null;
	}

}
