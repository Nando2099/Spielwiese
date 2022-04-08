package OCA_GFN_Test_Simulation;

public class Arrays {

	public static void main(String[] args) {
		

		  
        short arr [] = new short[3];
        short [] arr1 = {};
		
        /*INSERT*/
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 10;
        System.out.println("[" + arr[1] + ", " + arr[2] + "]"); //Line n1
		System.out.println(arr[0]);
		
		
		
		
		
		System.out.println("******1********");


		
		
		
		int [] arr2 = {1, 2, 3, 4, 5}; 
		byte [] val = new byte[10]; 
		//int [] arr3 = new int[3]{10, 20, 30};    // error! largo y valores no se decla. a la vez
		
		System.out.println(arr2[1]);
		System.out.println(val[0]);   // imprime valor inicial, 0
		
		
		
		
		
		System.out.println("*******2*******");
		
		
		
		
		int [][] arr0  = new int[5][5]; // array 2d con declaracion de largo y luego zuweisung
		arr0[0][0] = 1;
		arr0[0][1] = 2;
		arr0[1][0] = 3;
		
		System.out.println(arr0[0][0]);
		System.out.println(arr0[0][1]);
		System.out.println(arr0[1][0]);
		
		
		
		
		
		System.out.println("*******3*******");

		
		
		
		short [] args02 = {50,50}; 
		short [] args0 = new short[]{50, 50};			// declaracion con valores (sin largo)
		
		int[][] arr02 = new int [][] {{1,2,3},{7,8,9}}; // declaracion con valores (sin largo)
		System.out.println(arr02[0][2]);  // -> 3
		System.out.println(arr02[1][2]);  // -> 9
		
		
		
		
		
		System.out.println("*******4*******");
		
		
		
		
		String [] arrx = new String[7];
        System.out.println(arrx);
        System.out.println(arrx[0]);
        
        int ff = 0;
        ff = arrx.length;
        System.out.println(ff);
		
        
        
        
              
        System.out.println("*****5*********");
        
        
        
        
        
        String string = null;
        System.out.println(string);
        
        
        
        
        
        System.out.println("******6******");
        
        
        
        
        
        String msg = "Hello";
        boolean [] flag = new boolean[1];   // default value de boolean array es false!
        if(flag[0]) {
            msg = "Welcome";
        }
        System.out.println(msg);
        
		
        
	}

}
