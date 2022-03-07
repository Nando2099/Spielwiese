package Static_Atribute_and_Method;

public class Estatico2 {

	// public int sumar(int n1,int n2) {  -->>> !!!
	public static int sumar(int n1,int n2) {     // the class OWNS the member/method
		int suma = n1 + n2;
		return suma;
				
	}
	
	public static void main(String[] args) {
		
		System.out.println("La suma es: " + Estatico2.sumar(5, 5));
		

	}

}


//					EXPLICACION METODO ESTATICO
// haciendo el metodo estatico en linea 6, se puede llamar en linea
// 14 a la clase.metodo (Estatico2.sumar) y meterle parametros para ser usados, si no
// fuese estatico, la forma de utilizar el metodo en linea 14 no es valida. 

// para acceder un miembro estatico se tiene que usar el nombre de la clase + 