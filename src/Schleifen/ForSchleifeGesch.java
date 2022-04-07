package Schleifen;

public class ForSchleifeGesch {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 5; i++) {
			//System.out.println("valor de i: " +i);
			for (int j = 0 ; j < i; j++) {
				System.out.print("valor de j: "+j + " / ");
				System.out.println("valor de i: "+i + "");
				
			}
			
			System.out.println("[]");
		}

	}

}
