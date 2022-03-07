package Joerg_Loesungen;

import java.util.ArrayList;

public class Receipt {
	private ArrayList<ItemReceipt> itemList = new ArrayList<ItemReceipt>();
	private float sum = 0;

	public static void main(String[] args) {
		final Receipt r = new Receipt();
		r.addItem("Brot", 3.49);
		r.addItem("Milch", 1.2);
		r.addItem("Salami", 6.43);
		r.addItem("Butter", 2.38);
		r.addItem("Wein", 7.65);

		System.out.println(r);
	}

	public void addItem(String name, double price) {
		sum += price;
		itemList.add(new ItemReceipt(name, price));
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder(21 * itemList.size());

		for (ItemReceipt ir : itemList) {
			sb.append(String.format("%5s%-10s%6.2f%n", "", ir.getName(), ir.getPrice()));
		}

		sb.append(String.format("%5s----------------%n",""));
		sb.append(String.format("%5s%-10s%6.2f%n", "", "Summe:", this.sum));

		return sb.toString();
	}
}