package Strings;

public class StringMethods2 {

	public static void main(String[] args) {
		String s1 = "   Trim this     ";
		System.out.println(s1.trim());
		System.out.println(s1.replace(" ", "-"));
		System.out.println(s1.replace(' ', '-'));
		System.out.println(s1.startsWith("T"));
		System.out.println((s1.trim()).endsWith("s"));
		
		System.out.println(6 + 5 + "4");
		System.out.println("4" + (5 + 6));
		
		System.out.println(s1.toUpperCase());
		s1 = s1.toUpperCase();
		System.out.println(s1);
		
		String[] tokens = s1.split("M");
		System.out.println(tokens[0] + " x " + tokens[1] );
		
	}

}
