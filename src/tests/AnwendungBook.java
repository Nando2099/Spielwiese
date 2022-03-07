package tests;

public class AnwendungBook {

	public static void main(String[] args) {
		
		Book book = new Book("Java","Peter",20.99);
// se ha creado el objeto book de la Klasse Book. en el 
// archivo Book.java se ha creado la Klasse con atributos y sus tipos.
		String a = book.author;
		String t = book.title;
		double p = book.price;
		
		System.out.println(a + " " + t + " " + p);
		
		book.increasePrice(3);
		
		a = book.author;
		t = book.title;
		p = book.price;
		
		System.out.println(a + " " + t + " " + p);
		
		
	}

}
