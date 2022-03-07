package package1;

public class Access2 {

	public static void main(String[] args) {
		
		Access1 a = new Access1();
		System.out.println(a.minutes);
		
		a.imprimir(); // bota "yes"
		a.getHours(); // no bota nada
		a.imprimir2();
		
		System.out.println(a.getHours()); //bota 3
	}

}
