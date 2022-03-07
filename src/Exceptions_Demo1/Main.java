package Exceptions_Demo1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner1 = new Scanner(System.in);
		try { //----------------------------------------------->ganzer code block im try/catch
			System.out.println("Geben Sie eine Nummer ein");
			int number = scanner1.nextInt();
			System.out.println(number);
		}catch(InputMismatchException exception)  {
			System.out.println("Int ist erwartet");
		}
		
		
		
		Scanner scanner2 = new Scanner(System.in);
		try {
			System.out.println("Geben Sie eine zweite Nummer ein");
			String string = scanner2.nextLine();
			System.out.println(string);
		}catch(InputMismatchException exception)  {
			System.out.println("Int ist erwartet");
		} finally { 		///---> zum schließen wird egal was ausgeführt
			scanner2.close();
			System.out.println("Danke.Scanner geschlossen");
		}
		

	}

}
