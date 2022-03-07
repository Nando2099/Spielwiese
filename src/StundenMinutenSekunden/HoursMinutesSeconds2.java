package StundenMinutenSekunden;

		import java.util.Scanner;

		public class HoursMinutesSeconds2 {
		public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    double s;


		    System.out.println("Geben Sie die Anzahl von Sekunden ein: ");
		    s =input.nextInt();



		     double h=s/3600;
		     int h2=(int)h;

		     double h_h2=h-h2;
		     double m=h_h2*60;
		     int m1=(int)m;

		     double m_m1=m-m1;
		     double m_m1s=m_m1*60;






		     System.out.println(h2+" Stunden:"+m1+" Minuten:"+Math.round(m_m1s)+" Sekunden");
		}
		}
