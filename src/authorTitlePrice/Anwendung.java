package authorTitlePrice;

import java.util.ArrayList;
import java.util.List;

public class Anwendung {

	public static void main(String[] args) {
	Book book = new Book("Java for beginners","Viktor", 50);
	
	String a= book.getAuthor();
	String t= book.getTitle();
	double p = book.getPrice();
	
	book.setPrice(15.60);
	
		System.out.println(a+";"+t+";"+p);
	
	book.increasePrice(3);
	
	 a = book.getAuthor();
	 t = book.getTitle();
	 p = book.getPrice();
	
	 System.out.println(a +";" + t + ";" + p);
	 System.out.println(book);

	// Book[] books = new Book[3];
	
	 List <Book> books = new ArrayList<>();
	
	 // books[0] = new Book("Java ist auch eine Insel","Christian Ullenboom", 43.20);
	// books[1]  = new Book("Java for beginners","Viktor", 50);
	// books[2]  = new Book("Steppenwolf","Herman Hesse", 16.78);
	 
	 //book[0] = new Book();
	// book[1] = new Book();
	// book[2] = new Book();
	 
	 books.add ( new Book("Java ist auch eine Insel","Christian Ullenboom", 43.20));
	 books.add ( new Book("Java for beginners","Viktor", 50));
	 books.add ( new Book("Steppenwolf","Herman Hesse", 16.78));
	 
	for(Book b : books) {
			System.out.println(b);
			b.increasePrice(1);
			System.out.println(b);
	
			System.out.println("Es gibt " + Book.count +"Bücher");
	
			System.out.println(books.get(0));
	}
}
}