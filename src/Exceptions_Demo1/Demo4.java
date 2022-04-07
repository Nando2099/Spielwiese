package Exceptions_Demo1;

public class Demo4 {
    public static void main(String[] args) {
        try {
            main(args);
        } catch (Exception ex) {
            System.out.println("CATCH-");
        }
            System.out.println("OUT");
    }
}
