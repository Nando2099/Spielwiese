package OCA_GFN_Test_Simulation;

public class Arrays2 {

	public static void main(String[] args) {
		   
		
		char [][] arrABC = {
	                {'A', 'B', 'C'},
	                {'D', 'E', 'F'},
	                {'G', 'H', 'I'}
	        };
		
			System.out.println(arrABC.length); // imprime el largo de la columba izquierda
		
			System.out.println(arrABC[0][0]);
			System.out.println(arrABC[0][1]);
			System.out.println(arrABC[0][2]);
			System.out.println(arrABC[1][0]);
			System.out.println(arrABC[1][1]);
			System.out.println(arrABC[1][2]);
			System.out.println(arrABC[2][0]);
			System.out.println(arrABC[2][1]);
			System.out.println(arrABC[2][2]);
			
			
			System.out.println("***********");

			
			
			
	        for(int i = 0; i < arrABC.length; i++) {
	            for(int j = 0; j < arrABC[i].length; j++) {
	            	//System.out.println(i);
	                System.out.print(arrABC[i][1]);
	            }
	            System.out.println();

	        }
	        
	        
	        System.out.println("***********");
	        
	        
	        
	         int [] arr = {2, 1, 0};
	         for(int i : arr) {
	        	 System.out.println(i);
	            // System.out.println(arr[i]);
	         }
	        
	         
	         System.out.println("***********");
	         
	         
	       
	        

	}

}