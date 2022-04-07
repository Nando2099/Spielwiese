package OCA_GFN_Test_Simulation;


public class Metodos3 {
     public static void main(String[] args) {
         int x = 1;
         System.out.println(checkAndIncrement(x));
             
         
     }
 
     private static int checkAndIncrement(int x) {
         if(x < 5) {
             x = 2;
             return x;
         } else {
             return x;
         }
     }
}