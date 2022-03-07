package Arrays;

public class Array_Char_Random {

	public static void main(String[] args) {


		
	int summe = 0;
		
		char[] CharArray = new char[10];
		
		for (int i = 0; i !=10; i++) {
			
			CharArray[i] = (char)(Math.random()*10+48);
			System.out.println(CharArray[i] + " ");
			summe = (summe + CharArray[i]- '0');   // PORQUE '0'??
			
		}
		System.out.println(" ");
		System.out.println(summe);
		

	}

}
