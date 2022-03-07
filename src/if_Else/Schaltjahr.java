package if_Else;

import java.util.Scanner;

public class Schaltjahr {

	public static void main(String[] args) {
		
		Scanner tt = new Scanner (System.in);
		
		System.out.println("Jahr:");
		int jahr = tt.nextInt();
		
		if (jahr%4 ==0 && jahr%100==0)
			if (jahr%400==0)
				System.out.println(jahr + " ist ein Schaltjahr.");
			else
				System.out.println(jahr + " ist kein Schaltjahr.");
		else
			System.out.println(jahr + " ist ein Schaltjahr.");

	}

}
