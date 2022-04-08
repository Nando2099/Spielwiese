package OCA_GFN_Test_Simulation;

class Document {
	
    int pages;
    
    Document(int pages) {
        this.pages = pages;
    }
}



class Word extends Document {   // si hereda tmb tiene que heredar el constructor (linea 13)
 
	String type;
    
    Word (int pages){
    	super(pages);
    	
    	
    }
    
    
    Word (int pages, String type){
    	super(pages);
    	this.type = type;
    	
    	
    	
    }
}

public class Ejemplo {
    public static void main(String[] args) {
        Word obj = new Word(25, "TEXT");			//aqui se usa el constructor en linea 17
        System.out.println(obj.type + "," + obj.pages);
    }
}