package Veerbung6;

class M { }
class N extends M { }
class O extends N { }
class P extends O { }

public class Test {
     public static void main(String args []) {
         M obj = new O();
         if(obj instanceof M) 
           System.out.print("M");
         if(obj instanceof N) 
           System.out.print("N");
         if(obj instanceof O) 
           System.out.print("O");
         if(obj instanceof P) 
           System.out.print("P");
     }
}

/*

Die Antwort ist richtig.

M

^

N

^

O [obj refers to instance of O class]

^

P


obj instanceof M -> true

obj instanceof N -> true

obj instanceof O -> true

but

obj instanceof P -> false
Die richtige Antwort ist: MNO

*/