package Joerg_Loesungen;

public class Freelancer extends Mitarbeiter {
	private final static double FREELANCER_BONUS = 50;

	@Override
	public void gehaltErhoehen(double erhoehung) {
		super.gehaltErhoehen(erhoehung);
		super.gehaltErhoehen(FREELANCER_BONUS);
	}
}