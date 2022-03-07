package Strings;

public class IndexOf_Contains {


    public static void main(String[] args) {
        String name ="Marcel Salzer";
        
        // beinhaltet der name den Teil "Marcel"?
        //int zahl = name.indexOf("Marcel"); // 0 // Fundstelle 
        //int zahl = name.indexOf("Jens"); // -1 // nicht gefunden !!
        int zahl = name.indexOf("Salzer"); // 7
        
        // die zahl ist zwischen -1 und maximal Anzahl der Buchstaben des String -1
        System.out.println(zahl);
        
        String text ="... und ... und .. und";
        System.out.println(text.indexOf("und")); // 1. und von links gesucht Stelle 4
        
        System.out.println(text.contains("und")); // ungenau suchen, fundstelle bleibt unbekannt
       
        
    }

}