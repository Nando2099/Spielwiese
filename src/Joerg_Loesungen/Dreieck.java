package Joerg_Loesungen;

public class Dreieck implements Shape {
	private double grundseite;
	private double hoehe;
	private double aSeite;
	private double bSeite;
	private double seite1, seite2, seite3;

	public Dreieck(double seite1, double seite2, double seite3) {
		setSeite1(seite1);
		setSeite2(seite2);
		setSeite3(seite3);

		recalculate();
	}

	@Override
	public double berechneFlaeche() {
		final double s = getS();
		final double result = Math.sqrt(s * (s - getSeite1()) * (s - getSeite2()) * (s - getSeite3()));
		final double check = 0.5 * grundseite * hoehe;

		return result;
	}

	@Override
	public double berechneUmfang() {
		return getSeite1() + getSeite2() + getSeite3();
	}

	public double getSeite1() {
		return seite1;
	}

	public void setSeite1(double seite1) {
		this.seite1 = seite1;
	}

	public double getSeite2() {
		return seite2;
	}

	public void setSeite2(double seite2) {
		this.seite2 = seite2;
	}

	public double getSeite3() {
		return seite3;
	}

	public void setSeite3(double seite3) {
		this.seite3 = seite3;
	}

	private double getS() {
		return berechneUmfang() / 2.0;
	}

	private void recalculate() {
		double seite1 = this.seite1;
		double seite2 = this.seite2;
		double seite3 = this.seite3;
		double s;

		if (seite1 > seite2) {
			aSeite = seite2;

			if (seite1 > seite3) {
				bSeite = seite3;
				grundseite = seite1;
			} else {
				bSeite = seite1;
				grundseite = seite3;
			}
		} else {
			aSeite = seite1;

			if (seite2 > seite3) {
				bSeite = seite3;
				grundseite = seite2;
			} else {
				bSeite = seite2;
				grundseite = seite3;
			}
		}

		s = getS();

		this.hoehe = (2 * Math.sqrt(s * (s - aSeite) * (s - bSeite) * (s - grundseite))) / grundseite;
	}
}
