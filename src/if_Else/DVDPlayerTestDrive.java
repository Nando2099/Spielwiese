package if_Else;


class DVDPlayer {
	
	boolean canRecord = false;
			
	void recordDVD() {
		System.out.println("DVD recording");
	}	
	void recordDVDnot() {
		System.out.println("DVD not recording");
	}
}


public class DVDPlayerTestDrive {

	public static void main(String[] args) {

			DVDPlayer d = new DVDPlayer();
			d.canRecord = false;
			
			
			if (d.canRecord == true) {
				
				d.recordDVD();
			}	
			else {
				 d.recordDVDnot();
			}
	}
}
