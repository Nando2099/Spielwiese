package Vererbung8;

class Document {
    int pages;
    Document(int pages) {
        this.pages = pages;
    }
}

class Word extends Document {
    String type;
    Word(String type) {
        super(20); //default pages    			SUPER -> para la otra clase
        this.type = type; //*INSERT-1*/
    }
    
    Word(int pages, String type) {
    	this(type); //*INSERT-2*/
        super.pages = pages;		//			SUPER -> para la otra clase
        
    }
}

public class Test {
    public static void main(String[] args) {
        Word obj = new Word(25, "TEXT");
        System.out.println(obj.type + "," + obj.pages);
    }
}

/*  A Java constructor cannot be abstract, static, final, and synchronized.

We can have private, protected, public or default constructor in Java. 

*The default constructor is used to provide the default values to the object 
 like 0, null, etc., depending on the type. */