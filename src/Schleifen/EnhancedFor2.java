package Schleifen;


public class EnhancedFor2 {
    public static void main (String... args) {
      if (args.length > 0)
        for(String s : args)
            System.out.println(s);

    }
}