package Arrays;

public class Array_Phrase_o_Matic {

	public static void main(String[] args) {
		
		String [] wordListOne = {"24/7","Multi-Tier","30,000 foot","B-to-B","Win-Win","front-end"};
		String [] wordListTwo = {"Empowered","Sticky","value-added","branded","clustered","cooperative"};
		String [] wordListThree = {"core competency","strategy","solution","mindshare","space","vision"};
		
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		System.out.print("What we need is a " + phrase);
		
		
	}

}
