package ArtikelKassenzettel;

import java.util.ArrayList;
import java.util.List;

public class Kassenzettel {

	public static void main(String[] args) {
		
		List<Artikel> artikelList = new ArrayList();
		
		artikelList.add(new Artikel("Milch", 1.20));
		artikelList.add(new Artikel("Brot", 3.20));
		
		double sum = 0;
		for(Artikel a : artikelList) {
			sum += a.getPrice();
			System.out.println(a);
		}
		
		System.out.println(sum);
	}

}
