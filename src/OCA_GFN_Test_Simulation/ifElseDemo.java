package OCA_GFN_Test_Simulation;

class carlos {
	
}


public class ifElseDemo {
	
	
		public int a = 1;
	
	
	
    public static void main(String[] args) {
        
    	double price = 10000000;  // si le pongo final la variable ya no es variable y 20 es compilado a true o false
    	String model;
    	//String model = null; -> inicializa a model y ya no hay compile time error 
        
        if(price > 100000) {
        	
            model = "Tesla Model X";
            
        } else if(price < 100000) {
        	
            model = "Tesla Model S";
        
        }
        
        
       // System.out.println(model); // NO FUNCIONA - ERROR
    }
}