package Strings;

public class StringMethods {

	 public static void main(String[] args) {
		  
		  // String = a reference data type that can store one or more characters
		  //   reference data types have access to useful methods
		  
		  String name = "Hernando";
		  
		  boolean result = name.equalsIgnoreCase("bro");
		  int result1 = name.length();
		  char result2 = name.charAt(0);
		  int result3 = name.indexOf("o");
		  boolean result4 = name.isEmpty();
		  String result5 = name.toUpperCase();
		  String result6 = name.toLowerCase();
		  String result7 = name.trim();
		  String result8 = name.replace('o', 'a');
		   
		  System.out.println(result);
		  System.out.println(result1);
		  System.out.println(result2);
		  System.out.println(result3);
		  System.out.println(result4);
		  System.out.println(result5);
		  System.out.println(result6);
		  System.out.println(result7);
		  System.out.println(result8);
		  
		 }
		 
		}