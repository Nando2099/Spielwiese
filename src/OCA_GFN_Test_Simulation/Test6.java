package OCA_GFN_Test_Simulation;

public class Test6 {
    public static void main(String[] args) {
        char c = 'Z';  // ascci wert 92
        long l = 100_00l;
        int i = 9_2;
        float f = 2.02f; 
        double d = 10_0.35d;
        
        
        l = c + i;
        System.out.println( "l : " + (c + i));
    
       
        f = c * l * i * f;
        System.out.println("f: " + f);
        
        
        f = l + i + c;
        System.out.println("f: " + f);
        
        
        i = (int)d;
       System.out.println(i);
        
        f = (long)d;
        System.out.println(f);
    }
}