package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_to_Array {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		
		// CONVIERTE ARRAYLIST A ARRAY
		
			list.add("Halcon");
			list.add("Aguila");
			
			Object[] objectArray = list.toArray();
			System.out.println(objectArray.length);   // devuelve 2 ***********
			
			String[] stringArray = list.toArray(new String[10]);
			System.out.println(stringArray.length); 	// devuelve 10 ***********
			
			
		// CONVIERTE ARRAY A ARRAYLIST
			
			
			String[] array = {"Halcon", "Aguila"};  
			List<String> list2 = Arrays.asList(array);  // returns fixeed size list
			System.out.println(list2.size());
			list.set(0, "Colibri");
			
			
			
			

	}

}
