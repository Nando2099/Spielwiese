package Strings;



	import java.awt.GridLayout;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JTextField;
	
	public class DemoJOptionPane {
		
		
	   public static void main(String[] args) {
		   
	      JPanel panel = new JPanel(new GridLayout(2, 3));
	      JOptionPane.showInputDialog(null, "Bitte etwas eingeben");
	      JTextField text1 = new JTextField("dada");
	      JTextField text2 = new JTextField();
	      
	      panel.add(text1);
	      panel.add(text2);
	      
	      JOptionPane.showMessageDialog(null, panel);
	}

}
