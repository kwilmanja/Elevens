/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"A", "B", "C"};
		String[] suits = {"Hearts", "Clubs"};
		int[] values = {1, 2, 3};
		Deck deck = new Deck(ranks, suits, values);
		for (int i = 0;i<4;i++){
			deck.deal();
		}
		System.out.println(deck.toString());
	}
}
