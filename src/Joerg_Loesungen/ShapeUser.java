package Joerg_Loesungen;

import java.util.ArrayList;
import java.util.Random;

public class ShapeUser {
	public static void main(String[] args) {
		final Random rnd = new Random(System.currentTimeMillis());
		final int countDreieck = getCount(rnd);
		final int countRechteck = getCount(rnd);
		final int countKreis = getCount(rnd);
		final ArrayList<Shape> shape = new ArrayList<Shape>(countDreieck + countRechteck + countKreis);

		for (int i = 0; i < countDreieck; i++) {
			final double seite1=getRandomLength(rnd);
			final double seite2=getRandomLength(rnd);
			final double seite3=Math.sqrt(Math.pow(seite1,2) + Math.pow(seite2, 2));
			
			final Dreieck d = new Dreieck(seite1, seite2, seite3);

			shape.add(d);
		}

		for (int i = 0; i < countRechteck; i++) {
			final Rechteck r = new Rechteck(getRandomLength(rnd), getRandomLength(rnd));

			shape.add(r);
		}

		for (int i = 0; i < countKreis; i++) {
			final Kreis k = new Kreis(getRandomLength(rnd));

			shape.add(k);
		}

		sumShapes(shape);
	}

	private static void sumShapes(ArrayList<Shape> shape) {
		double perimeter = 0.0;
		double surface = 0.0;
		double resPer = 0.0;
		double resSur = 0.0;

		for (Shape s : shape) {
			resPer = s.berechneUmfang();
			resSur = s.berechneFlaeche();

			perimeter += s.berechneUmfang();
			surface += s.berechneFlaeche();
		}

		System.out.println(String.format("Gesamtumfang: %.2f; Gesamtfläche: %.2f", perimeter, surface));
	}

	private static int getCount(Random rnd) {
		return rnd.nextInt(5) + 1;
	}

	private static int getRandomLength(Random rnd) {
		return rnd.nextInt(100) + 1;
	}
}