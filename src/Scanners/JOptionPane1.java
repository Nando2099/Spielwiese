package Scanners;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JOptionPane1 {

    public static void main(String[] args) {
        JOptionPane.showInputDialog(null, "Bitte etwas eingeben");

        Object[] obj={"Bananen","Birnen","Kirschen"}; 
        ImageIcon icon = new ImageIcon("bild.jpg");
        Object antwort = JOptionPane.showInputDialog(null, "Obst gewünscht?", "Eingabefenster",
                JOptionPane.INFORMATION_MESSAGE, icon, obj,"Birnen");

        if (antwort.equals("Bananen")) {
            System.out.println("Alles Banane!");
        } else if (antwort.equals("Birnen")) {
            System.out.println("Birne!");
        } else if (antwort.equals("Kirschen")) {
            System.out.println("Kirschen bitte!");
        }
    }
}