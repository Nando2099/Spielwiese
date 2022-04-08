package OCA_GFN_Test_Simulation;

public class Metodos6 {
    public static void print() {
        System.out.println("static method");
    }

    public static void main(String[] args) {
        Metodos6 obj = null;
        obj.print();			// el objeto sin parametros simplemente llama al metodo
        Metodos6.print();		// pero esta es la forma correcta de llamarlo
        
        
    }
}