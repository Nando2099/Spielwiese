import java.util.Scanner;
import javax.swing.JOptionPane;


public class Kreditkarte {

	 		
		
		     
//		    public static void getInputsFromScanner()
//		    {        
//		        String name;
//		        Scanner input = new Scanner(System.in);
//		        System.out.print("Enter your name > ");
//		        name = input.nextLine();
//		        System.out.print("You entered your name as: ");
//		        System.out.println(name);
//		         
//		    }
		     
		    public static void getInputsFromJOptionPane()
		    {
		    	String MA = "paco";
		    	
		        String vorname = JOptionPane.showInputDialog(null,"Vorame");  // segunda posicion es texto
		        String nachname = JOptionPane.showInputDialog(null,"Nachame"); 
		        
		        
		        JOptionPane.showMessageDialog(null,"Hi "+ vorname);
		        
		        String s = vorname.toString();
		        
		        if(s.equals(MA) )
		        
		        System.out.println(s + "****");
		        
		         
		    }
		     
		    public static void main(String args[])
		    {
//		       getInputsFromScanner();
		       getInputsFromJOptionPane(); 
		    }
		     
		}

	


