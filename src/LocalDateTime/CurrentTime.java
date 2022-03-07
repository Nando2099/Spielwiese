package LocalDateTime;

import java.text.SimpleDateFormat;
import java.util.Date;


///////     https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html




public class CurrentTime {

	public static void main(String[] args) {
		
		Date currentDate = new Date();
		System.out.println(currentDate);   // PRINTS CURRENT DATE
		
		
		
		
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:MM:ss"); // formateador 
		
		System.out.println(timeFormat.format(currentDate));  //uso .format(obj)
		
		
		
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/YYYY"); // formateador 
		
		System.out.println(dateFormat.format(currentDate));
		
		
		
		
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("YYYY/MM"); // formateador 
		
		System.out.println(dateFormat2.format(currentDate));
		
		
		
		SimpleDateFormat dateFormat3 = new SimpleDateFormat("dd/MM/yyyy"); // formateador 
		
		System.out.println(dateFormat3.format(currentDate));
		
		
		
		SimpleDateFormat dateFormat4 = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z"); // formateador 
		
		System.out.println(dateFormat4.format(currentDate));
		
		
		
		SimpleDateFormat dateFormat5 = new SimpleDateFormat("hh 'o''clock' a, zzzz"); // formateador 
		// zzzz Mitteleuropäische Normalzeit
		// z    MEZ
		// a PM / AM -> nachm.,
		System.out.println(dateFormat5.format(currentDate));
		
		
		
		SimpleDateFormat dateFormat6 = new SimpleDateFormat("YYYY-'W'ww-u"); // formateador 
		// u	Day number of week (1 = Monday, ..., 7 = Sunday)
		// W	Week in month
		// w	Week in year
		
		System.out.println(dateFormat6.format(currentDate));
		
		
		
		SimpleDateFormat dateFormat7 = new SimpleDateFormat("EEEE"); // formateador 
		
		System.out.println(dateFormat7.format(currentDate));
	
	
		
		SimpleDateFormat dateFormat8 = new SimpleDateFormat("EEEE"); // formateador 
		
		System.out.println(dateFormat8.format(currentDate));
		
		
		
	}

}
