package OCA_GFN_Test_Simulation;


import java.util.ArrayList;
import java.util.List;

public class Test4 {
     public static void main(String[] args) {
         List<Integer> list = new ArrayList<>();
         list.add(100);
         list.add(200);
         list.add(100);
         list.add(200);
         list.remove(new Integer(100));
 
         System.out.println(list);
         
         
         
         Integer myInt = 5;
         Double myDouble = 5.99;
         Character myChar = 'A';
         System.out.println(myInt);
         System.out.println(myDouble);
         System.out.println(myChar);
         
        
     }
}