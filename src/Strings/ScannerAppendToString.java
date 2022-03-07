 package Strings;

import java.util.Scanner;

public class ScannerAppendToString {

	public static void main(String[] args) {
		
		String first;
		String last;
		String full;
		
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		System.out.println("Enter a first name");
		first = sc.nextLine();
		
		System.out.println("Enter a last name");
		last = sc.nextLine();
		
		full =sb.append(first + " " + last).toString();
		System.out.println(full);

	}

}
