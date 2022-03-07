package Strings;

public class String_Klasse {

    
    public static void main(String[] args) {
      
        // String Pool
        String vorname2 = "Jens"; // ab in den String-Pool "Jens";
        
        String vorname = "Jens"; // was soll das? hier fehlt new!
        vorname = "Jens Simon"; // Veränderbar! JA, aber.....
    
        System.out.println(vorname); // seit wann kann man denn ein Objekt ausgeben?
        System.out.println(vorname.toString()); // Langform mit toString()
    
      // mutable veränderlich , immutable - unveränderlich
      // String-Klassse ? immutable , unveränderlich
      
      // jede Instanz einer String-Klasse ist final(konstant!)
      // Wertänderungen können gemacht werden, aber die alte Instanz wird einfach
      // vernichtet und eine neue erstellt!!!
      
      vorname = "J" + "e" + "n" + "s";
      vorname = "J";
      vorname += "e";
      vorname += "n";
      vorname += "s";
      
      // Scanner trim()
      
     // vorname.trim
      
      
      // var += "weiterer Text" : Kurzform des + Operator  var = var + "weiterer text"; 
      
      // den String-Pool nicht nutzen geht nur mit new
      String nachname = new String("Simon"); // Konstruktor
      
    }

}