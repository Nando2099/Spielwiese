package ExceptionThrower_Class_with_TryCatch;

import java.util.Scanner;

public class ExceptionThrower {

	public void divide() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Se eine Zahl ein");
		int number = scan.nextInt();

		if (number == 0) {
			throw new ArithmeticException("Nicht durch 0 teilen!");
		}
	}

}
