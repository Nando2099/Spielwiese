package Strings;

public class Concat {

	public static void main(String[] args) {

		String vorname = "Jens";

		// 1. concat mit + Operator / Verkettungsoperator
		vorname = "   " + vorname + "Simon";
		System.out.println(vorname);

		// 2. concat()-Methode
		vorname = "Jens";
		vorname = vorname.concat(" "); // Zuweisung nicht vergesseen!!!
		vorname = vorname.concat("Simon");
		System.out.println(vorname);

	}

}