package Schleifen;



public class TestLoops {

	public static void question4(int count) {
		String nums = "";
		int min = 1;
		for (int iterations = 1; iterations <= count; iterations++ ) {
			if (count %2 != 0) 
				min = 2;
			if (iterations % 2 != 0 ) {
				for (int i = min; i <= 10 ; i++) {
					nums = nums + i + " ";
				}
			} else {
				for (int i = 9; i >= 2; i--) {
					nums = nums + i + " ";
				}
			}
		}	
		System.out.println(nums);
	}
	
	public static void main(String[] args) {

		String s = "*";
		int n = 5;
		for (int i = 0; i < n; i++ ){
			System.out.println(s);
			s = s.concat("*");			
		}
		question4(4);
	}
}
