package Arrays;

public class TwoDArray {

	public static void main(String... args) {
		char[][] arr = {{'a','b'},{'c','d','e'},{'f','g'}};
		//char[][] arr = {{'a','b'},{},{'f','g'}};
		System.out.println(arr[1][2]);
		for (int i=0; i < arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
		}
		
		char[][] arr2 = new char[2][2];
		arr2[0][0] = 'z';
		
		System.out.print("\n" + arr[0][0]);
	}

}

