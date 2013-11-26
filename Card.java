public class Card {
	private int suit;
	private int card;
	private int value;
	private String face;
	private String suiter;

	public Card(int suit, int card) {
		suit = this.suit;
		card = this.card;


		if (card <= 10) {
			value = card;
		} else {
			value = 10;
		}

	}

  //sets the suit to the integer 'sweet' value
	public void setSuit(int sweet) {
		suit = sweet;
	}


  //suit getter
	public int getSuit() {
		return suit;
	}

	public String getSuitStr() {
		//gets the Suit's 'title'
		String str = null;
		switch(this.suit) {
			case 0: str = "Clubs";
			break;
			case 1: str = "Spades";
			break;
			case 2: str = "Hearts";
			break;
			case 3: str = "Diamonds";
		}
		return str;
	}

	public void setCard(int kard) {
		card = kard;
	}

	public int getCard() {
		return card;
	}

  //Face card getter
	public String getFace() {
		String face = null;
		if (card <=10) {
			face = Integer.toString(card);
		} else {
			switch(card) {
			//Face card title setter
				case 11: face = "Jack";
				break;

				case 12: face = "Queen";
				break;

				case 13: face = "King";
				break;

				case 14: face = "Ace";
				break;
			}
		}

		return face;
	}

}
