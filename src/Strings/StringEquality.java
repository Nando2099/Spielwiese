package Strings;

public class StringEquality {

	public static void main(String[] args) {               
     

	   String s11 = "hallo";
	   String s22 = "hallo";
	   System.out.println("s11 == s22 : " + (s11 == s22));
	   System.out.println("equals : " + (s11.equals(s22)));
	   
	   
	   String s1 = new String("hallo");
	   String s2 = new String("hallo");
	   System.out.println("s1 == s2 : " + (s1 == s2));
	   System.out.println("equals : " + (s1.equals(s2)));
	}

}
