package Arrays;

public class ArrayTest1 {

	public static void main(String[] args) {
		
		//int[] array = new int[5];
		//int i = 2;
		int j = 5;
		
		int[] array = {1,2,3,4,5};
		
//		System.out.println(array[3]);  6   
//		array[3] = 67;  reescribe el valor en la posicion 3
//		System.out.println(array[3]); imrpime el valor dentro de un espacio especifico
//		
		
//		System.err.println(array.length); imprime la cantidad de posiciones
		
//		int[] arrayb;
//		arrayb = array;
//		
//		System.out.println(arrayb[3]);
		
		
		String[] vornamen = {"Pedro", "Maria","Lucas"};
		
		for (int i = 0; i < vornamen.length; i++) {
			System.out.println(vornamen[i]);
		}
		
		for (String vorname : vornamen) {
			System.out.println(vorname);
		}
	}

}
