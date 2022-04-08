package OCA_GFN_Test_Simulation;

public class Test8 {
    public static void main(String[] args) {
        extractInt(2.7);
        //extractInt(2);  error, tiene que ser 2.0 para extractInt Double obj
    }

    private static void extractInt(Double obj) {
        System.out.println(obj.intValue());
        
        Character var = 7;
    }
}