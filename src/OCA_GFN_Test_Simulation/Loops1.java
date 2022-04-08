package OCA_GFN_Test_Simulation;

public class Loops1 {
	
	

	public static void main(String[] args) {
        
	
		
		
		int x = 5;
        while (x < 10) {
            System.out.println(x);
            x++;  // muss innerhalb der brackets sein um den Wert um 1 zu erhöhen
        }
        x++;    // ->> eternal loop
       
        
          
        
        System.out.println("***************");
        
        
        
        
  	  int [] arr2 = {2, 1, 0};
      for(int i : arr2) { // el enhanced loop es diferente, i es el primer VALOR del array
     	 	
         System.out.println(arr2[i]);             
         
      }
        
          
	}
	

}


