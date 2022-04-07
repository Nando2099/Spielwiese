package OCA_GFN_Test_Simulation;

public class Arrays5 {
    public static void main(String[] args) {
        String [] arr = {"A", "B", "C", "D"};
        arr[0] = arr[1]; // ahora arr[0] mira al valor de arr[1]
        arr[1] = "E";   //ahora arr[1] tiene un NUEVO VALOR -> E
        				//arr[0] SIGUE MIRANDO AL VALOR ANTIGUO "B"
        
        for(String s : arr) {
            System.out.print(s + " ");
        }
    }
}  // 						output is: B E C D 