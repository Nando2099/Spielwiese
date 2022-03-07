package Schleifen;

import javax.swing.JOptionPane;

public class WhileSchleifenNochMehr {

	public static void main(String[] args) {
		
		
		//Nr. 16a
		System.out.println("Aufgabe 16a:");
		int ia=0;
		while(ia<6) {
			System.out.println(4+ia);
			ia++;
		}	
		
		//Nr. 16b
		System.out.println("Aufgabe 16b:");
		int ib=0;
		
		while(ib<6) {
			System.out.print(-10+ib*2+"  ");
			ib++;
		}
		System.out.println();
		
		//Nr. 16c
		System.out.println("Aufgabe 16c:");
		int ic=0;
		while(ic<5) {
			System.out.print(20-ic*4+" ");
			ic++;
		}
		System.out.println();
		
		//Nr. 16d
		System.out.println("Aufgabe 16d:");
		int id=0;
		int idd[] = {0,0,0};
	
		
		while (idd[id]==idd[(id+1)%3]||idd[id]==idd[(id+2)%3]||idd[(id+1)%3]==idd[(id+2)%3]||idd[2]==0) {
			int i=(int)(1+Math.random()*6);
			idd[id]=i;
			id=(id+1)%3;
		}
		System.out.println(idd[0]);	
		System.out.println(idd[1]);	
		System.out.println(idd[2]);	
		
		
		//Nr. 16e
		System.out.println("Aufgabe 16e:");
		int ie=(int)(1+Math.random()*10);
		int iegeraten=0;
		int zaehler=0;
		while(iegeraten!=ie) {
		while(iegeraten!=0) {System.out.println("Falsch");break;}
		System.out.println("Geben Sie die zu erratende Zahl ein:");
		iegeraten=Integer.parseInt(JOptionPane.showInputDialog("Geben sie die zu erratende Zahl ein:"));
		System.out.println(iegeraten);
		zaehler++;
		}
		System.out.println("Sie haben die Zahl "+ie+" erraten!");
		System.out.println("Sie haben "+zaehler+" Versuche benötigt!");
	}
}
