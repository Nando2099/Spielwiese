package Schleifen;

public class SterneC {

	public static void main(String[] args) {
		
		int stern = 7;
		int cont=0;
		
		
		for(int j=4; j>0; j--) {
			
			for(int i=0; i<stern; i++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			cont++;
			
			for (int s=1; s<=cont; s++) {
				System.out.print(" ");
			}
			stern-=2;
		}

	}

}
