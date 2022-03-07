package Exceptions_Demo1;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		
		System.out.println("Start-main()");
		
		Scanner eingabe = new Scanner(System.in);
		
		System.out.println("Geben Sie eine Zahl ein");
		
		try {
			int zahl = eingabe.nextInt();
			System.out.println("Danke, Sie haben eine Zahl eingegeben");
		
		}catch(RuntimeException rte) {
			System.out.println("Sie haben eine ungültige Zahl eingegeben!");
			System.out.println(rte);
			System.out.println(Arrays.toString(rte.getStackTrace()));
		}
		
		System.out.println("Ende-main");
	}

}
