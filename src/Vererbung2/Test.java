package Vererbung2;


public class Test {
     public static void main(String[] args) {
         A obj1 = new A();
         B obj2 = (B)obj1;    // <--- hace casting con el tipo "B" del obj1 al obj2 
         obj2.print();
     }
}
