package Veerbung3_b;

class Parent {
    int i = 10;
    Parent(int i) {
        //super();   // invoca el no args constructor de la clase object, se puede omitir
        this.i = i;
        System.out.println("Parent " + i);
    }
}

class Child extends Parent {
    int j = 20;

    Child(int j) {
        super(0);  		//<------- invoca el constr de Parent(int) y pasa el valor 1 al parametro !!!
        this.j = j;
        System.out.println("Child(int) constructor, j" + j);
    }

    //Child(int i, int j) {				// no llega a cambiar el valor de j (20! en linea 13)
        //super(i);                       // llega a cambiar el valor de i en linea 8
       // System.out.println("***" + i);
        //System.out.println("**" + j);
        
       // this(j);   --> falsch
    //}

}

public class Test2 {
    public static void main(String[] args) {
        Child child = new Child(1000);
        System.out.println(child.i + ":" + child.j);
    }
}