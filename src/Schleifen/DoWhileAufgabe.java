package Schleifen;



		import javax.swing.JOptionPane;



		public class DoWhileAufgabe {

			public static void main(String[] args) {
				// Nr. 17a
				System.out.println("Aufgabe 17a:");
				
				int ia = 1;
				do {
					System.out.println(ia);
					ia++;
				} while (ia < 6);

				
				
				
				// Nr. 17b
				System.out.println("Aufgabe 17b:");
				
				int ib = 0;
				do {
					System.out.println(-10 + ib * 3);
					ib++;
				} while (ib <= 3);

				
				
				
				
				// Nr. 17c
				System.out.println("Aufgabe 17c:");
				
				int zufall = (int) (Math.random() * 24);
				char ic = (char) ('a' + zufall);
				//System.out.println(ic);
				char a;
				int izaehler = 0;

				do {
					System.out.println("Geben Sie einen Buchstaben ein:");
					a = JOptionPane.showInputDialog("Geben Sie einen Buchstaben ein:").charAt(0);
					System.out.println(a);
					izaehler++;
					if (a != ic)
						System.out.println("falsch");
					else
						System.out.println("richtig \nSie haben " + izaehler + " Versuche benötigt!");
				} while (a != ic && izaehler < 3);
				if (a != ic)
					System.out.println(
							"Sie haben den Buchstaben in 3 Versuchen nicht erraten, der gesuchte Buchstabe war: " + ic);

			}

		}
		
		
	


