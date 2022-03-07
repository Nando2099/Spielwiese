package Schleifen;

public class Euklid_while {

	public static void main(String[] args) {
		int x=32, y=8;
		
		while(x !=y) {
			if(x<y) {
				x = x-y;
			}
			else {
				y=y-x;
			}
		}
		System.out.println(x);
	}

}
