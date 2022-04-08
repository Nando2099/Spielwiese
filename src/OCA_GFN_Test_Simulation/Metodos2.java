package OCA_GFN_Test_Simulation;

public class Metodos2 {
	
    public static void main(String[] args) {
    	
        double price = 90000;
        String model = null;
        
        
        if(price > 100000) {
        	
            model = "Tesla Model X";
            
        } else if(price <= 100000) {
        	
            model = "Tesla Model S";
            System.out.println(model);  // aqui si funciona
        }
       System.out.println(model);   // aqui solo si model en 8 esta inicializado
       
       int i = '3';
       System.out.println(i);
          
    }
}