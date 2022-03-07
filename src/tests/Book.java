package tests;

public class Book {
// Instanzvariablen von der Klasse Book
	String title;
	double price;
	String author;
// Constructor der Klasse Book
	Book(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
// Methode increasePrice
	void increasePrice(double d){
		this.price += d;
		
	}
	
	public String getTitle() {
		
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title =title;
	}
	
}
