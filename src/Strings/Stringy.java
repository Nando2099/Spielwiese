package Strings;

public class Stringy {


	public static void main(String[] args) {
		String s = "01234";
		StringBuilder sb = new StringBuilder(s);
		
		System.out.println(s);
		System.out.println(s.replace('2', '3'));
		//sb.replace(2, 3, "x");
		System.out.println(sb);
		
		//System.out.println(s.substring(-1));

	}

}
