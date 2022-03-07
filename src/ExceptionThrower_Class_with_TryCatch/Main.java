package ExceptionThrower_Class_with_TryCatch;

public class Main {

	public static void main(String[] args) {
		
		ExceptionThrower exceptionThrower = new ExceptionThrower();
		
		try {
			exceptionThrower.divide();
		}catch(ArithmeticException exception){
			System.out.println(exception.getMessage());
		}
		
		
		

	}

}



// https://www.youtube.com/watch?v=O1yJ9wvlviA