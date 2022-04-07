package Veerbung3;



class Parent {
     int i = 10;
     Parent(int i) {
         //super();   // invoca el no args constructor de la clase object, se puede omitir
         this.i = i;
         System.out.println(i);
     }
}

class Child extends Parent {
     int j = 20;
 
     Child(int j) {
         super(0);  					// invoca el constr de Parent(int)
         this.j = j;
         System.out.println("*" + j);
     }
 
     Child(int i, int j) {				// no llega a cambiar el valor de j (20! en linea 13)
         super(i);                       // llega a cambiar el valor de i en linea 6
         this.j = j;					// dice esta j es j en linea 15
         System.out.println("***" + i);
         System.out.println("**" + j);
         
        // this(j);   --> falsch
     }
 
}

public class Test {
     public static void main(String[] args) {
         Child child = new Child(1000, 2000);
         System.out.println(child.i + ":" + child.j);
     }
}