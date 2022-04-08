package OCA_GFN_Test_Simulation;

public class Operators {
    private static boolean flag = !true;
    static int inti = 30;
    private static int inti2 = 40;

    public static void main(String [] args) {
        System.out.println(!flag ? args[0] : args[1]);
        System.out.println(inti);
        System.out.println(inti2);
    }
}
