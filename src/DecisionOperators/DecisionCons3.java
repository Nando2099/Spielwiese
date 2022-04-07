package DecisionOperators;

public class DecisionCons3 {
    public static void main(String[] args) {
        int a = 7;
        boolean res = a++ == 7 && ++a == 9 || a++ == 9;
        System.out.println("a = " + a);
        System.out.println("res = " + res);
    }
}


/*
			int a = 7

boolean res = a++ == 7 && ++a == 9 || a++ == 9;

= (a++) == 7 && ++a == 9 || (a++) == 9;               expr ++

= (a++) == 7 && (++a) == 9 || (a++) == 9;				--expr 

= ((a++) == 7) && ((++a) == 9) || ((a++) == 9);				==

= ((a++) == 7) && ((++a) == 9) || ((a++) == 9);				==

= (((a++) == 7) && ((++a) == 9)) || ((a++) == 9);			&&

= ((7 == 7) && ((++a) == 9)) || ((a++) == 9); //a = 8		primero todo dentro de &&

= (true && ((++a) == 9)) || ((a++) == 9); //a = 8

= (true && (9 == 9)) || ((a++) == 9); //a = 9

= (true && true) || ((a++) == 9); //a = 9

= true || ((a++) == 9); //a = 9

= true; //a = 9

So,

a = 9

res = true
Die richtige Antwort ist: a = 9
res = true





*/