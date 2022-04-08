package Exceptions_Demo1;

public class Demo3{  
	  public static void main(String args[]){  
	   try{  
	      //code that may raise exception  
	      int data=100/0;  
	   }catch(ArithmeticException e){
		   System.out.println(e);
		   }  
	   //rest code of the program   
	   System.out.println("rest of the code..."); 
	   
//	   String s = "abc";
//	   int i = Integer.parseInt(s);
//	   System.out.println(i);            ->> NumberFormatException
	   
	   
	   
	  }  
	}  