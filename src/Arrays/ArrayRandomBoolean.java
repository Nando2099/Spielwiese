package Arrays;

import java.util.Random;

public class ArrayRandomBoolean {

	public static void main(String[] args) {


		Boolean arr[] = new Boolean[20];

			
		
		for (int i = 0; i < arr.length; i++) {
			
			Random random = new Random();
			int newRandom = random.nextInt(10);
			
			if ( i == 5)
				System.out.println();
			if ( i == 10)
				System.out.println();
			if ( i == 15)
				System.out.println();
			
			if(newRandom < 4) {
				
				arr[i]= false;
				
				System.out.print(i + 1 + ".");
				System.out.print(arr[i] + " ");
				
				
			}else {
				arr[i]= true;
				
				
				System.out.print(i + 1 + ".");
				System.out.print(arr[i] + " ");
			}
		
	
		
		}
		
	}

}





