package Arrays;

import javax.swing.JOptionPane;

public class Arrays_19_1d {

	public static void main(String[] args) {

		
		
		int z = 0;
		
		int[]zwischenspeichern =new int[10];
		
		z=Integer.parseInt(JOptionPane.showInputDialog("Wie viele Zahlen wollen Sie eingeben?"));
		
		
		int z1=z;
		int a=0;
		
		if(z<=0)
			System.out.println("Ich kann nicht "+z+ " Zahlen ausgeben");
		else {
			 do	{
				zwischenspeichern[a]=Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die "+(a+1)+". Zahl ein"));
				System.out.println("Diese ist die "+(a+1)+". eingegebene Zahl");
				System.out.println(zwischenspeichern[a]);
				z--;
				a++;
				if(a==10) break;
			 	}while(z>0);
			
			 a=0;
			 System.out.println("Die eingegebenen "+z1+" Zahlen waren:");
			 do {
				 System.out.println(a+1+". Zahl: "+zwischenspeichern[a]);
				 a++;
				 z1--;
				 if(a==10) {
				 System.out.println("Speicher voll");
				 break;
				 }
			 	}	while (z1>0);}
		
		
		

	}

}
