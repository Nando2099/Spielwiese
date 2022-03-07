package Strings;

public class Replace {

    
    public static void main(String[] args) {
      // replace / ersetzen
      
      String text ="eeee gggg hhh aa  kkk lll";
              
        System.out.println(text.replace("g", "!"));
       // System.out.println(text.replaceAll("[egh]", "!"));
        
        System.out.println(text.getBytes());  
        
        for (byte buchstabe :text.getBytes()) {
            System.out.print((char) buchstabe);
        }
   }

}