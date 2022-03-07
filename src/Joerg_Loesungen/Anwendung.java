package Joerg_Loesungen;

import java.util.ArrayList;

public class Anwendung {
	public static void main(String[] args) {
		final String formatSTP = "%s; %s; %s";

		Book book = new Book("Java for Beginners", "poya", 20.35);
		String s = book.getAuthor();
		String t = book.getTitle();
		double p = book.getPrice();

		book.setPrice(15.60);

		System.out.println(String.format(formatSTP, s, t, p));

		book.increasePrice(3);

		s = book.getAuthor();
		t = book.getTitle();
		p = book.getPrice();

		System.out.println(String.format(formatSTP, s, t, p));
		System.out.println(book);

//		Book[] books = new Book[3];
//		books[0] = new Book("Java for Beginners", "poya", 20.35);
//		books[1] = new Book("Java ist auch eine Insel", "Christian Ullenboom", 43.20);
//		books[2] = new Book("Steppenwolf", "Herman Hesse", 16.78);
//		books[0] = new Book();
//		books[1] = new Book();
//		books[2] = new Book();

		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book("Java for Beginners", "poya", 20.35));
		books.add(new Book("Java ist auch eine Insel", "Christian Ullenboom", 43.20));
		books.add(new Book("Steppenwolf", "Herman Hesse", 16.78));

		for (Book b : books) {
			System.out.println(b);
			b.increasePrice(1);
			System.out.println(b);
		}

		System.out.println(String.format("Es gibt %s Bücher.", Book.count));
	}
}
