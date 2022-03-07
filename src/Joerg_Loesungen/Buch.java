package Joerg_Loesungen;

public class Buch {
	private String author;
	private String titel;
	private double preis;

	public Buch(String author, String titel, double preis) {
		setAuthor(author);
		setTitel(titel);
		setPreis(preis);
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}
}