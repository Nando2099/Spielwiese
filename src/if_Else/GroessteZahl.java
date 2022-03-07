package if_Else;

public class GroessteZahl {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 3;
		int c = 2;
		
		if (a >= b && a >= c)
			System.out.print( a + " ist die höchste Zahl" );
			if (b >= c && b >= a)
				System.out.print( b + " ist die höchste Zahl" );
				if (c >= a && c >= b)
					System.out.print( c + " ist die höchste Zahl" );
		
		
	}

}
