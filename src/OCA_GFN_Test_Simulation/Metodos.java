package OCA_GFN_Test_Simulation;


class Message {
     String msg = "Happy New Year!";
 
     public void print() {
         System.out.println(msg);
     }
}

public class Metodos {
	
     public static void change(Message m) {  // aqui entra obj
         m = new Message();					// aqui se crea con las caracteristicas de obj el objeto m
         
         //System.out.println(m.msg);	 // m msg tambien imprime happy new year
         
         m.msg = "Happy Holidays!"; // nuevo msg para m, ahora vale happy holidays
         
         //System.out.println(m.msg); // ahora m imprime happy new year ( DE M )
     }
 
     
     
     public static void main(String[] args) {
         Message obj = new Message();
         obj.print();
         change(obj);
         obj.print();
         
        
         
 
         
         
     }
}