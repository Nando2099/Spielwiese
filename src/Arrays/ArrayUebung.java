package Arrays;

import javax.swing.JOptionPane;

public class ArrayUebung {
	
	

	static public void main(String ... args) {
//		//Nr. 19_1
//		System.out.println("Aufgabe 19_1a:");
//		String vornamen[]=new String[4];
//		
//		vornamen[0]=JOptionPane.showInputDialog("Bitte geben Sie den 1.Vornamen ein:" );
//		vornamen[1]=JOptionPane.showInputDialog("Bitte geben Sie den 1.Vornamen ein:" );
//		vornamen[2]=JOptionPane.showInputDialog("Bitte geben Sie den 1.Vornamen ein:" );
//		vornamen[3]=JOptionPane.showInputDialog("Bitte geben Sie den 1.Vornamen ein:" );
//		
//		//Nr.19_1b
//		
//		System.out.println("Aufgabe 19_1b:");
//		for(int i=0;i!=4;i++) {
//			System.out.println(vornamen[i]);
//		}
//		int z=0;
//		while(z!=4) {
//			System.out.println(vornamen[z]);
//			z++;
//		}
//		z=0;
//		do {
//			System.out.println(vornamen[z]);
//			z++;
//		}while(z!=4);
//		
//		
//		
//		//Nr.19_1c
//		System.out.println("Aufgabe 19_1c:");
//		boolean wahrheitswerte[]=new boolean[20];
//		
//		for (int i=0;i!=20;i++) {
//			double c=Math.random();
//			if (i%5==0)
//				System.out.println();
//			
//			if (c>=0.5)
//				wahrheitswerte[i]=true;
//			else
//				wahrheitswerte[i]=false;
//			System.out.print( i+1+". "+wahrheitswerte[i]+" | ");	
//			
//			}
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		//Nr.19_1d
//		System.out.println();
//		System.out.println("Aufgabe 19_1d:");
//		
//		int[]zwischenspeichern =new int[10];
//		z=Integer.parseInt(JOptionPane.showInputDialog("Wie viele Zahlen?"));
//		int z1=z;
//		int a=0;
//		if(z<=0)
//			System.out.println("Ich kann nicht "+z+ " Zahlen ausgeben");
//		else {
//			 do	{
//				zwischenspeichern[a]=Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die "+(a+1)+". Zahl ein :"));
//				System.out.println("Geben Sie die "+(a+1)+". Zahl ein :");
//				System.out.println(zwischenspeichern[a]);
//				z--;
//				a++;
//				if(a==10) break;
//			 	}while(z>0);
//			
//			 a=0;
//			 System.out.println("Die eingegebenen "+z1+" Zahlen waren:");
//			 do {
//				 System.out.println(a+1+". Zahl: "+zwischenspeichern[a]);
//				 a++;
//				 z1--;
//				 if(a==10) {
//				 System.out.println("Speicher voll");
//				 break;
//				 }
//			 	}	while (z1>0);}
//		
//		
//		
//		
//		
//		
		
		
		
		
		
		
		
		//Nr.19_2a
		
		
		
//		char[] quer=new char[6];
//		
//		int ausgabe=0;
//		
//		System.out.print("Die Quersumme von: ");
//		
//		for (int i=0;i!=6;i++) { // <<<<<<<<<<<-----------------------------PORQUE !=6 ??
//			
//		
//			quer[i]=(char)(Math.random()*10+48);
//		
//			System.out.print(quer[i]+ " ");
//		
//			ausgabe+=(quer[i]-'0');  // <<<<<<------------------------------- PORQUE '0'??
//		}
//		
//		
//		System.out.println("ist "+ausgabe);
		
		

		
		
		
		
		
		//Nr.19_2b
		System.out.println();
		System.out.println("Aufgabe 19_2b:");
		int j=Integer.MIN_VALUE;
		int groessteZahl[] =new int[4];
		for (int i=0;i!=4;i++) {
			groessteZahl[i]=Integer.parseInt(JOptionPane.showInputDialog("Eingabe der "+(i+1)+". Zahl:"));
			System.out.println("Eingabe der "+(i+1)+". Zahl:");
			System.out.println(groessteZahl[i]);
			if (j<groessteZahl[i])j=groessteZahl[i];
		}
		System.out.println("Der grösste Wert ist: "+j);
//	
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		//Nr.19_2c
//		System.out.println();
//		System.out.println("Aufgabe 19_2c:");
//		
//		String[] nachnamen= {"Brandelle","Laforge","Adam","Hahn","Mueller"};
//		String such=JOptionPane.showInputDialog("Geben Sie den zu suchenden Nachnamen ein:" );
//		
//		for(int i=0;i!=5;i++) {
//			if(nachnamen[i].equals(such)) {
//				System.out.println(such);
//			
//				System.out.println("Der Nachname „"+such+"“ wurde in der Liste gefunden!");
//				z=22;
//				break;	
//				}
//			}	
//		if(z!=22) {System.out.println(such);
//			System.err.println("Der Nachname „"+such+"“ wurde nicht in der Liste gefunden!");
//			}
//		
//		
//		
//		
//		
		
		
		
		
		
//		
//		
//		//Nr.19_3a
//		System.out.println();
//		System.out.println("Aufgabe 19_3a:");
//		
//		int[] umdrehen= {100,50,20,10,1};
//		int[] umgedreht=new int[5];
//		for (int i=0;i!=5;i++) {
//			umgedreht[i]=umdrehen[4-i];
//		}	
//		for(int i:umgedreht) {System.out.print(i);
//		if (i!=100) System.out.print(", ");
//		
//		
//		
//		}	
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//	
//		//Nr.19_3b
//		System.out.println();
//		System.out.println();
//		System.out.println("Aufgabe 19_3b:");
//		//Eingabe
//		String [] umdrehenB= {"100","50","20","10","1"};
//		//Verarbeitung
//		String bla []=reverse(umdrehenB);
//		//Ausgabe
//		for(String i:bla) {System.out.print(i);
//		if (i.equals("100")) ;
//		else System.out.print(", ");
//		
//		}
//		
//		
//	}
//	
//	public static String[] reverse(String [] arr){
//		String hello[]=new String [arr.length] ;
//		
//		
//		for (int i=0;i!=arr.length;i++) {
//			hello[i]=arr[arr.length-1-i];
//			}	
//		
//		return hello;
	}
}