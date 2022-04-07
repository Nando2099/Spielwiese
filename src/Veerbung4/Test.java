package Veerbung4;

class Super {
    
//	public Super() {
//        System.out.println(101);      // <------------- !!!! si no esta: linea 17 !
//    }
	
	
	public Super(int i) {
        System.out.println(100);
    }
}

class Sub extends Super {
    public Sub() {
        super(0);             //     <-- tiene que tener un super(valor) si no hay const en parent class
    	System.out.println(200);
    }
}

public class Test {
    public static void main(String[] args) {
        new Sub();
    }
}



/*    Die Antwort ist falsch.

super(); is added by the compiler as the first statement in both the constructors.

Class Super extends from Object class and Object class has no-argument constructor, hence no issues with the constructor of Super class.


But no-arg constructor is not available in Super class, hence calling super(); from Sub class constructor gives compilation error.
Die richtige Antwort ist: Compilation Error    */