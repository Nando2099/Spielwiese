package Interfaces;

public class Paypal implements IZahlung{

	@Override
	public void erzeugeZahlung() {
		
		System.out.println("Zahlungslogik Paypal");
	}

}
