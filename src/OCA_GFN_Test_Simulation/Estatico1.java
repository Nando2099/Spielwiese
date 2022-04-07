package OCA_GFN_Test_Simulation;

class PointE {
    static int x;  // estatica, por eso solo hay una copia que se comparten p1 y p2.
    int y, z;
    
    public String toString() {
        return "Point(" + x + ", " + y + ", " + z + ")";
    }
}

public class Estatico1 {
    public static void main(String[] args) {
        PointE p1 = new PointE();
        p1.x = 17;
        p1.y = 35;
        p1.z = -1;
        
        PointE p2 = new PointE();
        p2.x = 19;
        p2.y = 40;
        p2.z = 0;
        
        //System.out.println(PointE.x); asi se accede a la variante estatica
        
        System.out.println(p1); //Line n1
        System.out.println(p2); //Line n2
    }
}