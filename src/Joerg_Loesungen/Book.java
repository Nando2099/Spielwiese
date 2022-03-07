package Joerg_Loesungen;

public class Book {
	static int count = 0;
	private String title = "";
	private double price;
	private String author;

	Book(String name, String author, double price) {
		this.title = name;
		this.author = author;
		this.price = price;
		count++;
	}

	Book() {
		this("Dummy", "XY", 5);
	}

	void increasePrice(double d) {
		this.price += d;
	}

	@Override
	public String toString() {
		return String.format("Book title = %s, price = %s, author = %s", title, price, author);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}