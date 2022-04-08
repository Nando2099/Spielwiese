package OCA_GFN_Test_Simulation;

public class Arrays4 {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3};
        char [] arr2 = {'A', 'B'}; //ASCII code of 'A' is 65, 'B' is 66
       // arr1 = arr2;  TYPE MISMATCH; ERROR!
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}