package Arrays;

import java.util.ArrayList;

public class ArrayList_Aufgabe_2 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		 arrayList.add(11);
		 arrayList.add(12);
		 arrayList.add(13);
		 arrayList.add(14);
		 arrayList.add(15);
		
		 
		 //System.out.println(arrayList.get(4));
		 
		 for (int i = 0; i<6 ; i++) {
			 
			 int randomzahl = (int)(Math.random()*10+1);
			 
			 
			 arrayList.add(randomzahl);
			 
			 
			 //System.out.println(arrayList.get(i));
			 
		 }
		 System.out.println("++++++++++");
		 System.out.println(arrayList);
		 System.out.println("++++++++++");
		 
		 arrayList.remove(2); // lösches platzhalter und inhalt daher rutsch Rest der Liste nach oben
		 arrayList.set(9, 90);
		 arrayList.set(1, -1000);
		 
		 for (int i = 0; i < arrayList.size(); i++) {
			 
			 
			 
			 System.out.println(arrayList.get(i));
			 
		 }
		 
		 	//System.out.println(arrayList);
		 
		 	System.out.println(" ");
		 	System.out.println("++auf 42 geprüft+++");
	        if (arrayList.contains(42))
	            System.out.println("The list contains 42");
	        else
	            System.out.println("The list does not contains 42");
	
	        
	        System.out.println(" ");
	        System.out.println("+++dritte stelle abgeändert+++");
	        arrayList.set(3, 42);
	        
	        if (arrayList.contains(42))
	            System.out.println("The list contains 42");
	        else
	            System.out.println("The list does not contains 42");
	        
	        System.out.println(" ");
		 	System.out.println("++Liste gecleart+++");
		 	
		 	arrayList.clear();
		 	for (int i = 0; i < arrayList.size(); i++) {
		 		System.out.println(arrayList.get(i));
		 	}
		 	
		 	
	
	}

}
