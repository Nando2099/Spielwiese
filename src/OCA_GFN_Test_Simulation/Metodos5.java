package OCA_GFN_Test_Simulation;

class PointXY {
    static int x;
    private int y;
    
    public String toString() {
        return "Point(" + x + " , " + getY() + ")";
        // o return "Point(" + x + " , " + y + ")";   <--- !!
    }
    
 
   

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
    
}

public class Metodos5 {
    public static void main(String[] args) {
        PointXY p1 = new PointXY();
        p1.x = 100;
        p1.setY(200);
       
        
        PointXY p2 = new PointXY();
        p2.x = 100;
        p2.setY(200);
        
        System.out.println(p1);
        System.out.println(p1.getY());
    }
}