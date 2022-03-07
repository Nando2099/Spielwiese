package Strings;

import javax.swing.*;

public class String_Random_jOption_Kreditkarte {

	public static void main(String[] args) {

		JTextField vorname = new JTextField(10); // 10 ist Breite vom Eingabefeld
		JTextField nachname = new JTextField(10);

		JPanel myPanel = new JPanel();
		myPanel.add(new JLabel("Vorname:"));
		myPanel.add(vorname);

		myPanel.add(Box.createHorizontalStrut(15)); // 15 ist Abstand zwischen Eingabefelder

		myPanel.add(new JLabel("Nachname:"));
		myPanel.add(nachname);

		int result = JOptionPane.showConfirmDialog(null, myPanel, "Geben Sie Vor- und Nachname ein",
				JOptionPane.OK_CANCEL_OPTION);
		
		
		if (result == JOptionPane.OK_OPTION) {
			System.out.println("Vorname: " + vorname.getText());
			System.out.println("Nachname: " + nachname.getText());

			// prüft Leerzeichen, UpperCase und Umlaute
			
			String Vorname = vorname.getText().trim().toUpperCase().replace(" ", "")
					.replace("ä", "ae")
					.replace("ü", "ue")
					.replace("ö", "oe")
					.replace("Ä", "ae")
					.replace("Ü", "ue")
					.replace("Ö", "oe")
					.toUpperCase();
					
				
			String Nachname = nachname.getText().trim().toUpperCase().replace(" ", "")
					.replace("ä", "ae")
					.replace("ü", "ue")
					.replace("ö", "oe")
					.replace("Ä", "ae")
					.replace("Ü", "ue")
					.replace("Ö", "oe")
					.toUpperCase();
					
			
			System.out.println("Vorname: " + Vorname);
			System.out.println("Nachname: " + Nachname);
			
			
			// Prüege Character Länge und zusammen addieren 
			
			
			int vornameLaenge = Vorname.length();
			int nachnameLaenge = Nachname.length();
			
			System.out.println("Anzahl an Characteren: " +  (vornameLaenge + nachnameLaenge));

			System.out.println("Initialen: " + Vorname.charAt(0) + Nachname.charAt(0));
			
			String muster = "Muster";
			
			if (Vorname.equalsIgnoreCase(muster)) {
				System.out.println("Vorname ist gleich wie Muster");
			}else {
				System.out.println("Vorname ist nicht gleich wie Muster");
			}
			
			if (Nachname.equalsIgnoreCase(muster)) {
				System.out.println("Nachname ist gleich wie Muster");
			}else {
				System.out.println("Nachname ist nicht gleich wie Muster");
			}
			
			if (Vorname.equalsIgnoreCase(Nachname)) {
				System.out.println("Vorname ist gleich wie Nachname");
			}else {
				System.out.println("Vorname ist nicht gleich wie Nachname");
			
			
		
			}
		}
	}
}