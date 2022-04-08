package OCA_GFN_Test_Simulation;

class Document2 {
    int pages;
    
    Document2(int pages) {
        this.pages = pages;
    }
}




class Word2 extends Document2 {   // si hereda tmb tiene que heredar el constructor (linea 13)

	String type;
    
    
    Word2 (int pages){
    	super(pages);
    }
    
    
//    Word2 (int pages){
//    	this(type);
//    	super(pages);
//    	
//    }
    
    Word2(String type){
    	super(20);
    	this.type = type;
    }
    
    Word2 (int pages, String type){
    	super(pages);
    	this.type = type;
    
    
    
    }
}

public class Ejemplo2 {
    public static void main(String[] args) {
        Word2 obj = new Word2(25, "TEXT");			//aqui se usa el constructor en linea 17
        System.out.println(obj.type + "," + obj.pages);
    }
}