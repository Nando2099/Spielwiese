package Strings;

public class TeilString_SubString {

    
    public static void main(String[] args) {
      
        //charAt nur einen Buchstaben dem Text entnehmen
        
        String text="Jens-Simon";
        System.out.println(text.substring(0,4)); // 0 startIndex INKLUSIVE 4 endIndex EXKLUSIVE
        System.out.println(text.substring(3,8)); //  s-Sim
        
        
    }

}