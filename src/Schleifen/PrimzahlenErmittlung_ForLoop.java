package Schleifen;

public class PrimzahlenErmittlung_ForLoop {

	public static void main(String[] args) {
		
		
		for(int i=1; i<100;i++) {
			int count = 0;
					
			for(int div=1; div<=i; div++) {
					
				if (i%div==0) 
				count++;
				
				}
			
			if (count ==2)
				System.out.println(i);
		}
	}

}

// i % div = rest oder null
// 7 % 1 = 0
// 7 % 2 = 1
// 7 % 7 = 0