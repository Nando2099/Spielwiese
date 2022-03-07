package Joerg_Loesungen;

import java.util.ArrayList;

public class Bibliothek {
	public static void main(String[] args) {
		final String authorToFind = "Autor2";
		final Bibliothek b = new Bibliothek();
		b.addBuch("Autor1", "Titel1", 20.0);
		b.addBuch(authorToFind, "Titel2", 25.0);
		b.addBuch("Autor3", "Titel3", 30.0);
		b.addBuch("Autor4", "Titel4", 35.0);
		b.addBuch(authorToFind, "Titel5", 40.0);

		System.out.println(String.format("Bibliothek enthaelt %s Buecher vom Autor '%s'.", 
				b.findAuthor(authorToFind).size(), authorToFind));
		System.out.println(String.format("Gesamtwert der Bibliothek: %.2f.", b.getGesamtwert()));
	}

	private ArrayList<Buch> content = new ArrayList<Buch>();

	public void addBuch(String author, String titel, double preis) {
		content.add(new Buch(author, titel, preis));
	}

	public ArrayList<Buch> findAuthor(String author) {
		final ArrayList<Buch> result = new ArrayList<Buch>();

		for (Buch b : content) {
			if (b.getAuthor().equals(author)) {
				result.add(b);
			}
		}

		return result;
	}

	public double getGesamtwert() {
		double result = 0;

		for (Buch b : content) {
			result += b.getPreis();
		}

		return result;
	}
}