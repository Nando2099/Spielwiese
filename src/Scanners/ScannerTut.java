package Scanners;

import java.util.Scanner;

public class ScannerTut {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Whats your first name");
		String name = scan.next();
		
		System.out.println("Whats your age");
		int age = scan.nextInt();
		
		System.out.println("Whats your quote");
		String quote = scan.next();
		quote = quote + scan.nextLine();
		
		System.out.println("Thank you " + name + " your age is " + age + " and your quote is " + quote);
	}

}
