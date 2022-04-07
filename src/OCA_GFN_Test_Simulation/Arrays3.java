package OCA_GFN_Test_Simulation;

public class Arrays3 {

	public static void main(String[] args) {

		
        System.out.println("******7******");
        
        
        
        int [] arr99 = {5, 10, 15};  
        int [] arr88 = {'A', 'B'};
        arr99 = arr88;				// hier schaut der 99 nicht mehr auf 5,10,15 sondern auf A,B
        							// int und char sind kompatibel daher kein Problem
        System.out.println(arr99.length + arr88.length);
        
        
        
        System.out.println("******8******");
        
        
        int [] ar1 = {5, 10, 15};
        String [] ar2 = {"Str1", "Str2"}; //hier schaut 1 nicht mehr auf 5,10,15 sondern auf die Strings
        //ar1 = ar2;							//<-- error da int und String nicht kompatibel sind
        System.out.println(ar1.length + ar2.length);
        
        
        System.out.println("*******9*****");
        
        int [] arrAB = {'A', 'B'};
        System.out.println(arrAB[1]);
        
        System.out.println("*******10*****");
        
        
        byte [] arrNb = new byte[0];
       // System.out.println(arrNb[0]);
        /* Es un array de tamanho CERO, sin "largo", que ocupa memoria pero no tiene NINGUN valor dentro
         * byte [] arrNb = new byte[1]; -> tiene tamanho UNO, byte default "0" i.e. botaria el valor "0"
         */
        
        
        System.out.println("*******11*****");
        
        String [] arrIE = new String[1];       // String (Objetos) bei default NULL
        //arrIE[0] = "Lala";                 //<- con un valor, isEmpty bota FALSE
        System.out.println(arrIE[0].isEmpty()); // isEmpty bota NullPointer..
        
        
        System.out.println("*******12*****");
        
       

	}

}
