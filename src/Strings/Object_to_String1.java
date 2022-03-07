package Strings;

class Object_to_String1 {
	  
    // Main driver method
    public static void main(String[] args) {
    										
        /* String taken for consideration */
        String s = "Geeks For Geeks";
  
        // Passing string s to StringBuilder class object
        StringBuilder sb = new StringBuilder(s);
  
        // Converting the object to string
        // Converting StringBuilder to string
        String objToString = sb.toString();
  
        // Printing the strings to verify
        System.out.println("String: " + s);
        System.out.println("Converted String: "
                           + objToString);
    }
}