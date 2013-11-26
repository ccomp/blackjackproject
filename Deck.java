import java.util.Random;

public class Deck {
// 1-Clubs 2-Spades 3-Hearts 4-Diamonds

	// creates the deck using multiple arrays
	public static Card[] deck = new Card[52];
	public static Card[] hand = new Card[11];
	public static Card[] newdeck = new Card[52];
	private int cardsUsed = 0;

	public Deck(Card[] cards) {
		cards = deck;
		this.cardsUsed = cardsUsed;
	}

	public static void populateDeck() {
		Card[] dek = new Card[deck.length];
		Card c;
		int count=0;
		// adds new cards into the current deck
		for (int s=0; s<4; s++) {
			for (int v=2; v<15; v++) {
				c = new Card(s, v);
				dek[count] = c;
				count++;
			}
		}	
			
		setCards(dek);
	}

	// prints the contents of the deck onto the screen
	public static void printDeck() {
		for (int i=0; i<deck.length; i++) {
			System.out.println(deck[i].getFace() + " " + deck[i].getSuitStr());
		}
	}

	public static void shuffle() {
		// Function to pick random cards from the deck
		Random r = new Random();

		for (int i=deck.length-1; i>0; i--) {
			// then it takes the next card in the deck index
			int index = r.nextInt(i+1);

			Card a = deck[index];
				deck[index] = deck[i];
				deck[i] = a;
		}
	}

	// Obligatory setter
	public static void setCards(Card[] c) {
		deck = c;
	}


	public String getPath(int pos) {
		String fc = null;
		String path = null;
		// finds the path for the cards, specifically suits
		if (deck[pos].getSuit() <=10) {
			fc = deck[pos].getSuitStr();
		} else {
			// declaring of each suit
			switch(deck[pos].getSuit()) {
				case 11: fc = "J";
				break;

				case 12: fc = "Q";
				break;

				case 13: fc = "K";
				break;

				case 14: fc = "A";
			}
		}
		
		path = fc + deck[pos].getSuitStr();		
		return path;
	}

	public Card dealCard() {
		// the cards in the player's hand increases by increments
		this.cardsUsed++;
		return deck[cardsUsed-1];
	}

}
