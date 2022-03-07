package tests;

public class SwitchRandomNum2 {

	public static void main(String[] args) {
		
		int a1 =11, a2=12, a3=13, a4=14, a5=15, a6=16;
		for (int i =1; i<=6; i++) {
			int zzahl =(int) (Math.random()*49 +1);
			switch(i) {
			case 1: 
				a1 = zzahl;
				break;
			case 2:
				a2 = zzahl;
				break;
			case 3: 
				a3 = zzahl;
				break;
			case 4:
				a4 = zzahl;
				break;
			case 5: 
				a5 = zzahl;
				break;
			case 6:
				a6 = zzahl;
				break;
			}
			 if  (a1==a2 || a2==a3 || a3==a4 || a4==a5 || a5==a6) {
					i--;
				}
				
		}
		
		System.out.println();
		System.out.println("Zufallszahl1:" + a1);
		System.out.println("Zufallszahl2:" + a2);
		System.out.println("Zufallszahl3:" + a3);
		System.out.println("Zufallszahl4:" + a4);
		System.out.println("Zufallszahl5:" + a5);
		System.out.println("Zufallszahl6:" + a6);
	}
		
	
	}


	


