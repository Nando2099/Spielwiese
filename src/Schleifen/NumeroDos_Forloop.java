package Schleifen;

public class NumeroDos_Forloop {
// Que es continue (vuelve a subir al loop, y break , sale del loop)
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println(i);
			if (i == 2)
				continue;
			System.out.println("hallo");
		}

	}

}
