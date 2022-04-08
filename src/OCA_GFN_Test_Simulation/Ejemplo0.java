package OCA_GFN_Test_Simulation;


class Document0 {
	
    int pages;
    
    Document0(int pages) {
        this.pages = pages;
    }
}



class Word0 extends Document {
	
    String type;
    
    Word0(String type) {
        super(20); 
        this.type = type;
    }
    
    
    Word0(int pages, String type) {
    	this(type);
        super.pages = pages;
        
//      super(pages);    ASI TAMBIE SE PUEDE
//    	this.type = type;   ASI TAMBIEN SE PUEDE
    }
}



public class Ejemplo0 {
	
    public static void main(String[] args) {
        Word0 obj = new Word0(25, "TEXT");
        System.out.println(obj.type + "," + obj.pages);
    }
}