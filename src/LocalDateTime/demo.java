package LocalDateTime;

public class demo {

	public static void main(String[] args) {
	
		
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
		
		
       System.out.println(praznici.length);
        
		for(int i = 0; i < praznici.length; i++) {
			
			for(int j = 0; j < 4; j++) {
				
				System.out.println(praznici[i][j]);
			}
		}
	
	}
	
}
