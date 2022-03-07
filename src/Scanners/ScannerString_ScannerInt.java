package Scanners;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerString_ScannerInt {

	public static void main(String[] args) {
		
		Scanner scannerInt = new Scanner(System.in);
		try {
			int number = scannerInt.nextInt();
			System.out.println(number);
		}catch(InputMismatchException exception)  {
			System.out.println("Int ist erwartet");
		}
		
		
		
		Scanner scannerString = new Scanner(System.in);
		try {
			String string = scannerString.nextLine();
			System.out.println(string);
		}catch(InputMismatchException exception)  {
			System.out.println("Int ist erwartet");
		}
		

	}

}