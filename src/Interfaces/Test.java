package Interfaces;

public class Test {

	public static void main(String[] args) {
		
		Webshop ws1 = new Webshop("Shop1", new Paypal());
		Webshop ws2 = new Webshop("Shop2", new Kreditkarte());
		Webshop ws3 = new Webshop("Shop3", new EC());
		ws1.zahlen();
		ws2.zahlen();
		ws3.zahlen();
		
		
	}

}
