package tests;

public class DatenTypen {

	public static void main(String[] args) {
		
		double d = 3.14;
		int a = 4;
		
		d = a;
		
		long c = 12345;
		
		//char ch = "A";  // error: Type mismatch: cannot convert from String to char
		String ch = "A";
		char cha = 'A';
		
		System.out.println(ch);
		System.out.println(cha);
		
		byte b;
		b = (byte)257;
		System.out.println(b);
		
		char n = 0101;
		System.out.println(n);
		
		char n1 = (char)154212154L;
		System.out.println(n1);
	}

}
// a se convierte a "a" pero toma la capacidad de mostrar decimales como "d"