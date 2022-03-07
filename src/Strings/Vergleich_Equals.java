package Strings;

public class Vergleich_Equals {

    
    public static void main(String[] args) {
      
        // == gegen equals
        int zahl1 = 1;
        int zahl2 = 7;
        
        if (zahl1 == zahl2){
            System.out.println("Diese beiden Zahlen sind gleich!");
        }
        
        String text1="Abc";
        String text2= new String("abc");
        
        if (text1 == text2) {// verboten! Objekte vergleichen, bedeuten ihren Inhalt vergleichen an einer Stelle
            System.out.println(" == ja, es ist gleich!");
        }
        
        // in JAVA vergleicht man Texte mit equals auf exakte Gleichheit( CASE sensitive)!!!
        if (text1.equals(text2)) {
            System.out.println("equals ja, es ist gleich!");
        } 
        if (text1.equalsIgnoreCase(text2)) {  // CASE insensitive)
            System.out.println("equalsIgnoreCase ja, es ist gleich!");
        } 
        
    }

}