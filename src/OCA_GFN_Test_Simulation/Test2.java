package OCA_GFN_Test_Simulation;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
     public static void main(String[] args) {
         List<Integer> list = new ArrayList<>(); // Integer -> crea objetos
         list.add(100);
         list.add(200);
         list.add(100);
         list.add(200);
         list.remove(new Integer(100)); // remueve el primer obj con valor 100
         //list.remove(100);   --> remueve el obj en la 100th posicion!
 
         System.out.println(list);
         
  
        
     }
}