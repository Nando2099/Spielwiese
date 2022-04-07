package OCA_GFN_Test_Simulation;

public class Test11 {
    public static void main(String[] args) {
        /*INSERT*/
    	
    	byte var = 10; 

    	//long var = 10;   switch no acepta long

//    	Short var = 10; 
//
//    	Integer var = 10; 
//
//    	char var = 10; 

    	//double var = 10;   switch no acepta long
    	
    	

    	//      switch can accept primitive types: byte, short, int,
    	//      char; wrapper types: Byte, Short, Integer, Character; String and enums. 
    	
    	
        switch(var) {
            case 10:
                System.out.println("TEN");
                break;
            default:
                System.out.println("DEFAULT");
        }
    }
}