package Strings;

public class Trim_test {

    
    public static void main(String[] args) {
      String eingabe =  "    Jens \n      ";
      
      eingabe = eingabe.trim();
      
     
      System.out.println(eingabe);
      
      
      
      int laengeDesString = eingabe.length();
       System.out.println(laengeDesString);
    }

}
