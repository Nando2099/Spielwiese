package LocalDateTime;



import java.time.Month;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter; //import java.time.format.*;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Aufgabe_23_3_Milica {

	public static void main(String[] args) {
		
//		a
		
		String[] [] praznici = new String [5] [4];
		
		praznici[0][0]="Neujahr"; 
		praznici[0][1]="1";
        praznici[0][2]="1";
        praznici[0][3]="2022";
        		
        praznici[1][0]="Karfreitag";
        praznici[1][1]="15";
        praznici[1][2]="4";
        praznici[1][3]="2022";
        		
        praznici[2][0]="Ostermontag";
        praznici[2][1]="18";
        praznici[2][2]="4";
        praznici[2][3]="2022";
        				
        praznici[3][0]="Tag der Arbeit";
        praznici[3][1]="1";
        praznici[3][2]="5";
        praznici[3][3]="2022";
       
        praznici[4][0]="Pfingstmontag";
        praznici[4][1]="6";
        praznici[4][2]="6";
        praznici[4][3]="2022";
        			        				
//        	b   		
      	
     
        for (int i=0;i < praznici.length ; i++) {
			if(praznici[i]!=null)
			for(int j=0; j< praznici[i].length ;j++) {
				
		System.out.print(praznici[i][j] + " ");
		}
			System.out.println();
		}		
        		
        
        
        
        	System.out.println("------------------");	
        	
        	
        	
        		
//        	c	
        LocalDate c =LocalDate.now();	
        for (int i=0;i < praznici.length ; i++) {
	
				
				int d = Integer.parseInt(praznici[i][1]);
				int e =Integer.parseInt(praznici[i][2]);
				int f =Integer.parseInt(praznici[i][3]);
				LocalDate g = LocalDate.of(f,e,d);
				
				
				
		System.out.println(g);
		
		
//		e
		Period p = Period.between(c, g);
		
		if (c.isBefore(g))
			
			
			System.out.println(praznici[i][0] +" ist am " +g +  " und es sind noch " + p +" Tage bis dahin.");
		else
		System.out.println(praznici[i][0] + " ist am " + g + " und es war vor " + p +  " Tagen.");
		
		}
			System.out.println();
		}		
       		
}