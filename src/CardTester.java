/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card = new Card("seven", "hearts", 7);
		System.out.println(card.toString());
		Card card2 = new Card("five", "hearts", 5);
		System.out.println(card.matches(card2));
	}
}
