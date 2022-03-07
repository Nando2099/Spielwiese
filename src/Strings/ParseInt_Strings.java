package Strings;

public class ParseInt_Strings {

	public static void main(String[] args) {
		
		String str1 = "-100";
		String str2 = "100.5";
		String str3 = "100.88";
		
		int num = Integer.parseInt(str1); // convierte String en Int
		System.out.println(num);
		
		double num2 = Double.parseDouble(str2); // convierte String en double
		System.out.println(num2);
		
		float num3 = Float.parseFloat(str3); // convierte String en float
		System.out.println(num3);

	}

}
