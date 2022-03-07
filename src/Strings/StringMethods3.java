package Strings;

public class StringMethods3 {

	public static void main(String[] args) {
		String s1 = "12345";
		String s2 = "Cabbage";

		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		System.out.println(s1.indexOf("2"));
		System.out.println(s1.indexOf('2'));
		//System.out.println(s1.indexOf(1));
		System.out.println(s1.indexOf(50));  // 50 = hex 32 = ascii symbol 2
		System.out.println(s2.indexOf("a",2 ));
		System.out.println(s2.indexOf("ag"));
		System.out.println(s2.substring(3));
		System.out.println(s2.substring(3,6));
	
		char c = 51;
		System.out.println("c is " + c);
	}

}
